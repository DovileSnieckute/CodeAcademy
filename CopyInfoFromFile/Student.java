
public class Student {
	
	private String name;
	private String studentnr;
	private Integer course;
	private String phoneNumber;
	
	public Student(String name, String studentnr, Integer course, String phoneNumber) {

		this.name = name;
		this.studentnr = studentnr;
		this.course = course;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentnr() {
		return studentnr;
	}

	public void setStudentnr(String studentnr) {
		this.studentnr = studentnr;
	}

	public Integer getCourse() {
		return course;
	}

	public void setCourse(Integer course) {
		this.course = course;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	

}
