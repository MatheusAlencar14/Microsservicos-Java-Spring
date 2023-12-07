package com.dev.hroauth.services;

import com.dev.hroauth.entities.User;
import com.dev.hroauth.feignclients.UserFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private static Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    UserFeignClient userFeignClient;

    public User findByEmail(String email) {
        User user = userFeignClient.findByEmail(email).getBody();
        if (user == null) {
            logger.error("Email inválido: " + email);
            throw new IllegalArgumentException("Email inválido!");
        }
        logger.info("Email: " + email);
        return user;
    }
}
