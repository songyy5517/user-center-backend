package com.syy.usercenterbackend.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 */
@Data
public class UserRegisterRequest implements Serializable {
    private static final long serialVersionUID = 6774539291966783530L;

    private String account;
    private String password;
    private String checkPassword;
    private String planetCode;

}
