package Final;

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
	JLabel welcome, brand, brandYear, type, available, serialLabel;
	JTextField serial;
	JButton processTicket;
	
	static MusicStore Bennington = new MusicStore(); 

	public GUIHWStarterCode() {
		
		JFrame tFrame = new JFrame("MusicStore");
		
		tFrame.setSize(800,600);
		tFrame.setResizable(false);
		tFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tFrame.setLayout(new BorderLayout());
		JPanel topPanel = new JPanel(new GridLayout(1,2));
		JPanel upperPanel = new JPanel();
		JPanel centerPanel = new JPanel(new GridLayout(5,2));
		JPanel bottomPanel = new JPanel();


		//Instantiate the labels
		welcome = new JLabel("Welcome to the MusicStore");
		serialLabel = new JLabel("Enter Serial #");
		brand = new JLabel("Brand:");
		brandYear = new JLabel("Brand Founded:");
		type = new JLabel("Type:");
		available = new JLabel("Availability:");
		

		serial = new JTextField(15);

		topPanel.add(welcome);
		topPanel.add(serialLabel);
		topPanel.add(serial);
		tFrame.add(topPanel,BorderLayout.NORTH);
		//tFrame.add(upperPanel,BorderLayout.NORTH);
		centerPanel.add(brand);
		centerPanel.add(brandYear);
		centerPanel.add(type);
		
		tFrame.add(centerPanel,BorderLayout.CENTER);
		

		JButton button = new JButton("Enter");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				int serialNumber = Integer.parseInt(serial.getText());
				brand.setText("Brand: " + Bennington.getInstrument(serialNumber).getBrand().toString());
				brandYear.setText("Brand Founded: " + Bennington.getInstrument(serialNumber).getBrandFounded());
				type.setText("Type: "+ Bennington.getInstrument(serialNumber).getType().toString());
				}
				catch(Exception ArrayIndexOutOfBoundsException) {
					brand.setText("Brand: ");
					brandYear.setText("Brand Founded: ");
					type.setText("Type: INSTRUMENT NOT FOUND");
				}
			}
		});

		bottomPanel.add(button);
		tFrame.add(bottomPanel,BorderLayout.SOUTH);
		
		tFrame.setVisible(true);
	}

	
	
	
	/**
	 * Main creates an instance of the GUI,
	 * which will start itself
	 * @param args
	 */
	public static void main(String[] args) { // Generate the inventory array
		Bennington.fillInventoryGuitar(0,3); //Fill inventory with guitars
		Bennington.fillInventoryElectricGuitar(3,7); //Fill inventory with electric guitars
	
		
		System.out.println(Bennington.getInstrument(100).getBrandFounded());  // Get year of brand's founded year (stored in ENUM)
		
		Bennington.printInstrumentALL();
		Bennington.removeInstrument(100);
		Bennington.removeInstrument(103);
		Bennington.removeInstrument(104);
		
		
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				//create an instance of this class
				GUIHWStarterCode theGui = new GUIHWStarterCode();
			}
		});
		
	}
	
}