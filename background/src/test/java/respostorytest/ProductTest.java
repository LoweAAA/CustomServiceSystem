package respostorytest;


import com.givemefive.customerservicesystem.config.RootConfig;
import com.givemefive.customerservicesystem.model.bean.Product;
import com.givemefive.customerservicesystem.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
public class ProductTest {


    @Autowired
    private ProductService productService;



    @Test
    public void queryByCom(){
        List<Product> productList = productService.queryByComName("Apple");
        for (int i=0;i < productList.size();i++)
        System.out.println(productList.get(i).getProductName());
    }


    @Test
    public void queryBy(){
        List<Product> productList = productService.queryByCateName("laptop");
        for (int i=0;i < productList.size();i++)
            System.out.println(productList.get(i).getProductName());
    }


    @Test
    public void getAllTest(){
        List<Product> productList = productService.getAll();
        for (int i=0;i < productList.size();i++)
            System.out.println(productList.get(i).getProductName());
    }




}
