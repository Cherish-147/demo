package com.example.demo;

import com.example.demo.entities.Book;
import com.example.demo.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    @GetMapping("/books/create")
    public String Create(Model model)
    {
        return "books/create";
    }

    @PostMapping("/books/create")
    public String PostCreate(Model model, Book book)
    {
        System.out.println(book);
        bookMapper.insert(book);
        return "redirect:/books";
    }

    @RequestMapping("/books/delete")
    public String Delete(Model model, int book_id)
    {
        System.out.println(book_id);
        bookMapper.deleteById(book_id);
        return "redirect:/books";
    }

    @GetMapping("/books/edit")
    public String Edit(Model model, int book_id)
    {
        System.out.println(book_id);
        model.addAttribute("book", bookMapper.selectById(book_id));

        return "books/edit"; //这是模板文件名，不需要扩展名
    }

    @PostMapping("/books/edit")
    public String PostEdit(Model model, Book book)
    {
        System.out.println(book);
        bookMapper.updateById(book);

        return "redirect:/books";
    }
}
