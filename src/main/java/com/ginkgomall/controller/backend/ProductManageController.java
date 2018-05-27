package com.ginkgomall.controller.backend;

import com.ginkgomall.common.Const;
import com.ginkgomall.common.ResponseCode;
import com.ginkgomall.common.ServerResponse;
import com.ginkgomall.pojo.Product;
import com.ginkgomall.pojo.User;
import com.ginkgomall.service.IProductService;
import com.ginkgomall.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * 产品后台接口
 *
 * @author dill
 * @date 2018/5/27
 */

@Controller
@RequestMapping("/manage/product")
public class ProductManageController {

    @Autowired
    private IUserService iUserService;

    @Autowired
    private IProductService iProductService;

    /**
     * 保存或更新产品
     *
     * @param session HttpSession
     * @param product Product pojo
     * @return ServerResponse
     */
    @RequestMapping("save.do")
    @ResponseBody
    public ServerResponse productSave(HttpSession session, Product product) {
        User user = (User)session.getAttribute(Const.CURRENT_USER);
        if (user == null) {
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(), "用户未登录,请登录管理员");
        }
        if (iUserService.checkAdminRole(user).isSuccess()) {
            return iProductService.saveOrUpdateProduct(product);
        } else {
            return ServerResponse.createByErrorMessage("无权限操作");
        }
    }
}
