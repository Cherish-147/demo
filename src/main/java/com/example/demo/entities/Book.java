package com.example.demo.entities;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("book")
public class Book {
	@TableId("id")
	public Integer Id;
	@TableField("name")
	public String Name;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "Book{" +
				"Id=" + Id +
				", Name='" + Name + '\'' +
				'}';
	}
}
