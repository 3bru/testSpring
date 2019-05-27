package tr.com.eplatform.spring.view;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import tr.com.eplatform.spring.service.TestService;

@Component
public class TestView {

    @Autowired
    private TestService testService;
    private String  word;

        public void giris(String input){
            System.out.println("hello world");
            testService.giris(input);
}

    public TestService getTestService() {
        return testService;
    }

    public void setTestService(TestService testService) {
        this.testService = testService;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
