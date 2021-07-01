package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import com.sun.net.httpserver.Authenticator.Result;
//import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class GUI06 {

	private JFrame frame;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JCheckBox chAdd;
	private JCheckBox chMinus;
	private JCheckBox chMultiple;
	private JCheckBox chDivision;
	private JLabel lbl1;
	private JLabel lbl2;
	private JLabel lbl3;
	private JLabel lbl4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI06 window = new GUI06();
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
	public GUI06() {
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
		frame.getContentPane().add(getTfNum1());
		frame.getContentPane().add(getTfNum2());
		frame.getContentPane().add(getChAdd());
		frame.getContentPane().add(getChMinus());
		frame.getContentPane().add(getChMultiple());
		frame.getContentPane().add(getChDivision());
		frame.getContentPane().add(getLbl1());
		frame.getContentPane().add(getLbl2());
		frame.getContentPane().add(getLbl3());
		frame.getContentPane().add(getLbl4());
	}

	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.setBounds(30, 25, 89, 26);
			tfNum1.setColumns(10);
		}
		return tfNum1;
	}
	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.setBounds(30, 83, 89, 26);
			tfNum2.setColumns(10);
		}
		return tfNum2;
	}
	private JCheckBox getChAdd() {
		if (chAdd == null) {
			chAdd = new JCheckBox("+");
			chAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					result();
				}
			});
			chAdd.setBounds(157, 26, 128, 23);
		}
		return chAdd;
	}
	private JCheckBox getChMinus() {
		if (chMinus == null) {
			chMinus = new JCheckBox("-");
			chMinus.setBounds(157, 53, 128, 23);
		}
		return chMinus;
	}
	private JCheckBox getChMultiple() {
		if (chMultiple == null) {
			chMultiple = new JCheckBox("X");
			chMultiple.setBounds(157, 83, 128, 23);
		}
		return chMultiple;
	}
	private JCheckBox getChDivision() {
		if (chDivision == null) {
			chDivision = new JCheckBox("/");
			chDivision.setBounds(157, 111, 128, 23);
		}
		return chDivision;
	}
	private JLabel getLbl1() {
		if (lbl1 == null) {
			lbl1 = new JLabel("");
			lbl1.setBounds(30, 161, 226, 16);
		}
		return lbl1;
	}
	private JLabel getLbl2() {
		if (lbl2 == null) {
			lbl2 = new JLabel("");
			lbl2.setBounds(30, 189, 192, 16);
		}
		return lbl2;
	}
	private JLabel getLbl3() {
		if (lbl3 == null) {
			lbl3 = new JLabel("");
			lbl3.setBounds(30, 217, 192, 16);
		}
		return lbl3;
	}
	private JLabel getLbl4() {
		if (lbl4 == null) {
			lbl4 = new JLabel("");
			lbl4.setBounds(30, 245, 175, 16);
		}
		return lbl4;
	}
	
	private void result() {
		int wkNum1 = Integer.parseInt(tfNum1.getText());
		int wkNum2 = Integer.parseInt(tfNum2.getText());
		
		int wkResultAdd = wkNum1 + wkNum2;
		int wkResultMinus = wkNum1 - wkNum2;
		int wkResultMultiple = wkNum1 * wkNum2;
		double wkResultDivision = (double)wkNum1 / (double)wkNum2;
		
		if(chAdd.isSelected()==true) {
			lbl1.setText(Integer.toString(wkResultAdd));
		}

		
		if(chAdd.isSelected()==false) {
			lbl1.setText(Integer.toString(wkResultMinus));
		}else {
			lbl2.setText(Integer.toString(wkResultMinus));
			
		}

		
		if((chAdd.isSelected()==false&&chMinus.isSelected()==true)||(chAdd.isSelected()==true&&chMinus.isSelected()==false)) {
			lbl2.setText(Integer.toString(wkResultMultiple));
			
		}else if((chAdd.isSelected()==false&&chMinus.isSelected()==false)) {
			lbl1.setText(Integer.toString(wkResultMultiple));
			
		}else {
			lbl3.setText(Integer.toString(wkResultMultiple));
			
		}
		
		if(chAdd.isSelected()==true&&chMinus.isSelected()==true&&chDivision.isSelected()==true) {
			lbl4.setText(String.format("%.2f", wkResultDivision));

		}else if(chAdd.isSelected()==false&&chMinus.isSelected()==false&&chDivision.isSelected()==false){
			lbl1.setText(String.format("%.2f", wkResultDivision));
			
		}else if((chAdd.isSelected()==false&&chMinus.isSelected()==true&&chMultiple.isSelected()==false)||(chAdd.isSelected()==false&&chMinus.isSelected()==false&&chDivision.isSelected()==true)||
				(chAdd.isSelected()==true&&chMinus.isSelected()==false&&chDivision.isSelected()==false)) {
			lbl2.setText(String.format("%.2f", wkResultDivision));
			
		}else {
			lbl3.setText(String.format("%.2f", wkResultDivision));
			
		}
		
		
		
//		ArrayList<String> arrayList = new ArrayList<String>();
//		
//		arrayList.add(+)
//		
		
	}
	
	
	
	
	
	
}
