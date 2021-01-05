package com.wlt.datecountdown.service;

import com.wlt.datecountdown.dao.DateDao;
import com.wlt.datecountdown.entity.NewDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DateServiceImpl implements DateService {

    @Autowired
    private DateDao dateDao;

    public List<NewDate> getDateListByAccount(){
        return dateDao.getDateListByAccount();
    }

    public Integer insert(NewDate newdate){
        newdate.setDateId(5);
        Integer result = dateDao.insert(newdate);

        return result;
    }
}
