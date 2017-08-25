package com.nklongyi.Controller;

import com.nklongyi.Service.ColumnsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by longyi on 2017/8/23.
 * 文章控制器
 */
@Controller
public class ArticleController {

     @Autowired
     ColumnsService columnsService;

    /**
     * 文章列表
     * @return
     */
    @RequestMapping("/admin/articles")
    public String showUserIndex(){
        return "admin/Article/index";
    }

    @RequestMapping(value = "/admin/addArticles",method = RequestMethod.GET)
    public String addArticle(){
        return "admin/Article/add";
    }

    /**
     * 进入栏目管理页面
     * @return
     */
    @RequestMapping(value = "/admin/columns",method = RequestMethod.GET)
    public ModelAndView showColumn(){

        return new ModelAndView("admin/Article/listColumns");
    }
    @RequestMapping(value = "/admin/addColumns",method = RequestMethod.GET)
    public String addColumn(){
        return "admin/Article/addColumns";
    }

}
