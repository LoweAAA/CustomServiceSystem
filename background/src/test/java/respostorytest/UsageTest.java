package respostorytest;


import com.alibaba.fastjson.JSON;
import com.givemefive.customerservicesystem.config.RootConfig;
import com.givemefive.customerservicesystem.model.bean.Coml;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * 新包功能测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
public class UsageTest {

    private static Logger logger = Logger.getLogger(UsageTest.class);

    /**
     * log4j测试
     */
    @Test
    public void logTest(){
        int a  = 1;
        //Log4jUtil.info("here is logger!");
        Coml coml = new Coml();
        logger.info(JSON.toJSON(coml));
        System.out.println(a);
    }


}
