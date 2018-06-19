package respostorytest;


import com.givemefive.customerservicesystem.config.RootConfig;
import com.givemefive.customerservicesystem.model.*;

import com.givemefive.customerservicesystem.repostory.RecordDao;
import com.givemefive.customerservicesystem.repostory.TestDao;
import com.givemefive.customerservicesystem.service.*;
import com.givemefive.customerservicesystem.service.util.GetRecentDateService;
import org.junit.Test;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
    private AdminService adminService;


    @Autowired
    private AskForLeaveService askForLeaveService;

    private com.givemefive.customerservicesystem.model.Constant.Result result;

    @Autowired
    private GetRecentDateService getRecentDateService;

@Test
public void loginconfirm(){
    result = adminService.loginConfirm("admin@163.com","123");
    System.out.println(result.isComplete()+result.getERRmessage());
}



    @Test
    public void addTest(){
        Coml coml = new Coml();
        coml.build("question","similar","answer","apple","Tony");
        result = comlService.addComl(coml);
        System.out.println(result.getERRmessage());
    }

    @Test
    public void getAllTest(){
        List<Repository> list = repositorySerivce.getRepos();
        System.out.println(list.get(0).getRepositoryKeyWords());
    }





    @Test
    public void addRepos(){
        Repository repository = new Repository();
        try {
            java.util.Date date = getRecentDateService.getToday();
            repository.build("aaa","bbb","ccc","ddd",date);
        }catch (Exception e){
            System.out.println(e+"333");
        }//ok

        result = repositorySerivce.addQuestion(repository);
        System.out.println(repository.getRepositoryCreationTime()+result.getERRmessage());
    }


    @Test
    public void saveTest(){

        CustomerService customerService = new CustomerService("Zhao","0","15212345678","apple@gmail.com","2","123");
        cSservice.update(customerService);
        System.out.println(customerService.getCsAccount());
    }






}
