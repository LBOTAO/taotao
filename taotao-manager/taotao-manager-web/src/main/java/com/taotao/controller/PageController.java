package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * author：  刘涛
 * 跳转页面
 * @create 2019-01-25 19:59
 */
@Controller
public class PageController {

    //跳转首页
    @RequestMapping("/")
    public String goHome(){
        return "index";
    }

    @RequestMapping("/rest/page/item-edit")
    public String goItemPage(){
        return "item-edit";
    }

    //跳转其他页面
    @RequestMapping("/{page}")
    public Object getPage(@PathVariable("page")String page){
        return page;
    }

}
