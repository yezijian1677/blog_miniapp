package com.miniapp.service;

import com.miniapp.common.ServerResponse;
import com.miniapp.entity.Article;

import java.util.List;

public interface ArticleService {

    ServerResponse<Article> selectById(Integer id);

    ServerResponse<List<Article>> queryAll();

    ServerResponse<List<Article>> selectByYear(Integer year);

    ServerResponse<List<Article>> selectByCategory(String category);

    ServerResponse<Integer> countOfArticle();

}
