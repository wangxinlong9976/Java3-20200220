package com.wxl.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wxl.common.Conditions;
import com.wxl.pojo.Article;
import com.wxl.service.ArticleService;

@Controller
public class ArticleController {

	@Resource
	private ArticleService articleService;
	
	@RequestMapping("index")
	public String toIndex(Model model,Conditions con) {
		if(con.getCurrPage()==null) {
			con.setCurrPage(1);
		}
		PageHelper.startPage(con.getCurrPage(), 5);
		List<Article> list = articleService.queryArticleByConditions(con);
		
		PageInfo<Article> pageInfo = new PageInfo<>(list);
		model.addAttribute("pageInfo", pageInfo);
		model.addAttribute("con", con);
		return "index";
	}
}
