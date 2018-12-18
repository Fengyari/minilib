package minilib.action;
import minilib.vo.user;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

//loginaction中判断管理员还是普通用户

public class loginactionv01 extends ActionSupport{
		private user user;
		
		public user getUser() {
			return user;
		}
		public void setUser(user user) {
			this.user = user;
		}


		public String execute()throws Exception{
			//验证用户名和密码
			
			if(user.getUsername().equals("zhangsan") && user.getUserpass().equals("123456")) {
				//将用户名写入session
				HttpServletRequest request=ServletActionContext.getRequest();
				HttpSession session=request.getSession();
				session.setAttribute("username",user.getUsername());
				
				return "success";
			}
			else {
				return "error";
			}
		}
}
