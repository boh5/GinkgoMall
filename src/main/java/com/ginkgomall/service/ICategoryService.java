package com.ginkgomall.service;

import com.ginkgomall.common.ServerResponse;

/**
 * Created by dill on 2018/1/29
 */
public interface ICategoryService {

    /**
     * 添加品类
     *
     * @param categoryName
     * @param parentId
     * @return
     */
    ServerResponse addCategory(String categoryName, Integer parentId);

    /**
     * 更新品类名称
     *
     * @param categoryId
     * @param categoryName
     * @return
     */
    ServerResponse updateCategoryName(Integer categoryId, String categoryName);

    /**
     * 返回子分类
     *
     * @param categoryId
     * @return
     */
    ServerResponse getChildrenParallelCategory(Integer categoryId);

    /**
     * 递归查询节点id和所有子节点id
     *
     * @param categoryId
     * @return
     */
    ServerResponse selectCategoryAndChildrenById(Integer categoryId);

}
