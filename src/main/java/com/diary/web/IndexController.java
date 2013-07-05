package com.diary.web;

import com.diary.domain.User;
import com.diary.domain.dto.PageResultDTO;
import com.diary.service.DiaryService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * User: likuan
 * Date: 7/3/13
 * Time: 4:04 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/register")
    public String register() {
        return "register";
    }

    @RequestMapping("/reg")
    public String reg(User user) {
        diaryService.saveUser(user);
        return "reg_success";
    }

    @RequestMapping("/userExists")
    @ResponseBody
    public JSONObject userExists(String name) {
        PageResultDTO dto = diaryService.userExists(name);
        return JSONObject.fromObject(dto);
    }

    @Autowired
    private DiaryService diaryService;
}
