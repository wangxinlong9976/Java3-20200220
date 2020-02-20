package com.wxl.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wxl.common.Conditions;
import com.wxl.pojo.Article;
import com.wxl.service.ArticleService;

@Controller
public class ArticleController {

	@Resource
	private ArticleService articleService;
	
	@RequestMapping("/")
	public String toIndex(Model model,Conditions con) {
		
		List<Article> list = articleService.queryArticleByConditions(con);
		
		return "index";
	}
}
