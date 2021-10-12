package com.xjs.todolist.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xjs.todolist.entity.TodoList;
import com.xjs.todolist.service.TodoListService;
import com.xjs.todolist.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xjs
 * @since 2021-10-12
 */
@RestController
@RequestMapping("/todolist/todo-list")
public class TodoListController {
    @Autowired
    private TodoListService todoListService;

    @GetMapping
    public R findAll(){
        QueryWrapper<TodoList> queryWrapper = new QueryWrapper<TodoList>().orderByDesc("update_time");
        List<TodoList> list = todoListService.list(queryWrapper);
        return R.ok().put("list",list);
    }

    @PostMapping
    public R addList(@RequestBody TodoList todoList){
        todoListService.getBaseMapper().insert(todoList);
        return R.ok();
    }

    @DeleteMapping("/{id}")
    public R deleteList(@PathVariable("id")Long id){
        todoListService.removeById(id);
        return R.ok();
    }

    @PutMapping()
    public R updateList(@RequestBody TodoList todoList){
        todoListService.updateById(todoList);
        return R.ok();
    }

    @DeleteMapping("batch")
    public R batchDeleteList(Long[] ids){
        List<Long> longs = Arrays.asList(ids);
        todoListService.removeByIds(longs);
        return R.ok();
    }

}

