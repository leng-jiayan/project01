package com.itheima.springboot.controller;

//import org.omg.CORBA.Environment;
import com.itheima.springboot.config.DBConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//@Controller:表示这是controller层，同时把当前类对象放入IOC容器
@RestController
@RequestMapping("/test")
public class HelloController {
    //第一步，通过Autowried从IOC容器中获取environment
    //springMVC 会扫描@Controller类所在类的注解
    @Autowired
    //Environment environment;
    DBConfig dbConfig;
    //设置当前方法的请求路径
    //请求路径可以用多个单词组成，每个单词用/隔开
    //value设置当前方法的请求路径
    //params 设置当前方法必须传递的参数
    //method:限制访问当前方法的请求方式
    //@RequestMapping可用标注在方法上也可以标注在类上
    //当前方法的请求地址=类mapping+方法上的mappping=/test +/hello/index =/testhelo/index
    @RequestMapping(value="/hello/index",
    params = {"username","id"},
    method = RequestMethod.GET)
    public String hello(){
        System.out.println(dbConfig);
        //通过environmenthu获取值
        //String id = environment.getProperty("id");
        //System.out.println(id);
        //System.out.println(environment.getProperty("province.city.area"));
        //System.out.println(environment.getProperty("user.username"));
        //System.out.println(environment.getProperty("ids[0]"));
        return "Hello SpringBoot!";
    }
}
