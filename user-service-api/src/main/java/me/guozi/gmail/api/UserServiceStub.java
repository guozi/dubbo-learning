package me.guozi.gmail.api;

import me.guozi.gmail.bean.UserAddress;

import java.util.List;

/**
 * Created by chenyun on 2020/4/4
 */
public class UserServiceStub implements UserService {

    private final UserService userService;

    public UserServiceStub(UserService userService) {
        super();
        this.userService = userService;
    }

    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("Calling UserServiceStub...");
        if (userId != null && !"".equals(userId)){
            return userService.getUserAddressList(userId);
        }

        return null;
    }
}
