package com.lishijiee.mall.bean;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
@Data
@TableName("t_account")
public class Account implements Serializable {
    private static final long serialVersionUID = -7032479567987350240L;

    /**
     * 数据id
     */
    @TableId(value = "id", type = IdType.INPUT)
    @TableField(value = "id", fill = FieldFill.INSERT)
    private Long id;

    /**
     * 用户名
     */
    @TableField("t_username")
    private String username;

    /**
     * 密码
     */
    @TableField("t_password")
    private String password;

    /**
     * 权限
     * */
    @TableField("t_perms")
    private String perms;

    /**
     * 角色
     * */
    @TableField("t_role")
    private String role;

}
