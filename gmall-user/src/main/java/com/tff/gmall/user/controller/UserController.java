package com.tff.gmall.user.controller;

import com.tff.gmall.user.bean.UmsMember;
import com.tff.gmall.user.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author tuofafa
 * @version 1.0
 * @date 2020/10/13 0013 21:28
 */
@Controller
public class UserController {

    @Autowired
    private UmsMemberService memberService;

    @RequestMapping(value = "/getUserAll",method = RequestMethod.GET)
    @ResponseBody
    public List<UmsMember> getIndex(){
        List<UmsMember> memberList = memberService.getAll();
        return memberList;
    }



}
