package tr.com.eplatform.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import tr.com.eplatform.spring.service.TestService;
import tr.com.eplatform.spring.view.TestView;

@SpringBootApplication(scanBasePackages = "tr")
public class SpringTestApp {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringTestApp.class);
        TestView testView = (TestView)context.getBean("testView");
        testView.giris("hello world");

    }

}