/*
 * Shopping.java
 *
 * Created on __DATE__, __TIME__
 */

package hzu.com.cn.view;

import hzu.com.cn.dao.ComTypeDao;
import hzu.com.cn.dao.CommDao;
import hzu.com.cn.dao.SalesReDao;
import hzu.com.cn.dao.UserDao;
import hzu.com.cn.model.Comm;
import hzu.com.cn.model.SalesRecond;
import hzu.com.cn.model.User;
import hzu.com.cn.util.Dbutil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.xml.crypto.Data;

/**
 *
 * @author  __USER__
 */
public class Shopping extends javax.swing.JInternalFrame {
	User user = new User();
	Connection connection = null;
	Dbutil dbutil = new Dbutil();
	CommDao comDao = new CommDao();
	public MainFrom f1=null;
	int count;

	/** Creates new form Shopping */
	public Shopping(User user) {
		initComponents();
		this.user = user;
		DefaultTableModel defaultTableModel = (DefaultTableModel) jTable1
				.getModel();
		defaultTableModel.setRowCount(0);
		Connection connection = null;
		Dbutil dbutil = new Dbutil();
		ComTypeDao comTypeDao = new ComTypeDao();
		try {
			connection = dbutil.getCon();
			ResultSet resultSet = comTypeDao.GettypeResultSet(connection);
			while (resultSet.next()) {
				Vector a = new Vector();
				a.add(resultSet.getString(2));
				defaultTableModel.addRow(a);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			filltable1();
		}

	}

	private void filltable1() {
		try {
			connection = dbutil.getCon();
			DefaultTableModel defaultTableModel = (DefaultTableModel) jTable2
					.getModel();
			defaultTableModel.setRowCount(0);
			ResultSet resultSet = comDao.GetComResultSet(connection,
					jTextField1.getText());
			while (resultSet.next()) {
				Vector a = new Vector();
				a.add(resultSet.getString(2));
				a.add(resultSet.getString(3));
				a.add(resultSet.getFloat(6));
				a.add(resultSet.getInt(5));
				a.add(resultSet.getInt(10) + "-" + resultSet.getInt(11));
				a.add(resultSet.getInt(1));
				//	a.add(resultSet.getString(7));
				//	a.add(resultSet.getString(8));
				defaultTableModel.addRow(a);
			}
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
		jScrollPane2 = new javax.swing.JScrollPane();
		jTable2 = new javax.swing.JTable();
		jLabel2 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jButton2 = new javax.swing.JButton();
		jLabel4 = new javax.swing.JLabel();
		jTextField4 = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		jTextField5 = new javax.swing.JTextField();
		jButton3 = new javax.swing.JButton();

		setClosable(true);
		setIconifiable(true);

		jLabel1.setText("\u5546\u54c1\u540d");

		jButton1.setText("\u67e5\u8be2");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null } }, new String[] { "导航窗口" }) {
			boolean[] canEdit = new boolean[] { false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				jTable1MousePressed(evt);
			}
		});
		jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jTable1KeyPressed(evt);
			}
		});
		jScrollPane1.setViewportView(jTable1);

		jTable2.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] {

				}, new String[] { "商品名", "商品描述", "单价", "数量", "生产日期", "id" }) {
			boolean[] canEdit = new boolean[] { false, false, false, false,
					false, true };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				jTable2MousePressed(evt);
			}
		});
		jScrollPane2.setViewportView(jTable2);

		jLabel2.setText("id");

		jTextField2.setFont(new java.awt.Font("微软雅黑", 1, 12));
		jTextField2.setEnabled(false);

		jLabel3.setText("\u5546\u54c1\u540d");

		jTextField3.setEnabled(false);

		jButton2.setText("\u8be6\u7ec6\u4fe1\u606f");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jLabel4.setText("\u5355\u4ef7");

		jTextField4.setEnabled(false);

		jLabel5.setText("\u8d2d\u4e70\u6570\u91cf");

		jButton3.setText("\u8d2d\u4e70");
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
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				194,
																				194,
																				194)
																		.addComponent(
																				jLabel1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				119,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				18,
																				18,
																				18)
																		.addComponent(
																				jTextField1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				148,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				64,
																				64,
																				64)
																		.addComponent(
																				jButton1))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				93,
																				93,
																				93)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel4)
																						.addGroup(
																								layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel2)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addGroup(
																												layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addGroup(
																																layout
																																		.createSequentialGroup()
																																		.addComponent(
																																				jScrollPane1,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				120,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																		.addGap(
																																				28,
																																				28,
																																				28)
																																		.addComponent(
																																				jScrollPane2,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				494,
																																				javax.swing.GroupLayout.PREFERRED_SIZE))
																														.addGroup(
																																layout
																																		.createSequentialGroup()
																																		.addGap(
																																				29,
																																				29,
																																				29)
																																		.addGroup(
																																				layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.LEADING,
																																								false)
																																						.addComponent(
																																								jTextField4,
																																								javax.swing.GroupLayout.Alignment.TRAILING)
																																						.addComponent(
																																								jTextField2,
																																								javax.swing.GroupLayout.Alignment.TRAILING,
																																								javax.swing.GroupLayout.DEFAULT_SIZE,
																																								83,
																																								Short.MAX_VALUE))
																																		.addGap(
																																				54,
																																				54,
																																				54)
																																		.addGroup(
																																				layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.LEADING,
																																								false)
																																						.addGroup(
																																								layout
																																										.createSequentialGroup()
																																										.addComponent(
																																												jLabel3)
																																										.addGap(
																																												26,
																																												26,
																																												26)
																																										.addComponent(
																																												jTextField3,
																																												javax.swing.GroupLayout.PREFERRED_SIZE,
																																												127,
																																												javax.swing.GroupLayout.PREFERRED_SIZE))
																																						.addGroup(
																																								layout
																																										.createSequentialGroup()
																																										.addComponent(
																																												jLabel5)
																																										.addPreferredGap(
																																												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																																										.addComponent(
																																												jTextField5)))
																																		.addGap(
																																				68,
																																				68,
																																				68)
																																		.addGroup(
																																				layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.LEADING)
																																						.addComponent(
																																								jButton3)
																																						.addComponent(
																																								jButton2))))))))
										.addContainerGap(70, Short.MAX_VALUE)));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(32, 32, 32)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jLabel1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																38,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jButton1))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jScrollPane2,
																0, 0,
																Short.MAX_VALUE)
														.addComponent(
																jScrollPane1,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																360,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(27, 27, 27)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel2)
														.addComponent(jLabel3)
														.addComponent(
																jTextField3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jButton2))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel4)
														.addComponent(
																jTextField4,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel5)
														.addComponent(
																jTextField5,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jButton3))
										.addContainerGap(25, Short.MAX_VALUE)));

		jLabel5.getAccessibleContext().setAccessibleName("");

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		
		f1.createcomadd(jTextField2.getText(),1);
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		if (jTextField5.getText() != null
				&& jTextField5.getText().equals("") == false) {
			try {
				int a = Integer.parseInt(jTextField5.getText());
				if (a > count || a <= 0) {
					JOptionPane.showMessageDialog(null, "数量输入超过总量或错误");
					return;
				}

				try {
					connection = dbutil.getCon();
					Comm comm = new Comm();
					int k = comDao.comUpdateCount(connection, Integer
							.parseInt(jTextField2.getText()), count - a);
					if (k == 1) {
						JOptionPane.showMessageDialog(null, "购买成功");
						Calendar c = Calendar.getInstance();//可以对每个时间域单独修改
						int year = c.get(Calendar.YEAR); 
						int month = c.get(Calendar.MONTH)+1; 

						SalesRecond salesRecond=new SalesRecond(Integer.parseInt(jTextField2.getText()),a,
								a*Float.parseFloat(jTextField4.getText()),jTextField3.getText(),Integer.parseInt(year+""+month));
						
						SalesReDao salesReDao=new SalesReDao();
						salesReDao.add(connection, salesRecond);
					}
				} catch (Exception e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, e.getMessage());
				}

				//filltable1();

			} catch (Exception e) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(null, "数量输入不正确");
			}

		} else {
			JOptionPane.showMessageDialog(null, "购买失败");
		}
	}

	private void jTable2MousePressed(java.awt.event.MouseEvent evt) {
		try {
			int row = jTable2.getSelectedRow();
			jTextField2.setText(jTable2.getValueAt(row, 5) + "");
			jTextField3.setText(jTable2.getValueAt(row, 0) + "");
			jTextField4.setText(jTable2.getValueAt(row, 2) + "");
			count = Integer.parseInt(jTable2.getValueAt(row, 3) + "");

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
		try {
			int row = jTable1.getSelectedRow();
			String s = jTable1.getValueAt(row, 0) + "";
			connection = dbutil.getCon();
			DefaultTableModel defaultTableModel = (DefaultTableModel) jTable2
					.getModel();
			defaultTableModel.setRowCount(0);
			ResultSet resultSet = comDao.GetComResultSet(connection, s, 0);
			while (resultSet.next()) {
				Vector a = new Vector();
				a.add(resultSet.getString(2));
				a.add(resultSet.getString(3));
				a.add(resultSet.getFloat(6));
				a.add(resultSet.getInt(5));
				a.add(resultSet.getInt(10) + "-" + resultSet.getInt(11));
				a.add(resultSet.getInt(1));
				//	a.add(resultSet.getString(7));
				//	a.add(resultSet.getString(8));
				defaultTableModel.addRow(a);
			}
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

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			connection = dbutil.getCon();
			DefaultTableModel defaultTableModel = (DefaultTableModel) jTable2
					.getModel();
			defaultTableModel.setRowCount(0);
			ResultSet resultSet = comDao.GetComResultSet(connection,
					jTextField1.getText());
			while (resultSet.next()) {
				Vector a = new Vector();
				a.add(resultSet.getString(2));
				a.add(resultSet.getString(3));
				a.add(resultSet.getFloat(6));
				a.add(resultSet.getInt(5));
				a.add(resultSet.getInt(10) + "-" + resultSet.getInt(11));
				a.add(resultSet.getInt(1));
				//	a.add(resultSet.getString(8));
				defaultTableModel.addRow(a);
			}
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

	private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {

	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTable jTable1;
	private javax.swing.JTable jTable2;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	// End of variables declaration//GEN-END:variables

}