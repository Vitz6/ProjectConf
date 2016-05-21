package com.proj.Controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wincenty on 4/22/2016.
 */
@ComponentScan
@Controller
public class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getIndex() {
        return "/static/html/index.html";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String getRegisterForm() {
        return "/static/html/register.html";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLoginForm() {
        return "/static/html/login.html";
    }

    @RequestMapping(value = "/admin/newconf", method = RequestMethod.GET)
    public String getNewConfForm() {
        return "/static/html/addconference.html";
    }

    @RequestMapping(value = "/reviewer/newreview", method = RequestMethod.GET)
    public String getNewReviewForm() {
        return "/static/html/addreview.html";
    }

    @RequestMapping(value = "/admin/relatereviewer", method = RequestMethod.GET)
    public String getRelaterReviewerForm() {
        return "/static/html/relatereviewer.html";
    }

    @RequestMapping(value = "/user/newarticle", method = RequestMethod.GET)
    public String getNewArticleForm() {
        return "/static/html/addarticle.html";
    }


}