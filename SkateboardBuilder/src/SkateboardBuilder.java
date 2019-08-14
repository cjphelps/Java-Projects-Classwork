
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.util.List;

import javax.swing.*;




public class SkateboardBuilder extends JFrame{	
	//create deck panel
	private JPanel deckPanel;	
	private JLabel deckBoxLabel;	
	private String[] decks = { "The Master Thrasher", "The Dictator", "The Street King"};
	private int[] deckPrices = {60,45,50};
	private JComboBox deckBox;


	//set truck assembly Combo Box
	private JPanel axelPanel;
	private JLabel axelBoxLabel;
	private String[] axels = {"7.75 in Axel","8 in Axel","8.5 in Axel"};
	private int[] axelPrices = {35,40,45};
	private JComboBox axelBox;

	//set wheels Combo Box
	private JPanel wheelsPanel;
	private JLabel wheelBoxLabel;
	private String[] wheelSizes = {"51mm","55mm","58mm","61mm"};
	private int[] wheelPrices = {20,22,24,28};
	private JComboBox wheelsBox;
	
	//set misc list
	private JPanel miscPanel;
	private JLabel miscLabel;
	private String[] addons = {"Grip Tape","Bearings","Riser Pads","Nuts and Bolts"};
	private int[] addonPrices = { 10, 60, 2, 3};
	private JList miscList;
	private JScrollPane scrollPanel;
	private JList selectedMiscOptions;
	//set price panel
	private JPanel pricePanel;
	private JLabel subtotalTextLabel;
	private JTextField subtotalTextField;
	private JLabel taxTextLabel;
	private JTextField taxTextField;
	private JLabel totalTextLabel;
	private JTextField totalTextField;
	//set buttons
	private JPanel buttonPanel;
	private JButton calcButton;
	
	
	//set variables
	private double subtotal;
	private double tax;
	private double total;

	private static final long serialVersionUID = 1L;



	public SkateboardBuilder(){
		final int WINDOW_WIDTH = 400;
		final int WINDOW_HEIGHT = 400;
		
		//set title
		setTitle("Skateboard Builder");
		
		//set size of window
		setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		
		// set layout
		setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		
		//default close operation
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		//build panels
		buildDeckPanel();
		buildAssemblyPanel();
		buildWheelsPanel();
		buildMiscPanel();		
		CalcButton();
		buildTotalsPanel();
		
		//add panel to frame		
		add(deckPanel);
		add(wheelsPanel);
		add(axelPanel);		
		add(miscPanel);
		add(pricePanel);
		add(calcButton);
		
		
		
		//pack();
		//set to visible
		setVisible(true);
	}//end SkateboardBuilder
	
	private void buildDeckPanel() {
		//build deck panel
		deckPanel = new JPanel();
		
		//create label		
		deckBoxLabel = new JLabel("Please Select A Deck");
		
		
		//add the string to the combo box
		 deckBox = new JComboBox(decks);
		
		//create and action event listener for the combo box
		//deckBox.addActionListener(new ActionListener());
		
		//add the box to the panel
		deckPanel.add(deckBoxLabel);
		deckPanel.add(deckBox);
		
		
	}// end builDeckPanel
	//create assembly panel to add to frame
	private void buildAssemblyPanel() {
		//build assembly panel
		axelPanel = new JPanel();
		
		//build label
		axelBoxLabel = new JLabel("Please Select A Truck Assembly");
		
		// string of assembly options
		
		//add the string to the combo box
		 axelBox = new JComboBox(axels);
		
		//create and action event listener
		//axelBox.addActionListener(new ComboBoxListener());
		
		// add box to panel
		axelPanel.add(axelBoxLabel);
		axelPanel.add(axelBox);		
		
		
	
	}// end buildAxelPanel
	//create wheels panel
	private void buildWheelsPanel() {
		//build wheels panel
		wheelsPanel = new JPanel();
		
		//build label
		wheelBoxLabel = new JLabel("Please Select Wheel Size");
		
		//create wheels combo box
		 wheelsBox = new JComboBox(wheelSizes);
		
		//action event
		//wheelsBox.addActionListener(new ComboBoxListener());
		
		// add box to panel
		wheelsPanel.add(wheelBoxLabel);
		wheelsPanel.add(wheelsBox);
	}// end buildWheelsPanel
	
	private  void buildMiscPanel() {
		//create panel
		miscPanel = new JPanel();
		
		// build label
		miscLabel = new JLabel("Select Addition Items To Add");	
		
		
		//create JList
		miscList = new JList(addons);
		
		miscList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		miscList.setVisibleRowCount(3);
		scrollPanel = new JScrollPane(miscList);
		
		
		
		// add to panel
		miscPanel.add(miscLabel);
		miscPanel.add(scrollPanel);
	}// end buildMiscPanel
	private void buildTotalsPanel() {
		pricePanel = new JPanel();
		subtotalTextLabel = new JLabel("Subtotal:");
		subtotalTextField = new JTextField(5);
		taxTextLabel = new JLabel("Tax:");
		taxTextField = new JTextField(5);
		totalTextLabel = new JLabel("Total:");
		totalTextField = new JTextField(5);
		
		pricePanel.add(subtotalTextLabel);
		pricePanel.add(subtotalTextField);
		pricePanel.add(taxTextLabel);
		pricePanel.add(taxTextField);
		pricePanel.add(totalTextLabel);
		pricePanel.add(totalTextField);
	}
	

	
	private void CalcButton() {
		
		buttonPanel = new JPanel();
		calcButton = new JButton("Calculate Total");
		calcButton.addActionListener(new CalcButtonListener());
		buttonPanel.add(calcButton);
	}// end calc button
	
	private class CalcButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//get deck panel selection
			String deckSelection = (String) deckBox.getSelectedItem();
			subtotal=0;
			if (deckSelection == decks[0]) {
				subtotal += deckPrices[0];
			}
			else if(deckSelection == decks[1]) {
				subtotal += deckPrices[1];
			}
			else if(deckSelection == decks[2]) {
				subtotal += deckPrices[2];
			}
			
			//get axel selection
			String axelSelection = (String)axelBox.getSelectedItem();
			if (axelSelection == axels[0]) {
				subtotal += axelPrices[0];
			}
			else if (axelSelection == axels[1]) {
				subtotal += axelPrices[1];
			}
			else if (axelSelection == axels[2]) {
				subtotal += axelPrices[2];
			}			
			
			//get wheels selection
			String wheelSelection = (String)wheelsBox.getSelectedItem();
			if(wheelSelection == wheelSizes[0]) {
				subtotal += wheelPrices[0];				
			}
			else if (wheelSelection == wheelSizes[1]) {
				subtotal += wheelPrices[1];
			}
			else if (wheelSelection == wheelSizes[2]) {
				subtotal += wheelPrices[2];
			}
			else if (wheelSelection == wheelSizes[3]) {
				subtotal += wheelPrices[3];
			}
			
			//get misc selections
			int[] miscSelections = miscList.getSelectedIndices();
			for (int idx=0; idx < miscSelections.length; idx++) {
				subtotal += addonPrices[miscSelections[idx]];
			}
		
			tax = subtotal * .06;
			total = subtotal + tax;
			//update prices text fields
			taxTextField.setText("$" + (String.format("%.2f", tax)));
			subtotalTextField.setText("$" + (String.format("%.2f", subtotal)));
			totalTextField.setText("$"+(String.format("%.2f", total)));
			
		}	

	}//end class
	public static void main(String[] args) {
		new SkateboardBuilder();
	}//end main
}

		
		
	

	
	
	
	
	
	
	


