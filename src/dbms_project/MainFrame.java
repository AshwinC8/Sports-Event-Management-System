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
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

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
		tabbedPane.setBounds(10, 10, 416, 460);
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
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setForeground(new Color(240, 248, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(new Color(50, 205, 50));
		btnNewButton.setBounds(285, 137, 85, 21);
		Events.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setForeground(new Color(240, 248, 255));
		btnNewButton_1.setBackground(new Color(255, 99, 71));
		btnNewButton_1.setBounds(179, 137, 85, 21);
		Events.add(btnNewButton_1);
		
		JLabel lblNewLabel_6 = new JLabel("Delete Event :");
		lblNewLabel_6.setBounds(10, 342, 85, 13);
		Events.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Enter ID of the event to be deleted :");
		lblNewLabel_7.setBounds(10, 365, 254, 13);
		Events.add(lblNewLabel_7);
		
		textField_3 = new JTextField();
		textField_3.setBounds(10, 385, 161, 25);
		Events.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.setForeground(new Color(240, 248, 255));
		btnNewButton_2.setBackground(new Color(255, 0, 0));
		btnNewButton_2.setBounds(179, 387, 85, 21);
		
		Events.add(btnNewButton_2);
		
		JLabel lblNewLabel_9 = new JLabel("Update Event :");
		lblNewLabel_9.setBounds(10, 189, 150, 13);
		Events.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Enter Event ID to be updated :");
		lblNewLabel_10.setBounds(10, 212, 198, 13);
		Events.add(lblNewLabel_10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(10, 235, 161, 25);
		Events.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Enter Event Name :");
		lblNewLabel_11.setBounds(10, 276, 132, 13);
		Events.add(lblNewLabel_11);
		
		textField_7 = new JTextField();
		textField_7.setBounds(127, 270, 243, 25);
		Events.add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnNewButton_5 = new JButton("Update");
		btnNewButton_5.setBackground(new Color(50, 205, 50));
		btnNewButton_5.setForeground(new Color(240, 248, 255));
		btnNewButton_5.setBounds(285, 305, 85, 21);
		Events.add(btnNewButton_5);
		
		JButton btnNewButton_1_1 = new JButton("Cancel");
		btnNewButton_1_1.setForeground(new Color(240, 248, 255));
		btnNewButton_1_1.setBackground(new Color(255, 99, 71));
		btnNewButton_1_1.setBounds(179, 305, 85, 21);
		Events.add(btnNewButton_1_1);
		
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
		
		JLabel lblNewLabel_8 = new JLabel("Enter Event ID :");
		lblNewLabel_8.setBounds(10, 134, 137, 13);
		Sports.add(lblNewLabel_8);
		
		textField_5 = new JTextField();
		textField_5.setBounds(161, 128, 227, 25);
		Sports.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("Save");
		btnNewButton_3.setForeground(new Color(240, 248, 255));
		btnNewButton_3.setBackground(new Color(50, 205, 50));
		btnNewButton_3.setBounds(303, 173, 85, 21);
		Sports.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Cancel");
		btnNewButton_4.setForeground(new Color(240, 248, 255));
		btnNewButton_4.setBackground(new Color(255, 99, 71));
		btnNewButton_4.setBounds(208, 173, 85, 21);
		Sports.add(btnNewButton_4);
		
		JLabel lblNewLabel_9_1 = new JLabel("Update Sport :");
		lblNewLabel_9_1.setBounds(10, 204, 150, 13);
		Sports.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_10_1 = new JLabel("Enter Sports ID to be updated :");
		lblNewLabel_10_1.setBounds(10, 227, 198, 13);
		Sports.add(lblNewLabel_10_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(10, 250, 161, 25);
		Sports.add(textField_8);
		
		JLabel lblNewLabel_11_1 = new JLabel("Enter Sport Name :");
		lblNewLabel_11_1.setBounds(10, 291, 132, 13);
		Sports.add(lblNewLabel_11_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(145, 285, 243, 25);
		Sports.add(textField_9);
		
		JButton btnNewButton_1_1_1 = new JButton("Cancel");
		btnNewButton_1_1_1.setForeground(new Color(240, 248, 255));
		btnNewButton_1_1_1.setBackground(new Color(255, 99, 71));
		btnNewButton_1_1_1.setBounds(208, 360, 85, 21);
		Sports.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_5_1 = new JButton("Update");
		btnNewButton_5_1.setForeground(new Color(240, 248, 255));
		btnNewButton_5_1.setBackground(new Color(50, 205, 50));
		btnNewButton_5_1.setBounds(303, 360, 85, 21);
		Sports.add(btnNewButton_5_1);
		
		JLabel lblNewLabel_11_1_1 = new JLabel("Enter Event ID :");
		lblNewLabel_11_1_1.setBounds(10, 331, 132, 13);
		Sports.add(lblNewLabel_11_1_1);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(145, 325, 243, 25);
		Sports.add(textField_10);
		
		JPanel Participant = new JPanel();
		tabbedPane.addTab("Participant", null, Participant, null);
		
		JPanel Couch = new JPanel();
		tabbedPane.addTab("Couch", null, Couch, null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 480, 416, 104);
		contentPane.add(panel);
	}
}
