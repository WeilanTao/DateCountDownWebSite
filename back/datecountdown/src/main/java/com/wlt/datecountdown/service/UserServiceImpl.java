package com.wlt.datecountdown.service;

import com.wlt.datecountdown.dao.UserDao;
import com.wlt.datecountdown.entity.MyUserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    private BCryptPasswordEncoder bcryptPasswordEncoder=new BCryptPasswordEncoder();

    public Integer register(MyUserEntity myUserEntity) throws Exception{
        if(myUserEntity!=null){
            if(userDao.getUserByEmail(myUserEntity.getEmail())!=null){
                System.out.println("test test test ");
                throw new Exception("Error! User already exists.");
            }
            String rawPassword=myUserEntity.getPassword();
            myUserEntity.setPassword(bcryptPasswordEncoder.encode(rawPassword));

            return userDao.register(myUserEntity);
        }else{
            throw new Exception("Error!User cannot be null.");
        }
    }
}
