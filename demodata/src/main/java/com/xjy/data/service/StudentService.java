package com.xjy.data.service;

import com.xjy.data.mapper.StudentMapper;
import com.xjy.data.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;
    public Student getStudentById(int id){
        return studentMapper.selectByPrimaryKey(id);
    }
    public int insertSelective(Student record){
        return studentMapper.insert(record);
    }
    public int deleteByPrimaryKey(Integer id){
        return studentMapper.deleteByPrimaryKey(id);
    }
    public int updateByPrimaryKey(Student student){
        return studentMapper.updateByPrimaryKey(student);
    }

}
