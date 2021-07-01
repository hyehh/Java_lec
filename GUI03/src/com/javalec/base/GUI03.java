package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;

//import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

//import org.graalvm.compiler.core.common.type.VoidStamp;

import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI03 {

	private JFrame frame;
	private JComboBox cb1;
	private JComboBox cb2;
	private JComboBox cb3;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI03 window = new GUI03();
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
	public GUI03() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getCb1());
		frame.getContentPane().add(getCb2());
		frame.getContentPane().add(getCb3());
		frame.getContentPane().add(getTextField());
	}
	private JComboBox getCb1() {
		if (cb1 == null) {
			cb1 = new JComboBox();
			cb1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					result();
				}
			});
			cb1.setModel(new DefaultComboBoxModel(new String[] {"2", "3", "4", "5", "6", "7", "8", "9"}));
			cb1.setBounds(21, 17, 69, 27);
		}
		return cb1;
	}
	private JComboBox getCb2() {
		if (cb2 == null) {
			cb2 = new JComboBox();
			cb2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					result();
				}
			});
			cb2.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "X", "/"}));
			cb2.setBounds(112, 17, 69, 27);
		}
		return cb2;
	}
	private JComboBox getCb3() {
		if (cb3 == null) {
			cb3 = new JComboBox();
			cb3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					result();
				}
			});
			cb3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
			cb3.setBounds(203, 17, 69, 27);
		}
		return cb3;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setEditable(false);
			textField.setBounds(293, 16, 92, 26);
			textField.setColumns(10);
		}
		return textField;
	}
	public void result() {
		
		
		int wkNum1 = Integer.parseInt(cb1.getSelectedItem().toString());
		int wkNum2 = Integer.parseInt(cb3.getSelectedItem().toString());
		String division = cb2.getSelectedItem().toString();
		

		if(division=="+") {
			textField.setText(Integer.toString(wkNum1+wkNum2));
		}else if(division=="-") {
			textField.setText(Integer.toString(wkNum1-wkNum2));
		}else if(division=="X") {
			textField.setText(Integer.toString(wkNum1*wkNum2));
		}else {
			try {
				
				textField.setText(String.format("%.2f", (double)wkNum1/(double)wkNum2));
			}catch (Exception e) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
		

//		int wkNum1 = cb1.getSelectedIndex()+2;
//		int wkNum2 = cb3.getSelectedIndex()+1;
//		
//		switch (cb2.getSelectedIndex()) {
//		case 0:
//			textField.setText(Integer.toString(wkNum1+wkNum2));
//			break;
//		case 1:
//			textField.setText(Integer.toString(wkNum1-wkNum2));
//			break;
//		case 2:
//			textField.setText(Integer.toString(wkNum1*wkNum2));
//			break;
//		case 3:
//			textField.setText(String.format("%.2f", (double)wkNum1/(double)wkNum2));
//		default:
//			break;
//		}
		
		
	}
	
	
	
	
}
