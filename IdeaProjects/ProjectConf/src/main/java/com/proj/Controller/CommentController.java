package com.proj.Controller;

import com.proj.Dao.CommentDao;
import com.proj.Dao.EmployeeDao;
import com.proj.Model.Comment;
import com.proj.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

/**
 * Created by wincenty on 4/26/2016.
 */
@ComponentScan
@RestController
public class CommentController {


   // private Comment comment = new Comment();

    @Autowired
    private CommentDao commentDao;


    @RequestMapping(value = "/getcomments", method = RequestMethod.GET)
    public List<Comment> getComment() {
        return commentDao.findAllComment();
    }

    @RequestMapping(value = "/setcomment", method = RequestMethod.POST)
    public void setComment(@RequestBody Comment comment) {


        commentDao.createComment(comment);

    }




}
