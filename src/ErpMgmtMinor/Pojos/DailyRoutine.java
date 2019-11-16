package ErpMgmtMinor.Pojos;

public class DailyRoutine {
	@Override
	public String toString() {
		return "DailyRoutine [dept_id=" + dept_id + ", day=" + day + ", f_id=" + f_id + ", lecture=" + lecture
				+ ", sub_name=" + sub_name + ", dept_name=" + dept_name + ", sec=" + sec + ", semester=" + semester
				+ "]";
	}
	private int dept_id;
	private String day;
	private int f_id;
	private int lecture;
	private String sub_name;
	private String dept_name;
	private String sec;
	private String semester;
	public DailyRoutine() {
		super();
	}
	public DailyRoutine(int dept_id, String day, int f_id, int lecture, String sub_name) {
		super();
		this.dept_id = dept_id;
		this.day = day;
		this.f_id = f_id;
		this.lecture = lecture;
		this.sub_name = sub_name;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public int getF_id() {
		return f_id;
	}
	public void setF_id(int f_id) {
		this.f_id = f_id;
	}
	public int getLecture() {
		return lecture;
	}
	public void setLecture(int lecture) {
		this.lecture = lecture;
	}
	public String getSub_name() {
		return sub_name;
	}
	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}
	public DailyRoutine(int dept_id, int lecture, String sub_name, String dept_name, String sec, String semester) {
		super();
		this.dept_id = dept_id;
		this.lecture = lecture;
		this.sub_name = sub_name;
		this.dept_name = dept_name;
		this.sec = sec;
		this.semester = semester;
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
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}

	}

