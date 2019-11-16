package ErpMgmtMinor.Pojos;

public class Admin_detail {
	int a_id;
	String Admin_name;
	String email;
	String mobile;
	String username;
	String password;
	
 
  
public Admin_detail(int a_id, String Admin_name, String email, String mobile, String username, String password){
	 
	 this.a_id=a_id;
	 this.Admin_name=Admin_name;
	 this.email= email;
	 this.mobile=mobile;
	 this.username=username;
	 this.password=password;
 }
 public Admin_detail(int a_id,String Admin_name, String email, String mobile ){
	 this.a_id=a_id;
	 this.Admin_name=Admin_name;
	 this.email= email;
	 this.mobile=mobile;	 
 }
 public Admin_detail() {
		super();
	}
public int getA_id() {
	return a_id;
}
public void setA_id(int a_id) {
	this.a_id = a_id;
}
public String getAdmin_name() {
	return Admin_name;
}
public void setAdmin_name(String admin_name) {
	Admin_name = admin_name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
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
}
