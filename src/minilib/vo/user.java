package minilib.vo;

public class user {
		private int userid=0; 
		private String username;
		private String userpass;
		boolean flag;
		public int getuserid() {
			return userid;
		}
		public void setuserid() {
			this.userid+=1;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getUserpass() {
			return userpass;
		}
		public void setUserpass(String userpass) {
			this.userpass = userpass;
		}
		public boolean isFlag() {
			return flag;
		}
		public void setFlag(boolean flag) {
			this.flag = flag;
		}
		
}
