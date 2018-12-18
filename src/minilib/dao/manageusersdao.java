package minilib.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import minilib.util.DB;
import minilib.vo.user;

//本方法中接受user数据库，
public class manageusersdao {
	
	public boolean findalluser(user user) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
		ArrayList userlist=new ArrayList();
		String result;
		Connection con=(Connection) DB.getConnection();
		if(con==null) {
			System.out.println("数据库未连接");
		}
		String sql="select * from t_user";
		PreparedStatement past=con.prepareStatement(sql);
		//获取查询结果集
		ResultSet rs=past.executeQuery();
		//循环遍历结果集
		user t1=new user();
		System.out.println(user.getUsername());
		while(rs.next()) {
			user user1=new user();
			System.out.println("cxvcb"+user.getUsername());
			user1.setUsername(rs.getString(2));
			user1.setUserpass(rs.getString(7));
			userlist.add(user1);
		}
		
		Iterator its=userlist.iterator();//生成动态指针
		while(its.hasNext()){//遍历
			user t=new user();
			t=(user)its.next();
			System.out.println(t.getUsername());
		if(t.getUsername().equals(user.getUsername())) {
					System.out.println(t.getUsername());
				t1=t;
				break;
			}}
		rs.close();
		past.close();
		con.close();
		if(t1.getUserpass().equals(user.getUserpass()))
			return true;
		else
			return false;
	}

	public void addusers(user user) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Connection conn=(Connection) DB.getConnection();
		System.out.println("save username="+user.getUsername());
		//insert into t_user()
		//values(2,'lili','2','012','002','1','harry',1);
		String sql="  insert into t_user(userid,name,sexid,deptid,regdate,typeid,password,flag)"
				+" values('"+user.getuserid()+"','"+user.getUsername()+"','1','011','001','1','"+user.getUserpass()+"','1') ";
		System.out.println("save user sql=="+sql);
		Statement stmt;
		stmt=(Statement) conn.createStatement();
		stmt.executeUpdate(sql);
		stmt.close();
		conn.close();		
	}
}
