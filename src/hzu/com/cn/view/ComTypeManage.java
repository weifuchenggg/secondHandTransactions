/*
 * ComTypeManage.java
 *
 * Created on __DATE__, __TIME__
 */

package hzu.com.cn.view;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import hzu.com.cn.dao.ComTypeDao;
import hzu.com.cn.model.ComType;
import hzu.com.cn.util.Dbutil;

/**
 *
 * @author  __USER__
 */
public class ComTypeManage extends javax.swing.JInternalFrame {

	/** Creates new form ComTypeManage */
	public ComTypeManage() {
		initComponents();
		Filltable();
	}

	private void Filltable() {
		DefaultTableModel defaultTableModel = (DefaultTableModel) jTable1
				.getModel();
		defaultTableModel.setRowCount(0);
		ComTypeDao comTypeDao = new ComTypeDao();
		Dbutil dbutil = new Dbutil();
		try {
			Connection connection = dbutil.getCon();
			ResultSet resultSet = comTypeDao.GettypeResultSet(connection);
			while (resultSet.next()) {
				Vector a = new Vector();
				a.add(resultSet.getInt(1));
				a.add(resultSet.getString(2));
				a.add(resultSet.getString(3));
				defaultTableModel.addRow(a);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

	}

	private void Filltable(String s) {
		DefaultTableModel defaultTableModel = (DefaultTableModel) jTable1
				.getModel();
		defaultTableModel.setRowCount(0);
		ComTypeDao comTypeDao = new ComTypeDao();
		Dbutil dbutil = new Dbutil();
		try {
			Connection connection = dbutil.getCon();
			ResultSet resultSet = comTypeDao.GettypeResultSet(connection, s);
			while (resultSet.next()) {
				Vector a = new Vector();
				a.add(resultSet.getInt(1));
				a.add(resultSet.getString(2));
				a.add(resultSet.getString(3));
				defaultTableModel.addRow(a);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jLabel2 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();

		setClosable(true);
		setIconifiable(true);

		jLabel1.setText("\u8f93\u5165\u8981\u67e5\u627e\u7684\u7c7b\u578b");

		jButton1.setText("\u67e5\u8be2");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] {

				}, new String[] { "编号", "商品类型", "商品描述" }) {
			boolean[] canEdit = new boolean[] { false, false, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				jTable1MousePressed(evt);
			}
		});
		jScrollPane1.setViewportView(jTable1);

		jLabel2.setText("\u5546\u54c1\u7c7b\u578b");

		jTextField2.setEnabled(false);

		jLabel3.setText("\u7c7b\u578b\u63cf\u8ff0");

		jTextArea1.setColumns(20);
		jTextArea1.setRows(5);
		jScrollPane2.setViewportView(jTextArea1);

		jButton2.setText("\u5220\u9664");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setText("\u4fee\u6539");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(55, 55, 55)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jScrollPane1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																580,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel1)
																		.addGap(
																				42,
																				42,
																				42)
																		.addComponent(
																				jTextField1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				261,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				63,
																				63,
																				63)
																		.addComponent(
																				jButton1))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel2)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				jTextField2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				85,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel3)
																						.addComponent(
																								jButton2))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jScrollPane2,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								359,
																								Short.MAX_VALUE)
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addGap(
																												44,
																												44,
																												44)
																										.addComponent(
																												jButton3)))))
										.addContainerGap(92, Short.MAX_VALUE)));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				25,
																				25,
																				25)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jTextField1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								23,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jButton1)))
														.addGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																layout
																		.createSequentialGroup()
																		.addGap(
																				31,
																				31,
																				31)
																		.addComponent(
																				jLabel1)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												262,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(30, 30, 30)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(
																				jLabel2)
																		.addComponent(
																				jLabel3)
																		.addComponent(
																				jTextField2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addComponent(
																jScrollPane2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(40, 40, 40)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton3)
														.addComponent(jButton2))
										.addContainerGap()));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		Connection connection=null;
		Dbutil dbutil=new Dbutil();
		ComType comType = new ComType(jTextField2.getText(), jTextArea1
				.getText());
		ComTypeDao comTypeDao = new ComTypeDao();
		try {
			connection=dbutil.getCon();
			if(comTypeDao.comtypeupdata(connection, comType)==1)
			{
				JOptionPane.showMessageDialog(null, "修改成功");
				Filltable();
			}
			else
				JOptionPane.showMessageDialog(null, "修改不成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
			
		}finally
		{
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		if ("".equals(jTextField2.getText()) || null == jTextField2.getText()) {
			JOptionPane.showMessageDialog(null, "没有选择类型");
			return;
		}
		ComTypeDao comTypeDao = new ComTypeDao();
		ComType comType = new ComType(jTextField2.getText(), jTextArea1
				.getText());
		Dbutil dbutil = new Dbutil();
		Connection connection = null;
		try {
			connection = dbutil.getCon();
			if ((comTypeDao.comtypedelete(connection, comType)) == 1) {
				JOptionPane.showMessageDialog(null, "删除成功");
				Filltable();
			} else
				JOptionPane.showMessageDialog(null, " 删除不成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void jTable1MousePressed(java.awt.event.MouseEvent evt) {
		int row = jTable1.getSelectedRow();
		jTextField2.setText(jTable1.getValueAt(row, 1) + "");
		jTextArea1.setText(jTable1.getValueAt(row, 2) + "");
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		Filltable(jTextField1.getText());
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextArea jTextArea1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	// End of variables declaration//GEN-END:variables

}