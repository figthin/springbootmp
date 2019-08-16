package com.oaec.springbootmp.controller;

import com.baomidou.mybatisplus.extension.api.R;
import com.oaec.springbootmp.entity.Book;
import com.oaec.springbootmp.service.BookService;
import com.oaec.springbootmp.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/list")
    public String list(Model model){
        return "list";
    }

    @RequestMapping(value = "/books",produces = "application/json;charset=utf-8")
    @ResponseBody
    public Result books(){
        List<Book> books = bookService.list();
        return new Result("查询成功",books);
    }

    @GetMapping("/add")
    public String add(){
        return "form";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model){
        Book book = bookService.getById(id);
        model.addAttribute("book",book);
        return "form";
    }

    @PostMapping(value = "/saveOrUpdate",produces = "application/json;charset=utf-8")
    @ResponseBody
    public Result saveOrUpdate(Book book){
        boolean b = bookService.saveOrUpdate(book);
        return new Result(b?"操作成功":"操作失败");
    }

    @PostMapping(value = "/del/{id}",produces = "application/json;charset=utf-8")
    @ResponseBody
    public Result del(@PathVariable Long id){
        boolean b = bookService.removeById(id);
        return new Result(b?"删除成功":"删除失败");
    }

}
