import java.awt.EventQueue;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.text.MessageFormat;

public class JavaPOSApp {

	private JFrame frame;
	private JTable table;
	private JTextField jtxtTax;
	private JTextField jtxtSubTotal;
	private JTextField jtxtTotal;
	private JTextField jtxtDisplay;
	private JTextField jtxtChange;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaPOSApp window = new JavaPOSApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JavaPOSApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	// =======================================================================Functions=========================================================================
	// calculations for tax total and subtotal
	public void ItemCost()
	{
		double sum = 0;
		double tax = 3.9;
		
		for(int i = 0; i < table.getRowCount(); i++)
		{
			sum = sum + Double.parseDouble(table.getValueAt(i, 2).toString());
		}
		
		jtxtSubTotal.setText(Double.toString(sum));
		double cTotal = Double.parseDouble(jtxtSubTotal.getText());
		
		double cTax = (cTotal * tax)/100;
		String iTaxTotal = String.format("Rs %.2f", cTax);
		jtxtTax.setText(iTaxTotal);
		
		String iSubTotal = String.format("Rs %.2f", cTotal);
		jtxtSubTotal.setText(iSubTotal);
		
		String iTotal = String.format("Rs %.2f", cTotal + cTax);
		jtxtTotal.setText(iTotal);
		
//		String BarCode = String.format("Total is Rs %.2f", cTotal + cTax);
//		jtxtBarCode.setText(BarCode);
	}
	
	// =======================================================================Functions=========================================================================
	// function that calculates whatever amount customer handedover
	public void Change()
	{
		double sum = 0;
		double tax = 3.9;
		double cash = Double.parseDouble(jtxtDisplay.getText());
		
		for(int i = 0; i < table.getRowCount(); i++)
		{
			sum = sum + Double.parseDouble(table.getValueAt(i, 2).toString());
		}
		
		double cTax = (tax * sum)/100;
		double cChange = (cash - (sum + cTax));
		String ChangeGiven = String.format("Rs %.2f", cChange);
		jtxtChange.setText(ChangeGiven);
	}
	
