package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcex {
	static final String JDBC_ORIVER="com.mysql.jdbc.Driver";
	static final String DB_URL="jdbc:mysql://localhost/EXAMPLE";
	static final String USER="root";
	static final String PASS="gtq123456";

	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		try {
			//将数据库的驱动类动态加载到内存中
			Class.forName("com.mysql.jdbc.Driver");
			
			System.out.println("Connecting to database...");
			//指定数据库连接
			conn=DriverManager.getConnection(DB_URL,USER,PASS);
			
			System.out.println("Creating statement...");
			stmt=conn.createStatement();
			conn.setAutoCommit(false);
			String sql1="INSERT INTO student(id,name,age)VALUES(99,'Angle',33)";
			String sql2="INSERT INTO student(id,name,age)VALUES(7,'Angle',33)";
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			int[] count = stmt.executeBatch();
		      conn.commit();
			//处理结果集
			
			stmt.close();
			conn.close();
		}catch(SQLException se){
			se.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
				try {
					if(stmt!=null)
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
						try {
							if(conn!=null)
							conn.close();
						} catch (SQLException se) {
							// TODO Auto-generated catch block
							se.printStackTrace();
						}
		}
		System.out.println("Goodbye!");
	}
}
