package com.xio.controller;

import com.xio.pojo.SUser;
import com.xio.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UserService loginService;

    /**
     * 登陆校验
     */
    @RequestMapping("/CheckUser")
    public ModelAndView CheckUser(SUser user,HttpSession session){
        ModelAndView modelAndView = new ModelAndView();
        SUser user1 = loginService.checkUser(user);
        if(user1!=null){
            session.setAttribute("user",user1);
            modelAndView.addObject("username",user1.getUsername());
            modelAndView.setViewName("index");
        }else{
            modelAndView.setViewName("login");
        }
        return modelAndView;
    }

    @RequestMapping("/showIndex")
    public String showIndex() {
        return "index";
    }

    @RequestMapping("/showLogin")
    public String showLogin() {
        return "login";
    }
}
