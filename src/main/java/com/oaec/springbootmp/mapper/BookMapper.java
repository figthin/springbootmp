package com.oaec.springbootmp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.oaec.springbootmp.entity.Book;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface BookMapper extends BaseMapper<Book> {
}
