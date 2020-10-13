package com.tff.gmall.user.mapper;

import com.tff.gmall.user.bean.UmsMember;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author tuofafa
 * @version 1.0
 * @date 2020/10/13 0013 22:01
 */
@Repository
public interface UmsMemberMapper {
    List<UmsMember> selectAll();
}
