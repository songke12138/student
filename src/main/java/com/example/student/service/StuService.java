package com.example.student.service;

import com.example.student.pojo.StuInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author songke
 * @company xxx
 * @create 2020-05-07 18:12
 */
public interface StuService {

    /**
     *增
     * @param name
     * @param sno
     * @param sex
     * @param tel
     * @return
     */
    String add(@Param("sno") Integer sno,@Param("name") String name,
               @Param("sex") String sex,@Param("tel") String tel);


    /**
     * 删
     * @param sno
     * @return
     */
    String delete(Integer sno);

    /**
     * 根据sno改
     * @param sno
     * @param name
     * @param sex
     * @param tel
     * @return  result
     */
    String update(@Param("sno") Integer sno, @Param("name") String name,
                @Param("sex") String sex, @Param("tel") String tel);

    /**
     * 根据sno查找
     * @param sno
     * @return
     */
    List<StuInfo> findBySno(Integer sno);
}
