package com.xjs.todolist.service.impl;

import com.xjs.todolist.entity.TodoList;
import com.xjs.todolist.mapper.TodoListMapper;
import com.xjs.todolist.service.TodoListService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xjs
 * @since 2021-10-12
 */
@Service
public class TodoListServiceImpl extends ServiceImpl<TodoListMapper, TodoList> implements TodoListService {

}
