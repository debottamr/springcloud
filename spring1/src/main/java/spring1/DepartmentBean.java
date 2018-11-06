package spring1;

public class DepartmentBean {
    @Override
	public String toString() {
		return "DepartmentBean [name=" + name + "]";
	}
	private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}