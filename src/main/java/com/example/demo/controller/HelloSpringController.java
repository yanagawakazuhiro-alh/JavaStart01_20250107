package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloSpringController {
	
	//URLパターン /helloのGETリクエストが送られてきたら、このハンドラーメソッドが実行される
	//localhost:8080/helloでリクエストが来る想定
	@GetMapping("/hello")
	public String hello() {
		// HTMLテンプレートに hello-spring.htmlを指定(.htmlは省略可能) 
		return "hello-spring";
	}

}
