package in.ashokit.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User {

	@Id
	private Integer uid;
	private String uname;
	private Integer age;
	private String gender;
	private String country;

}