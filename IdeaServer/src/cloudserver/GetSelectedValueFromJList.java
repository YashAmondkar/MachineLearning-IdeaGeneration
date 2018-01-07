package cloudserver;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
 
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;

import org.jfugue.Pattern;
import org.jfugue.Player;
 	public class GetSelectedValueFromJList extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JComboBox dropDownList;
    
    private JButton button;
 
    public GetSelectedValueFromJList(ArrayList<Sargam> finalNoteList) {
 
        // set flow layout for the frame
        this.getContentPane().setLayout(new FlowLayout());
         
        
         
        Object[] data =finalNoteList.toArray();
        
        dropDownList=new JComboBox(data);
        
        button = new JButton("Play");
         
        button.addActionListener(this);
         
        
        add(dropDownList);
        add(button);
 
    }
     
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("play")) {
            int index = dropDownList.getSelectedIndex();
            System.out.println("Index Selected: " + index);
            String s = (String) dropDownList.getSelectedItem();
            char temp[]=s.toCharArray();
            String str=String.valueOf(temp[0]);
            for(int i=1;i<temp.length;i++)
            {
            	str+=" "+temp[i];
            	
            	
            }
            System.out.print(str);
            Pattern pattern=new Pattern(str);
            Player player=new Player();
            player.play(pattern);
        }
    }
     
    public void createAndShowGUI(ArrayList<Sargam> finalNoteList) {
 
 
  //Create and set up the window.
 
  JFrame frame = new GetSelectedValueFromJList(finalNoteList);
 
 
  //Display the window.
 
  frame.pack();
 
  frame.setVisible(true);
 
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
   
    }
     
    
 
}
