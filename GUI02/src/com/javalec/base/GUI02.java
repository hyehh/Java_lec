package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class GUI02 {

	private JFrame frmCombobox;
	private JComboBox cbFruits;
	private JTextField tfFruits;
	private JTextField tfAdd;
	private JButton btnAdd;
	private JComboBox cbAdd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI02 window = new GUI02();
					window.frmCombobox.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI02() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCombobox = new JFrame();
		frmCombobox.setTitle("ComboBox");
		frmCombobox.setBounds(100, 100, 450, 300);
		frmCombobox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCombobox.getContentPane().setLayout(null);
		frmCombobox.getContentPane().add(getCbFruits());
		frmCombobox.getContentPane().add(getTfFruits());
		frmCombobox.getContentPane().add(getTfAdd());
		frmCombobox.getContentPane().add(getBtnAdd());
		frmCombobox.getContentPane().add(getCbAdd());
	}
	private JComboBox getCbFruits() {
		if (cbFruits == null) {
			cbFruits = new JComboBox();
			cbFruits.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
//					int stFruit = cbFruits.getSelectedIndex();
//					tfFruits.setText(stFruit);
					String stFruit = cbFruits.getSelectedItem().toString();
					tfFruits.setText(stFruit);
				}
			});
			cbFruits.setModel(new DefaultComboBoxModel(new String[] {"Apple", "Banana", "Grape", "Mango", "Melon"}));
			cbFruits.setBounds(22, 21, 119, 27);
		}
		return cbFruits;
	}
	private JTextField getTfFruits() {
		if (tfFruits == null) {
			tfFruits = new JTextField();
			tfFruits.setBounds(186, 18, 130, 26);
			tfFruits.setColumns(10);
		}
		return tfFruits;
	}
	private JTextField getTfAdd() {
		if (tfAdd == null) {
			tfAdd = new JTextField();
			tfAdd.setBounds(31, 76, 113, 26);
			tfAdd.setColumns(10);
		}
		return tfAdd;
	}
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("Add");
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					addCombo();
				}
			});
			btnAdd.setBounds(29, 119, 117, 29);
		}
		return btnAdd;
	}
	private JComboBox getCbAdd() {
		if (cbAdd == null) {
			cbAdd = new JComboBox();
			cbAdd.setBounds(183, 77, 131, 27);
		}
		return cbAdd;
	}
	
	private void addCombo() {
		String stTemp = tfAdd.getText();
		cbAdd.addItem(stTemp);
	}
	
	
	
	
	
	
}
