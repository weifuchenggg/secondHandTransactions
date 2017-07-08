package hzu.com.cn.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbutil {
	private String dbUrl="jdbc:mysql://localhost:3306/secondhandtransactions";
	private String dbusername="root";
	private String dbpassword="123456";
	private String jdbcNameString="com.mysql.jdbc.Driver";
	public Connection getCon() throws Exception{
		Class.forName(jdbcNameString);
		Connection con=DriverManager.getConnection(dbUrl, dbusername, dbpassword);
		return con;
	}
	public void closeCon(Connection con) throws SQLException
	{
		if(con!=null)
			con.close();
	}
	public static void main(String []args) 
	{
		Dbutil dbUtil=new Dbutil();
		try {
			Connection connection= dbUtil.getCon();
			System.out.println("成功连接");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
