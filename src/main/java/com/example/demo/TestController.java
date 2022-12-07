package com.example.demo;

import com.example.demo.entities.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @GetMapping("/test/area")
    String Area()
    {
        return "/test/area";
    }

    @PostMapping("/test/area")
    @ResponseBody
    String Area(Double a, Double h)
    {
        System.out.println(a);
        System.out.println(h);
        return  "a=" + a + ",h=" + h;
    }

    @GetMapping("/test/book")
    String Book()
    {
        return "/test/book";
    }

    @PostMapping("/test/book")
    @ResponseBody
    String Book(Book book)
    {
        System.out.println(book);
        return  book.toString();
    }
}
