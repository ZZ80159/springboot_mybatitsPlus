package com.xd.view;

import com.xd.entity.Functions;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FunctionView {
    /**
     * 功能主键
     */
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

    /**
     * 子功能
     */
    private List<Functions> children;
}
