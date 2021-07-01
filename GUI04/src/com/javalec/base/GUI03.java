package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class GUI03 {

	private JFrame frmCheckboxRadio;
	private JCheckBox chApple;
	private JCheckBox chBanana;
	private JButton btnFruit;
	private JTextField tfFruit;
	private JRadioButton rbKBS;
	private JRadioButton rbMBC;
	private JButton btnBroad;
	private JTextField tfBroad;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI03 window = new GUI03();
					window.frmCheckboxRadio.setVisible(true);
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
		frmCheckboxRadio = new JFrame();
		frmCheckboxRadio.setTitle("CheckBox / Radio Button");
		frmCheckboxRadio.setBounds(100, 100, 487, 218);
		frmCheckboxRadio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCheckboxRadio.getContentPane().setLayout(null);
		frmCheckboxRadio.getContentPane().add(getChApple());
		frmCheckboxRadio.getContentPane().add(getChBanana());
		frmCheckboxRadio.getContentPane().add(getBtnFruit());
		frmCheckboxRadio.getContentPane().add(getTfFruit());
		frmCheckboxRadio.getContentPane().add(getRbKBS());
		frmCheckboxRadio.getContentPane().add(getRbMBC());
		frmCheckboxRadio.getContentPane().add(getBtnBroad());
		frmCheckboxRadio.getContentPane().add(getTfBroad());
	}
	private JCheckBox getChApple() {
		if (chApple == null) {
			chApple = new JCheckBox("Apple");
			chApple.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					fruitCheck();
				}
			});
			chApple.setBounds(24, 20, 128, 23);
		}
		return chApple;
	}
	private JCheckBox getChBanana() {
		if (chBanana == null) {
			chBanana = new JCheckBox("Banana");
			chBanana.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					fruitCheck();
				}
			});
			chBanana.setBounds(24, 63, 128, 23);
		}
		return chBanana;
	}
	private JButton getBtnFruit() {
		if (btnFruit == null) {
			btnFruit = new JButton("OK");
			btnFruit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					fruitCheck();
				}
			});
			btnFruit.setBounds(24, 103, 117, 29);
		}
		return btnFruit;
	}
	private JTextField getTfFruit() {
		if (tfFruit == null) {
			tfFruit = new JTextField();
			tfFruit.setBounds(24, 144, 204, 26);
			tfFruit.setColumns(10);
		}
		return tfFruit;
	}
	
	private void fruitCheck() {
		tfFruit.setText("");
		if(chApple.isSelected() == true) {
			tfFruit.setText("Apple이 선택 되었습니다.");
		}
		
		if(chBanana.isSelected() == true) {
			tfFruit.setText("Banana가 선택 되었습니다.");
		}
		
		if(chApple.isSelected() && chBanana.isSelected() == true) {
			tfFruit.setText("Apple, Banana가 선택 되었습니다.");
		}
//		if(chApple.isSelected() == true && chBanana.isSelected() == true) {
//			tfFruit.setText("Apple, Banana가 선택 되었습니다.");
//		}
		
		
		
		
	}
	private JRadioButton getRbKBS() {
		if (rbKBS == null) {
			rbKBS = new JRadioButton("KBS");
			rbKBS.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					broadCheck();
				}
			});
			buttonGroup.add(rbKBS);
			rbKBS.setBounds(246, 20, 141, 23);
		}
		return rbKBS;
	}
	private JRadioButton getRbMBC() {
		if (rbMBC == null) {
			rbMBC = new JRadioButton("MBC");
			rbMBC.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					broadCheck();
				}
			});
			buttonGroup.add(rbMBC);
			rbMBC.setBounds(246, 63, 141, 23);
		}
		return rbMBC;
	}
	private JButton getBtnBroad() {
		if (btnBroad == null) {
			btnBroad = new JButton("OK");
			btnBroad.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					broadCheck();
				}
			});
			btnBroad.setBounds(246, 103, 117, 29);
		}
		return btnBroad;
	}
	private JTextField getTfBroad() {
		if (tfBroad == null) {
			tfBroad = new JTextField();
			tfBroad.setBounds(256, 144, 188, 26);
			tfBroad.setColumns(10);
		}
		return tfBroad;
	}
	
	private void broadCheck() {
		if(rbKBS.isSelected()==true) {
			tfBroad.setText("KBS가 선택 되었습니다.");
		}
		if(rbMBC.isSelected()==true) {
			tfBroad.setText("MBC가 선택 되었습니다.");
		}
		
	}
	
	
	
	
	
}
