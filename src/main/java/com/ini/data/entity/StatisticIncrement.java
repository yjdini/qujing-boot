package com.ini.data.entity;


import javax.persistence.*;

import org.hibernate.annotations.Type;

import java.util.Date;

/**
 * Created by Somnus`L on 2017/5/4.
 *
 *
 */
@Entity
@Table(name = "StatisticIncrement")
public class StatisticIncrement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer statisticIncrementId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    private Integer subId;
    private Integer time;

    private Integer user;
    private Integer master;
    private Integer skill;
    private Integer orders;
    private Integer finishOrder;
    private Integer request;
    private Integer apply;

    public Integer getApply() {
        return apply;
    }

    public void setApply(Integer apply) {
        this.apply = apply;
    }

    public StatisticIncrement() {
    }

    public StatisticIncrement(boolean initial) {
        if (initial) {
            this.createTime = new Date();
        }
    }

    public Integer getStatisticIncrementId() {
        return statisticIncrementId;
    }

    public void setStatisticIncrementId(Integer statisticIncrementId) {
        this.statisticIncrementId = statisticIncrementId;
    }

    public Integer getSubId() {
        return subId;
    }

    public void setSubId(Integer subId) {
        this.subId = subId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public Integer getMaster() {
        return master;
    }

    public void setMaster(Integer master) {
        this.master = master;
    }

    public Integer getSkill() {
        return skill;
    }

    public void setSkill(Integer skill) {
        this.skill = skill;
    }

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    public Integer getFinishOrder() {
        return finishOrder;
    }

    public void setFinishOrder(Integer finishOrder) {
        this.finishOrder = finishOrder;
    }

    public Integer getRequest() {
        return request;
    }

    public void setRequest(Integer request) {
        this.request = request;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

}
