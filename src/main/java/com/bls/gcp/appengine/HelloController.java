package com.bls.gcp.appengine;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello() {
        StringBuilder message = new StringBuilder("Hello Google App Engine! \n");
        try {
            InetAddress ip = InetAddress.getLocalHost();
            message.append("\nFrom host: " + ip);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return message.toString();
    }

}