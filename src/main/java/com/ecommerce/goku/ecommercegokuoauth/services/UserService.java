package com.ecommerce.goku.ecommercegokuoauth.services;

import com.ecommerce.goku.ecommercegokuoauth.feignclients.UserFeignClient;
import com.ecommerce.goku.ecommercegokuoauth.models.users.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import static java.util.Objects.isNull;

@Service
public class UserService implements UserDetailsService {

    private static Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserFeignClient userFeignClient;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        User user = userFeignClient.findByEmail(userName).getBody();

        if(isNull(user)){
            logger.error("User not found" + userName);
            throw new UsernameNotFoundException("User not found");
        }
        logger.info("Email found: " + userName);
        return user;
    }
}
