package _00_Intro_To_ArrayLists;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
    /*
     * Create a GUI with two buttons. One button reads "Add Name" and the other
     * button reads "View Names". When the add name button is clicked, display
     * an input dialog that asks the user to enter a name. Add that name to an
     * ArrayList. When the "View Names" button is clicked, display a message
     * dialog that displays all the names added to the list. Format the list as
     * follows:
     * Guest #1: Bob Banders
     * Guest #2: Sandy Summers
     * Guest #3: Greg Ganders
     * Guest #4: Donny Doners
     
     */
	public static void main(String[] args) {
		new _02_GuestBook();
	}
	JFrame frame = new JFrame();
     JPanel panel = new JPanel();
     JButton addbutton = new JButton();
     JButton viewbutton = new JButton();
     ArrayList<String>names = new ArrayList<String>();
     public _02_GuestBook() {
     panel.add(addbutton);
     panel.add(viewbutton);
     frame.add(panel);
     addbutton.setText("Add Name");
     viewbutton.setText("View Names");
     addbutton.addActionListener(this);
     viewbutton.addActionListener(this);
     frame.setVisible(true);
     frame.pack();
     }
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==addbutton) {
			String name = JOptionPane.showInputDialog("Please enter a name to add to the guest book.");
			names.add(name);
			
		}
		if(arg0.getSource()==viewbutton) {
			JOptionPane.showMessageDialog(null, names);
		}
	}

}
