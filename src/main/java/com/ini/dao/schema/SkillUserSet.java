package com.ini.dao.schema;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Somnus`L on 2017/5/9.
 */

@SqlResultSetMapping
(
        name="SkillUserSet",
        entities = {
                @EntityResult
                (
                        entityClass = com.ini.dao.schema.SkillUserSet.class
                        ,
                        fields = {
                                @FieldResult(name = "createTime", column = "createTime"),
                                @FieldResult(name = "description", column = "description"),
                                @FieldResult(name = "orderedTimes", column = "orderedTimes"),
                                @FieldResult(name = "orderTimes", column = "orderTimes"),
                                @FieldResult(name = "score", column = "score"),
                                @FieldResult(name = "skillId", column = "skillId"),
                                @FieldResult(name = "tagId", column = "tagId"),
                                @FieldResult(name = "title", column = "title"),
                                @FieldResult(name = "totleprice", column = "totleprice"),
                                @FieldResult(name = "totletime", column = "totletime"),
                                @FieldResult(name = "works", column = "works"),
                                @FieldResult(name = "userId", column = "userId"),
                                @FieldResult(name = "status", column = "status"),
                                @FieldResult(name = "tagname", column = "name")
                        }
                )
        },
        columns = {
        }
)
public class SkillUserSet {

    private Integer skillId;

    private DateTime createTime;

    private Integer userId;

    private String title;

    private String totleprice;

    private String totletime;

    private Integer orderTimes;

    private Integer orderedTimes;

    private String works;

    private Integer tagId;

    private String description;

    private BigDecimal score;

    private Integer status;

    public Integer getSkillId() {
        return skillId;
    }

    public void setSkillId(Integer skillId) {
        this.skillId = skillId;
    }

    public DateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(DateTime createTime) {
        this.createTime = createTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTotleprice() {
        return totleprice;
    }

    public void setTotleprice(String totleprice) {
        this.totleprice = totleprice;
    }

    public String getTotletime() {
        return totletime;
    }

    public void setTotletime(String totletime) {
        this.totletime = totletime;
    }

    public Integer getOrderTimes() {
        return orderTimes;
    }

    public void setOrderTimes(Integer orderTimes) {
        this.orderTimes = orderTimes;
    }

    public Integer getOrderedTimes() {
        return orderedTimes;
    }

    public void setOrderedTimes(Integer orderedTimes) {
        this.orderedTimes = orderedTimes;
    }

    public String getWorks() {
        return works;
    }

    public void setWorks(String works) {
        this.works = works;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }
}
