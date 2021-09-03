package com.itheima.springboot.controller;

import com.itheima.springboot.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Arrays;

@RestController
@RequestMapping("/param")
public class ParamController {
    /**
    //简单类型参数接收：保证前台参数名和方法上的参数名一致
     *简单类型：包装类型+
     * @return
     * */
    @RequestMapping("/base")
    public  String base(String username,Integer id, Data birthday){
        return "username:"+username+"id"+id+"birthday:"+birthday;
    }
    //使用对象类型接收参数
    //保证参数名和对象的属性名一致（set）
    @RequestMapping("obj")
    public User obj(User user){
        return user;
    }
    /*
    * 接收数组类型的参数
    * 1.对应类型数组接收
    * 2.直接使用字符串接收参数
    * 3.使用集合接收数组类型参数
    * */
    @RequestMapping("/arr")

    public String arr(Integer[] id){
        System.out.println(Arrays.toString(id));
        return "200";
    }
    @RequestMapping("arr2")
    public String arr2(String[] hobby ){
        System.out.println(Arrays.toString(hobby));
        return "200";
    }
    //直接使用字符串接收数组
    @RequestMapping("arr3")
    public String arr3(String hobby ){
        System.out.println(hobby);
        return "200";
    }/*@Requesparam
name:表示接收指定名称的参数
required:表示必须传递，默认true表示必须传递，flase不传
 */
    //使用集合来接收数组类型参数
    @RequestMapping("arr4")
    public String arr4(@RequestParam ArrayList<String> hobby,
                       @RequestParam(name = "name",
                       required = true,
                       defaultValue = "tom")String username){
        System.out.println(hobby);
        System.out.println(username);//运动 音乐
        return "200";
    }
}

