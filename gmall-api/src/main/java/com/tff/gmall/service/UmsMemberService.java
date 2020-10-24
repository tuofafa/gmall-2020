package com.tff.gmall.service;

import com.tff.gmall.beans.UmsMember;
import java.util.List;

/**
 * @author tuofafa
 * @version 1.0
 * @date 2020/10/13 0013 21:56
 */
public interface UmsMemberService {

    //查询所有
    List<UmsMember> getAll();

    //按主键查询
    UmsMember getUmsMemberById(UmsMember umsMember);

    //更新操作
    Integer updateMember(UmsMember umsMember);

    //删除操作
    Integer deleteUmsMemberById(UmsMember umsMember);
}
