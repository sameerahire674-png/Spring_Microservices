package in.cp.entities;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  //tells to the hibernate this is java class & is mapped to the database table.
@Table  // creating the table using this class name in database;
public class User {
	@Id //creating for unique id and its created by automatically
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column //this all @column is creating the column in database tables
	private long id;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private String address;
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
    public String toString() {
        return "User{" +"\n"+
                "id=" + id +"\n"+
                ", name='" + name + '\'' +"\n"+
                ", email='" + email + '\'' +"\n"+
                ", password='" + password + '\'' +"\n"+
                ", address='" + address + '\'' +"\n"+
                '}';
    }

}
