package com.ricky.controller;


import com.ricky.info.TestInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;

@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping(path="/Hello")
    public ModelAndView index(TestInfo testInfo, HttpServletRequest request, HttpServletResponse response) {
        System.out.println(testInfo.toString());
        ModelAndView view = new ModelAndView("success");
        view.addObject("welcome", "hello");

        HttpSession session = request.getSession();
        System.out.println(session.toString());

        return view;
    }

    @RequestMapping(path="/uploadFile")
    public ModelAndView uploadFile(TestInfo testInfo, HttpServletRequest request, HttpServletResponse response) {
        System.out.println(testInfo.toString());

        String path = request.getSession().getServletContext().getRealPath("/uploads/");
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }
        DiskFileItemFactory factory = new DiskFileItemFactory();




        ModelAndView view = new ModelAndView("success");
        view.addObject("welcome", "hello");

        HttpSession session = request.getSession();
        System.out.println(session.toString());

        return view;
    }


}