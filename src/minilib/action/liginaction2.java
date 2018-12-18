package minilib.action;
import minilib.dao.managetitlesdao;
import minilib.dao.manageusersdao;
import minilib.vo.user;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

//loginaction中判断管理员还是普通用户

public class liginaction2 extends ActionSupport{
		private user user;
		public user getUser() {
			return user;
		}
		public void setUser(user user) {
			this.user = user;
		}
		
		public String execute()throws Exception{
			//验证用户名和密码
			String rest=INPUT;
			System.out.println("====check users====");//在控制台输出，用于检验程序运行
			manageusersdao myuser= new manageusersdao();
			if(myuser.findalluser(user)) {
				
				return "success";
			}
		
			else
				return "error";
			//HttpServletRequest request=ServletActionContext.getRequest();
			//String result1 = request.getParameter(result);
			
		
		}
}
