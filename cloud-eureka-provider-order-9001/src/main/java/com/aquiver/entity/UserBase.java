package com.aquiver.entity;


import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName(value = "XF_USER")
public class UserBase  {
    private static final long serialVersionUID = 3121418431571658519L;
    private Long id;
    private String username;//用户名唯一
    private String password;//密码
    private String salt;//密码扰码
    private String payPassword;//支付密码
    private String paySalt;//支付密码扰码
    private String cellPhone;//手机号唯一
    private String email;//邮箱
    private String nickName;//昵称唯一
    private Integer status;//状态: 1有效，2无效
    private Date createTime;//创建时间
    private Long unitId;//单位id
    private Integer review;//审核状态
    private String reviewContent;//审核备注内容
    private Date reviewTime;//审核时间
    private Long reviewId;//审核人ID
    private String pinyin;//昵称汉语拼音
    private String headImgUrl;//用户头像Url
    private Integer message;//用户是否接收短信
    private String unionId;//微信账号唯一标识
    private String openId;//微信公众账号唯一标识
    private Integer orbit;//是否开启轨迹上传
    private Long roleId ; //角色名称
    private String roleName;//角色名称

    private Integer userType ; // 用户类型

    private String contactId ; // 通行证ID

    //是否政府 1.是  2.否
    private Integer government;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Integer getGovernment() {
        return government;
    }

    public void setGovernment(Integer government) {
        this.government = government;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }


    public Integer getOrbit() {
        return orbit;
    }

    public void setOrbit(Integer orbit) {
        this.orbit = orbit;
    }

    public Integer getMessage() {
        return message;
    }

    public void setMessage(Integer message) {
        this.message = message;
    }

    public Date getReviewTime() {
        return reviewTime;
    }

    public void setReviewTime(Date reviewTime) {
        this.reviewTime = reviewTime;
    }

    public Long getReviewId() {
        return reviewId;
    }

    public void setReviewId(Long reviewId) {
        this.reviewId = reviewId;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public void setReviewContent(String reviewContent) {
        this.reviewContent = reviewContent;
    }

    public Integer getReview() {
        return review;
    }

    public void setReview(Integer review) {
        this.review = review;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword;
    }

    public String getPaySalt() {
        return paySalt;
    }

    public void setPaySalt(String paySalt) {
        this.paySalt = paySalt;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getUnitId() {
        return unitId;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getHeadImgUrl() {
        return headImgUrl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl;
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserBase)) return false;

        UserBase userBase = (UserBase) o;

        return getId() != null ? getId().equals(userBase.getId()) : userBase.getId() == null;
    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }
}
