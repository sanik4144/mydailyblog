package com.sanik.mydailyblog.Services;

import com.sanik.mydailyblog.Entities.User;
import com.sanik.mydailyblog.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean registerUser(User user) {
        try {
            userRepository.save(user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public User logInUser(String email, String password) {
        User validUser = userRepository.findByEmail(email);
        if(validUser!=null && password.equals(validUser.getPassword())){
            return validUser;
        }
        return null;
    }

}
