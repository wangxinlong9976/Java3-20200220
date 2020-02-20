package com.wxl.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wxl.common.Conditions;
import com.wxl.dao.ArticleDao;
import com.wxl.pojo.Article;
import com.wxl.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService{

	@Resource
	private ArticleDao articleDao;
	
	@Override
	public List<Article> queryArticleByConditions(Conditions con) {
		// TODO Auto-generated method stub
		return articleDao.queryArticleByConditions(con);
	}

}
