package org.sample.mongodb;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.sample.mongodb.SampleMongoDBApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={SampleMongoDBApplication.class})
public class SampleTest {

    @Autowired
    private MongoTemplate mongoTemplate;
    
    @Test
    public void testMongoTemplate(){
	Assert.assertNotNull(mongoTemplate);
    }
}
