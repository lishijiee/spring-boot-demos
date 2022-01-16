package com.lishijiee.mapper;

import com.lishijiee.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
@Repository
public interface UserMapper {
    @Select("select * from user where id=#{id}")
    public User getUserById(Long id);
}
