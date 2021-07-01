package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.DefaultEditorKit.InsertBreakAction;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AddressInsert {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JTextField tfName;
	private JButton btnOK;
	
	
	// Database 환경 정의
	private final String url_mysql = "jdbc:mysql://192.168.0.128/useraddress?serverTimezone=UTC&characterEncoding=utf8&useSSL=FALSE";
	//                                             ip 주소        데이터베이스 이름?
	private final String id_mysql = "root";
	private final String pw_mysql = "qwer1234";
	private JTextField tfTelno;
	private JLabel lblNewLabel_1;
	private JTextField tfAddress;
	private JLabel lblNewLabel_2;
	private JTextField tfEmail;
	private JLabel lblNewLabel_3;
	private JTextField tfRelationship;
	private JLabel lblNewLabel_4;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddressInsert window = new AddressInsert();
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
	public AddressInsert() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("주소록 등록");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getTfName());
		frame.getContentPane().add(getBtnOK());
		frame.getContentPane().add(getTfTelno());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getTfAddress());
		frame.getContentPane().add(getLblNewLabel_2());
		frame.getContentPane().add(getTfEmail());
		frame.getContentPane().add(getLblNewLabel_3());
		frame.getContentPane().add(getTfRelationship());
		frame.getContentPane().add(getLblNewLabel_4());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("성명 :");
			lblNewLabel.setBounds(35, 30, 61, 16);
		}
		return lblNewLabel;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setBounds(107, 25, 130, 26);
			tfName.setColumns(10);
		}
		return tfName;
	}
	private JButton getBtnOK() {
		if (btnOK == null) {
			btnOK = new JButton("입력");
			btnOK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
//					int i_chk = insertFieldCheck();
//					if(i_chk ==0) {
//						insertAction();
//					}
					
					if(tfName.getText().trim().isEmpty() || tfTelno.getText().trim().isEmpty() || tfAddress.getText().trim().isEmpty() || tfEmail.getText().trim().isEmpty() || tfRelationship.getText().trim().isEmpty()) {
						checkArray();
					}else {
						insertAction();
					}
					
												}
			});
			btnOK.setBounds(309, 222, 117, 29);
		}
		return btnOK;
	}
	
	private void insertAction() { // 사용자 정보 입력
		PreparedStatement ps = null;
		// 언어 변환 같은 느낌
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			// connection 이라는 인터페이스 만들어준 것
			Statement stmt_mysql = conn_mysql.createStatement();
			
			String query = "insert into userinfo (name, telno, address, email, relation)";
			String query1 = " values (?,?,?,?,?)";
//			String query = "insert into userinfo (name, telno, address, email, relation) values (?, ?, ?, ?, ?)";
//			이런 방법도 있음
			
			ps = conn_mysql.prepareStatement(query+query1);
			ps.setString(1, tfName.getText().trim());
			ps.setString(2, tfTelno.getText().trim());
			ps.setString(3, tfAddress.getText().trim());
			ps.setString(4, tfEmail.getText().trim());
			ps.setString(5, tfRelationship.getText().trim());
			ps.executeUpdate(); //DB에 스트링을 insert해준다
			
			conn_mysql.close();
			
			JOptionPane.showMessageDialog(null, tfName.getText() + "님의 정보가 입력되었습니다!");
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	
//	private void insertAction() { // 사용자 정보 입력
//		PreparedStatement ps = null;
//		// 언어 변환 같은 느낌
//		try {
//			
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
//			// connection 이라는 인터페이스 만들어준 것
//			Statement stmt_mysql = conn_mysql.createStatement();
//			
//			String query = "insert into userinfo (name) values (?)";
//			
//			ps = conn_mysql.prepareStatement(query);
//			ps.setString(1, tfName.getText().trim()); // 사용자가 tf에 입력한 값을 스트링 값으로 변환시켜준다.
//			ps.executeUpdate(); //DB에 스트링을 insert해준다
//			
//			conn_mysql.close();
//			
//			JOptionPane.showMessageDialog(null, tfName.getText() + "님의 정보가 입력되었습니다!");
//			
//		}catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		
//	}
	
	private JTextField getTfTelno() {
		if (tfTelno == null) {
			tfTelno = new JTextField();
			tfTelno.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			tfTelno.setBounds(107, 63, 130, 26);
			tfTelno.setColumns(10);
		}
		return tfTelno;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("전화번호 :");
			lblNewLabel_1.setBounds(35, 68, 61, 16);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfAddress() {
		if (tfAddress == null) {
			tfAddress = new JTextField();
			tfAddress.setBounds(107, 101, 308, 26);
			tfAddress.setColumns(10);
		}
		return tfAddress;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("주소 :");
			lblNewLabel_2.setBounds(35, 106, 61, 16);
		}
		return lblNewLabel_2;
	}
	private JTextField getTfEmail() {
		if (tfEmail == null) {
			tfEmail = new JTextField();
			tfEmail.setBounds(107, 139, 191, 26);
			tfEmail.setColumns(10);
		}
		return tfEmail;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("전자우편 :");
			lblNewLabel_3.setBounds(35, 144, 61, 16);
		}
		return lblNewLabel_3;
	}
	

	private JTextField getTfRelationship() {
		if (tfRelationship == null) {
			tfRelationship = new JTextField();
			tfRelationship.setBounds(107, 177, 307, 26);
			tfRelationship.setColumns(10);
		}
		return tfRelationship;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("관계 :");
			lblNewLabel_4.setBounds(35, 182, 61, 16);
		}
		return lblNewLabel_4;
	}
	
	private int insertFieldCheck(){
		int i = 0;
		String message = "Please confirm ";
		if(tfName.getText().trim().length() == 0) {
			i++;
			message = message + "name ";
			tfName.requestFocus();
		}
		if(tfTelno.getText().trim().length() == 0) {
			i++;
			message = message + "telephone ";
			tfTelno.requestFocus();
		}
		if(tfAddress.getText().trim().length() == 0) {
			i++;
			message = message + "address ";
			tfAddress.requestFocus();
		}
		if(tfEmail.getText().trim().length() == 0) {
			i++;
			message = message + "email ";
			tfEmail.requestFocus();
		}
		if(tfRelationship.getText().trim().length() == 0) {
			i++;
			message = message + "relationship ";
			tfRelationship.requestFocus();
		}
		
		if(i>0) {
			JOptionPane.showMessageDialog(null, message);
		}
		return i;
	}
	

	private void checkArray() {
		String[] input = {tfName.getText(), tfTelno.getText(), tfAddress.getText(), tfEmail.getText(), tfRelationship.getText()};
		String[] output = {"name", "telephone", "address", "email", "relationship"};
		for(int i=0; i<input.length; i++) {
			if(input[i].isEmpty()) {
				
			}
			JOptionPane.showMessageDialog(null, output[i]);
		}
	}
	
	
	private void check() {
		
		
//		String str = " is empty. Fill in the blanks";
//		if(tfRelationship.getText().trim().isEmpty()){
//			str = "relationship " + str;
//		}
//		if(tfEmail.getText().trim().isEmpty()){
//			str = "email " + str;
//		}
//		if(tfAddress.getText().trim().isEmpty()) {
//			str = "address " + str;
//		}
//		if(tfTelno.getText().trim().isEmpty()) {
//			str = "telephone " + str;
//		}
//		if(tfName.getText().trim().isEmpty()) {
//			str = "name " + str;
//		}
//		JOptionPane.showMessageDialog(null, str);
		
		
		String str = " is empty. Fill in the blanks";
		if(tfRelationship.getText().trim().isEmpty()){
			str = "relationship " + str;
		}
		if(tfEmail.getText().trim().isEmpty()){
			str = "email " + str;
		}
		if(tfAddress.getText().trim().isEmpty()) {
			str = "address " + str;
		}
		if(tfTelno.getText().trim().isEmpty()) {
			str = "telephone " + str;
		}
		if(tfName.getText().trim().isEmpty()) {
			str = "name " + str;
		}
		JOptionPane.showMessageDialog(null, str);

	}
}
