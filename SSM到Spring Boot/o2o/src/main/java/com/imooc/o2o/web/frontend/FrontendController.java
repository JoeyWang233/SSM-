package com.imooc.o2o.web.frontend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/frontend")
public class FrontendController {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    private String index(){
        return "frontend/index";
    }

    /**
     * 商店列表页路由
     *
     */
    @RequestMapping(value = "/shoplist",method = RequestMethod.GET)
    private String shoplist(){
        return "frontend/shoplist";
    }

    /**
     * 店铺详情页路由
     *
     */
    @RequestMapping(value = "/shopdetail",method = RequestMethod.GET)
    private String shopdetail(){
        return "frontend/shopdetail";
    }

    /**
     * 商品详情页路由
     */
    @RequestMapping(value = "/productdetail",method = RequestMethod.GET)
    private String productdetail(){
        return "frontend/productdetail";
    }
}
