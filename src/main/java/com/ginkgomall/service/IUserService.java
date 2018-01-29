package com.ginkgomall.service;

import com.ginkgomall.common.ServerResponse;
import com.ginkgomall.pojo.User;

/**
 * 用户模块接口
 *
 * @author dill
 * @date 2018/1/26
 */
public interface IUserService {

    /**
     * 用户登录
     *
     * @param username username
     * @param password pasword
     * @return ServerResponse<User>
     */
    ServerResponse<User> login(String username, String password);

    /**
     * 用户注册
     *
     * @param user User pojo
     * @return ServerResponse
     */
    ServerResponse register(User user);

    /**
     * 校验参数是否合法
     *
     * @param str 参数值
     * @param type 参数类型
     * @return ServerResponse<String>
     */
    ServerResponse<String> checkValid(String str, String type);

    /**
     * 根据用户名返回密保问题
     *
     * @param username username
     * @return ServerResponse<String>
     */
    ServerResponse<String> selectQuestion(String username);

    /**
     * 检查问题答案是否正确，如果正确则返回一个token
     *
     * @param username username
     * @param question 密保问题
     * @param answer 问题答案
     * @return ServerResponse<String>
     */
    ServerResponse<String> checkAnswer(String username, String question, String answer);

    /**
     * 判断token，并修改密码
     *
     * @param username username
     * @param passwordNew new password
     * @param forgetToken token
     * @return ServerResponse<String>
     */
    ServerResponse<String> forgetResetPassword(String username, String passwordNew, String forgetToken);

    /**
     * 登录状态更新用户密码
     *
     * @param passwordOld old password
     * @param passwordNew new password
     * @param user User pojo
     * @return ServerResponse<String>
     */
    ServerResponse<String> resetPassword(String passwordOld, String passwordNew, User user);

    /**
     * 登录状态更新用户信息
     *
     * @param user User pojo
     * @return ServerResponse<User>
     */
    ServerResponse<User> updateInformation(User user);

    /**
     * 获取用户信息
     *
     * @param userId user id
     * @return ServerResponse<User>
     */
    ServerResponse<User> getInformation(Integer userId);

    /**
     * 校验是否是管理员
     *
     * @param user User pojo
     * @return ServerResponse
     */
    ServerResponse checkAdminRole(User user);

}
