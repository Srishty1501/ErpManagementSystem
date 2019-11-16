package ErpMgmtMinor.Pojos;



public class Faculty_details {
	private int f_id;
	private String f_name;
	private String password;
	private String dept_name;
	private String f_username;
	private String yearofjoining;
	private String email;
	private String phoneno;
	private String dob;
	
	

	
	
	
	public Faculty_details()
	{}
	public Faculty_details(int f_id,String f_name,String password,String dept_name,String f_username)
	{
		this.f_id=f_id;
		this.f_name=f_name;
		this.password=password;
		this.dept_name=dept_name;
		this.f_username=f_username;
		
		
		
		
	}
	public Faculty_details(int f_id,String f_name,String password,String dept_name,String f_username,String yearofjoining, String email, String phoneno, String dob)
	{
		this.f_id=f_id;
		this.f_name=f_name;
		this.password=password;
		this.dept_name=dept_name;
		this.f_username=f_username;
		this.yearofjoining=yearofjoining;
		this.email=email;
		this.phoneno =phoneno;
		this.dob=dob;
			
	}
	public Faculty_details(String f_name,String password,String dept_name,String f_username,String yearofjoining, String email, String phoneno, String dob)
	{
	
		this.f_name=f_name;
		this.password=password;
		this.dept_name=dept_name;
		this.f_username=f_username;
		this.yearofjoining=yearofjoining;
		this.email=email;
		this.phoneno =phoneno;
		this.dob=dob;
				
	}
	
	
	public int getF_id() {
		return f_id;
	}
	public void setF_id(int f_id) {
		this.f_id = f_id;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public String getF_username() {
		return f_username;
	}
	public void setF_username(String f_username) {
		this.f_username = f_username;
	}
	public String getYearOfJoining() {
		return yearofjoining;
	}
	public void setYearOfJoining(String yearofjoining) {
		this.yearofjoining = yearofjoining;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phoneno;
	}
	public void setPhone(String phoneno) {
		this.phoneno = phoneno;
	}
	
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	


}
