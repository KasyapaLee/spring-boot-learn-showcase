package com.dobby.readprop.web;

import com.alibaba.fastjson.JSON;
import com.dobby.readprop.model.Developer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/readprop")
public class ReadPropController {

    /**
     * 主属性文件中的配置项，可以直接使用 @Value注入
     */
    @Value("${date.today}")
    private String todayStr;


    @Value("${myname}")
    private String myname;

    @Autowired
    private Developer developer;

    @Autowired
    private Environment env;


    @GetMapping("/readMainProp")
    public String today() {
        return this.todayStr;
    }


    @GetMapping("/readCustomProp")
    public String myname() {
        return this.myname;
    }

    @GetMapping("/readObj")
    public String developer() {
        return JSON.toJSONString(this.developer);
    }


    @GetMapping("/env")
    public String evn() {
        String port = env.getProperty("server.port");
        return port;
    }

}
