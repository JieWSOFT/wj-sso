package com.wj.sso.server.model;

import com.wj.sso.common.tool.model.PersistentModel;

public class RolePermission extends PersistentModel {


    private static final long serialVersionUID = -2090044833153033314L;
    private Integer appId;
    private Integer roleId;
    private Integer permissionId;

    public RolePermission() {
    }

    public RolePermission(Integer appId, Integer roleId, Integer permissionId) {
        super();
        this.appId = appId;
        this.roleId = roleId;
        this.permissionId = permissionId;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }
}
