package net.codingme.boot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * <p>
 * 正常的logback日志输出
 *
 * @Author niujinpeng
 * @Date 2018/8/26 9:20
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LoggerTest1 {

    // 获取记录类的日志对象
    private final Logger logger =LoggerFactory.getLogger(LoggerTest1.class);

    @Test
    public void testPrint(){
        logger.debug("debug....");
        logger.info("info....");
        logger.error("error....");
    }


}