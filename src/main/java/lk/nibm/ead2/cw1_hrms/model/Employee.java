package lk.nibm.ead2.cw1_hrms.model;
 
public class Employee {
	private Integer id;
	private String firstname;
	private String lastname;
	private String designation;
	private String email;
	private String telephone;
	private Integer age;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", designation="
				+ designation + ", email=" + email + ", telephone=" + telephone + ", age=" + age + "]";
	}
	
 
        // Create getters/setters by using eclipse
        // Alt + Shift + S , Then press R
        // Alt + Shift + S -> Generate toString() with all attributes
}
 

