package com.wlt.datecountdown.dao;

import com.wlt.datecountdown.entity.NewDate;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


import java.util.List;

@Mapper
@Repository
public interface DateDao {
    List<NewDate> getDateListByAccount();

    Integer insert(NewDate newdate);
}
