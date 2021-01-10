package com.wlt.datecountdown.dao;

import com.wlt.datecountdown.entity.MyUserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {

    Integer register(MyUserEntity myUserEntity);

    MyUserEntity getUserByEmail(String email);

}
