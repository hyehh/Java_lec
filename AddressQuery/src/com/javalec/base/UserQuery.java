package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UserQuery {

	private JFrame frame;
	private JComboBox cbSelection;
	private JTextField tfSelection;
	private JButton btnQuery;
	private JScrollPane scrollPane;
	private JTable Inner_Table;
	private JLabel lblNewLabel;
	private JTextField tfSeqno;
	private JLabel lblNewLabel_1;
	private JTextField tfName;
	private JLabel lblNewLabel_1_1;
	private JTextField tfTelno;
	private JLabel lbltfAddress;
	private JTextField tfAddress;
	private JLabel lbltfEmail;
	private JTextField tfEmail;
	private JLabel lbltfRelation;
	private JTextField tfRelation;

	// Database 환경 정의
	private final String url_mysql = "jdbc:mysql://192.168.0.128/useraddress?serverTimezone=UTC&characterEncoding=utf8&useSSL=FALSE";
	//                                             ip 주소        데이터베이스 이름?
	private final String id_mysql = "root";
	private final String pw_mysql = "qwer1234";
	
	
	// Table 환경 정의
	private final DefaultTableModel Outer_Table = new DefaultTableModel();
	private JTextField tfCount;
	private JLabel lblNewLabel_2;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserQuery window = new UserQuery();
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
	public UserQuery() {
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
				
				tableInit();
				searchAction();
			}
		});
		frame.setTitle("주소록 검색");
		frame.setBounds(100, 100, 449, 438);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getCbSelection());
		frame.getContentPane().add(getTfSelection());
		frame.getContentPane().add(getBtnQuery());
		frame.getContentPane().add(getScrollPane());
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getTfSeqno());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getTfName());
		frame.getContentPane().add(getLblNewLabel_1_1());
		frame.getContentPane().add(getTfTelno());
		frame.getContentPane().add(getLbltfAddress());
		frame.getContentPane().add(getTfAddress());
		frame.getContentPane().add(getLbltfEmail());
		frame.getContentPane().add(getTfEmail());
		frame.getContentPane().add(getLbltfRelation());
		frame.getContentPane().add(getTfRelation());
		frame.getContentPane().add(getTfCount());
		frame.getContentPane().add(getLblNewLabel_2());
	}
	private JComboBox getCbSelection() {
		if (cbSelection == null) {
			cbSelection = new JComboBox();
			cbSelection.setModel(new DefaultComboBoxModel(new String[] {"이름", "주소", "관계"}));
			cbSelection.setBounds(21, 19, 111, 27);
		}
		return cbSelection;
	}
	private JTextField getTfSelection() {
		if (tfSelection == null) {
			tfSelection = new JTextField();
			tfSelection.setBounds(144, 18, 193, 26);
			tfSelection.setColumns(10);
		}
		return tfSelection;
	}
	private JButton getBtnQuery() {
		if (btnQuery == null) {
			btnQuery = new JButton("검색");
			btnQuery.setBounds(349, 18, 83, 29);
		}
		return btnQuery;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(31, 58, 384, 100);
			scrollPane.setViewportView(getInner_Table());
		}
		return scrollPane;
	}
	private JTable getInner_Table() {
		if (Inner_Table == null) {
			Inner_Table = new JTable();
			Inner_Table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					tableClick();				
				}
			});
			Inner_Table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			
			Inner_Table.setModel(Outer_Table); //*******중요********
		}
		return Inner_Table;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Seq No :");
			lblNewLabel.setBounds(33, 183, 61, 16);
		}
		return lblNewLabel;
	}
	private JTextField getTfSeqno() {
		if (tfSeqno == null) {
			tfSeqno = new JTextField();
			tfSeqno.setEditable(false);
			tfSeqno.setBounds(106, 178, 61, 26);
			tfSeqno.setColumns(10);
		}
		return tfSeqno;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("이름 :");
			lblNewLabel_1.setBounds(31, 216, 61, 16);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setEditable(false);
			tfName.setColumns(10);
			tfName.setBounds(104, 211, 130, 26);
		}
		return tfName;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("전화번호 :");
			lblNewLabel_1_1.setBounds(33, 251, 61, 16);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getTfTelno() {
		if (tfTelno == null) {
			tfTelno = new JTextField();
			tfTelno.setEditable(false);
			tfTelno.setColumns(10);
			tfTelno.setBounds(106, 246, 130, 26);
		}
		return tfTelno;
	}
	private JLabel getLbltfAddress() {
		if (lbltfAddress == null) {
			lbltfAddress = new JLabel("주소 :");
			lbltfAddress.setBounds(33, 289, 61, 16);
		}
		return lbltfAddress;
	}
	private JTextField getTfAddress() {
		if (tfAddress == null) {
			tfAddress = new JTextField();
			tfAddress.setEditable(false);
			tfAddress.setColumns(10);
			tfAddress.setBounds(106, 284, 315, 26);
		}
		return tfAddress;
	}
	private JLabel getLbltfEmail() {
		if (lbltfEmail == null) {
			lbltfEmail = new JLabel("전자우편 :");
			lbltfEmail.setBounds(33, 327, 61, 16);
		}
		return lbltfEmail;
	}
	private JTextField getTfEmail() {
		if (tfEmail == null) {
			tfEmail = new JTextField();
			tfEmail.setEditable(false);
			tfEmail.setColumns(10);
			tfEmail.setBounds(106, 322, 182, 26);
		}
		return tfEmail;
	}
	private JLabel getLbltfRelation() {
		if (lbltfRelation == null) {
			lbltfRelation = new JLabel("관계 :");
			lbltfRelation.setBounds(31, 360, 61, 16);
		}
		return lbltfRelation;
	}
	private JTextField getTfRelation() {
		if (tfRelation == null) {
			tfRelation = new JTextField();
			tfRelation.setEditable(false);
			tfRelation.setColumns(10);
			tfRelation.setBounds(104, 355, 298, 26);
		}
		return tfRelation;
	}
	
	// 화면 Table 초기화
	private void tableInit() {
		Outer_Table.addColumn("순서");
		Outer_Table.addColumn("이름");
		Outer_Table.addColumn("전화번호");
		Outer_Table.addColumn("관계");
		Outer_Table.setColumnCount(4);
		
		int i = Outer_Table.getRowCount();
		for(int j=0; i<i; j++) {
			Outer_Table.removeRow(0);
			// 0이라고 적은 이유? 계속 0번만 지우라고 시킨 것! 0번만 지우면 반복문 돌면서 다 지워지기 때문에!
			// j라고 적으면 0번 먼저 지우고 그 다음에 1번 지우러감 (근데 원래 1번에 있던 게 0번이 지워지면서 0번으로 땡겨짐)
		
		}
		
		Inner_Table.setAutoResizeMode(Inner_Table.AUTO_RESIZE_OFF);
		
		int vColIndex  = 0;
		TableColumn col = Inner_Table.getColumnModel().getColumn(vColIndex);
		int width = 30;
		col.setPreferredWidth(width);
		
		vColIndex  = 1;
		col = Inner_Table.getColumnModel().getColumn(vColIndex);
		width = 100;
		col.setPreferredWidth(width);
		
		vColIndex  = 2;
		col = Inner_Table.getColumnModel().getColumn(vColIndex);
		width = 100;
		col.setPreferredWidth(width);
		
		vColIndex  = 3;
		col = Inner_Table.getColumnModel().getColumn(vColIndex);
		width = 200;
		col.setPreferredWidth(width);
		
	}
	
	private void searchAction() {
		String query = "select seqno, name, telno, relation from userinfo";
		int dataCount = 0;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			// connection 이라는 인터페이스 만들어준 것
			Statement stmt_mysql = conn_mysql.createStatement();
			
			ResultSet rs = stmt_mysql.executeQuery(query);
			
	
			while(rs.next()) {
				String[] qTxt = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)};
				//시퀀스넘버, 이름 , 전화번호, 관계를 의미
				Outer_Table.addRow(qTxt);
				dataCount++;
				//while에서 몇 명인지 알 수 있음! 얼마나 도는지만 알면 되기 때문!
			}
			
			conn_mysql.close();
			tfCount.setText(Integer.toString(dataCount));
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
	}
	
	
	// Table Clicked
	
	private void tableClick() {
		int i = Inner_Table.getSelectedRow();
		// 이제 줄은 들어옴
		String wkSeq = (String) Inner_Table.getValueAt(i, 0);
		

		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			// connection 이라는 인터페이스 만들어준 것
			Statement stmt_mysql = conn_mysql.createStatement();

			String query = "select seqno, name, telno, address, email, relation from userinfo where seqno=" + wkSeq;
			
			ResultSet rs = stmt_mysql.executeQuery(query);
			
			
			while(rs.next()) {
				
				tfSeqno.setText(rs.getString(1));
				tfName.setText(rs.getString(2));
				tfTelno.setText(rs.getString(3));
				tfAddress.setText(rs.getString(4));
				tfEmail.setText(rs.getString(5));
				tfRelation.setText(rs.getString(6));
				
				
//				String[] qTxt = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)};
//				Outer_Table.addRow(qTxt);
			}

			

			conn_mysql.close();
			
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	
	private JTextField getTfCount() {
		if (tfCount == null) {
			tfCount = new JTextField();
			tfCount.setEditable(false);
			tfCount.setBounds(361, 158, 36, 26);
			tfCount.setColumns(10);
		}
		return tfCount;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("명");
			lblNewLabel_2.setBounds(400, 165, 21, 16);
		}
		return lblNewLabel_2;
	}

	
	
}

