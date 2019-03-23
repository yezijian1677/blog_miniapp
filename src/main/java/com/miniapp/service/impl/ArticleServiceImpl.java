package com.miniapp.service.impl;

import com.miniapp.common.ResponseCode;
import com.miniapp.common.ServerResponse;
import com.miniapp.dao.ArticleMapper;
import com.miniapp.dao.CategoryMapper;
import com.miniapp.entity.Article;
import com.miniapp.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("articleServiceImpl")
public class ArticleServiceImpl implements ArticleService {

    @Resource(name = "articleMapper")
    private ArticleMapper articleMapper;
    @Resource(name = "categoryMapper")
    private CategoryMapper categoryMapper;

    @Override
    public ServerResponse<Article> selectById(Integer id) {
        if (id == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.ILLEGAL_ARGUMENT.getCode(), ResponseCode.ILLEGAL_ARGUMENT.getDesc());
        }
        //获取数据
        Article article = articleMapper.selectByPrimaryKey(id);
        if (article == null){
            return ServerResponse.createByErrorMessage("文章不存在");
        }

        return ServerResponse.createBySuccess(article);
    }

    @Override
    public ServerResponse<List<Article>> queryAll() {

        List<Article> articleList = articleMapper.queryAll();
        if (articleList == null){
            return ServerResponse.createByErrorMessage("未发现文章");
        }
        return ServerResponse.createBySuccess(articleList);
    }

    @Override
    public ServerResponse<List<Article>> selectByYear(Integer year) {
        if (year==null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.ILLEGAL_ARGUMENT.getCode(), ResponseCode.ILLEGAL_ARGUMENT.getDesc());
        }
        List<Article> articleList = articleMapper.selectByYear(year);
        if (articleList == null){
            return ServerResponse.createByErrorMessage("该年次尚无文章");
        }
        return ServerResponse.createBySuccess(articleList);
    }

    @Override
    public ServerResponse<List<Article>> selectByCategory(String category) {
        if (category== null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.ILLEGAL_ARGUMENT.getCode(), ResponseCode.ILLEGAL_ARGUMENT.getDesc());
        }
        List<Article> articleList = articleMapper.selectArticleById(categoryMapper.selectArticleIdByCategory(category).getId());
        if (articleList == null){
            return ServerResponse.createByErrorMessage("该分类尚无文章");
        }
        return ServerResponse.createBySuccess(articleList);
    }

    @Override
    public ServerResponse<Integer> countOfArticle() {
        int count = articleMapper.countAllNum();
        if (count == 0){
            return ServerResponse.createByErrorMessage("未发现文章");
        }
        return ServerResponse.createBySuccess(count);
    }
}
