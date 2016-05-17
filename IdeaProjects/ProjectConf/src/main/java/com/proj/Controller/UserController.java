package com.proj.Controller;

import com.proj.Dao.UserDao;
import com.proj.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by wincenty on 5/1/2016.
 */
@ComponentScan
@RestController
public class UserController {

    @Autowired
    private UserDao userDao;
    /*
    ShowAll
    ShowOne
    SetOne
    DelByID
    IfExsist
     */

    @RequestMapping(value = "/getusers", method = RequestMethod.GET)
    public List<User> getUser() {
        return userDao.findAllComment();
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User showuser(@PathVariable("id") int id) {return userDao.showUser(id);}

    @RequestMapping(value = "/setuser", method = RequestMethod.POST ,produces="text/plain")
    @ResponseBody
    public String  setUser(@RequestBody User user) {
     if(userDao.checkName(user)== false) return "Nazwa zajeta!";
        else{
         userDao.createUser(user);
         return "Zarejestrowano!";}
    }

    @RequestMapping(value = "/deleteuser", method = RequestMethod.POST)
    public void delUser(@RequestBody User user) {userDao.deleteUser(user);}

//    @ResponseBody
//    @RequestMapping(value = "/loginuser", method = RequestMethod.POST ,produces="text/plain")
//    public String loginUser (@RequestBody User user) {
//        if(userDao.loginUser(user) == true)
//            return "Zalogowano!";
//        else
//        return "Niepoprawne dane logowania!";
//
//    }

    @RequestMapping(value = "/checkname", method = RequestMethod.POST)
    public boolean checkName (@RequestBody User user) {return userDao.checkName(user);}


}
