package com.oliveyoung.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.oliveyoung.web.entity.ProductEntity;

@Mapper
public interface ProductDao {

    // 제품등록
    public int productInsert(ProductEntity pEnt);


	
}

