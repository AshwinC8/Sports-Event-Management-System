package dbms_project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_3;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 631);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 10, 416, 574);
		contentPane.add(tabbedPane);
		
		JPanel Events = new JPanel();
		tabbedPane.addTab("Events", null, Events, null);
		Events.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter the Event details :");
		lblNewLabel.setBounds(10, 10, 150, 13);
		Events.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Event ID :");
		lblNewLabel_1.setBounds(10, 47, 101, 13);
		Events.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(91, 41, 279, 25);
		Events.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Event Name :");
		lblNewLabel_2.setBounds(10, 88, 111, 13);
		Events.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(91, 82, 279, 25);
		Events.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setForeground(new Color(240, 248, 255));
		btnNewButton_1.setBackground(new Color(255, 99, 71));
		btnNewButton_1.setBounds(179, 162, 85, 21);
		Events.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setForeground(new Color(240, 248, 255));
		btnNewButton.setBackground(new Color(50, 205, 50));
		btnNewButton.setBounds(285, 162, 85, 21);
		Events.add(btnNewButton);
		
		JLabel lblNewLabel_9 = new JLabel("Update Event :");
		lblNewLabel_9.setBounds(10, 214, 150, 13);
		Events.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Enter Event ID to be updated :");
		lblNewLabel_10.setBounds(10, 237, 198, 13);
		Events.add(lblNewLabel_10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(10, 260, 161, 25);
		Events.add(textField_3);
		
		JLabel lblNewLabel_11 = new JLabel("Enter Event Name :");
		lblNewLabel_11.setBounds(10, 301, 132, 13);
		Events.add(lblNewLabel_11);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(127, 295, 243, 25);
		Events.add(textField_6);
		
		JButton btnNewButton_1_1 = new JButton("Cancel");
		btnNewButton_1_1.setForeground(new Color(240, 248, 255));
		btnNewButton_1_1.setBackground(new Color(255, 99, 71));
		btnNewButton_1_1.setBounds(179, 380, 85, 21);
		Events.add(btnNewButton_1_1);
		
		JButton btnNewButton_5 = new JButton("Update");
		btnNewButton_5.setForeground(new Color(240, 248, 255));
		btnNewButton_5.setBackground(new Color(50, 205, 50));
		btnNewButton_5.setBounds(285, 380, 85, 21);
		Events.add(btnNewButton_5);
		
		JLabel lblNewLabel_6 = new JLabel("Delete Event :");
		lblNewLabel_6.setBounds(10, 431, 85, 13);
		Events.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Enter ID of the event to be deleted :");
		lblNewLabel_7.setBounds(10, 454, 254, 13);
		Events.add(lblNewLabel_7);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(10, 474, 161, 25);
		Events.add(textField_7);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.setForeground(new Color(240, 248, 255));
		btnNewButton_2.setBackground(Color.RED);
		btnNewButton_2.setBounds(179, 476, 85, 21);
		Events.add(btnNewButton_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Event Date :");
		lblNewLabel_2_1.setBounds(10, 133, 111, 13);
		Events.add(lblNewLabel_2_1);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(91, 127, 279, 25);
		Events.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(127, 336, 243, 25);
		Events.add(textField_12);
		
		JLabel lblNewLabel_11_2 = new JLabel("Enter Event Name :");
		lblNewLabel_11_2.setBounds(10, 342, 132, 13);
		Events.add(lblNewLabel_11_2);
		
		JPanel Sports = new JPanel();
		tabbedPane.addTab("Sports", null, Sports, null);
		Sports.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Enter the Sports details :");
		lblNewLabel_3.setBounds(10, 10, 157, 13);
		Sports.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Enter Sports ID :");
		lblNewLabel_4.setBounds(10, 49, 109, 13);
		Sports.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(161, 43, 227, 25);
		Sports.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Enter name of Sport :");
		lblNewLabel_5.setBounds(10, 92, 157, 13);
		Sports.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(161, 86, 227, 25);
		Sports.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Enter the Location :");
		lblNewLabel_8.setBounds(10, 134, 137, 13);
		Sports.add(lblNewLabel_8);
		
		textField_5 = new JTextField();
		textField_5.setBounds(161, 128, 227, 25);
		Sports.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("Cancel");
		btnNewButton_4.setForeground(new Color(240, 248, 255));
		btnNewButton_4.setBackground(new Color(255, 99, 71));
		btnNewButton_4.setBounds(208, 260, 85, 21);
		Sports.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("Save");
		btnNewButton_3.setForeground(new Color(240, 248, 255));
		btnNewButton_3.setBackground(new Color(50, 205, 50));
		btnNewButton_3.setBounds(303, 260, 85, 21);
		Sports.add(btnNewButton_3);
		
		JLabel lblNewLabel_9_1 = new JLabel("Update Sport :");
		lblNewLabel_9_1.setBounds(10, 291, 150, 13);
		Sports.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_10_1 = new JLabel("Enter Sports ID to be updated :");
		lblNewLabel_10_1.setBounds(10, 314, 198, 13);
		Sports.add(lblNewLabel_10_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(10, 337, 161, 25);
		Sports.add(textField_8);
		
		JLabel lblNewLabel_11_1 = new JLabel("Enter Sport Name :");
		lblNewLabel_11_1.setBounds(10, 378, 132, 13);
		Sports.add(lblNewLabel_11_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(145, 372, 243, 25);
		Sports.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(145, 407, 243, 25);
		Sports.add(textField_10);
		
		JLabel lblNewLabel_11_1_1 = new JLabel("Enter the Location :");
		lblNewLabel_11_1_1.setBounds(15, 413, 132, 13);
		Sports.add(lblNewLabel_11_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Cancel");
		btnNewButton_1_1_1.setForeground(new Color(240, 248, 255));
		btnNewButton_1_1_1.setBackground(new Color(255, 99, 71));
		btnNewButton_1_1_1.setBounds(208, 516, 85, 21);
		Sports.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_5_1 = new JButton("Update");
		btnNewButton_5_1.setForeground(new Color(240, 248, 255));
		btnNewButton_5_1.setBackground(new Color(50, 205, 50));
		btnNewButton_5_1.setBounds(303, 516, 85, 21);
		Sports.add(btnNewButton_5_1);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(161, 172, 227, 25);
		Sports.add(textField_13);
		
		JLabel lblNewLabel_8_1 = new JLabel("Enter the Duration :");
		lblNewLabel_8_1.setBounds(10, 178, 137, 13);
		Sports.add(lblNewLabel_8_1);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(161, 218, 227, 25);
		Sports.add(textField_14);
		
		JLabel lblNewLabel_8_2 = new JLabel("Enter Event ID :");
		lblNewLabel_8_2.setBounds(10, 224, 137, 13);
		Sports.add(lblNewLabel_8_2);
		
		JLabel lblNewLabel_8_1_1 = new JLabel("Enter the Duration :");
		lblNewLabel_8_1_1.setBounds(10, 448, 137, 13);
		Sports.add(lblNewLabel_8_1_1);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(145, 442, 243, 25);
		Sports.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(145, 477, 243, 25);
		Sports.add(textField_16);
		
		JLabel lblNewLabel_8_2_1 = new JLabel("Enter Event ID :");
		lblNewLabel_8_2_1.setBounds(10, 483, 137, 13);
		Sports.add(lblNewLabel_8_2_1);
		
		JPanel Participant = new JPanel();
		tabbedPane.addTab("Participant", null, Participant, null);
		
		JPanel Couch = new JPanel();
		tabbedPane.addTab("Couch", null, Couch, null);
	}
}
