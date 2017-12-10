package com.tianbiaoge.example.fanruidemo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @Describe
 * 挂账的实体类，用于第三方公司和本公司挂账时添加的对象
 * 对象添加上限不超过 5次
 * 主要包含设计编号（主键，用于和项目对应）、挂账次数也就是对象添加的个数、每次挂账的实际金额，以及发票的三段信息
 * 等相关信息
 * @Author lc
 * @CreateTime 2017/11/23
 */
@Entity
public class HangUp {
    @Id
    @GeneratedValue
    private Integer id; //Id序号 自增的注解
    private String idProject;  //设计编号,因为设计编号是唯一的，所以作为联系其他表的外键
    private Integer idTemp; //对应Project表中的id，因为前端页面是根据id来调用的，但是idProject包含非数字符号，会导致前端地址栏显示的时候报错，不知道怎么解决这个问题
    private Integer hangUpTimes = 0;  //挂账次数，默认为0
    private double actualHangUpAmount = 0;   //实际挂账金额，默认值0
    private String hangUpInvoiceNumber;    //发票号码
    private double hangUpInvoiceAmount; //发票金额
    private Date hangUpInvoiceTime; //发票时间（datetime		DEFAULT '2001-01-01',）

    private Date hangUpCreateTime;   //挂账创建时间（datetime 	DEFAULT CURRENT_TIMESTAMP,）
    private String userName;   //创建挂账的用户

    /**
     * @Describe 必须要有一个无参的构造方法
     */
    public HangUp(){
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

    public String getIdProject() {
        return idProject;
    }

    public void setIdProject(String idProject) {
        this.idProject = idProject;
    }

    public Integer getIdTemp() {
        return idTemp;
    }

    public void setIdTemp(Integer idTemp) {
        this.idTemp = idTemp;
    }

    public Integer getHangUpTimes() {
        return hangUpTimes;
    }

    public void setHangUpTimes(Integer hangUpTimes) {
        this.hangUpTimes = hangUpTimes;
    }

    public double getActualHangUpAmount() {
        return actualHangUpAmount;
    }

    public void setActualHangUpAmount(double actualHangUpAmount) {
        this.actualHangUpAmount = actualHangUpAmount;
    }

    public String getHangUpInvoiceNumber() {
        return hangUpInvoiceNumber;
    }

    public void setHangUpInvoiceNumber(String hangUpInvoiceNumber) {
        this.hangUpInvoiceNumber = hangUpInvoiceNumber;
    }

    public double getHangUpInvoiceAmount() {
        return hangUpInvoiceAmount;
    }

    public void setHangUpInvoiceAmount(double hangUpInvoiceAmount) {
        this.hangUpInvoiceAmount = hangUpInvoiceAmount;
    }

    public Date getHangUpInvoiceTime() {
        return hangUpInvoiceTime;
    }

    public void setHangUpInvoiceTime(Date hangUpInvoiceTime) {
        this.hangUpInvoiceTime = hangUpInvoiceTime;
    }

    public Date getHangUpCreateTime() {
        return hangUpCreateTime;
    }

    public void setHangUpCreateTime(Date hangUpCreateTime) {
        this.hangUpCreateTime = hangUpCreateTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
