package com.tff.gmall.user.service.impl;


import com.tff.gmall.beans.UmsMember;
import com.tff.gmall.service.UmsMemberService;
import com.tff.gmall.user.mapper.UmsMemberMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author tuofafa
 * @version 1.0
 * @date 2020/10/13 0013 21:58
 */
@Service
public class UmsMemberServiceImpl implements UmsMemberService {

    @Resource
    private UmsMemberMapper memberMapper;

    //查询所有用户信息
    @Override
    public List<UmsMember> getAll() {
        List<UmsMember> umsMemberList = memberMapper.selectAll();
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
