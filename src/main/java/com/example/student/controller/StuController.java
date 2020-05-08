package com.example.student.controller;


import com.example.student.pojo.StuInfo;
import com.example.student.service.StuService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author songke
 * @company xxx
 * @create 2020-05-07 18:13
 */
@RestController
public class StuController {

    @Resource
    StuService stuService;


    @RequestMapping("/insert/{sno}/{name}/{sex}/{tel}")
    public String add(@PathVariable Integer sno, @PathVariable String name,
                      @PathVariable String sex, @PathVariable String tel){
        return stuService.add(sno,name,sex,tel);
    }


    @RequestMapping("/delete/{sno}")
    public String delete(@PathVariable Integer sno){
       return stuService.delete(sno);
    }

    @GetMapping("/update/{sno}/{name}/{sex}/{tel}")
    public String update(@PathVariable Integer sno, @PathVariable String name,
                    @PathVariable String sex, @PathVariable String tel){
       return stuService.update(sno, name, sex, tel);
    }

    @RequestMapping("/find/{sno}")
    public List<StuInfo> findBySno(@PathVariable Integer sno){
        return stuService.findBySno(sno);
    }

}
