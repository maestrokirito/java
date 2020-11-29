package com.xjy.data.controller;

import com.xjy.data.model.Student;
import com.xjy.data.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("/select")
    public @ResponseBody Object select(Integer id){
        return studentService.getStudentById(id);
    }
    @RequestMapping("/insert")
    public @ResponseBody Object insert(Student record){
        return studentService.insertSelective(record);
    }
    @RequestMapping("/delete")
    public @ResponseBody Object delete(Integer id){
        return studentService.deleteByPrimaryKey(id);
    }
    @RequestMapping("/update")
    public @ResponseBody Object update(Student student){
        return studentService.updateByPrimaryKey(student);
    }
}
