package mod13;

import mod9.ConcertTicket;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class GUIHWStarterCode {
	//components needed
	JLabel welcome, eventName, price, row, seatNumber, genre;
	JTextField eventNameEntry, priceEntry, rowEntry, 
				seatNumberEntry, genreEntry;
	JButton processTicket;

	/**
	 * The constructor creates a JFrame, then places other
	 * components on it and finally makes the JFrame visible.
	 */

	public GUIHWStarterCode() {
		//Make a JFrame
		JFrame tFrame = new JFrame("Tickets");
		
		//Set dimensions and resizable
		tFrame.setSize(800,600);
		tFrame.setResizable(false);
		
		//Exit the app when the window is closed
		tFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Apply a border layout
		tFrame.setLayout(new BorderLayout());
		
		//Make panels to hold content (I've done this for you)
		JPanel topPanel = new JPanel();
		//the GridLayout will auto-arrange components in a 5 x 2 grid
		JPanel centerPanel = new JPanel(new GridLayout(5,2));
		JPanel bottomPanel = new JPanel();


		//Instantiate the labels
		welcome = new JLabel("Welcome to the Box Office app");
		eventName = new JLabel("Event Name:");
		price = new JLabel("Price: ");
		row = new JLabel("Row ID:");
		seatNumber = new JLabel("Seat Number");
		genre = new JLabel("Genre");
		

		//Instantiate the text fields
		eventNameEntry = new JTextField(15);
		priceEntry = new JTextField(5);
		rowEntry = new JTextField(2);
		seatNumberEntry = new JTextField(2);
		genreEntry = new JTextField(15);
		//You do the rest

		//Add the welcome label to the top panel
		topPanel.add(welcome);
		//Add the top panel to NORTH of the layout
		tFrame.add(topPanel,BorderLayout.NORTH);
		//Add the labels and text fields to the center panel
		centerPanel.add(eventName);
		centerPanel.add(eventNameEntry);
		
		centerPanel.add(price);
		centerPanel.add(priceEntry);
		centerPanel.add(row);
		centerPanel.add(rowEntry);
		centerPanel.add(seatNumber);
		centerPanel.add(seatNumberEntry);
		centerPanel.add(genre);
		centerPanel.add(genreEntry);

		//Add the center panel to the CENTER of the app layout
		tFrame.add(centerPanel,BorderLayout.CENTER);
		
		
		//Instantiate the button to process the ticket
		JButton button = new JButton("Enter");
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				double eventPrice = Double.parseDouble(priceEntry.getText());
				char eventRow = rowEntry.getText().charAt(0);
				int eventSeat = Integer.parseInt(seatNumberEntry.getText());
				String eventName = eventNameEntry.getText();
				String eventGenre = genreEntry.getText();
				
				ConcertTicket event = new ConcertTicket(eventName,eventPrice,eventRow,eventSeat,eventGenre);
				event.printTicket();
			
			}
			
		});
	
		//Add the button to the bottom
		bottomPanel.add(button);
		tFrame.add(bottomPanel,BorderLayout.SOUTH);

		
		//make the JFrame visible
		
		tFrame.setVisible(true);
	}


	/**
	 * Main creates an instance of the GUI,
	 * which will start itself
	 * @param args
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				//create an instance of this class
				GUIHWStarterCode theGui = new GUIHWStarterCode();
			}
		});
	}
}