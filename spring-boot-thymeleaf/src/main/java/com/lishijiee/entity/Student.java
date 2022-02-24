package com.lishijiee.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (Student)实体类
 *
 * @author
 * @since
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student  {
    private static final long serialVersionUID = -91969758749726312L;
    /**
     * 唯一标识id
     */
    private Integer id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;
    //省略get，set方法，自己加上
}

