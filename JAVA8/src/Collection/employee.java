package Collection;

public class employee {

	private String name;
	private String email;
	private String age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public employee(String name, String email, String age) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
	}
	@Override
	public String toString() {
		return "employee [name=" + name + ", email=" + email + ", age=" + age + "]";
	}
	
	
}
