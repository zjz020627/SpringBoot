package com.study.admin.controller;

import com.study.admin.bean.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

/**
 * @author RenAshbell
 * @create 2022-05-25-17:00
 */
@Slf4j
@Controller
public class IndexController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @ResponseBody
    @GetMapping("/sql")
    public String queryFromDb(){
        Long aLong = jdbcTemplate.queryForObject("select count(*) from t_fruit", Long.class);
        return aLong.toString();
    }

    @GetMapping(value = {"/","login"})
    public String loginPage(){
        return "login";
    }

    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model){
        if (user.getUserName().length() != 0 && "123456".equals(user.getPassword())){
            // 把登录成功的用户保存到session
            session.setAttribute("loginUser",user);
            // 登录成功重定向到main.html; 重定向防止表单重复提交
            return "redirect:/main.html";
        } else {
            model.addAttribute("msg","账号密码错误");
            // 回到登录页
            return "login";
        }
    }

    @GetMapping("/main.html")
    public String mainPage(HttpSession session,Model model){

        // 是否登录
//        Object loginUser = session.getAttribute("loginUser");
//        if (loginUser != null){
//            return "main";
//        } else {
//            // 回到登录页面
//            model.addAttribute("msg","请重新登录");
//            return "login";
//        }
        return "main";
    }
}
