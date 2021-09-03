package com.itheima.springboot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Configuration表示当前是一个配置类，会放入到IOC容器中
@Configuration
//读取以db开头的配置
@ConfigurationProperties("db")
public class DBConfig {
    //提供配置对应的属性
    private String driver;
    private String url;
    private String username;
    private String password;

    @Override
    public String toString() {
        return "DBConfig{" +
                "driver='" + driver + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @RestController
    public class HelloController {
        //从IOC容器中获取dbConfig对象
        @Autowired
        DBConfig dbConfig;

        @RequestMapping("/prop/config")
        public String dbConfig(){
            System.out.println(dbConfig);
            return "200";
        }
    }
}
