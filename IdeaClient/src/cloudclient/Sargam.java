/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cloudclient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class Sargam
{
    private List<String> sargamNotes ;

    public Sargam()
    {
        sargamNotes = new ArrayList<String>();
    }
    public Sargam(String data)
    {
        String [] notes = data.split(" ");
        sargamNotes = Arrays.asList(notes);
    }

    public void addNote(String note)
    {
    
        sargamNotes.add(note);
    }

    public List<String> getSargamNotes()
    {
        return sargamNotes;
    }

    @Override
    public String toString()
    {
        String out = "";
       
        for(String s : sargamNotes)
        {

            out += s + " ";
        }
        return out;
    }
}


