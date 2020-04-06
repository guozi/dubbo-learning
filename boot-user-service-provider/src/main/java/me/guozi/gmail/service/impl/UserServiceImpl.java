package me.guozi.gmail.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import me.guozi.gmail.api.UserService;
import me.guozi.gmail.bean.UserAddress;
import org.apache.dubbo.config.annotation.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by chenyun on 2020/4/2
 */
@Service
public class UserServiceImpl implements UserService {

    @HystrixCommand(fallbackMethod = "hello")   //服务调用出错回调函数
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress userAddress1 = new UserAddress(1, "zhangsan", "张三", "上海市浦东新区");
        UserAddress userAddress2 = new UserAddress(2, "lisi", "李四", "湖北省武汉市");

        if (Math.random() > 0.5) {
            throw new RuntimeException("exception....");
        }

        return Arrays.asList(userAddress1, userAddress2);
    }

    public List<UserAddress> hello(String userId) {
        UserAddress userAddress = new UserAddress(2, "wangwu", "王五", "北京市顺义区");

        return Arrays.asList(userAddress);
    }
}
