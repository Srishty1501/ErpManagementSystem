package ErpMgmtMinor.Pojos;

import java.util.Date;

public class Attendance {
	private int s_id;
	private int dept_id;
	private String sub_name;
	private Date date;
	private int log;
	private int sum;
	private int daycount;
	private float totatten;
	private String ap;

	
	public Attendance()
	{}
	public Attendance(String sub_name, float totatten){
		this.sub_name= sub_name;
		this.totatten = totatten;
	}
	
	public Attendance(int s_id,int dept_id,String sub_name,Date date,int log)
	{
		this.s_id=s_id;
		this.dept_id=dept_id;
		this.sub_name=sub_name;
		this.date=date;
		this.log=log;
		
		
	}
	public Attendance(int s_id, int dept_id, String sub_name, Date date, int log, String ap) {
		super();
		this.s_id = s_id;
		this.dept_id = dept_id;
		this.sub_name = sub_name;
		this.date = date;
		this.log = log;
		this.ap = ap;
	}
	public Attendance(int s_id,int dept_id,String sub_name,Date date,int log, int sum, int daycount)
	{
		this.s_id=s_id;
		this.dept_id=dept_id;
		this.sub_name=sub_name;
		this.date=date;
		this.log=log;		
	}
	
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getLog() {
		return log;
	}
	public void setLog(int log) {
		this.log = log;
	}
	public String getAp() {
		return ap;
	}
	public void setAp(String ap) {
		this.ap = ap;
	}
	public float getTotatten() {
		return totatten;
	}
	public void setTotatten(float totatten) {
		this.totatten = totatten;
	}
	public int getSum(){
		return sum;
	}
	public int getDaycount() {
		return daycount;
	}
	public void setDaycount(int daycount) {
		this.daycount = daycount;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
}
