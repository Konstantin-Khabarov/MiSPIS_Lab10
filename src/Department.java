public class Department {

	Lecturer lecturer;
	DepartmentHead head;
	HRStaff HR;
	private String name;



	public Department(String name, String code) {
		this.name = name;
	}

	// Пустой конструктор (для совместимости)
	public Department() {}
	public void addCourse() {
		// TODO - implement Department.addCourse
		throw new UnsupportedOperationException();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



}