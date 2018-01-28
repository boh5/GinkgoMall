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
     *
     * @param str
     * @param type
     * @return
     */
    public ServerResponse<String> checkValid(String str, String type);

    /**
     * 根据用户名返回密保问题
     *
     * @param username
     * @return
     */
    public ServerResponse<String> selectQuestion(String username);

    /**
     * 检查问题答案是否正确，如果正确则返回一个token
     *
     * @param username
     * @param question
     * @param answer
     * @return
     */
    public ServerResponse<String> checkAnswer(String username, String question, String answer);

    /**
     * 判断token，并修改密码
     *
     * @param username
     * @param passwordNew
     * @param forgetToken
     * @return
     */
    public ServerResponse<String> forgetResetPassword(String username, String passwordNew, String forgetToken);

    /**
     * 登录状态更新用户密码
     *
     * @param passwordOld
     * @param passwordNew
     * @param user
     * @return
     */
    public ServerResponse<String> resetPassword(String passwordOld, String passwordNew, User user);

    /**
     * 登录状态更新用户信息
     *
     * @param user
     * @return
     */
    public ServerResponse<User> updateInformation(User user);

    /**
     * 获取用户信息
     *
     * @param userId
     * @return
     */
    public ServerResponse<User> getInformation(Integer userId);

    }
