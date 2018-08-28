package org.gmail.jsonrpc.impl;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;
import org.gmail.jsonrpc.JsonrpcServer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@AutoJsonRpcServiceImpl
public class JsonrpcServerImpl implements JsonrpcServer {

    @Override
    public void sayHello1() {
        System.out.println("Hello.");
    }

    @Override
    public String sayHello2(String name) {
        return "Hello " + name;
    }

    @Override
    public String sayHello3(String firstName, String lastName) {
        return "Hello " + firstName + lastName;
    }

    @Override
    public List<String> sayHello4(Map<String, String> name) {
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, String> entry : name.entrySet()) {
            list.add(entry.getValue());
        }
        return list;
    }

}
