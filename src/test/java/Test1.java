import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tr.com.eplatform.spring.SpringTestApp;
import tr.com.eplatform.spring.service.TestService;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringTestApp.class)
public class Test1 {

    @Autowired
    private TestService testService;

    private boolean body;


    @Test
    public void testCreate() {
        body = this.testService.giris("hello world");
        Assert.assertTrue(body);

    }

}
