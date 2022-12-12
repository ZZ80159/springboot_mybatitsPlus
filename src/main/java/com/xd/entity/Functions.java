package com.xd.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 
 * @TableName function
 */
@TableName(value ="functions")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Functions {
    /**
     * 功能主键
     */
    @TableId(type = IdType.AUTO)
    private Integer functionId;

    /**
     * 功能编码
     */
    private String functionCode;

    /**
     * 功能名称
     */
    private String functionName;

    /**
     * 功能图标
     */
    private String functionIcon;

    /**
     * 功能等级
     */
    private Integer functionLevel;

    /**
     * 父功能等级ID
     */
    private Integer functionFather;

}