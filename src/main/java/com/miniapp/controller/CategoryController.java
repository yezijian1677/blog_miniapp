package com.miniapp.controller;

import com.miniapp.common.ServerResponse;
import com.miniapp.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("categoryController")
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("list.do")
    @ResponseBody
    public ServerResponse list(){
        return categoryService.queryAll();
    }

    @RequestMapping("listById.do")
    @ResponseBody
    public ServerResponse listById(@RequestParam(value = "id",required = true)Integer id){
        return categoryService.selectByCategoryId(id);
    }
}
