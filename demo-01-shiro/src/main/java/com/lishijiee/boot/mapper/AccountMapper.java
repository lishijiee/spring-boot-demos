package com.lishijiee.boot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lishijiee.boot.bean.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper extends BaseMapper<Account> {
}