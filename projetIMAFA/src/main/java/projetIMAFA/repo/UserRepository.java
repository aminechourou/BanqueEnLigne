package projetIMAFA.repo;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import projetIMAFA.entity.Role_User;
import projetIMAFA.entity.User;



@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
	@Query("SELECT u FROM User u WHERE u.Role_User= ?1")
	List<User> retrieveUsersByRole(Role_User role);
	
	@Modifying
	@Transactional
	@Query("update User u set u.Verified_account=1 where u.User_ID = ?1")
	void verifiedaccount(Integer id);
	
	@Query("SELECT u FROM User u WHERE u.Hiring_date between ?1 and ?2")
	List<User> retrieveUsersByDate(Date d1,Date d2);
	
	@Query("SELECT u FROM User u WHERE u.Email=?1 AND u.Password=?2")
	User login(String email,String password);
	
	@Query("SELECT u FROM User u WHERE u.Email= ?1")
	User getcode(String email);
	
	@Query("SELECT u FROM User u WHERE u.random= ?1")
	User getRandom(Integer random);
	
	@Query("SELECT u FROM User u WHERE u.CIN= ?1")
	User getCin(Long cin);
	@Query("SELECT u FROM User u WHERE u.First_name= ?1")
	User getName(String cin);
	
	@Query("SELECT COUNT(u),u.Hiring_date FROM User u GROUP BY u.Hiring_date")
	 List<Object> getUserbydate();
	@Query("SELECT COUNT(u),u.Geographical_area FROM User u GROUP BY u.Geographical_area")
	 List<Object> getUserbyarea();
	
	@Modifying
	@Transactional
	@Query("update User u set u.Password=?2 where u.random = ?1")
	void upMdp(Integer random,String mdp);
	
	@Modifying
	@Transactional
	@Query("update User u set u.random=?1 where u.random = ?2")
	void upRandom(Integer random,Integer random1);

}
