package me.guozi.gmail.bean;

import java.io.Serializable;

/**
 * Created by chenyun on 2020/4/2
 */
public class UserAddress implements Serializable {

    private static final long serialVersionUID = -5837644426524172333L;

    private Integer id;
    private String userId;
    private String userName;
    private String userAddress;

    public UserAddress(Integer id, String userId, String userName, String userAddress) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.userAddress = userAddress;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    @Override
    public String toString() {
        return "UserAddress{" +
               "id=" + id +
               ", userId='" + userId + '\'' +
               ", userName='" + userName + '\'' +
               ", userAddress='" + userAddress + '\'' +
               '}';
    }
}
