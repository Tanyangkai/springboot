package com.wdbyte.controller;

import com.wdbyte.domain.Response;
import com.wdbyte.utils.ResponseUtill;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 测试控制器
 *
 * @Author niujinpeng
 * @Date 2018/12/4 14:41
 */
@Slf4j
@RestController
public class HelloController {

    @Value("${bootapp.description}")
    private String description;

    @RequestMapping("/")
    public String index() {
        log.info(description);
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(value = "/er")
    @ResponseBody
    public Response error(Integer num) throws Exception {
        num = num / num;
        return ResponseUtill.success(num);
    }

}
