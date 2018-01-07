package cloudclient;

import java.util.ArrayList;
import java.util.List;

public class MusicNotesFilter  
{
	List<Sargam> requestList = null;
	List<Sargam> resultList = null;
       
	public MusicNotesFilter(ArrayList<Sargam> requestList)
	{
		this.requestList = requestList;
		this.resultList = new ArrayList<Sargam>();
	}
		
	
	public List<Sargam> totalFilter()
	{
		filter1();
		
		return resultList;
	}
	
	
	//filter1 => Basic Requirement For Raga Generation
	private void filter1()
	{	
		
		for(Sargam note:requestList)
		{
                    
                    boolean flag=true ;
                    //There can be no raga without S ; A raga must have at least one of the notes M, M# and P
                    for(int i=0;i<=11;i++)
                    {
                        if(note.getSargamNotes().get(i).equals("C")||note.getSargamNotes().get(i).equals("c")||note.getSargamNotes().get(i).equals("G")||note.getSargamNotes().get(i).equals("g"))
                        {
                            flag=true;
                            System.out.println("Flag Set True");
                            break;
                        }
                    }

                     

                 //A note and its altered version may both be used in a raga, they cannot be used consecutively.(like S,S#)
                    for(int i=0;i<11;i++)
                    {
                       
                        if(note.getSargamNotes().get(i).equals("G")&&note.getSargamNotes().get(i+1).equals("g")||note.getSargamNotes().get(i).equals("g")&&note.getSargamNotes().get(i+1).equals("G")||note.getSargamNotes().get(i).equals("A")&&note.getSargamNotes().get(i+1).equals("a")||note.getSargamNotes().get(i).equals("a")&&note.getSargamNotes().get(i+1).equals("A")||note.getSargamNotes().get(i).equals("D")&&note.getSargamNotes().get(i+1).equals("d")||note.getSargamNotes().get(i).equals("d")&&note.getSargamNotes().get(i+1).equals("D")||note.getSargamNotes().get(i).equals("E")&&note.getSargamNotes().get(i+1).equals("e")||note.getSargamNotes().get(i).equals("e")&&note.getSargamNotes().get(i+1).equals("E")||note.getSargamNotes().get(i).equals("C")&&note.getSargamNotes().get(i+1).equals("c")||note.getSargamNotes().get(i).equals("c")&&note.getSargamNotes().get(i+1).equals("C"))
                        {
                            flag=false;
                           break;
                        }
                    
                    }
                 
                   System.out.println("Flag-  "+flag);
                    System.out.println(note);
                    if(flag)
                    {
                         resultList.add(note);
                    }
                      
		}
		
                System.out.println("Resultlist size"+resultList.size());
		
	}
	
	
	
	public List<Sargam> getResultList()
	{
		return resultList;
	}
}










