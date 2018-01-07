/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cloudclient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server{

        ServerSocket serverSocket = null;
        Socket clientSocket = null;
        static final int PORT_NUMBER = 4321;


	public Server()
	{
		System.out.println("In server thread constructor");
		try
		{
			serverSocket = new ServerSocket(PORT_NUMBER);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}		
	}

        public void startServer()
        {
            try
            {
	        while(true)
		{
                    System.out.println("Server started and waiting for client : before accept...");
                    clientSocket=serverSocket.accept();
                    System.out.println("Client Connected....");
                    //Client connected...
                    DataInputStream din = new DataInputStream(clientSocket.getInputStream());
                    DataOutputStream dout = new DataOutputStream(clientSocket.getOutputStream());

                    int todo = din.readInt();
                    if(todo == TODO.NO_OF_ELEMENT)
                    {
                        int noOfElement = din.readInt();
                        ArrayList<Sargam> requestSargamList = new ArrayList<Sargam>();

                        for(int i=0; i<noOfElement; i++)
                        {
                            String data = din.readUTF();
                            requestSargamList.add(new Sargam(data));                            
                        }                        
                        System.out.println("Got Total "+noOfElement+" elements...");

                        for(Sargam s: requestSargamList)
                        {
                            System.out.println(s);
                        }

                        List<Sargam> resultSargamList = new ArrayList<Sargam>();
                        //filtering of notes as per the rules
                        System.out.println("Filtering Notes");
                        MusicNotesFilter musicNotesFilter=new MusicNotesFilter(requestSargamList);
                        musicNotesFilter.totalFilter();
                        resultSargamList = musicNotesFilter.getResultList();
                        
                        System.out.println("Sending result back to server. resultList size = " + resultSargamList.size());
                        //Work Place For Convering Notes into Frequencies
                        System.out.println("Filtered Notes From Client Side");

                        PrintWriter pwf=null;

                        try{
                         File file=new File("C:\\Users\\Akshay\\Desktop\\Project Data\\Filtered_Notes.txt");
            FileWriter fwf=new FileWriter(file,false);
            pwf=new PrintWriter(fwf);

         System.out.println("Frequency Representation Of Notes(5th Octave)");
        for(Sargam sr : resultSargamList)
        {


            for(int i=0;i<=11;i++)
            {
                if(sr.getSargamNotes().get(i).equals("g"))
                {

                System.out.print("0.0392 ");
                pwf.print("0.0392 ");

                }
                if(sr.getSargamNotes().get(i).equals("a"))
                {
                System.out.print("0.0440 ");
                pwf.print("0.0440 ");

                }
                if(sr.getSargamNotes().get(i).equals("C"))
                {
                System.out.print("0.0520 ");
                pwf.print("0.0520 ");

                }
                if(sr.getSargamNotes().get(i).equals("D"))
                {
                System.out.print("0.0587 ");
                pwf.print("0.0587 ");

                }
                if(sr.getSargamNotes().get(i).equals("E"))
                {
                System.out.print("0.0659 ");
                pwf.print("0.0659 ");

                }
                if(sr.getSargamNotes().get(i).equals("G"))
                {
                System.out.print("0.0783 ");
                pwf.print("0.0783 ");

                }
                if(sr.getSargamNotes().get(i).equals("A"))
                {
                System.out.print("0.0880 ");
                pwf.print("0.0880 ");

                }
                if(sr.getSargamNotes().get(i).equals("c"))
                {
                System.out.print("0.1046 ");
                pwf.print("0.1046 ");

                }
                if(sr.getSargamNotes().get(i).equals("d"))
                {
                System.out.print("0.1174 ");
                pwf.print("0.1174 ");

                }
                if(sr.getSargamNotes().get(i).equals("e"))
                {
                System.out.print("0.1318 ");
                pwf.print("0.1318 ");

                }
               if(sr.getSargamNotes().get(i).equals("O"))
                {
                System.out.print("0 ");
                pwf.print("0.0 ");

                }
                
            }
             System.out.println("");
             pwf.println();

           
        }
        }
        catch(IOException ioe)
        {
            System.out.println(ioe);
        }
        finally{
        if(pwf!=null)
        {
        pwf.close();
        }
                        }
                        
                        dout.writeInt(TODO.NO_OF_ELEMENT);
                        dout.flush();
                         
                        dout.writeInt(resultSargamList.size());
                        dout.flush();

                        for(int i=0; i<resultSargamList.size(); i++)
                        {
                            Sargam sargam = resultSargamList.get(i);
                            dout.writeUTF(sargam.toString());
                            dout.flush();
                        }
                        System.out.println("DONE.....");
                    }
                }
            }
            catch(Exception e)
            {
            	e.printStackTrace();
            }
        }
}
