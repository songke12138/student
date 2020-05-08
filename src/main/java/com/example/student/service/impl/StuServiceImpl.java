package com.example.student.service.impl;


import com.example.student.dao.StuInfoMapper;
import com.example.student.pojo.StuInfo;
import com.example.student.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author songke
 * @company xxx
 * @create 2020-05-07 18:12
 */
@Service
public class StuServiceImpl implements StuService {


    @Resource
    StuInfoMapper stuInfoMapper;


    @Override
    public String add(Integer sno, String name, String sex, String tel) {

        List<StuInfo> infos = stuInfoMapper.findBySno(sno);

        if (infos.size()>0){
            return "该sno已经存在，请换一个";
        }else {
            stuInfoMapper.add(sno, name, sex, tel);
            List<StuInfo> infos1 = stuInfoMapper.findBySno(sno);
            if (infos1.isEmpty()){
                return "插入失败哦";
            }else {
                return "添加success";
            }
        }
    }

    @Override
    public String delete(Integer sno) {

        List<StuInfo> infos1 = stuInfoMapper.findBySno(sno);
        if (infos1.isEmpty()) {
            return "没有该数据";
        }else {
            stuInfoMapper.deleteBySno(sno);
            List<StuInfo> infos = stuInfoMapper.findBySno(sno);
            if (infos.isEmpty()) {
                return "删除成功！";
            } else {
                return "删除失败";
            }
        }
    }
    @Override
    public String update(Integer sno, String name, String sex, String tel) {
        List<StuInfo> infos = stuInfoMapper.findBySno(sno);
        if (infos.isEmpty()){
            return "不存在要修改的数据";
        }else {
            stuInfoMapper.update(sno, name, sex, tel);
                return "修改成功";
            }
        }

    @Override
    public List<StuInfo> findBySno(Integer sno) {
        return stuInfoMapper.findBySno(sno);
    }
}
