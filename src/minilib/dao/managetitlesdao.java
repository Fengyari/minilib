package minilib.dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.mysql.jdbc.Util;

import minilib.util.DB;
import minilib.vo.codetype;
import minilib.vo.title;

//业务逻辑层
public class managetitlesdao {
	//private static final Statement DB = null;

	public List findall() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		List list=new ArrayList();
		try {
			//建立数据库连接
			java.sql.Connection con=DB.getConnection();
			if(con==null) {
				System.out.println("数据库未连接");
			}
			//定义查询语句
			String sql="select * from t_book order by t_book.bookid";
			PreparedStatement pastmt=con.prepareStatement(sql);
			//获取查询结果集
			ResultSet rs=pastmt.executeQuery();
			//循环遍历结果集
			while(rs.next()) {
				title title=new title();
				title.setBookid(rs.getInt(1));
				title.setIsbn(rs.getString(3));
				title.setAuthors(rs.getString(6));
				title.setTitle(rs.getString(5));
				title.setPressid(rs.getString(8));
				list.add(title);
			}
			rs.close();
			pastmt.close();
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	//按照书名查询（title）
	public List findbooktitle(title book) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		List list=new ArrayList();
		Connection conn=(Connection) DB.getConnection();
		if(conn==null) {
			System.out.println("数据库未连接");
		}
		Statement stmt=(Statement) conn.createStatement();
		String str=book.getTitle();
		String sql="select * from t_book where title like  '%"+str+"%'  ";
		System.out.println("sql===="+sql);
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()) {
			title title=new title();
			title.setIsbn(rs.getString(3));
			title.setAuthors(rs.getString(6));
			title.setTitle(rs.getString(5));
			title.setPressid(rs.getString(8));
			list.add(title);	//将查找到的title对象及其成员全传入list
		}
		rs.close();
		stmt.close();
		conn.close();
		return list;
	}
	//按照作者名查询（authors）
	public List findbookauthor(title book) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		List list=new ArrayList();
		Connection conn=(Connection) DB.getConnection();
		if(conn==null) {
			System.out.println("数据库未连接");
		}
		Statement stmt=(Statement) conn.createStatement();
		String str=book.getAuthors();
		String sql="select * from t_book where authors like '%"+str+"%'";//准确查找+模糊查找
		//String sql="select * from t_book where authors = '"+str+"'"+" or authors like '%"+str+"%'"+" order by t_book.bookid";
		System.out.println("sql===="+sql);
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()) {
			title title1=new title();
			title1.setBookid(rs.getInt(1));
			title1.setIsbn(rs.getString(3));
			title1.setAuthors(rs.getString(6));
			title1.setTitle(rs.getString(5));
			title1.setPressid(rs.getString(8));
			list.add(title1);
		}
		rs.close();
		stmt.close();
		conn.close();
		return list;
	}
	public List findBookType() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		List list=new ArrayList();
		//数据库连接
		Connection conn=(Connection) DB.getConnection();
		Statement stmt=(Statement) conn.createStatement();
		
		String sql="select ";
		sql=sql+"codeid,codename";
		sql=sql+" from code_booktype order by codeid";//显示图书分类（用于在增加图书选项中）
		
		System.out.println("sql===="+sql);
		ResultSet rs=stmt.executeQuery(sql);
		
		while(rs.next()) {
			codetype booktype=new codetype();
			booktype.setCodeid(rs.getString(1));
			booktype.setCodename(rs.getString(2));
			list.add(booktype);
		}
		rs.close();
		stmt.close();
		conn.close();
		return list;
	}
	//增加图书
	public void savetitle(title book) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		Connection conn=(Connection) DB.getConnection();
		System.out.println("savetitlesql="+book.gettypeid());
		
		String sql="  insert into t_book(typeid,title,authors,isbn)"
				+" values('"+book.gettypeid()+"','"+book.getTitle()+"','"+book.getAuthors()+"','"+book.getIsbn()+"') ";
		System.out.println("savetitlesql=="+sql);
		
		Statement stmt;
		stmt=(Statement) conn.createStatement();
		stmt.executeUpdate(sql);
		stmt.close();
		conn.close();
	}

}
