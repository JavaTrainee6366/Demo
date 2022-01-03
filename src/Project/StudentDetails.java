package Project;

public class StudentDetails {
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public StudentDetails(int id, String name, String contact, String course, double eng, double maths, double science,
			double computers) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.course = course;
		this.eng = eng;
		this.maths = maths;
		this.science = science;
		this.computers = computers;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getEng() {
		return eng;
	}
	public void setEng(double eng) {
		this.eng = eng;
	}
	public double getMaths() {
		return maths;
	}
	public void setMaths(double maths) {
		this.maths = maths;
	}
	public double getScience() {
		return science;
	}
	public void setScience(double science) {
		this.science = science;
	}
	public double getComputers() {
		return computers;
	}
	public void setComputers(double computers) {
		this.computers = computers;
	}
	public StudentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int id;
	public String name;
	public String contact;
	public String course;
	public double eng;
	public double maths;
	public double science;
	public double computers;
	public double computers_lab;
	
	

}
