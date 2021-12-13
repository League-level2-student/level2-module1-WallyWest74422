package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import _01_array_list_visualizer.data.ArrayList;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton("Add Name");
	JButton button2 = new JButton("View Names");
	ArrayList<String> GuestBook = new ArrayList<String>();
GuestBook (){
	GuestBook.add("Bob Banders");
	GuestBook.add("Sandy Summers");
	GuestBook.add("Greg Ganders");
	GuestBook.add("Donny Doners");
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	frame.setSize(700, 700);
	frame.setVisible(true);
	button1.addActionListener(this);
	button2.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource()==button1){
		String EnterName = JOptionPane.showInputDialog("Please enter a name below!");
		GuestBook.add(EnterName);
	} else if (e.getSource()==button2) {
		String message = "";
		for(int i = 0; i < GuestBook.size(); i++){
			message += GuestBook.get(i) + "\n";
		}
		JOptionPane.showMessageDialog(null, message);


	}
}
}
