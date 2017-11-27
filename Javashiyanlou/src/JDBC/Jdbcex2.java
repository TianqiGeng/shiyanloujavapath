package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcex2 {
	static final String JDBC_ORIVER="com.mysql.jdbc.Driver";
	static final String DB_URL="jdbc:mysql://localhost/EXAMPLE";
	static final String USER="root";
	static final String PASS="gtq123456";

	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement stmt=null;
		try {
			//将数据库的驱动类动态加载到内存中
			Class.forName("com.mysql.jdbc.Driver");
			
			System.out.println("Connecting to database...");
			//指定数据库连接
			conn=DriverManager.getConnection(DB_URL,USER,PASS);
			
			System.out.println("Creating statement...");
			conn.setAutoCommit(false);
			String sql="INSERT INTO student(id,name,age)VALUES(?,?,?)";
			stmt=conn.prepareStatement(sql);
			stmt.setInt(1, 8);
			stmt.setString(2, "con");
			stmt.setInt(3, 17);
			stmt.addBatch();
			stmt.setInt(1, 88);
			stmt.setString(2, "con");
			stmt.setInt(3, 17);
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
