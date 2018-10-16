package respostorytest;


import com.givemefive.customerservicesystem.config.RootConfig;
import com.givemefive.customerservicesystem.model.bean.Company;
import com.givemefive.customerservicesystem.repostory.CompanyDao;
import com.givemefive.customerservicesystem.service.CompanyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
public class CompanyDaoTest {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private CompanyService companyService;

    @Test
    public void queryByMail(){
        Company company = companyDao.queryByMail("apple@gmail.com");
        System.out.println(company.getCompanyName());
    }



/*    @Test
    public void loginconfirm(){
        String company = companyService.loginconfirm("apple@gmail.com","123");
        System.out.println(company);
    }*/

    @Test
    public void querybyid(){
        Company company = companyService.queryById("0");
        System.out.println(company.getCompanyName());
    }


}
