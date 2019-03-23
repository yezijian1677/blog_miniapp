package com.miniapp.dao;

import com.miniapp.entity.Category;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("categoryMapper")
public interface CategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKeyWithBLOBs(Category record);

    int updateByPrimaryKey(Category record);

    Category selectArticleIdByCategory(String category);

    List<Category> queryAllCategory();
}