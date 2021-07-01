package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import com.sun.net.httpserver.Authenticator.Result;

//import jdk.jfr.internal.PrivateAccess;

import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUI05 {

	private JFrame frame;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JRadioButton rbAdd;
	private JRadioButton rbMius;
	private JRadioButton rbMultiple;
	private JRadioButton rbDivision;
	private JLabel lblResult;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI05 window = new GUI05();
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
	public GUI05() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				rbAdd.setSelected(true);
			}
		});
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getTfNum1());
		frame.getContentPane().add(getTfNum2());
		frame.getContentPane().add(getRbAdd());
		frame.getContentPane().add(getRbMius());
		frame.getContentPane().add(getRbMultiple());
		frame.getContentPane().add(getRbDivision());
		frame.getContentPane().add(getLblResult());
	}
	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.setBounds(29, 27, 91, 26);
			tfNum1.setColumns(10);
		}
		return tfNum1;
	}
	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.setBounds(29, 83, 91, 26);
			tfNum2.setColumns(10);
		}
		return tfNum2;
	}
	private JRadioButton getRbAdd() {
		if (rbAdd == null) {
			rbAdd = new JRadioButton("+");
			rbAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					result();
				}
			});
			buttonGroup.add(rbAdd);
			rbAdd.setBounds(160, 28, 141, 23);
		}
		return rbAdd;
	}
	private JRadioButton getRbMius() {
		if (rbMius == null) {
			rbMius = new JRadioButton("-");
			rbMius.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				result();
				}
			});
			buttonGroup.add(rbMius);
			rbMius.setBounds(160, 55, 141, 23);
		}
		return rbMius;
	}
	private JRadioButton getRbMultiple() {
		if (rbMultiple == null) {
			rbMultiple = new JRadioButton("X");
			rbMultiple.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					result();
				}
			});
			buttonGroup.add(rbMultiple);
			rbMultiple.setBounds(160, 84, 141, 23);
		}
		return rbMultiple;
	}
	private JRadioButton getRbDivision() {
		if (rbDivision == null) {
			rbDivision = new JRadioButton("/");
			rbDivision.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				result();
				}
			});
			buttonGroup.add(rbDivision);
			rbDivision.setBounds(160, 112, 141, 23);
		}
		return rbDivision;
	}
	private JLabel getLblResult() {
		if (lblResult == null) {
			lblResult = new JLabel("");
			lblResult.setBounds(29, 172, 205, 16);
		}
		return lblResult;
	}

	
//	private void addResult() {
//		int wkNum1 = Integer.parseInt(tfNum1.getText());
//		int wkNum2 = Integer.parseInt(tfNum2.getText());
//		
//		lblResult.setText(Integer.toString(wkNum1+wkNum2));
//	}
//	
//	
//	private void minusResult() {
//		int wkNum1 = Integer.parseInt(tfNum1.getText());
//		int wkNum2 = Integer.parseInt(tfNum2.getText());
//		
//		lblResult.setText(Integer.toString(wkNum1-wkNum2));
//		
//	}
//	
//	private void multipleResult() {
//		int wkNum1 = Integer.parseInt(tfNum1.getText());
//		int wkNum2 = Integer.parseInt(tfNum2.getText());
//		
//		lblResult.setText(Integer.toString(wkNum1*wkNum2));
//		
//	}
//	
//	private void divisionResult() {
//		int wkNum1 = Integer.parseInt(tfNum1.getText());
//		int wkNum2 = Integer.parseInt(tfNum2.getText());
//		
//		if(wkNum1==0&&wkNum2==0) {
//			JOptionPane.showMessageDialog(null, "0이 아닌 다른 수를 입력해주세요.");
//		}else if(wkNum1!=0&&wkNum2==0) {
//			JOptionPane.showMessageDialog(null, "0이 아닌 다른 수를 입력해주세요.");
//			
//		}else {
//			lblResult.setText(String.format("%.2f", (double)wkNum1/(double)wkNum2));
//			
//		}
//
//		
//	}
	
	private void result() {
		int wkNum1 = Integer.parseInt(tfNum1.getText());
		int wkNum2 = Integer.parseInt(tfNum2.getText());
		
		if(rbAdd.isSelected() == true) {
			lblResult.setText(Integer.toString(wkNum1)+" + "+Integer.toString(wkNum2)+" = "+Integer.toString(wkNum1+wkNum2));
		}
		if(rbMius.isSelected()==true) {
			lblResult.setText(Integer.toString(wkNum1)+" - "+Integer.toString(wkNum2)+" = "+Integer.toString(wkNum1-wkNum2));
		}
		if(rbMultiple.isSelected()==true) {
			lblResult.setText(Integer.toString(wkNum1)+" X "+Integer.toString(wkNum2)+" = "+Integer.toString(wkNum1*wkNum2));
		}
		if(rbDivision.isSelected()==true) {
			if(wkNum1==0&&wkNum2==0) {
			JOptionPane.showMessageDialog(null, "0이 아닌 다른 수를 입력해주세요.");
		}else if(wkNum1!=0&&wkNum2==0) {
			JOptionPane.showMessageDialog(null, "0이 아닌 다른 수를 입력해주세요.");
			
		}else {
			lblResult.setText(Integer.toString(wkNum1)+" / "+Integer.toString(wkNum2)+" = "+String.format("%.2f", (double)wkNum1/(double)wkNum2));
		}
		
		}
		
	}
	
}
