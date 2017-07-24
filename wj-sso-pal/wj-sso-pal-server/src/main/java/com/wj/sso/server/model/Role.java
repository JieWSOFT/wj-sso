package com.wj.sso.server.model;

import com.wj.sso.common.tool.model.PersistentModel;

public class Role extends PersistentModel {

    private static final long serialVersionUID = 5989640778878912286L;
    /* 应用ID */
    private Integer appId;
    /* 名称 */
    private String name;
    /* 排序 */
    private Integer sort = Integer.valueOf(1);
    /* 描述 */
    private String description;
    /* 是否启用 */
    private Boolean isEnable = Boolean.valueOf(true);

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getEnable() {
        return isEnable;
    }

    public void setEnable(Boolean enable) {
        isEnable = enable;
    }
}
