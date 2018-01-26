package com.ginkgomall.service;

import com.ginkgomall.common.ServerResponse;
import com.ginkgomall.pojo.User;

/**
 * Created by dill on 2018/1/26
 */
public interface IUserService {

    /**
     * 用户登录
     *
     * @param username
     * @param password
     * @return
     */
    ServerResponse<User> login(String username, String password);

    /**
     * 用户注册
     *
     * @param user
     * @return
     */
    public ServerResponse<String> register(User user);

    /**
     * 校验参数是否合法
     * @param str
     * @param type
     * @return
     */
    public ServerResponse<String> checkValid(String str, String type);
    }
