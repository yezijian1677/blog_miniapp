package com.miniapp.dao;

import com.miniapp.entity.Article;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("articleMapper")
public interface ArticleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKeyWithBLOBs(Article record);

    int updateByPrimaryKey(Article record);

    List<Article> queryAll();

    int countAllNum();

    List<Article> selectByWord(String word);

    List<Article> selectByYear(int year);

    List<Article> selectArticleById(int id);
}