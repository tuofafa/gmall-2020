package com.tff.gmall.user.mapper;


import com.tff.gmall.beans.UmsMember;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author tuofafa
 * @version 1.0
 * @date 2020/10/13 0013 22:01
 */
@Repository
public interface UmsMemberMapper extends Mapper<UmsMember> {
    //List<UmsMember> selectAllUser();
}