	// =======================================================================Functions=========================================================================
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1450, 800);  // coordinates of the form // x, y, size, height
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 21, 328, 454);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton jbtn7 = new JButton("7");
		jbtn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String Enternumber = jtxtDisplay.getText();
				
				if(Enternumber == "")
				{
					jtxtDisplay.setText(jbtn7.getText());
				}
				else
				{
					Enternumber = jtxtDisplay.getText() + jbtn7.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn7.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn7.setBounds(10, 35, 95, 88);
		panel.add(jbtn7);
		
		JButton jbtn9 = new JButton("9");
		jbtn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = jtxtDisplay.getText();
				
				if(Enternumber == "")
				{
					jtxtDisplay.setText(jbtn9.getText());
				}
				else
				{
					Enternumber = jtxtDisplay.getText() + jbtn9.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn9.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn9.setBounds(223, 35, 95, 88);
		panel.add(jbtn9);
		
		JButton jbtn8 = new JButton("8");
		jbtn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = jtxtDisplay.getText();
				
				if(Enternumber == "")
				{
					jtxtDisplay.setText(jbtn8.getText());
				}
				else
				{
					Enternumber = jtxtDisplay.getText() + jbtn8.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn8.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn8.setBounds(115, 35, 95, 88);
		panel.add(jbtn8);
		
		JButton jbtn4 = new JButton("4");
		jbtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = jtxtDisplay.getText();
				
				if(Enternumber == "")
				{
					jtxtDisplay.setText(jbtn4.getText());
				}
				else
				{
					Enternumber = jtxtDisplay.getText() + jbtn4.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn4.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn4.setBounds(10, 133, 95, 88);
		panel.add(jbtn4);
		
		JButton jbtn5 = new JButton("5");
		jbtn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = jtxtDisplay.getText();
				
				if(Enternumber == "")
				{
					jtxtDisplay.setText(jbtn5.getText());
				}
				else
				{
					Enternumber = jtxtDisplay.getText() + jbtn5.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn5.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn5.setBounds(115, 133, 95, 88);
		panel.add(jbtn5);
		
		JButton jbtn6 = new JButton("6");
		jbtn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = jtxtDisplay.getText();
				
				if(Enternumber == "")
				{
					jtxtDisplay.setText(jbtn6.getText());
				}
				else
				{
					Enternumber = jtxtDisplay.getText() + jbtn6.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn6.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn6.setBounds(223, 133, 95, 88);
		panel.add(jbtn6);
		
		JButton jbtn1 = new JButton("1");
		jbtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = jtxtDisplay.getText();
				
				if(Enternumber == "")
				{
					jtxtDisplay.setText(jbtn1.getText());
				}
				else
				{
					Enternumber = jtxtDisplay.getText() + jbtn1.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn1.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn1.setBounds(10, 231, 95, 88);
		panel.add(jbtn1);
		
		JButton jbtn2 = new JButton("2");
		jbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = jtxtDisplay.getText();
				
				if(Enternumber == "")
				{
					jtxtDisplay.setText(jbtn2.getText());
				}
				else
				{
					Enternumber = jtxtDisplay.getText() + jbtn2.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn2.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn2.setBounds(115, 231, 95, 88);
		panel.add(jbtn2);
		
		JButton jbtn3 = new JButton("3");
		jbtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = jtxtDisplay.getText();
				
				if(Enternumber == "")
				{
					jtxtDisplay.setText(jbtn3.getText());
				}
				else
				{
					Enternumber = jtxtDisplay.getText() + jbtn3.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn3.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn3.setBounds(223, 231, 95, 88);
		panel.add(jbtn3);
		
		JButton jbtn0 = new JButton("0");
		jbtn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = jtxtDisplay.getText();
				
				if(Enternumber == "")
				{
					jtxtDisplay.setText(jbtn0.getText());
				}
				else
				{
					Enternumber = jtxtDisplay.getText() + jbtn0.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn0.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtn0.setBounds(10, 340, 95, 88);
		panel.add(jbtn0);
		
		// adding decimal
		JButton jbtnDot = new JButton(".");
		jbtnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(! jtxtDisplay.getText().contains("."))
				{
					jtxtDisplay.setText(jtxtDisplay.getText() + jbtnDot.getText());
				}
			}
		});
		jbtnDot.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtnDot.setBounds(115, 340, 95, 88);
		panel.add(jbtnDot);
		
		// cancel
		JButton jbtnC = new JButton("C");
		jbtnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jtxtDisplay.setText(null);
				jtxtChange.setText(null);
			}
		});
		jbtnC.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtnC.setBounds(223, 340, 95, 88);
		panel.add(jbtnC);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(657, 21, 769, 454);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton jbtnCappuccino = new JButton("");
		jbtnCappuccino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 60;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Cappuccino", "1", PriceOfItem});
				ItemCost();
			}
		});
		jbtnCappuccino.setIcon(new ImageIcon("C:\\Users\\varsh\\Downloads\\cappuccino.jpg"));
		jbtnCappuccino.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtnCappuccino.setBounds(10, 33, 140, 124);
		panel_1.add(jbtnCappuccino);
		
		JButton jbtnCreamRoll = new JButton("");
		jbtnCreamRoll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 50;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Cream Roll", "1", PriceOfItem});
				ItemCost();
			}
		});
		jbtnCreamRoll.setIcon(new ImageIcon("C:\\Users\\varsh\\Downloads\\creamroll.jpg"));
		jbtnCreamRoll.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtnCreamRoll.setBounds(10, 167, 140, 124);
		panel_1.add(jbtnCreamRoll);
		
		JButton jbtnOrangeDrink = new JButton("");
		jbtnOrangeDrink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 35;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Orange Drink", "1", PriceOfItem});
				ItemCost();
			}
		});
		jbtnOrangeDrink.setIcon(new ImageIcon("C:\\Users\\varsh\\Downloads\\orangedrink.jpg"));
		jbtnOrangeDrink.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtnOrangeDrink.setBounds(10, 301, 140, 124);
		panel_1.add(jbtnOrangeDrink);
		
		JButton jbtnCanDrinks = new JButton("");
		jbtnCanDrinks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 30;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Can Drink", "1", PriceOfItem});
				ItemCost();
			}
		});
		jbtnCanDrinks.setIcon(new ImageIcon("C:\\Users\\varsh\\Downloads\\candrinks.jpg"));
		jbtnCanDrinks.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtnCanDrinks.setBounds(160, 33, 140, 124);
		panel_1.add(jbtnCanDrinks);
		
		JButton jbtnTea = new JButton("");
		jbtnTea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 40;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Tea", "1", PriceOfItem});
				ItemCost();
			}
		});
		jbtnTea.setIcon(new ImageIcon("C:\\Users\\varsh\\Downloads\\tea.jpg"));
		jbtnTea.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtnTea.setBounds(160, 167, 140, 124);
		panel_1.add(jbtnTea);
		
		JButton jbtnBlackForestCake = new JButton("");
		jbtnBlackForestCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 100;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Black Forest Cake", "1", PriceOfItem});
				ItemCost();
			}
		});
		jbtnBlackForestCake.setIcon(new ImageIcon("C:\\Users\\varsh\\Downloads\\cake.jpg"));
		jbtnBlackForestCake.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtnBlackForestCake.setBounds(310, 33, 140, 124);
		panel_1.add(jbtnBlackForestCake);
		
		JButton jbtnCoffee = new JButton("");
		jbtnCoffee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 50;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Coffee", "1", PriceOfItem});
				ItemCost();
			}
		});
		jbtnCoffee.setIcon(new ImageIcon("C:\\Users\\varsh\\Downloads\\coffee.jpg"));
		jbtnCoffee.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtnCoffee.setBounds(460, 33, 140, 124);
		panel_1.add(jbtnCoffee);
		
		JButton jbtnMuffin = new JButton("");
		jbtnMuffin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 25;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Muffin", "1", PriceOfItem});
				ItemCost();
			}
		});
		jbtnMuffin.setIcon(new ImageIcon("C:\\Users\\varsh\\Downloads\\muffin.jpg"));
		jbtnMuffin.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtnMuffin.setBounds(610, 33, 140, 124);
		panel_1.add(jbtnMuffin);
		
		JButton jbtnCocoa = new JButton("");
		jbtnCocoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 70;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Cocoa", "1", PriceOfItem});
				ItemCost();
			}
		});
		jbtnCocoa.setIcon(new ImageIcon("C:\\Users\\varsh\\Downloads\\cocoa.jpg"));
		jbtnCocoa.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtnCocoa.setBounds(310, 167, 140, 124);
		panel_1.add(jbtnCocoa);
		
		JButton jbtnStrawberryIceCream = new JButton("");
		jbtnStrawberryIceCream.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 45;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Strawberry Ice Cream", "1", PriceOfItem});
				ItemCost();
			}
		});
		jbtnStrawberryIceCream.setIcon(new ImageIcon("C:\\Users\\varsh\\Downloads\\strawberryicecream.jpg"));
		jbtnStrawberryIceCream.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtnStrawberryIceCream.setBounds(460, 167, 140, 124);
		panel_1.add(jbtnStrawberryIceCream);
		
		JButton jbtnChocolateCake = new JButton("");
		jbtnChocolateCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 105;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Chocolate Cake", "1", PriceOfItem});
				ItemCost();
			}
		});
		jbtnChocolateCake.setIcon(new ImageIcon("C:\\Users\\varsh\\Downloads\\chocolatecake.jpg"));
		jbtnChocolateCake.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtnChocolateCake.setBounds(610, 167, 140, 124);
		panel_1.add(jbtnChocolateCake);
		
		JButton jbtnMilkyCappuccino = new JButton("");
		jbtnMilkyCappuccino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 55;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Milky Cappuccino", "1", PriceOfItem});
				ItemCost();
			}
		});
		jbtnMilkyCappuccino.setIcon(new ImageIcon("C:\\Users\\varsh\\Downloads\\milkycapuccino.jpg"));
		jbtnMilkyCappuccino.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtnMilkyCappuccino.setBounds(160, 301, 140, 124);
		panel_1.add(jbtnMilkyCappuccino);
		
		JButton jbtnFruitCake = new JButton("");
		jbtnFruitCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 95;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Fruit Cake", "1", PriceOfItem});
				ItemCost();
			}
		});
		jbtnFruitCake.setIcon(new ImageIcon("C:\\Users\\varsh\\Downloads\\fruitcake.jpg"));
		jbtnFruitCake.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtnFruitCake.setBounds(310, 301, 140, 124);
		panel_1.add(jbtnFruitCake);
		
		JButton jbtnSpongeCake = new JButton("");
		jbtnSpongeCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 80;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Sponge Cake", "1", PriceOfItem});
				ItemCost();
			}
		});
		jbtnSpongeCake.setIcon(new ImageIcon("C:\\Users\\varsh\\Downloads\\spongecake.jpg"));
		jbtnSpongeCake.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtnSpongeCake.setBounds(460, 301, 140, 124);
		panel_1.add(jbtnSpongeCake);
		
		JButton jbtnIceCreamDrink = new JButton("");
		jbtnIceCreamDrink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 60;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Ice Cream Drink", "1", PriceOfItem});
				ItemCost();
			}
		});
		jbtnIceCreamDrink.setIcon(new ImageIcon("C:\\Users\\varsh\\Downloads\\icecreamdrink.jpg"));
		jbtnIceCreamDrink.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtnIceCreamDrink.setBounds(610, 301, 140, 124);
		panel_1.add(jbtnIceCreamDrink);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(10, 516, 1416, 237);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(21, 21, 436, 194);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tax");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(10, 39, 164, 29);
		panel_3.add(lblNewLabel);
		
		jtxtTax = new JTextField();
		jtxtTax.setFont(new Font("Tahoma", Font.BOLD, 24));
		jtxtTax.setBounds(197, 39, 218, 29);
		panel_3.add(jtxtTax);
		jtxtTax.setColumns(10);
		
		JLabel lblSubtotal = new JLabel("SubTotal");
		lblSubtotal.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblSubtotal.setBounds(10, 85, 164, 29);
		panel_3.add(lblSubtotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTotal.setBounds(10, 140, 164, 29);
		panel_3.add(lblTotal);
		
		jtxtSubTotal = new JTextField();
		jtxtSubTotal.setFont(new Font("Tahoma", Font.BOLD, 24));
		jtxtSubTotal.setColumns(10);
		jtxtSubTotal.setBounds(197, 85, 218, 29);
		panel_3.add(jtxtSubTotal);
		
		jtxtTotal = new JTextField();
		jtxtTotal.setFont(new Font("Tahoma", Font.BOLD, 24));
		jtxtTotal.setColumns(10);
		jtxtTotal.setBounds(197, 140, 218, 29);
		panel_3.add(jtxtTotal);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3_1.setBounds(477, 21, 460, 194);
		panel_2.add(panel_3_1);
		
		JLabel lblDisplayCash = new JLabel("Display Cash");
		lblDisplayCash.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblDisplayCash.setBounds(10, 88, 164, 29);
		panel_3_1.add(lblDisplayCash);
		
		JLabel lblChange = new JLabel("Change");
		lblChange.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblChange.setBounds(10, 139, 164, 29);
		panel_3_1.add(lblChange);
		
		jtxtDisplay = new JTextField();
		jtxtDisplay.setFont(new Font("Tahoma", Font.BOLD, 24));
		jtxtDisplay.setColumns(10);
		jtxtDisplay.setBounds(219, 88, 218, 29);
		panel_3_1.add(jtxtDisplay);
		
		jtxtChange = new JTextField();
		jtxtChange.setFont(new Font("Tahoma", Font.BOLD, 24));
		jtxtChange.setColumns(10);
		jtxtChange.setBounds(219, 139, 218, 29);
		panel_3_1.add(jtxtChange);
		
		JLabel lblPayMethod = new JLabel("Pay Method");
		lblPayMethod.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblPayMethod.setBounds(10, 30, 164, 42);
		panel_3_1.add(lblPayMethod);
		
		JComboBox jcboPayment = new JComboBox();
		jcboPayment.setModel(new DefaultComboBoxModel(new String[] {"", "Cash", "Visa Card", "Master Card"}));
		jcboPayment.setFont(new Font("Tahoma", Font.BOLD, 24));
		jcboPayment.setBounds(219, 37, 218, 29);
		panel_3_1.add(jcboPayment);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setLayout(null);
		panel_3_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3_2.setBounds(947, 21, 447, 194);
		panel_2.add(panel_3_2);
		
		JButton jbtnPay = new JButton("Pay");
		jbtnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(jcboPayment.getSelectedItem().equals("Cash"))
				{
					Change();
				}
				else
				{
					jtxtChange.setText("");
					jtxtDisplay.setText("");
				}
			}
		});
		jbtnPay.setFont(new Font("Tahoma", Font.BOLD, 24));
		jbtnPay.setBounds(10, 32, 128, 62);
		panel_3_2.add(jbtnPay);
		
		JButton jbtnPrint = new JButton("Print");
		jbtnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MessageFormat header = new MessageFormat("Printing in Progress");
				MessageFormat footer = new MessageFormat("Page {0, number, integer}");
				
				try
				{
					table.print(JTable.PrintMode.NORMAL, header, footer);
				}
				catch(java.awt.print.PrinterException ex)
				{
					System.err.format("No Printer Found", ex.getMessage());
				}
			}
		});
		jbtnPrint.setFont(new Font("Tahoma", Font.BOLD, 24));
		jbtnPrint.setBounds(162, 32, 128, 62);
		panel_3_2.add(jbtnPrint);
		
		JButton jbtnReset = new JButton("Reset");
		jbtnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jtxtDisplay.setText(null);
				jtxtChange.setText(null);
				jtxtTax.setText(null);
				jtxtSubTotal.setText(null);
				jtxtTotal.setText(null);
				
				DefaultTableModel RecordTable = (DefaultTableModel) table.getModel();
				RecordTable.setRowCount(0);
			}
		});
		jbtnReset.setFont(new Font("Tahoma", Font.BOLD, 24));
		jbtnReset.setBounds(312, 32, 128, 62);
		panel_3_2.add(jbtnReset);
		
		JButton jbtnRemove = new JButton("Remove Item");
		jbtnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				int RemoveItem = table.getSelectedRow();
				if(RemoveItem >= 0)
				{
					model.removeRow(RemoveItem);
				}
				
				ItemCost();
				
				if(jcboPayment.getSelectedItem().equals("Cash"))
				{
					Change();
				}
				else
				{
					jtxtChange.setText("");
					jtxtDisplay.setText("");
				}
			}
		});
		jbtnRemove.setFont(new Font("Tahoma", Font.BOLD, 24));
		jbtnRemove.setBounds(20, 104, 245, 62);
		panel_3_2.add(jbtnRemove);
		
		JButton jbtnExit = new JButton("Exit");
		jbtnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame("Exit");
				
				if(JOptionPane.showConfirmDialog(frame, "Confirm If You Want To Exit", "Food Ordering App", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
			}
		});
		jbtnExit.setFont(new Font("Tahoma", Font.BOLD, 24));
		jbtnExit.setBounds(275, 104, 165, 62);
		panel_3_2.add(jbtnExit);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(348, 21, 301, 454);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Items", "Qty", "Amount"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(125);
		table.getColumnModel().getColumn(0).setMinWidth(125);
		table.getColumnModel().getColumn(1).setPreferredWidth(60);
		table.getColumnModel().getColumn(1).setMinWidth(20);
		scrollPane.setViewportView(table);
	}
}
