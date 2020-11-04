package com.tff.gmall.user.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.tff.gmall.beans.UmsMember;
import com.tff.gmall.service.UmsMemberService;
import com.tff.gmall.user.mapper.UmsMemberMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(interfaceClass = UmsMemberService.class)
public class UmsMemberServiceImpl implements UmsMemberService {

    @Autowired
    private UmsMemberMapper memberMapper;

    //查询所有用户信息
    @Override
    public List<UmsMember> getAll() {
        System.out.println("执行前");
        List<UmsMember> umsMemberList = memberMapper.selectAll();
        System.out.println("执行后");
        return umsMemberList;
    }

    //根据条件查询用户信息
    @Override
    public UmsMember getUmsMemberById(UmsMember umsMember) {
        UmsMember umsMember1 = memberMapper.selectByPrimaryKey(umsMember);
        return umsMember1;
    }

    //更细用户信息
    @Override
    public Integer updateMember(UmsMember umsMember) {
        return memberMapper.updateByPrimaryKey(umsMember);
    }

    //根据ID删除用户
    @Override
    public Integer deleteUmsMemberById(UmsMember umsMember) {
        return memberMapper.delete(umsMember);
    }

}
