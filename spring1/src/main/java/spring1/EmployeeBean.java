package spring1;

public class EmployeeBean {
	public EmployeeBean(DepartmentBean departmentBean) {
		this.departmentBean = departmentBean;
	}

	private String fullName;

	private DepartmentBean departmentBean;

	public DepartmentBean getDepartmentBean() {
		return departmentBean;
	}

	public void setDepartmentBean(DepartmentBean departmentBean) {
		this.departmentBean = departmentBean;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
}