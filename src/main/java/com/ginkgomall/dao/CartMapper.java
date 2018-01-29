package com.ginkgomall.dao;

import com.ginkgomall.pojo.Cart;

/**
 * 购物车Mapper
 *
 * @author dill
 * @date 2018/1/26
 */
public interface CartMapper {

    /**
     * 通过主键,删除记录
     * @param id primary key id
     * @return deleted count
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入
     *
     * @param record Cart pojo
     * @return insert count
     */
    int insert(Cart record);

    /**
     * 插入,值为空的属性不作修改
     *
     * @param record Cart pojo
     * @return insert count
     */
    int insertSelective(Cart record);

    /**
     * 通过主键查询
     * @param id primary key,cart id
     * @return Cart pojo
     */
    Cart selectByPrimaryKey(Integer id);

    /**
     * 更新记录,主键作条件,值为空的属性不作修改
     *
     * @param record Cart pojo
     * @return update count
     */
    int updateByPrimaryKeySelective(Cart record);

    /**
     * 更新记录,主键作条件
     * @param record Cart pojo
     * @return update count
     */
    int updateByPrimaryKey(Cart record);
}