package com.wxl.service;

import java.util.List;

import com.wxl.common.Conditions;
import com.wxl.pojo.Article;

public interface ArticleService {

	List<Article> queryArticleByConditions(Conditions con);

}
