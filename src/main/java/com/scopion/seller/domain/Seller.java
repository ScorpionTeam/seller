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
     * 店铺审核状态 AUDITING审核中  AUDITED已审核   NOT_AUDIT审核未通过
     */
    private String audit;

    /**
     * 店铺状态 NORMAL 正常 UN_NORMAL关闭
     */
    private String status;


    /**
     * 电话
     */
    private String mobile;


    /**
     * 用户id
     */
    @JSONField(name = "user_id")
    private Long userId;


    /**
     * 信誉值 0-99
     */
    private Integer reputation;

    /**
     * 店铺编号
     */
    @JSONField(name = "seller_no")
    private String sellerNo;

    /**
     * 店铺名称
     */
    @JSONField(name = "seller_name")
    private String sellerName;

    /**
     * 店铺地址
     */
    @JSONField(name = "seller_address")
    private String sellerAddress;

    /**
     * 店铺描述
     */
    @JSONField(name = "seller_description")
    private String sellerDescription;

    /**
     * 修改时间
     */
    @JSONField(name = "update_date", format = "yyyy-MM-dd HH:mm:ss")
    private Date updateDate;

    /**
     * 创建时间
     */
    @JSONField(name = "create_date", format = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;


    public Long getId() {
        return id;
    }

    public String getSellerNo() {
        return sellerNo;
    }

    public void setSellerNo(String sellerNo) {
        this.sellerNo = sellerNo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAudit() {
        return audit;
    }

    public void setAudit(String audit) {
        this.audit = audit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getReputation() {
        return reputation;
    }

    public void setReputation(Integer reputation) {
        this.reputation = reputation;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerAddress() {
        return sellerAddress;
    }

    public void setSellerAddress(String sellerAddress) {
        this.sellerAddress = sellerAddress;
    }

    public String getSellerDescription() {
        return sellerDescription;
    }

    public void setSellerDescription(String sellerDescription) {
        this.sellerDescription = sellerDescription;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
