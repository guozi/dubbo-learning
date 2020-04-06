package me.guozi.gmail;

import me.guozi.gmail.api.UserService;
import me.guozi.gmail.bean.UserAddress;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@EnableDubbo
@SpringBootApplication
public class BootOrderServiceConsumerApplication implements CommandLineRunner {

    //    @Reference(url = "127.0.0.1:20880") //dubbo直连方式
    @Reference
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(BootOrderServiceConsumerApplication.class, args);
    }

    public void run(String... args) throws Exception {
        final List<UserAddress> userAddresses = userService.getUserAddressList("1");

        System.out.println(userAddresses);
    }
}
