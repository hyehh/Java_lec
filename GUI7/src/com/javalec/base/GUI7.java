package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class GUI7 {

	private JFrame frmButtonTest;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI7 window = new GUI7();
					window.frmButtonTest.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI7() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmButtonTest = new JFrame();
		frmButtonTest.setTitle("Button Test");
		frmButtonTest.setBounds(100, 100, 450, 300);
		frmButtonTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmButtonTest.getContentPane().setLayout(null);
		frmButtonTest.getContentPane().add(getBtnNewButton());
		frmButtonTest.getContentPane().add(getLblNewLabel());
		frmButtonTest.getContentPane().add(getTextField());
		frmButtonTest.getContentPane().add(getTextField_1());
		frmButtonTest.getContentPane().add(getTextField_2());
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("OK");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Message");
				}
			});
			btnNewButton.setBounds(170, 109, 117, 29);
		}
		return btnNewButton;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Java Swing Button Test");
			lblNewLabel.setBounds(24, 6, 204, 16);
		}
		return lblNewLabel;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setHorizontalAlignment(SwingConstants.TRAILING);
			textField.setBounds(6, 200, 98, 26);
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setHorizontalAlignment(SwingConstants.TRAILING);
			textField_1.setBounds(143, 200, 98, 26);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setHorizontalAlignment(SwingConstants.TRAILING);
			textField_2.setBounds(285, 200, 98, 26);
			textField_2.setColumns(10);
		}
		return textField_2;
	}
}
