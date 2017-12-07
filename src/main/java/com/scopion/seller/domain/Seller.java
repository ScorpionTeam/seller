package com.scopion.seller.domain;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * @author ycj
 * @version V1.0 <商户>
 * @date 2017-12-07 10:36
 */
public class Seller {

    private Long id;


    /**
     * 姓名
     */
    private String name;

    /**
     * 性别  MALE 男    FEMALE 女
     */
    private String gender;

    @JSONField(name = "create_date", format = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
