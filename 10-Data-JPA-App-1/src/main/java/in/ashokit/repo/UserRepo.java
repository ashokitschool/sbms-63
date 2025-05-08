package in.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import in.ashokit.entities.User;
import jakarta.transaction.Transactional;

public interface UserRepo extends JpaRepository<User, Integer> {

	@Query(value = "select * from user", nativeQuery = true)
	public List<User> getAllUsers();

	@Query(value = "From User")
	public List<User> getAllUsersHQL();

	@Query(value = "delete from User where uid = :id")
	@Transactional
	@Modifying
	public void deleteUserByHQL(Integer id);

	public List<User> findByGender(String gender);

	public List<User> findByCountry(String country);

	public List<User> findByGenderAndCountry(String gender, String country);

	public List<User> findByAgeGreaterThanEqual(Integer age);

}