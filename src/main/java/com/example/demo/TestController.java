package com.example.demo;

import com.example.demo.entities.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @GetMapping("/test/hello")
    String Hello(Model model)
    {
        model.addAttribute("a", 3);
        model.addAttribute("b", 4);
        model.addAttribute("c", 5);
        return "/test/hello";
    }

    @GetMapping("/test/book")
    String Book(Model model)
    {
        Book book = new Book();
        book.Id = 123;
        book.Name = "IBM";
        model.addAttribute("book", book);
        return "/test/book";
    }

    @GetMapping("/test/array")
    String ArrayTest(Model model)
    {
        int[] IntArray = {1,2,3,4,5,6,7};
        model.addAttribute("intArr", IntArray);
        return "/test/array";
    }
}
