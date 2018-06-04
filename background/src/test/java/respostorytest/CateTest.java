package respostorytest;


import com.givemefive.customerservicesystem.config.RootConfig;
import com.givemefive.customerservicesystem.model.Category;
import com.givemefive.customerservicesystem.repostory.CategoryDao;
import com.givemefive.customerservicesystem.service.CategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
public class CateTest {
    @Autowired
    private CategoryService categoryService;

    @Autowired
    private CategoryDao categoryDao;

    @Test
    public void getAllTest(){
        List<Category> list = categoryService.queryByCom("Apple");
        for(int i=0;i < list.size();i++){
            System.out.println(list.get(i).getCategoryName());
        }
    }
}
