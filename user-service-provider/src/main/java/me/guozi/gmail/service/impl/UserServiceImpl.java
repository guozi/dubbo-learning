package me.guozi.gmail.service.impl;

import me.guozi.gmail.api.UserService;
import me.guozi.gmail.bean.UserAddress;

import java.util.Arrays;
import java.util.List;

/**
 * Created by chenyun on 2020/4/2
 */
public class UserServiceImpl implements UserService {

    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress userAddress1 = new UserAddress(1, "zhangsan", "张三", "上海市浦东新区");
        UserAddress userAddress2 = new UserAddress(2, "lisi", "李四", "湖北省武汉市");

        return Arrays.asList(userAddress1, userAddress2);
    }
}
