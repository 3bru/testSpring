package tr.com.eplatform.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tr.com.eplatform.spring.dao.TestDao;
import tr.com.eplatform.spring.entity.Helloworld;

@Component
public class TestService {

    @Autowired
    private TestDao testDao;

    public Boolean giris(String input){

        Helloworld helloworld = testDao.getWord();

        if (helloworld != null){

            return  helloworld.getInput().equals(input);

        }
        return  false;

    }

    public TestDao getTestDao() {
        return testDao;
    }

    public void setTestDao(TestDao testDao) {
        this.testDao = testDao;
    }

}
