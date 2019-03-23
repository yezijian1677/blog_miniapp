package com.miniapp.controller;

import com.miniapp.common.ServerResponse;
import com.miniapp.service.ArticleService;
import com.miniapp.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("articleController")
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("list.do")
    @ResponseBody
    public ServerResponse listAllArticle(){
        return articleService.queryAll();
    }

    @RequestMapping("listById.do")
    @ResponseBody
    public ServerResponse listByArticleId(@RequestParam(value = "id", required = true) Integer id){
        return articleService.selectById(id);
    }

    @RequestMapping("listByYear.do")
    @ResponseBody
    public ServerResponse listByYear(@RequestParam(value = "year", required = true, defaultValue = "2019")Integer year){
        return articleService.selectByYear(year);
    }

    @RequestMapping("listByCategory.do")
    @ResponseBody
    public ServerResponse listByYear(@RequestParam(value = "category", required = true, defaultValue = "Java")String category){
        return articleService.selectByCategory(category);
    }

    @RequestMapping("count.do")
    @ResponseBody
    public ServerResponse count(){
        return articleService.countOfArticle();
    }

}
