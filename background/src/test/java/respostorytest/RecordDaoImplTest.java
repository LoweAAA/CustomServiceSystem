package respostorytest;


import com.givemefive.customerservicesystem.config.RootConfig;
import com.givemefive.customerservicesystem.model.Record;
import com.givemefive.customerservicesystem.repostory.RecordDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
public class RecordDaoImplTest {

    @Autowired
    private RecordDao recordDao;


    @Test
    public void getAllTest(){
        List<Record> rl=recordDao.getAll();
        System.out.print(rl.get(0).getRecordCsId());
    }

    @Test
    public void saveTest(){

    }
}
