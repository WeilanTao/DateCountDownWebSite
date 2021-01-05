package com.wlt.datecountdown.service;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DateService {
   List getDateListByAccount();
}
