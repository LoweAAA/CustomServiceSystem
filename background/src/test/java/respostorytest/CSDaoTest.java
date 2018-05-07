package respostorytest;


import com.givemefive.customerservicesystem.config.RootConfig;
import com.givemefive.customerservicesystem.model.CustomerService;
import com.givemefive.customerservicesystem.model.Product;
import com.givemefive.customerservicesystem.model.Record;
import com.givemefive.customerservicesystem.repostory.CustomerserviceDao;
import com.givemefive.customerservicesystem.repostory.ProductDao;
import com.givemefive.customerservicesystem.repostory.RecordDao;
import com.givemefive.customerservicesystem.repostory.TestDao;
import com.givemefive.customerservicesystem.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
public class CSDaoTest {
    @Autowired
    private CustomerserviceDao customerserviceDao;

    @Autowired
    private ProductService productService;
    @Autowired
    private ProductDao productDao;

    @Test
    public void querybyid(){
        CustomerService CustomerService= customerserviceDao.queryByID("123");
        System.out.println(CustomerService.getCsPassword());
    }

    @Test
    public void querybycomname(){

        List<Product> productlist = productService.queryByCateName("Laptop");

        for(Product a : productlist) {
            System.out.println(a.getProductName());
        }
    }


}
