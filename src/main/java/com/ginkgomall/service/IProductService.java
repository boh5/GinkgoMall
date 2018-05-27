package com.ginkgomall.service;

import com.ginkgomall.common.ServerResponse;
import com.ginkgomall.pojo.Product;

/**
 * 产品Service接口
 *
 * @author dill
 * @date 2018/5/27
 */
public interface IProductService {

    /**
     * 保存或更新产品
     *
     * @param product
     * @return
     */
    public ServerResponse saveOrUpdateProduct(Product product);
}
