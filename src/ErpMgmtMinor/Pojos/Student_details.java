package ErpMgmtMinor.Pojos;

public class Student_details {
	private int s_id;
	private String s_name;
	private String password;
	private int dept_id;
	private String sem;
	private String email;
	private String phoneno;
	private String dob;
	private float percent;
	private String enrollno;
	private String fathername;
	private String fatherphoneno;
	private String marks10;
	private String marks12;
	private String peraddress;
	private String locaddress;
	private String category;
	private String img;
	
	
	public Student_details(int s_id, String s_name, String password, int dept_id, String sem, String email, String phoneno,
			String dob, String enrollno) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.password = password;
		this.dept_id = dept_id;
		this.sem = sem;
		this.email = email;
		this.phoneno = phoneno;
		this.dob = dob;
		this.enrollno= enrollno;
	}
	public Student_details() {
		super();
	}

	public Student_details(String s_name, String password, int dept_id, String sem, String email, String phoneno,
			String dob, String enrollno, String fathername, String fatherphoneno, String marks10, String marks12,
			String peraddress, String locaddress, String category,String img) {
		super();
		this.s_name = s_name;
		this.password = password;
		this.dept_id = dept_id;
		this.sem = sem;
		this.email = email;
		this.phoneno = phoneno;
		this.dob = dob;
		this.enrollno = enrollno;
		this.fathername = fathername;
		this.fatherphoneno = fatherphoneno;
		this.marks10 = marks10;
		this.marks12 = marks12;
		this.peraddress = peraddress;
		this.locaddress = locaddress;
		this.category = category;
		this.img=img;
		
	}
	

	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public String getSem() {
		return sem;
	}
	public void setSem(String sem) {
		this.sem = sem;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEnrollno() {
		return enrollno;
	}
	public void setEnrollno(String enrollno) {
		this.enrollno = enrollno;
	}
	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}

	public String getSemester() {
		return sem;
	}


	public void setSemester(String sem) {
		this.sem = sem;
	}
	public float getPercent() {
		return percent;
	}


	public void setPercent(float percent) {
		this.percent = percent;
	}
	public String getImg() {
		return img;
	}


	public void setImg(String img) {
		this.img = img;
	}


	@Override
	public String toString() {
		return "Student_details [s_id=" + s_id + ", s_name=" + s_name + ", password=" + password + ", dept_id="
				+ dept_id + ", sem=" + sem + ", email=" + email + ", phoneno=" + phoneno + ", dob=" + dob
				+ ", enrollno=" + enrollno + ", fathername=" + fathername + ", fatherphoneno=" + fatherphoneno
				+ ", marks10=" + marks10 + ", marks12=" + marks12 + ", peraddress=" + peraddress + ", locaddress="
				+ locaddress + ", category=" + category + ", getS_id()=" + getS_id() + ", getS_name()=" + getS_name()
				+ ", getPassword()=" + getPassword() + ", getDept_id()=" + getDept_id() + ", getSem()=" + getSem()
				+ ", getEmail()=" + getEmail() + ", getPhoneno()=" + getPhoneno() + ", getDob()=" + getDob()
				+ ", getEnrollno()=" + getEnrollno() + ", getCategory()=" + getCategory() + ", getSemester()="
				+ getSemester() + ", hashCode()=" + hashCode() + ", getFathername()=" + getFathername()
				+ ", getFatherphoneno()=" + getFatherphoneno() + ", getMarks10()=" + getMarks10() + ", getMarks12()="
				+ getMarks12() + ", getPeraddress()=" + getPeraddress() + ", getLocaddress()=" + getLocaddress()
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + dept_id;
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((enrollno == null) ? 0 : enrollno.hashCode());
		result = prime * result + ((fathername == null) ? 0 : fathername.hashCode());
		result = prime * result + ((fatherphoneno == null) ? 0 : fatherphoneno.hashCode());
		result = prime * result + ((locaddress == null) ? 0 : locaddress.hashCode());
		result = prime * result + ((marks10 == null) ? 0 : marks10.hashCode());
		result = prime * result + ((marks12 == null) ? 0 : marks12.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((peraddress == null) ? 0 : peraddress.hashCode());
		result = prime * result + ((phoneno == null) ? 0 : phoneno.hashCode());
		result = prime * result + s_id;
		result = prime * result + ((s_name == null) ? 0 : s_name.hashCode());
		result = prime * result + ((sem == null) ? 0 : sem.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student_details other = (Student_details) obj;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (dept_id != other.dept_id)
			return false;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (enrollno == null) {
			if (other.enrollno != null)
				return false;
		} else if (!enrollno.equals(other.enrollno))
			return false;
		if (fathername == null) {
			if (other.fathername != null)
				return false;
		} else if (!fathername.equals(other.fathername))
			return false;
		if (fatherphoneno == null) {
			if (other.fatherphoneno != null)
				return false;
		} else if (!fatherphoneno.equals(other.fatherphoneno))
			return false;
		if (locaddress == null) {
			if (other.locaddress != null)
				return false;
		} else if (!locaddress.equals(other.locaddress))
			return false;
		if (marks10 == null) {
			if (other.marks10 != null)
				return false;
		} else if (!marks10.equals(other.marks10))
			return false;
		if (marks12 == null) {
			if (other.marks12 != null)
				return false;
		} else if (!marks12.equals(other.marks12))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (peraddress == null) {
			if (other.peraddress != null)
				return false;
		} else if (!peraddress.equals(other.peraddress))
			return false;
		if (phoneno == null) {
			if (other.phoneno != null)
				return false;
		} else if (!phoneno.equals(other.phoneno))
			return false;
		if (s_id != other.s_id)
			return false;
		if (s_name == null) {
			if (other.s_name != null)
				return false;
		} else if (!s_name.equals(other.s_name))
			return false;
		if (sem == null) {
			if (other.sem != null)
				return false;
		} else if (!sem.equals(other.sem))
			return false;
		return true;
	}
	public String getFathername() {
		return fathername;
	}


	public void setFathername(String fathername) {
		this.fathername = fathername;
	}


	public String getFatherphoneno() {
		return fatherphoneno;
	}


	public void setFatherphoneno(String fatherphoneno) {
		this.fatherphoneno = fatherphoneno;
	}


	public String getMarks10() {
		return marks10;
	}


	public void setMarks10(String marks10) {
		this.marks10 = marks10;
	}


	public String getMarks12() {
		return marks12;
	}


	public void setMarks12(String marks12) {
		this.marks12 = marks12;
	}


	public String getPeraddress() {
		return peraddress;
	}


	public void setPeraddress(String peraddress) {
		this.peraddress = peraddress;
	}


	public String getLocaddress() {
		return locaddress;
	}


	public void setLocaddress(String locaddress) {
		this.locaddress = locaddress;
	}
	
	

}
