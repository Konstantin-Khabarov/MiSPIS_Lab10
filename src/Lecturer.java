import java.util.*;

public class Lecturer {

	//Department workInDepartment;
	Collection<EventLog> events;
	private int lecturerId;
	private String name;
	private String academicTitle;
	private String degree;
	private double salary;
	private Department department;

	public void viewProfile() {
		// TODO - implement Lecturer.viewProfile
		throw new UnsupportedOperationException();
	}

	public void editContactInfo() {
		// TODO - implement Lecturer.editContactInfo
		throw new UnsupportedOperationException();
	}

	public void viewTeachingLoad() {
		// TODO - implement Lecturer.viewTeachingLoad
		throw new UnsupportedOperationException();
	}

	public void submitResearchReport() {
		// TODO - implement Lecturer.submitResearchReport
		throw new UnsupportedOperationException();
	}

	public void applyForLeave() {
		// TODO - implement Lecturer.applyForLeave
		throw new UnsupportedOperationException();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public void setWorksInDepartment(Department department) {
		this.department = department;
	}

	public Department getWorksInDepartment() {
		return department;
	}
}