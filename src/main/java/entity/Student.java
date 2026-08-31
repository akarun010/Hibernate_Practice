package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "students")
public class Student {

    @Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", department=" + department + ", age="
				+ age + "]";
	}

	@Id
    private int id;

    private String name;
    private String email;
    private String department;
    private int age;

    public Student(String name, String email, String department,int age) {
		this.age = age;
		this.department = department;
		this.email = email;
		this.name = name;
	}
    
    public Student(String name, String email, String department,int age,int id) {
		this.age = age;
		this.department = department;
		this.email = email;
		this.name = name;
		this.id = id;
	}
    
    public Student() {}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
    
    
}
