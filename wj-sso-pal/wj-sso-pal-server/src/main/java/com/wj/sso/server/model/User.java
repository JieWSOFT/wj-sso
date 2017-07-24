package com.wj.sso.server.model;

import com.wj.sso.common.tool.model.PersistentModel;

import java.util.Date;

public class User extends PersistentModel {


    private static final long serialVersionUID = 3956240965940962068L;
    /* 登录名 */
    private String account;
    /* 密码 */
    private String passoword;
    /* 最后登录的IP */
    private String lastLoginIp;
    /* 登录总次数 */
    private Integer loginCount = Integer.valueOf(0);
    /* 最后登录时间 */
    private Date lastLoginTime;
    /* 创建时间 */
    private Date createTime;
    /* 是否启用 */
    private Boolean isEnable = Boolean.valueOf(true);

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassoword() {
        return passoword;
    }

    public void setPassoword(String passoword) {
        this.passoword = passoword;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Boolean getEnable() {
        return isEnable;
    }

    public void setEnable(Boolean enable) {
        isEnable = enable;
    }
}
