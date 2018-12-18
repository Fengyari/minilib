package minilib.action;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;

import java.sql.SQLException;
import java.util.*;
import minilib.dao.manageusersdao;
import minilib.vo.user;

public class manageuserAction {
	private user user;
	public user getUsers() {
		return user;	}
	public void setUsers(user user) {
		this.user = user;	}

	public String adduser() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		String restadd="";
		manageusersdao myadd = new manageusersdao();
		System.out.println("====user.username===="+user.getUsername());
		myadd.addusers(user);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("message","用户添加成功，请继续添加！");
		restadd="adduser";
		return restadd;
		
//		String restadd=INPUT;
//		managetitlesdao myadd=new managetitlesdao();//生成managetitledao对象，便于调用方法
//		System.out.println("====book.title===="+book.getTitle());
//		myadd.savetitle(book);//调用方法，把book.title参数放在一个book对象整体中，作为参数插入到数据库
//		HttpServletRequest request = ServletActionContext.getRequest();
//		request.setAttribute("message","添加成功，请继续添加！");
//		restadd="addbook";
//		System.out.println("=====add===="+book.gettypeid()+"\t"+book.getbookid());
//		return restadd;
	}
}
