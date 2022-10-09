package com.example.demo;

import com.example.demo.entities.Book;
import com.example.demo.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BooksController {
    @Autowired
    BookMapper bookMapper;

    @RequestMapping("/books")
    public String Index(Model model)
    {
        model.addAttribute("books", bookMapper.selectList(null));
        return "books/index"; //这是模板文件名，不需要扩展名
    }

    @RequestMapping("/books/create")
    public String Index(Model model, Book book)
    {
        System.out.println(book);
        bookMapper.insert(book);
        return "redirect:/books/index"; //这是模板文件名，不需要扩展名
    }
}
