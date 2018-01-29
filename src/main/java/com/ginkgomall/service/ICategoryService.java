package com.ginkgomall.service;

import com.ginkgomall.common.ServerResponse;

/**
 * 品类模块接口
 *
 * @author dill
 * @date 2018/1/29
 */
public interface ICategoryService {

    /**
     * 添加品类
     *
     * @param categoryName category name
     * @param parentId 父品类id
     * @return ServerResponse
     */
    ServerResponse addCategory(String categoryName, Integer parentId);

    /**
     * 更新品类名称
     *
     * @param categoryId category id
     * @param categoryName category name
     * @return ServerResponse
     */
    ServerResponse updateCategoryName(Integer categoryId, String categoryName);

    /**
     * 返回子分类
     *
     * @param categoryId category id
     * @return ServerResponse
     */
    ServerResponse getChildrenParallelCategory(Integer categoryId);

    /**
     * 递归查询节点id和所有子节点id
     *
     * @param categoryId category id
     * @return ServerResponse
     */
    ServerResponse selectCategoryAndChildrenById(Integer categoryId);

}
