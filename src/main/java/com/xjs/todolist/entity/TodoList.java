package com.xjs.todolist.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author xjs
 * @since 2021-10-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("todo_list")
public class TodoList implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 默认雪花算法
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    /**
     * 标题
     */
    private String title;

    /**
     * 是否勾选 0是 1否
     */
    private Integer done;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 修改时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;


}
