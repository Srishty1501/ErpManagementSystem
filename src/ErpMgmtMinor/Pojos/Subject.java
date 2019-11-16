package ErpMgmtMinor.Pojos;

public class Subject {
	private int subject_id;
	private String sub_name;
	private int dept_id;
	public Subject()
	{}
	
	public Subject(int subject_id,String sub_name,int dept_id)
{
	this.subject_id=subject_id;
	this.sub_name=sub_name;
	this.dept_id=dept_id;
	
}

	public int getSubject_id() {
		return subject_id;
	}

	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
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
