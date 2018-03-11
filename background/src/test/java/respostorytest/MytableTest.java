package respostorytest;


import com.givemefive.customerservicesystem.config.RootConfig;
import com.givemefive.customerservicesystem.model.Mytable;
import com.givemefive.customerservicesystem.repostory.MytableDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
public class MytableTest {

    @Autowired
    private MytableDao mytableDao;

    @Test
    public void getAllTest(){
        for(int i=0;i<mytableDao.getall().size();i++){
            System.out.print(mytableDao.getall().get(i).getUsername()+"\n");
        }
    }

    @Test
    public void saveTest(){
        Mytable mytable=new Mytable();
        mytable.setAge(55);
        mytable.setUsername("99999911");
        mytableDao.save(mytable);
    }
}
