package com.example.demo;

import com.example.demo.mapper.BookMapper;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entities.Book;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private BookMapper bookMapper;


	@Test
	public void getBooks()
	{
		Book book = bookMapper.selectById(10);
		System.out.println(book);

		book.Id = 100;
		book.Name = "New Book";
		bookMapper.insert(book);

		book = bookMapper.selectById(100);
		System.out.println(book);

		book.Name = "Book2";
		bookMapper.updateById(book);

		book = bookMapper.selectById(100);
		System.out.println(book);

		bookMapper.deleteById(100);

		for(Book b : bookMapper.selectList(null))
		{
			System.out.println(b);
		}
	}
}
