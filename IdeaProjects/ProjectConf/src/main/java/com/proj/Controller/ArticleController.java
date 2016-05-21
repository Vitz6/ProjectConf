package com.proj.Controller;

import com.proj.Dao.ArticleDao;
import com.proj.Model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by wincenty on 5/21/2016.
 */
@ComponentScan
@RestController
public class ArticleController {



    @Autowired
    private ArticleDao  articleDao;

    @RequestMapping(value = "/getarticles", method = RequestMethod.GET)
    public List<Article> getArticles() {
        return articleDao.findAllArticles();
    }

    @RequestMapping(value = "/setarticle", method = RequestMethod.POST)
    public void setArticles(@RequestBody Article article) {


        articleDao.createArticle(article);

    }

}
