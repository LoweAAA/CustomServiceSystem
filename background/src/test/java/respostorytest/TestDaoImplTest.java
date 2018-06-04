package respostorytest;


import com.givemefive.customerservicesystem.config.RootConfig;
import com.givemefive.customerservicesystem.model.CustomerService;
import com.givemefive.customerservicesystem.model.Record;
import com.givemefive.customerservicesystem.model.Repository;
import com.givemefive.customerservicesystem.model.SystemQuestion;
import com.givemefive.customerservicesystem.repostory.RecordDao;
import com.givemefive.customerservicesystem.repostory.TestDao;
import com.givemefive.customerservicesystem.service.CSservice;
import com.givemefive.customerservicesystem.service.RepositorySerivce;
import com.givemefive.customerservicesystem.service.SQuesService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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


    @Test
    public void addRepos(){
        Repository repository = new Repository("1","how to close it?","push the button","close,how");
        repositorySerivce.addQuestion(repository);
        System.out.print(repository.getRepositoryKeyWords());
    }



    @Test
    public void getAllTest(){
        List<com.givemefive.customerservicesystem.model.SystemQuestion> SQList = sQuesService.getAll();
        System.out.print(SQList.get(0).getQuestionAnswer() );
    }

    @Test
    public void saveTest(){

        CustomerService customerService = new CustomerService("Zhao","0","15212345678","apple@gmail.com","2","123");
        cSservice.update(customerService);
        System.out.println(customerService.getCsAccount());
    }
}
