package com.sawyer.mapper;

import com.sawyer.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StuMapper {
    int insertStudent(Student student);
    Student findBySno(@Param("sno") int sno);
    int deleteBySno(@Param("sno") int sno);
    int updateAgeBySno(@Param("sno") int sno, @Param("age") int age);
}
