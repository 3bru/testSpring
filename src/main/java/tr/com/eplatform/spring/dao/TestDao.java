package tr.com.eplatform.spring.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import tr.com.eplatform.spring.entity.Helloworld;


@Component
public class TestDao {


      public Helloworld getWord() {

        Helloworld helloworld = new Helloworld();
        helloworld.setInput("hello world");
        return  helloworld;
    }
}

