package com.wj.sso.server.model;

import com.wj.sso.common.tool.model.PersistentModel;

public class UserRole extends PersistentModel {

    private static final long serialVersionUID = -3503419852109011255L;
    private Integer appId;
    private Integer userId;
    private Integer roleId;

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}
