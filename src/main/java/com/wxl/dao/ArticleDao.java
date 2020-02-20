package com.wxl.dao;

import java.util.List;

import com.wxl.common.Conditions;
import com.wxl.pojo.Article;

public interface ArticleDao {

	List<Article> queryArticleByConditions(Conditions con);

}
