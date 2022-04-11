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
import javax.swing.JTextPane;
import java.awt.FlowLayout;

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
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_20;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	JButton btnNewButton;
	JLabel lblNewLabel_13;

//	private String EventOut = "";
//	private String SportOut = "";
//	private String participantOut="";
//	private String CouchOut="";
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
	
//	public void saveButtonEvent() {
//		ActionListener saveButtonEvent = new ActionListener() {
//		 @Override
//		 public void actionPerformed(ActionEvent ae) {
////			 EventOut = "Event Details is stored";
//			 lblNewLabel_13.setText("The Event details is stored.");
//		 }
//		};
//	}
//	
//	btnNewButton.addActionListener(saveButtonEvent);


		
	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 843, 631);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 10, 809, 574);
		contentPane.add(tabbedPane);
		
		// The Events tab
		
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
		lblNewLabel_6.setBounds(436, 10, 85, 13);
		Events.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Enter ID of the event to be deleted :");
		lblNewLabel_7.setBounds(436, 33, 254, 13);
		Events.add(lblNewLabel_7);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(436, 53, 301, 25);
		Events.add(textField_7);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.setForeground(new Color(240, 248, 255));
		btnNewButton_2.setBackground(Color.RED);
		btnNewButton_2.setBounds(652, 84, 85, 21);
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
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(436, 217, 301, 254);
		Events.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_13 = new JLabel();
		lblNewLabel_13.setBounds(10, 10, 45, 13);
		panel.add(lblNewLabel_13);
		
		JLabel lblNewLabel_6_2 = new JLabel("Output :");
		lblNewLabel_6_2.setBounds(436, 194, 85, 13);
		Events.add(lblNewLabel_6_2);
		
		// The Sports tab
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
		
		JLabel lblNewLabel_6_1 = new JLabel("Delete Sport :");
		lblNewLabel_6_1.setBounds(433, 10, 85, 13);
		Sports.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("Enter ID of the sport to be deleted :");
		lblNewLabel_7_1.setBounds(433, 30, 254, 13);
		Sports.add(lblNewLabel_7_1);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(433, 53, 301, 25);
		Sports.add(textField_19);
		
		JButton btnNewButton_2_1 = new JButton("Delete");
		btnNewButton_2_1.setForeground(new Color(240, 248, 255));
		btnNewButton_2_1.setBackground(Color.RED);
		btnNewButton_2_1.setBounds(649, 91, 85, 21);
		Sports.add(btnNewButton_2_1);
		
		JLabel lblNewLabel_6_2_1 = new JLabel("Output :");
		lblNewLabel_6_2_1.setBounds(433, 184, 85, 13);
		Sports.add(lblNewLabel_6_2_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(433, 207, 301, 254);
		Sports.add(panel_1);
		
		// The Participant tab
		
		JPanel Participant = new JPanel();
		tabbedPane.addTab("Participant", null, Participant, null);
		tabbedPane.setEnabledAt(2, true);
		Participant.setLayout(null);
		
		JLabel lblNewLabel_12 = new JLabel("Enter the Participants details  :");
		lblNewLabel_12.setBounds(10, 10, 183, 13);
		Participant.add(lblNewLabel_12);
		
		JLabel lblNewLabel_12_1 = new JLabel("Enter the Name of the Participant :");
		lblNewLabel_12_1.setBounds(10, 36, 195, 19);
		Participant.add(lblNewLabel_12_1);
		
		JLabel lblNewLabel_12_1_1 = new JLabel("Enter Ph.no of Participant :");
		lblNewLabel_12_1_1.setBounds(10, 79, 195, 13);
		Participant.add(lblNewLabel_12_1_1);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(217, 33, 227, 25);
		Participant.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(215, 73, 227, 25);
		Participant.add(textField_18);
		
		JLabel lblNewLabel_12_1_1_1_1 = new JLabel("Enter D.O.B of Participant :");
		lblNewLabel_12_1_1_1_1.setBounds(10, 118, 195, 13);
		Participant.add(lblNewLabel_12_1_1_1_1);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(217, 112, 227, 25);
		Participant.add(textField_21);
		
		JLabel lblNewLabel_12_1_1_1_1_1 = new JLabel("Enter Event ID of the participant :");
		lblNewLabel_12_1_1_1_1_1.setBounds(10, 159, 195, 13);
		Participant.add(lblNewLabel_12_1_1_1_1_1);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(217, 153, 227, 25);
		Participant.add(textField_22);
		
		JLabel lblNewLabel_12_2 = new JLabel("Update details:");
		lblNewLabel_12_2.setBounds(10, 234, 183, 13);
		Participant.add(lblNewLabel_12_2);
		
		JLabel lblNewLabel_12_1_2 = new JLabel("Enter the Name of the Participant :");
		lblNewLabel_12_1_2.setBounds(10, 260, 195, 19);
		Participant.add(lblNewLabel_12_1_2);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(217, 257, 227, 25);
		Participant.add(textField_20);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(215, 297, 227, 25);
		Participant.add(textField_23);
		
		JLabel lblNewLabel_12_1_1_1 = new JLabel("Enter Ph.no of Participant :");
		lblNewLabel_12_1_1_1.setBounds(10, 303, 195, 13);
		Participant.add(lblNewLabel_12_1_1_1);
		
		JLabel lblNewLabel_12_1_1_1_1_2 = new JLabel("Enter D.O.B of Participant :");
		lblNewLabel_12_1_1_1_1_2.setBounds(10, 342, 195, 13);
		Participant.add(lblNewLabel_12_1_1_1_1_2);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(217, 336, 227, 25);
		Participant.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(217, 377, 227, 25);
		Participant.add(textField_25);
		
		JLabel lblNewLabel_12_1_1_1_1_1_1 = new JLabel("Enter Event ID of the participant :");
		lblNewLabel_12_1_1_1_1_1_1.setBounds(10, 383, 195, 13);
		Participant.add(lblNewLabel_12_1_1_1_1_1_1);
		
		JButton btnNewButton_4_1 = new JButton("Cancel");
		btnNewButton_4_1.setForeground(new Color(240, 248, 255));
		btnNewButton_4_1.setBackground(new Color(255, 99, 71));
		btnNewButton_4_1.setBounds(263, 199, 85, 21);
		Participant.add(btnNewButton_4_1);
		
		JButton btnNewButton_3_1 = new JButton("Save");
		btnNewButton_3_1.setForeground(new Color(240, 248, 255));
		btnNewButton_3_1.setBackground(new Color(50, 205, 50));
		btnNewButton_3_1.setBounds(358, 199, 85, 21);
		Participant.add(btnNewButton_3_1);
		
		
		JButton btnNewButton_4_1_1 = new JButton("Cancel");
		btnNewButton_4_1_1.setForeground(new Color(240, 248, 255));
		btnNewButton_4_1_1.setBackground(new Color(255, 99, 71));
		btnNewButton_4_1_1.setBounds(264, 420, 85, 21);
		Participant.add(btnNewButton_4_1_1);
		
		JButton btnNewButton_5_2 = new JButton("Update");
		btnNewButton_5_2.setForeground(new Color(240, 248, 255));
		btnNewButton_5_2.setBackground(new Color(50, 205, 50));
		btnNewButton_5_2.setBounds(358, 420, 85, 21);
		Participant.add(btnNewButton_5_2);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("Delete Participant :");
		lblNewLabel_6_1_1.setBounds(471, 14, 144, 13);
		Participant.add(lblNewLabel_6_1_1);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("Enter Ph.no of the participant to be deleted :");
		lblNewLabel_7_1_1.setBounds(471, 34, 254, 13);
		Participant.add(lblNewLabel_7_1_1);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(471, 57, 301, 25);
		Participant.add(textField_26);
		
		JButton btnNewButton_2_1_1 = new JButton("Delete");
		btnNewButton_2_1_1.setForeground(new Color(240, 248, 255));
		btnNewButton_2_1_1.setBackground(Color.RED);
		btnNewButton_2_1_1.setBounds(687, 95, 85, 21);
		Participant.add(btnNewButton_2_1_1);
		
		JLabel lblNewLabel_6_2_1_1 = new JLabel("Output :");
		lblNewLabel_6_2_1_1.setBounds(471, 164, 85, 13);
		Participant.add(lblNewLabel_6_2_1_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(471, 187, 301, 254);
		Participant.add(panel_1_1);
		
		// The Couch tab
		
		JPanel Couch = new JPanel();
		tabbedPane.addTab("Couch", null, Couch, null);
		Couch.setLayout(null);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(217, 47, 227, 25);
		Couch.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(471, 71, 301, 25);
		Couch.add(textField_28);
		
		JLabel lblNewLabel_7_1_1_1 = new JLabel("Enter ID of the Couch:");
		lblNewLabel_7_1_1_1.setBounds(471, 47, 254, 13);
		Couch.add(lblNewLabel_7_1_1_1);
		
		JLabel lblNewLabel_6_1_1_1 = new JLabel("Delete Couch :");
		lblNewLabel_6_1_1_1.setBounds(471, 24, 144, 13);
		Couch.add(lblNewLabel_6_1_1_1);
		
		JButton btnNewButton_2_1_1_1 = new JButton("Delete");
		btnNewButton_2_1_1_1.setForeground(new Color(240, 248, 255));
		btnNewButton_2_1_1_1.setBackground(Color.RED);
		btnNewButton_2_1_1_1.setBounds(687, 109, 85, 21);
		Couch.add(btnNewButton_2_1_1_1);
		
		JLabel lblNewLabel_6_2_1_1_1 = new JLabel("Output :");
		lblNewLabel_6_2_1_1_1.setBounds(471, 132, 85, 13);
		Couch.add(lblNewLabel_6_2_1_1_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1.setBounds(471, 155, 301, 254);
		Couch.add(panel_1_1_1);
		
		JButton btnNewButton_5_2_1 = new JButton("Update");
		btnNewButton_5_2_1.setForeground(new Color(240, 248, 255));
		btnNewButton_5_2_1.setBackground(new Color(50, 205, 50));
		btnNewButton_5_2_1.setBounds(358, 385, 85, 21);
		Couch.add(btnNewButton_5_2_1);
		
		JButton btnNewButton_4_1_1_1 = new JButton("Cancel");
		btnNewButton_4_1_1_1.setForeground(new Color(240, 248, 255));
		btnNewButton_4_1_1_1.setBackground(new Color(255, 99, 71));
		btnNewButton_4_1_1_1.setBounds(264, 385, 85, 21);
		Couch.add(btnNewButton_4_1_1_1);
		
		JButton btnNewButton_3_1_1 = new JButton("Save");
		btnNewButton_3_1_1.setForeground(new Color(240, 248, 255));
		btnNewButton_3_1_1.setBackground(new Color(50, 205, 50));
		btnNewButton_3_1_1.setBounds(359, 171, 85, 21);
		Couch.add(btnNewButton_3_1_1);
		
		JButton btnNewButton_4_1_2 = new JButton("Cancel");
		btnNewButton_4_1_2.setForeground(new Color(240, 248, 255));
		btnNewButton_4_1_2.setBackground(new Color(255, 99, 71));
		btnNewButton_4_1_2.setBounds(264, 171, 85, 21);
		Couch.add(btnNewButton_4_1_2);
		
		JLabel lblNewLabel_12_2_1 = new JLabel("Update details:");
		lblNewLabel_12_2_1.setBounds(10, 225, 183, 13);
		Couch.add(lblNewLabel_12_2_1);
		
		JLabel lblNewLabel_12_1_1_1_1_3 = new JLabel("Enter ID of Couch :");
		lblNewLabel_12_1_1_1_1_3.setBounds(10, 53, 195, 13);
		Couch.add(lblNewLabel_12_1_1_1_1_3);
		
		JLabel lblNewLabel_12_1_1_2 = new JLabel("Enter Ph.no of Couch :");
		lblNewLabel_12_1_1_2.setBounds(10, 132, 195, 13);
		Couch.add(lblNewLabel_12_1_1_2);
		
		JLabel lblNewLabel_12_1_3 = new JLabel("Enter the Name of the Couch :");
		lblNewLabel_12_1_3.setBounds(10, 90, 195, 19);
		Couch.add(lblNewLabel_12_1_3);
		
		JLabel lblNewLabel_12_3 = new JLabel("Enter the details of Couch :");
		lblNewLabel_12_3.setBounds(10, 24, 183, 13);
		Couch.add(lblNewLabel_12_3);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(215, 87, 227, 25);
		Couch.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(217, 126, 227, 25);
		Couch.add(textField_34);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(217, 339, 227, 25);
		Couch.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(215, 300, 227, 25);
		Couch.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(217, 260, 227, 25);
		Couch.add(textField_31);
		
		JLabel lblNewLabel_12_1_1_1_1_3_1 = new JLabel("Enter ID of Couch :");
		lblNewLabel_12_1_1_1_1_3_1.setBounds(10, 266, 195, 13);
		Couch.add(lblNewLabel_12_1_1_1_1_3_1);
		
		JLabel lblNewLabel_12_1_3_1 = new JLabel("Enter the Name of the Couch :");
		lblNewLabel_12_1_3_1.setBounds(10, 303, 195, 19);
		Couch.add(lblNewLabel_12_1_3_1);
		
		JLabel lblNewLabel_12_1_1_2_1 = new JLabel("Enter Ph.no of Couch :");
		lblNewLabel_12_1_1_2_1.setBounds(10, 345, 195, 13);
		Couch.add(lblNewLabel_12_1_1_2_1);
	}
}
