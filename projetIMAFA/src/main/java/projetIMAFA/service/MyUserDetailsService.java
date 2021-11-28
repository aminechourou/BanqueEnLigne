package projetIMAFA.service;
/*
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import projetIMAFA.entity.User;
import projetIMAFA.repo.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	UserRepository userRep;
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        
		User users=userRep.getcode(email);
		if(users.getEmail()=="")
		{
			System.out.println("user not found");
		}
		System.out.println(new MyUserDetails(users));
		return new MyUserDetails(users);
		
	}

}
*/