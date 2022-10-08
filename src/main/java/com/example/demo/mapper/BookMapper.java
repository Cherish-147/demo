package com.example.demo.mapper;

import org.springframework.stereotype.Repository;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.example.demo.entities.Book;

@Repository
public interface BookMapper extends BaseMapper<Book> {
}
