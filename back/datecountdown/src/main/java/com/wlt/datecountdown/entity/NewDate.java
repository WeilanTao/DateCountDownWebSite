package com.wlt.datecountdown.entity;

import lombok.Data;
import lombok.NonNull;

import java.util.Date;

@Data
public class NewDate {

    @NonNull
    private Integer dateId;
    @NonNull
    private String dateName;
    @NonNull
    private String account;
    @NonNull
    private Date createDate;
    @NonNull
    private Date nowDate;
    @NonNull
    private Integer delFlag;

}
