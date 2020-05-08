package com.example.student.dao;


import com.example.student.pojo.StuInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @author 19673
 */
@Mapper
public interface StuInfoMapper {

    /**
     * 增
     * @param name
     * @param sno
     * @param sex
     * @param tel
     * @return
     */
    void add(@Param("sno") Integer sno, @Param("name") String name,
           @Param("sex") String sex, @Param("tel") String tel);


    /**
     * 删
     * @param sno
     * @return
     */
    void deleteBySno(Integer sno);

    /**
     * 根据sno改
     * @param sno
     * @param name
     * @param sex
     * @param tel
     */
    void update(@Param("sno") Integer sno, @Param("name") String name,
                @Param("sex") String sex, @Param("tel") String tel);


    /**
     * 根据sno查找
     * @param Sno
     * @return
     */
    List<StuInfo> findBySno(Integer Sno);
}