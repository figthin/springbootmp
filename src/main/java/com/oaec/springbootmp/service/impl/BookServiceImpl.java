package com.oaec.springbootmp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oaec.springbootmp.entity.Book;
import com.oaec.springbootmp.mapper.BookMapper;
import com.oaec.springbootmp.service.BookService;
import org.springframework.stereotype.Service;

@Service("bookService")
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {
}
