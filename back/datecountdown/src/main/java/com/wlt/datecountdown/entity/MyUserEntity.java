package com.wlt.datecountdown.entity;
import lombok.Data;
import lombok.NonNull;
import lombok.Setter;

@Data
public class MyUserEntity {

    @Setter
    private Integer userId;
    @NonNull
    private String userName;
    @NonNull
    private String email;
    @NonNull
    private String password;
    @NonNull
    private Integer delFlag;


}
