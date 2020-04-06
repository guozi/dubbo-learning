package me.guozi.gmail.api;

import me.guozi.gmail.bean.UserAddress;

import java.util.List;

/**
 * 用户服务
 * <p>
 * Created by chenyun on 2020/4/2
 */
public interface UserService {

    /**
     *
     * @param userId
     * @return
     */
    public List<UserAddress> getUserAddressList(String userId);
}
