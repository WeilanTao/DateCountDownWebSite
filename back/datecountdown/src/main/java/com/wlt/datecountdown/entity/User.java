package com.wlt.datecountdown.entity;
import lombok.Data;
import lombok.NonNull;

@Data
public class User {

    @NonNull
    private Integer userId;
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
    @NonNull
    private String email;
    @NonNull
    private String password;
    @NonNull
    private Integer delFlag;


}
