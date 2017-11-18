package com.tianbiaoge.example.fanruidemo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity     //实体类，表示这个类对应数据库的一个表
public class Project {
    //基本信息
    @Id
    @GeneratedValue //Id序号 自增的注解
    private Integer id;
    private String idRegion;   //所属区域
    private String idProject;  //设计编号
    private String designName; //设计名称
    private double textDesignFee; //文本设计费
    private double hangUpDesignFee; //院挂账设计费
    private double approvedDesignFee; //审定设计费
    private double differenceAmount;   //差额比对=院挂账设计费-审定设计费
    private String cooperationUnit;    //协作单位
    private double hangUpRation;  //挂账协作比例
    private double projectSubtotal;    //小计
//    //挂账后应有信息
//    private double manageFee;  //管理费
//    private double landTax	;   //地税
//    private double ProjectSubtotal;    //挂账小计
//    //后续信息
//    private double paymentAmount;  //院本次付款金额
//    private double paymentRation;  //院付款比例
//    private double actualReceiveAmount;   //实收金额
//    private double receivableAmount;   //院项目应收余额
//    private Date paymentTime;  //院付款时间
//    private double cooperationPaymentAmount;  //协作单位本次付款金额
//    private double returnedGuaranteee; //归还质保金
//    private double cooperationPayableAmount;  //协作单位应付余额
//    private double reachMoneyAmount;  //到账金额（繁睿）
//    private Date intoAccountTime; //到账时间
//    private String hangUpBatch;   //院挂账批次
//    private double paymentBatch;   //付款批次
//    private String hangOutCompany;    //挂账公司
//    private boolean isChecked = false; //收款审核，默认未审核
//    private Date publishedTime;    //出版时间
//    //实体创建的相关信息
//    private boolean isDeleted = false; //是否为删除状态，默认为假，后期确定到底需不需要
//    private Date projectCreateTime;   //项目创建时间
//    private String userName;   //创建项目的用户
//    private String addtionalInfo;  //备注
    //必须要有一个无参的构造方法
    public Project(){
    }
    //构造方法和getter、setter方法都可以用构造器生成

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(String idRegion) {
        this.idRegion = idRegion;
    }

    public String getIdProject() {
        return idProject;
    }

    public void setIdProject(String idProject) {
        this.idProject = idProject;
    }

    public String getDesignName() {
        return designName;
    }

    public void setDesignName(String designName) {
        this.designName = designName;
    }

    public double getTextDesignFee() {
        return textDesignFee;
    }

    public void setTextDesignFee(double textDesignFee) {
        this.textDesignFee = textDesignFee;
    }

    public double getHangUpDesignFee() {
        return hangUpDesignFee;
    }

    public void setHangUpDesignFee(double hangUpDesignFee) {
        this.hangUpDesignFee = hangUpDesignFee;
    }

    public double getApprovedDesignFee() {
        return approvedDesignFee;
    }

    public void setApprovedDesignFee(double approvedDesignFee) {
        this.approvedDesignFee = approvedDesignFee;
    }

    public double getDifferenceAmount() {
        return differenceAmount;
    }

    public void setDifferenceAmount(double differenceAmount) {
        this.differenceAmount = differenceAmount;
    }

    public String getCooperationUnit() {
        return cooperationUnit;
    }

    public void setCooperationUnit(String cooperationUnit) {
        this.cooperationUnit = cooperationUnit;
    }

    public double getHangUpRation() {
        return hangUpRation;
    }

    public void setHangUpRation(double hangUpRation) {
        this.hangUpRation = hangUpRation;
    }

    public double getProjectSubtotal() {
        return projectSubtotal;
    }

