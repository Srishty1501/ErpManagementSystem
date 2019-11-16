package ErpMgmtMinor.Pojos;

public class TimeTable {
	private int u_id;
	private int f_id;
	private String sub_name;
	private int dept_id;

	public TimeTable()
	{}
	public TimeTable(int u_id,int f_id,String sub_name,int dept_id)
	{
		this.u_id=u_id;
		this.f_id=f_id;
		this.sub_name=sub_name;
		this.dept_id=dept_id;
		
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public int getF_id() {
		return f_id;
	}
	public void setF_id(int f_id) {
		this.f_id = f_id;
	}
	public String getSub_name() {
		return sub_name;
	}
	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}


}
//<% if (session.getAttribute("category")==null) %>
