package com.proj.Controller;

import com.proj.Dao.UserDao;
import com.proj.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by wincenty on 5/1/2016.
 */
@ComponentScan
@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/getusers", method = RequestMethod.GET)
    public List<User> getComment() {
        return userDao.findAllComment();
    }

    @RequestMapping(value = "/setuser", method = RequestMethod.POST)
    public void setComment(@RequestBody User user) {userDao.createUser(user);}
  //  return "Dodano usera";}

    @RequestMapping(value = "/deleteuser", method = RequestMethod.POST)
    public void delUser(@RequestBody User user) {userDao.deleteUser(user);}


}
