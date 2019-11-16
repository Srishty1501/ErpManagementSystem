package ErpMgmtMinor.Pojos;

public class Dept {
	private int dept_id;
	private String dept_name;
	private String sec;
	private String sem;
	
	public Dept()
	{
		
	}
	public Dept(int dept_id,String dept_name,String sec)
	{
		this.dept_id=dept_id;
		this.dept_name=dept_name;
		this.sec=sec;
		
		
		
		
	}
	public Dept(int dept_id,String dept_name,String sec , String sem )
	{
		this.dept_id=dept_id;
		this.dept_name=dept_name;
		this.sec=sec;
		this.sem=sem;
		
		
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public String getSec() {
		return sec;
	}
	public void setSec(String sec) {
		this.sec = sec;
	}
	public String getSem() {
		return sem;
	}
	public void setSem(String sem) {
		this.sem = sem;
	}
	
}
