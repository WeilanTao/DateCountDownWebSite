package com.wlt.datecountdown.entity;

import lombok.Data;
import lombok.NonNull;

@Data
public class Date {

    @NonNull
    private Integer dateId;
    @NonNull
    private String dateName;
    @NonNull
    private String account;
    @NonNull
    private Date createDate;
    @NonNull
    private Date currentDate;


}
