package com.tianbiaoge.example.fanruidemo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity     //实体类，表示这个类对应数据库的一个表
public class Project {
    @Id
    @GeneratedValue //I 自增的注解
    private Integer id;
    private String id_region;
    private String id_project;
    private String design_name;
    private double text_design_fee;
    private double hang_up_desgine_fee;
    private String cooperation_unit;
    private double hang_up_ration;
    private double hang_up_discount;
    private double return_discount;
    private double subtotal;

    private int hang_up_times;
    private double hang_up_recp_total;
    private double manage_fee;
    private double land_tax	;
    private double subtotal_of_hang_up;

    private int account_times;
    private double account_recp_total;

    private double actual_design_fee;
    private double cooperation_fee	;
    private Date reach_money_time;
    private double reach_money_amount;
    private double balance;
    private Date into_account_time;
    private String contract_number;

    private boolean is_deleted;
    private Date start_time;
    private String user;
    private String addtional_info;
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

    public String getId_region() {
        return id_region;
    }

    public void setId_region(String id_region) {
        this.id_region = id_region;
    }

    public String getId_project() {
        return id_project;
    }

    public void setId_project(String id_project) {
        this.id_project = id_project;
    }

    public String getDesign_name() {
        return design_name;
    }

    public void setDesign_name(String design_name) {
        this.design_name = design_name;
    }

    public double getText_design_fee() {
        return text_design_fee;
    }

    public void setText_design_fee(double text_design_fee) {
        this.text_design_fee = text_design_fee;
    }

    public double getHang_up_desgine_fee() {
        return hang_up_desgine_fee;
    }

    public void setHang_up_desgine_fee(double hang_up_desgine_fee) {
        this.hang_up_desgine_fee = hang_up_desgine_fee;
    }

    public String getCooperation_unit() {
        return cooperation_unit;
    }

    public void setCooperation_unit(String cooperation_unit) {
        this.cooperation_unit = cooperation_unit;
    }

    public double getHang_up_ration() {
        return hang_up_ration;
    }

    public void setHang_up_ration(double hang_up_ration) {
        this.hang_up_ration = hang_up_ration;
    }

    public double getHang_up_discount() {
        return hang_up_discount;
    }

    public void setHang_up_discount(double hang_up_discount) {
        this.hang_up_discount = hang_up_discount;
    }

    public double getReturn_discount() {
        return return_discount;
    }

    public void setReturn_discount(double return_discount) {
        this.return_discount = return_discount;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public int getHang_up_times() {
        return hang_up_times;
    }

    public void setHang_up_times(int hang_up_times) {
        this.hang_up_times = hang_up_times;
    }

    public double getHang_up_recp_total() {
        return hang_up_recp_total;
    }

    public void setHang_up_recp_total(double hang_up_recp_total) {
        this.hang_up_recp_total = hang_up_recp_total;
    }

    public double getManage_fee() {
        return manage_fee;
    }

    public void setManage_fee(double manage_fee) {
        this.manage_fee = manage_fee;
    }

    public double getLand_tax() {
        return land_tax;
    }

    public void setLand_tax(double land_tax) {
        this.land_tax = land_tax;
    }

    public double getSubtotal_of_hang_up() {
        return subtotal_of_hang_up;
    }

    public void setSubtotal_of_hang_up(double subtotal_of_hang_up) {
        this.subtotal_of_hang_up = subtotal_of_hang_up;
    }

    public int getAccount_times() {
        return account_times;
    }

    public void setAccount_times(int account_times) {
        this.account_times = account_times;
    }

    public double getAccount_recp_total() {
        return account_recp_total;
    }

    public void setAccount_recp_total(double account_recp_total) {
        this.account_recp_total = account_recp_total;
    }

    public double getActual_design_fee() {
        return actual_design_fee;
    }

    public void setActual_design_fee(double actual_design_fee) {
        this.actual_design_fee = actual_design_fee;
    }

    public double getCooperation_fee() {
        return cooperation_fee;
    }

    public void setCooperation_fee(double cooperation_fee) {
        this.cooperation_fee = cooperation_fee;
    }

    public Date getReach_money_time() {
        return reach_money_time;
    }

    public void setReach_money_time(Date reach_money_time) {
        this.reach_money_time = reach_money_time;
    }

    public double getReach_money_amount() {
        return reach_money_amount;
    }

    public void setReach_money_amount(double reach_money_amount) {
        this.reach_money_amount = reach_money_amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getInto_account_time() {
        return into_account_time;
    }

    public void setInto_account_time(Date into_account_time) {
        this.into_account_time = into_account_time;
    }

    public String getContract_number() {
        return contract_number;
    }

    public void setContract_number(String contract_number) {
        this.contract_number = contract_number;
    }

    public boolean isIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(boolean is_deleted) {
        this.is_deleted = is_deleted;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getAddtional_info() {
        return addtional_info;
    }

    public void setAddtional_info(String addtional_info) {
        this.addtional_info = addtional_info;
    }
}
