package fun.bean.login;

public class UserBean {
	
	private String username;
	
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	//业务逻辑，判断帐号密码
	public boolean validate(){
		if(username.equals("redhat")&&password.equals("000"))
			return true;
		else
			return false;
	}
}
