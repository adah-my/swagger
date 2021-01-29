package com.muyi.swagger.pojo;

import com.muyi.swagger.pojo.base.BasePojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class TkUserPojo extends BasePojo{
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LASE_INSERT_ID()")
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 用户类型
     */
    private Integer userType;
}