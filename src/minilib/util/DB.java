package minilib.util;
//工具包，连接数据库

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
	//数据库的用户信息
	private static String rootname="root";
	private static String rootpass="123456";
	//mysql的驱动程序
	private static String driver="com.mysql.jdbc.Driver";
	//数据库的位置
	private static String url="jdbc:mysql://localhost:3306/book";//连接到book数据库
	//创建与数据库连接
	public static Connection getConnection()throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
		Class.forName(driver).newInstance();//??
		return DriverManager.getConnection(url,rootname,rootpass);
	}
}
