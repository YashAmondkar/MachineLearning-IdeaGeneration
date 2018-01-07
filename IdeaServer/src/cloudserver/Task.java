/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cloudserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task
{
    private ArrayList<Sargam> requestSargams;
    private ArrayList<Sargam> responseSargams;
   
    private int noOfResultElement = 0;
    private static Task self = null;
    private int noOfClients = 0;
    private int noOfClientsReportedResult = 0;
    public static boolean allClientResultReady=false;
    private List<String> inputNoteList = new ArrayList<String>();
    private List<String> inputFreqList =new ArrayList<String>();

    public void setNoOfClient(int value)
    {
        noOfClients = value;
    }

    public int getNoOfClient()
    {
       return noOfClients;
    }
    
    public int getRequestSargamsSize()
    {
        return requestSargams.size();
    }

    public ArrayList<Sargam> getResponseSargams()
    {
        
        return requestSargams;
    }
    
    public static Task getInstance()
    {
        if(self == null)
        {
            self = new Task();
        }
        return self;
    }

    public synchronized int addNoOfResultElement(int count)
    {
        noOfResultElement += count;
        noOfClientsReportedResult++;
        if(noOfClientsReportedResult == noOfClients)
        {
            responseSargams = new ArrayList<Sargam>(noOfResultElement);
            allClientResultReady = true;
        }
        return (noOfResultElement - count);
    }
    
    public synchronized Sargam getSargam(int index)
    {
        //System.out.println("I AM: " + Thread.currentThread().getId());
        return requestSargams.get(index);
    }

    public synchronized void setSargam(Sargam element, int index)
    {
        responseSargams.add(index, element);
    }

    public void setNotes(List<String> noteList)
    {
        inputNoteList = noteList;        
    }

    public void populateArray()
    {
        //requestList = permutation.getAllPermutation();
        //Logic to generate random permutation of total 1000 elemets of different size from 6-12.
        final int NO_OF_ELEMETS = 100;
        final int MIN_SIZE = 6;
        final int MAX_SIZE = 12;

        requestSargams = new ArrayList<Sargam>();
       //inputNoteList.add(0, "O");
        for(int i=0; i<NO_OF_ELEMETS; i++)
        {
            Sargam sargam = new Sargam();
            //Frequency freq=new Frequency();
            Random random = new Random();
            long range = (long)MAX_SIZE - (long)MIN_SIZE + 1;
            long fraction = (long)(range * random.nextDouble());
            int nextSize =  (int)(fraction + MIN_SIZE);
           int nextNote;
            for(int j=0; j<nextSize; j++)
            {
                Random randomGenerator = new Random();
                nextNote = randomGenerator.nextInt(inputNoteList.size());
                
                sargam.addNote(inputNoteList.get(nextNote));
               // freq.addFreq(inputFreqList.get(nextNote));
            }
          //int size=inputNoteList.size();
           if(nextSize<=12)
            {
                for(int z=nextSize;z<12;z++)
                {
                    sargam.addNote("O");
                   // freq.addFreq("0.0");
                   // sargam.addNote(inputNoteList.get(0));
                }
            }
            requestSargams.add(sargam);
        }

        //Print all Sargams
        System.out.println("All 100 Random Combinations");
        for(Sargam sargam : requestSargams)
        {
            System.out.println(sargam);
        }
       // System.out.println("Frequency Wise Distribution");
       // for(Frequency freqn : requestFreq)
        //{
         //   System.out.println(freqn);
        //}
    }
}


