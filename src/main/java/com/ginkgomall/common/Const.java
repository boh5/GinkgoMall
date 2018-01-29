package com.ginkgomall.common;

/**
 * 常用常量
 *
 * @author dill
 * @date 2018/1/26
 */
public class Const {

    public static final String CURRENT_USER = "currentUser";

    public static final String EMAIL = "email";

    public static final String USERNAME = "username";

    public interface Role {
        int ROLE_CUSTOMER = 0;
        int ROLE_ADMIN = 1;
    }
}
