package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcupdate {
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
			stmt=conn.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE
					);
			
			String sql;
			sql="SELECT id,name,age FROM student";
			ResultSet rs=stmt.executeQuery(sql);
			
			System.out.println("Moving cursor to the last...");
			rs.moveToInsertRow();
			rs.updateInt("id", 22);
			rs.updateString("name", "John");
			rs.updateInt("age", 21);
			rs.insertRow();
			//处理结果集
			System.out.println("Displaying record...");
			int id=rs.getInt("id");
			int age=rs.getInt("age");
			String name=rs.getString("name");
			System.out.print("Id:"+id);
			System.out.print(",Age:"+age);
			System.out.print(",Name:"+name);
			System.out.println();
			
			
	        rs.close();
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
