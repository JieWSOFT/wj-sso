package com.wj.sso.server.model;

import com.wj.sso.common.tool.model.PersistentModel;

public class UserApp extends PersistentModel{


    private static final long serialVersionUID = -3271839526506132171L;
    private Integer appId;
    private Integer userId;

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
}
