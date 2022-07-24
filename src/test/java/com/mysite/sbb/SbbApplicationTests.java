package com.mysite.sbb;

import com.mysite.sbb.Article.service.ArticleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SbbApplicationTests {


	@Autowired
	private ArticleService articleService;


}
