package org.gmail.jsonrpc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JsonrpcClient {
    @Autowired
    private JsonrpcServer server;

    @Test
    public void testSayHello1() {
        server.sayHello1();
    }

    @Test
    public void testSayHello2() {
        String str = server.sayHello2("Tom");
        System.out.println(str);
    }

    @Test
    public void testSayHello3() {
        String str = server.sayHello3("Jerry", "Tom");
        System.out.println(str);
    }

    @Test
    public void testSayHello4() {
        HashMap<String, String> name = new HashMap<>();
        name.put("firstName", "Jerry");
        name.put("lastName", "Tom");
        List<String> list = server.sayHello4(name);
        System.out.println(list);
    }

}
