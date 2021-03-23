package com.example.demo.controller;

import cn.hutool.core.lang.Assert;
import cn.hutool.core.lang.Console;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import com.example.demo.domain.Order;
import com.example.demo.domain.User;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * Created by LXJ on 2021-03-22.
 */
@RestController
public class LoginController {

    public String login(User user) {
        return "success";
    }

    public static void main(String[] args) {
        /*TimeInterval timer = DateUtil.timer();
        System.out.println(DateUtil.ageOfNow("1994-08-20"));
        System.out.println(timer.interval());
        timer.restart();
        System.out.println(DateUtil.date());
        System.out.println(timer.intervalMs());
        System.out.println(DateUtil.now());
        System.out.println(DateUtil.formatDate(new Date()));
        System.out.println(DateUtil.parse("1994820", "yyyyMdd"));
        System.out.println(DateUtil.nextWeek());
        System.out.println(new Date() + " --- " + new DateTime().toString());*/

        // 文件
        /*String str = ResourceUtil.readUtf8Str("test.xml");
        System.out.println(str);*/

        // 字符串
        /*
        System.out.println(StrUtil.isBlank(" "));
        System.out.println(StrUtil.DASHED);
        */

        // xml
        /*Document document = XmlUtil.readXML(LoginController.class.getClassLoader().getResourceAsStream("test.xml"));
        NodeList bean = document.getElementsByTagName("beans");
        Element bean1 = (Element) ((Element) bean.item(0)).getElementsByTagName("bean").item(0);
        System.out.println(bean1.getAttribute("name"));*/

        /*System.out.println(ClassUtil.getClassPath());
        System.out.println(RuntimeUtil.execForStr("java -version"));*/

        /*System.out.println(IdUtil.simpleUUID());
        System.out.println(IdUtil.randomUUID());
        System.out.println(IdUtil.fastUUID());
        System.out.println(IdUtil.fastSimpleUUID());*/

        /*String id = "370783199408205979";
        System.out.println(IdcardUtil.isValidCard(id));
        System.out.println(IdcardUtil.getProvinceByIdCard(id));*/

        // http
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("name", "北京");
        String result = HttpUtil.get("http://127.0.0.1:8080/ttt/111", paramMap);
        Console.log(result);

        Order order = new Order(2, 222, "山东");
        String jsonStr = JSONUtil.toJsonStr(order);
        String result1 = HttpRequest.post("http://127.0.0.1:8080/ttt1").contentType("application/json").body(jsonStr).execute().body();
        Console.log(result1);
    }
}
