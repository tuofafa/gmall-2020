package com.tff.gmall.user.service.impl;

import com.tff.gmall.user.bean.UmsMember;
import com.tff.gmall.user.mapper.UmsMemberMapper;
import com.tff.gmall.user.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Override
    public List<UmsMember> getAll() {
        List<UmsMember> umsMemberList = memberMapper.selectAll();
        return umsMemberList;
    }
}
