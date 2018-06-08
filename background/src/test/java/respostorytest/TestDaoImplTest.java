package respostorytest;


import com.givemefive.customerservicesystem.config.RootConfig;
import com.givemefive.customerservicesystem.model.*;
import com.givemefive.customerservicesystem.repostory.RecordDao;
import com.givemefive.customerservicesystem.repostory.TestDao;
import com.givemefive.customerservicesystem.service.AskForLeaveService;
import com.givemefive.customerservicesystem.service.CSservice;
import com.givemefive.customerservicesystem.service.RepositorySerivce;
import com.givemefive.customerservicesystem.service.SQuesService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Date;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
public class TestDaoImplTest {

    @Autowired
    private TestDao testDao;
    @Autowired
    private SQuesService sQuesService;

    @Autowired
    private CSservice cSservice;
    @Autowired
    private RepositorySerivce repositorySerivce;


    @Autowired
    private AskForLeaveService askForLeaveService;


    @Test
    public void addRepos(){
        Date date = new Date(2018,6,8);
        AskForLeave askForLeave = new AskForLeave("Zhao",date,"holiday");
        askForLeaveService.addAfl(askForLeave);
        System.out.print(askForLeave.getNote());
    }



    @Test
    public void getAllTest(){
        List<AskForLeave> list = askForLeaveService.getAll();
        System.out.print(list.get(0).getNote() );
    }

    @Test
    public void saveTest(){

        CustomerService customerService = new CustomerService("Zhao","0","15212345678","apple@gmail.com","2","123");
        cSservice.update(customerService);
        System.out.println(customerService.getCsAccount());
    }






}
