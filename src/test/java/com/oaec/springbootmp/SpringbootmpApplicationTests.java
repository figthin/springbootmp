package com.oaec.springbootmp;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Assert;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.oaec.springbootmp.entity.Book;
import com.oaec.springbootmp.mapper.BookMapper;
import com.oaec.springbootmp.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootmpApplicationTests {

    @Autowired
    private BookService bookService;

    @Test
    public void contextLoads() {
        boolean b = bookService.removeById(20);
        System.out.println("b = " + b);
    }
}
