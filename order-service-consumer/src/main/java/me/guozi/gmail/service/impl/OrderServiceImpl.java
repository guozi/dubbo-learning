package me.guozi.gmail.service.impl;

import me.guozi.gmail.api.UserService;
import me.guozi.gmail.bean.UserAddress;
import me.guozi.gmail.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by chenyun on 2020/4/2
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserService userService;

    public void initOrder(String userId) {
        System.out.println("userId ===>>> " + userId);
        final List<UserAddress> userAddresses = userService.getUserAddressList(userId);

        System.out.println(userAddresses);
    }
}
