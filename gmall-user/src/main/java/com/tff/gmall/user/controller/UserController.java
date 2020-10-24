package com.tff.gmall.user.controller;

import com.tff.gmall.beans.UmsMember;
import com.tff.gmall.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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

    //查询所有用户
    @RequestMapping(value = "/getUserAll",method = RequestMethod.GET)
    @ResponseBody
    public List<UmsMember> getIndex(){
        List<UmsMember> memberList = memberService.getAll();
        return memberList;
    }


    //按条件查询用户信息
    @RequestMapping(value = "/getUserById",method = RequestMethod.GET)
    @ResponseBody
    public UmsMember getUserById(){
        UmsMember umsMember = new UmsMember();
        umsMember.setId("9");
        UmsMember member = memberService.getUmsMemberById(umsMember);
        return member;
    }


    //修改用户信息
    @RequestMapping(value = "/updateUserById",method = RequestMethod.GET)
    @ResponseBody
    public int updateUserById(){
        UmsMember umsMember = new UmsMember();
        umsMember.setId("9");
        umsMember.setNickname("张清玉");
        umsMember.setUsername("小玉玉");
        umsMember.setGender(2);
        umsMember.setPhone("123456");
        int member = memberService.updateMember(umsMember);
        return member;
    }

    //删除用户信息
    @RequestMapping(value = "/deleteUserById",method = RequestMethod.GET)
    @ResponseBody
    public int deleteUserById(){
        UmsMember umsMember = new UmsMember();
        umsMember.setId("10");
        int member = memberService.deleteUmsMemberById(umsMember);
        return member;
    }



}
