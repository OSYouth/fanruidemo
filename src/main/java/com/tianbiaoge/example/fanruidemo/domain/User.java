package com.tianbiaoge.example.fanruidemo.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @Describe 用户实体类，用来存储注册的用户
 * @Author lc
 * @CreateTime 2017/11/1
 */
@Entity
public class User{

    @Id
    @GeneratedValue
    private Integer id;

    private String userName;    //用户名

    private String password;    //密码

    private Date createTime;    //创建用户的时间

    /**
     * @Describe 必须要有一个无参的构造方法
     */
    public User() {
    }

    /**
     * @Describe 这个类里面各个变量的setter和getter方法
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
