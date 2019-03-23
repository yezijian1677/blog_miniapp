package com.miniapp.service;

import com.miniapp.common.ServerResponse;
import com.miniapp.entity.Category;

import java.util.List;

public interface CategoryService {

    ServerResponse<List<Category>> queryAll();
    ServerResponse<Category> selectByCategoryId(Integer id);

}
