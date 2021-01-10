package com.wlt.datecountdown.service;


import com.wlt.datecountdown.entity.MyUserEntity;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
     Integer register(MyUserEntity myUserEntity) throws Exception;

}
