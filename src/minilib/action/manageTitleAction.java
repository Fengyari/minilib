package minilib.action;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
//m层，业务层/控制层
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.opensymphony.xwork2.ActionSupport;

import minilib.dao.managetitlesdao;
//import minilib.dao.managetitlesdao;  
import minilib.util.DB;
import minilib.vo.title;

//图书管理方法放本控制层中
//查询后删除、或每本书后加删除按钮

public class manageTitleAction extends ActionSupport {
	private title book;
	public title getBook() {
		return book;
	}
	public void setBook(title book) {
		this.book = book;
	}
	public String addTitle() throws Exception{
		String restadd=INPUT;
		managetitlesdao myadd=new managetitlesdao();//生成managetitledao对象，便于调用方法
		System.out.println("====book.title===="+book.getTitle());
		myadd.savetitle(book);//调用方法，把book.title参数放在一个book对象整体中，作为参数插入到数据库
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("message","添加成功，请继续添加！");
		restadd="addbook";
		System.out.println("111=");
		System.out.println("=====add===="+book.gettypeid());
		return restadd;
	}
	/*
	 * 总结action中的内容：
	 * 参数book传到action
	 * 在action中调用方法(book)
	 * 得到的返回值传到结果页面
	 */
	public String querybyauth() throws Exception{
		String restque=INPUT;//初始化
		managetitlesdao myquery = new managetitlesdao();
		List alltitlelist=myquery.findbookauthor(book);//调用查询方法，得到返回值
		HttpServletRequest request =ServletActionContext.getRequest();//建立服务器连接
		request.setAttribute("alltitlelist",alltitlelist);//传参，在result结果显示中直接获得参数输出显示。
		
		restque="querybook";
		System.out.println("====find book by author====");//在控制台输出，用于检验程序运行
		return restque;
	}
	public String querybookbttitle() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		String restque=INPUT;
		managetitlesdao myquery=new managetitlesdao();
		List alltitlelist=myquery.findbooktitle(book);
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("alltitlelist",alltitlelist);
		
		restque="querybook";//通用一个显示页面，显示查找结果对象book(alltitleslist)的所有成员。
		System.out.println("====find book by title====");
		return restque;
	}
	public String findalltitles() throws Exception{//查找全部图书
		String rest=INPUT;
		managetitlesdao mt=new managetitlesdao();
		List alltitlelist=mt.findall();//调用全部显示的方法
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("alltitlelist",alltitlelist);
		rest="querybook";
		System.out.println("====findAllTitles====");
		return rest;
	}	
	public String findBookType() throws Exception{////显示图书分类（用于在增加图书选项中）
		System.out.println("11111");
		String resttype=INPUT;
		managetitlesdao mytype=new managetitlesdao();
		List alltypelist=mytype.findBookType();
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("alltypelist",alltypelist);//????????????
		resttype="booktype";
		System.out.println("====finbooktype1====");
		return  resttype;
	}
	

}

