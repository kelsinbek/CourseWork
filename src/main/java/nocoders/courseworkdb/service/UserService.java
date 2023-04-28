package nocoders.courseworkdb.service;


import org.springframework.security.core.userdetails.UserDetailsService;

import nocoders.courseworkdb.model.User;
import nocoders.courseworkdb.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    User save(UserRegistrationDto registrationDto);
}