    public void setProjectSubtotal(double projectSubtotal) {
        this.projectSubtotal = projectSubtotal;
    }

//    public double getManageFee() {
//        return manageFee;
//    }
//
//    public void setManageFee(double manageFee) {
//        this.manageFee = manageFee;
//    }
//
//    public double getLandTax() {
//        return landTax;
//    }
//
//    public void setLandTax(double landTax) {
//        this.landTax = landTax;
//    }
//
//    public double getHangUpSubtotal() {
//        return hangUpSubtotal;
//    }
//
//    public void setHangUpSubtotal(double hangUpSubtotal) {
//        this.hangUpSubtotal = hangUpSubtotal;
//    }

//    public double getPaymentAmount() {
//        return paymentAmount;
//    }
//
//    public void setPaymentAmount(double paymentAmount) {
//        this.paymentAmount = paymentAmount;
//    }
//
//    public double getPaymentRation() {
//        return paymentRation;
//    }
//
//    public void setPaymentRation(double paymentRation) {
//        this.paymentRation = paymentRation;
//    }
//
//    public double getActualReceiveAmount() {
//        return actualReceiveAmount;
//    }
//
//    public void setActualReceiveAmount(double actualReceiveAmount) {
//        this.actualReceiveAmount = actualReceiveAmount;
//    }
//
//    public double getReceivableAmount() {
//        return receivableAmount;
//    }
//
//    public void setReceivableAmount(double receivableAmount) {
//        this.receivableAmount = receivableAmount;
//    }
//
//    public Date getPaymentTime() {
//        return paymentTime;
//    }
//
//    public void setPaymentTime(Date paymentTime) {
//        this.paymentTime = paymentTime;
//    }
//
//    public double getCooperationPaymentAmount() {
//        return cooperationPaymentAmount;
//    }
//
//    public void setCooperationPaymentAmount(double cooperationPaymentAmount) {
//        this.cooperationPaymentAmount = cooperationPaymentAmount;
//    }
//
//    public double getReturnedGuaranteee() {
//        return returnedGuaranteee;
//    }
//
//    public void setReturnedGuaranteee(double returnedGuaranteee) {
//        this.returnedGuaranteee = returnedGuaranteee;
//    }
//
//    public double getCooperationPayableAmount() {
//        return cooperationPayableAmount;
//    }
//
//    public void setCooperationPayableAmount(double cooperationPayableAmount) {
//        this.cooperationPayableAmount = cooperationPayableAmount;
//    }
//
//    public double getReachMoneyAmount() {
//        return reachMoneyAmount;
//    }
//
//    public void setReachMoneyAmount(double reachMoneyAmount) {
//        this.reachMoneyAmount = reachMoneyAmount;
//    }
//
//    public Date getIntoAccountTime() {
//        return intoAccountTime;
//    }
//
//    public void setIntoAccountTime(Date intoAccountTime) {
//        this.intoAccountTime = intoAccountTime;
//    }
//
//    public String getHangUpBatch() {
//        return hangUpBatch;
//    }
//
//    public void setHangUpBatch(String hangUpBatch) {
//        this.hangUpBatch = hangUpBatch;
//    }
//
//    public double getPaymentBatch() {
//        return paymentBatch;
//    }
//
//    public void setPaymentBatch(double paymentBatch) {
//        this.paymentBatch = paymentBatch;
//    }
//
//    public String getHangOutCompany() {
//        return hangOutCompany;
//    }
//
//    public void setHangOutCompany(String hangOutCompany) {
//        this.hangOutCompany = hangOutCompany;
//    }
//
//    public boolean isChecked() {
//        return isChecked;
//    }
//
//    public void setChecked(boolean checked) {
//        isChecked = checked;
//    }
//
//    public Date getPublishedTime() {
//        return publishedTime;
//    }
//
//    public void setPublishedTime(Date publishedTime) {
//        this.publishedTime = publishedTime;
//    }
//
//    public boolean isDeleted() {
//        return isDeleted;
//    }
//
//    public void setDeleted(boolean deleted) {
//        isDeleted = deleted;
//    }
//
//    public Date getProjectCreateTime() {
//        return projectCreateTime;
//    }
//
//    public void setProjectCreateTime(Date projectCreateTime) {
//        this.projectCreateTime = projectCreateTime;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public String getAddtionalInfo() {
//        return addtionalInfo;
//    }
//
//    public void setAddtionalInfo(String addtionalInfo) {
//        this.addtionalInfo = addtionalInfo;
//    }
}