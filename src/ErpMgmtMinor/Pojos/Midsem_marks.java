package ErpMgmtMinor.Pojos;



public class Midsem_marks {
	private int dept_id;
	private String enrollno;
	private String sub_name;
	private String exam;
	private int marks;
public Midsem_marks() {
	super();
}	
public Midsem_marks( int dept_id,String enrollno, String sub_name, String exam, int marks) {
	this.dept_id = dept_id;
	this.enrollno = enrollno;
	this.sub_name = sub_name;
	this.exam= exam;
	this.marks = marks;
}
public Midsem_marks(String sub_name, int marks) {
	this.sub_name = sub_name;
	this.marks = marks;
	
}

public String getEnrollno() {
	return enrollno;
}

public void setEnrollno(String enrollno) {
	this.enrollno = enrollno;
}

public int getDept_id() {
	return dept_id;
}

public void setDept_id(int dept_id) {
	this.dept_id = dept_id;
}

public String getSub_name() {
	return sub_name;
}

public void setSub_name(String sub_name) {
	this.sub_name = sub_name;
}

public String getExam() {
	return exam;
}

public void setExam(String exam) {
	this.exam = exam;
}

public int getMarks() {
	return marks;
}

public void setMarks(int marks) {
	this.marks = marks;
}



	
	
	
	
}
