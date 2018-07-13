package sample.dengchao.lib;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author <a href="mailto:qq2325690622@gmail.com">Deng Chao</a>
 * @since 2018/7/13
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LibServiceTest {

    @Autowired
    private LibService service;

    @Test
    public void findById() {
        Assert.assertEquals(service.findById().getId(), "1");
        LoggerFactory.getLogger(getClass()).info("Test pass !");
    }


    @SpringBootApplication
    static class TestApp {
    }
}