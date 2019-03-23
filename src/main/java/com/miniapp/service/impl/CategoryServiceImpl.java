package com.miniapp.service.impl;

import com.miniapp.common.ResponseCode;
import com.miniapp.common.ServerResponse;
import com.miniapp.dao.CategoryMapper;
import com.miniapp.entity.Category;
import com.miniapp.service.CategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("categoryServiceImpl")
public class CategoryServiceImpl implements CategoryService {

    @Resource(name = "categoryMapper")
    private CategoryMapper categoryMapper;


    @Override
    public ServerResponse<List<Category>> queryAll() {
        List<Category> categoryList = categoryMapper.queryAllCategory();

        if (categoryList == null){
            return ServerResponse.createByErrorMessage("尚无分类");
        }
        return ServerResponse.createBySuccess(categoryList);
    }

    @Override
    public ServerResponse<Category> selectByCategoryId(Integer id) {

        if (id == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.ILLEGAL_ARGUMENT.getCode(), ResponseCode.ILLEGAL_ARGUMENT.getDesc());
        }
        Category category = categoryMapper.selectByPrimaryKey(id);
        if (category == null){
            return ServerResponse.createByErrorMessage("无该分类");
        }
        return ServerResponse.createBySuccess(category);
    }
}
