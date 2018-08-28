package org.gmail.jsonrpc;

import com.googlecode.jsonrpc4j.JsonRpcParam;
import com.googlecode.jsonrpc4j.JsonRpcService;

import java.util.List;
import java.util.Map;

@JsonRpcService("jsonrpc")
public interface JsonrpcServer {

    /**
     * 无参无返回值方法调用
     */
    void sayHello1();

    /**
     * 有参有返回值方法调用
     */
    String sayHello2(String name);

    /**
     * 命名参数方法调用
     */
    String sayHello3(@JsonRpcParam("firstName") String firstName, @JsonRpcParam("lastName") String lastName);

    /**
     * 集合参数方法调用
     */
    List<String> sayHello4(Map<String, String> name);

}
