/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cloudserver;


import com.mysql.jdbc.PreparedStatement;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

import java.util.ArrayList;

public class Client implements Runnable{

    Socket socket = null;
    DataInputStream din = null;
    DataOutputStream dout =  null;
    int startIndex = 0;
    int endIndex = 0;
    long threadId = -1;
    public static boolean iAmDone=false;
      PreparedStatement stmt=null;
     static  ArrayList<Sargam> resultList = new ArrayList<Sargam>();


 public static  ArrayList<Sargam> getResponseSargam()
    {
        //return responseSargams;
        return resultList;
    }
    public Client(String host, String port){
        try
         {
            System.out.println("Client Constructor call");
            socket = new Socket(host, Integer.parseInt(port));
         }
        catch(Exception e)
        {
            e.printStackTrace();
        }        
    }

    public void setStartAndEndIndex(int startIndex, int endIndex)
    {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }
    
    public void start()
    {
        Thread me = new Thread(this);
        threadId = me.getId();
        me.start();
    }

    public void run()
        {
            System.out.println("I am started. MyID: "+ threadId);
            try
            {
                    din = new DataInputStream(socket.getInputStream());
                    dout = new DataOutputStream(socket.getOutputStream());
                    Task task = Task.getInstance();
                    
                    dout.writeInt(TODO.NO_OF_ELEMENT);
                    dout.flush();

                    dout.writeInt(endIndex-startIndex+1);
                    dout.flush();
                    // send element request element
                    for(int i=startIndex; i<=endIndex; i++)
                    {
                        Sargam sargam = task.getSargam(i);
                        dout.writeUTF(sargam.toString());
                        dout.flush();
                    }

                    // Now read response...

                    int todo = din.readInt();
                    if(todo == TODO.NO_OF_ELEMENT)
                    {
                        int noOfResultElement = din.readInt();
                        
                        String data = "";
                        for(int i=0; i<noOfResultElement; i++)
                        {
                            data = din.readUTF();
                            Sargam sargam = new Sargam(data);
                            resultList.add(sargam);
                           
                        }
                        System.out.println("DONE. Total "+ noOfResultElement +" Sargams got from this client..");
                        
                        int myStartIndexToFinalArray = task.addNoOfResultElement(noOfResultElement);
                        System.out.println("myStartIndexToFinalArray : " + myStartIndexToFinalArray);

                        while(!Task.allClientResultReady)
                        {
                            Thread.sleep(1000);
                        }
                        
                        System.out.println("Writing data into result array...");
                        for(int finalArrayIndex=myStartIndexToFinalArray, i=0; i<noOfResultElement; i++)
                        {
                            task.setSargam(resultList.get(i),finalArrayIndex++);
                        }
                        System.out.println("Filtered Notes from Client Side");
                        for(Sargam sr:resultList)
                        {
                            System.out.println(sr);
                        }
          

                        

                       /*
                        for(int i=0;i<noOfResultElement;i++)
                        {
                        	task.setSargam(resultList.get(i),i);
                        }
                        */
                        // writing task is done to result array
                        iAmDone=true;
                        System.out.println("DONE... bye");
                    }
             }
            catch(Exception e)
            {
            	e.printStackTrace();
            }

          
            
        }   
 }

