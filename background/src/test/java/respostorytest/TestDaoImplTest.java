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
    private AskForLeaveService askForLeaveService;

    private com.givemefive.customerservicesystem.model.Constant.Result result;


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
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = new java.util.Date();
        String ss = sdf.format(date);
        Date date1 = null;
        try {
            java.util.Date date3 = sdf.parse(ss);
            date1 = new Date(date3.getTime());

        }catch (ParseException e){
            e.printStackTrace();
        }

        //long l = Long.parseLong(ss);



        System.out.println(date1);
       /* Repository repository = new Repository();

        repository.build("aaa","bbb","ccc","ddd",l);
        result = repositorySerivce.addQuestion(repository);
        System.out.println(repository.getRepositoryCreationTime()+result.getERRmessage());*/
    }


    @Test
    public void saveTest(){

        CustomerService customerService = new CustomerService("Zhao","0","15212345678","apple@gmail.com","2","123");
        cSservice.update(customerService);
        System.out.println(customerService.getCsAccount());
    }






}
