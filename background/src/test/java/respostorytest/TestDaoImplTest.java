package respostorytest;


import com.givemefive.customerservicesystem.config.RootConfig;
import com.givemefive.customerservicesystem.model.*;

import com.givemefive.customerservicesystem.repostory.RecordDao;
import com.givemefive.customerservicesystem.repostory.TestDao;
import com.givemefive.customerservicesystem.service.*;
import org.junit.Test;
import org.junit.runner.Result;
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
    private ComlService comlService;

    @Autowired
    private CSservice cSservice;
    @Autowired
    private RepositorySerivce repositorySerivce;


    @Autowired
    private AskForLeaveService askForLeaveService;

    private com.givemefive.customerservicesystem.model.Constant.Result result;


    @Test
    public void addRepos(){
        Coml coml = new Coml();
        coml.build("question","similar","answer","apple","Tony");
        result = comlService.addComl(coml);
        System.out.println(result.getERRmessage());
    }



    @Test
    public void getAllTest(){
        List<Repository> list = repositorySerivce.getRepos();
        System.out.print(list.get(0).getRepositoryQuestion() );
    }

    @Test
    public void saveTest(){

        CustomerService customerService = new CustomerService("Zhao","0","15212345678","apple@gmail.com","2","123");
        cSservice.update(customerService);
        System.out.println(customerService.getCsAccount());
    }






}
