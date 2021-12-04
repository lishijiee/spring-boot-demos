package com.lishijiee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UrlController {

    private final static String name = "name";

    @RequestMapping("index")
    public String getIndex(HttpServletRequest request, Model model){

        String rname = request.getParameter(name);
        Object mname = model.getAttribute(name);
        if(null != mname && !mname.equals("")){
            model.addAttribute(name, mname);
        }
        if(null != rname && !"".equals(rname)){
            model.addAttribute(name, rname);
        }
        return "index";
    }

}
