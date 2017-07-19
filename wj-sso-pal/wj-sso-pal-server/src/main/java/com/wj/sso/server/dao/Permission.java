package com.wj.sso.server.dao;

import com.wj.sso.common.tool.model.PersistentModel;

public class Permission extends PersistentModel {


    private static final long serialVersionUID = -4431079283748486124L;
    /* 应用ID */
    private Integer appId;
    /* 父ID */
    private Integer parentId;
    /* 图标 */
    private String icon;
    /* 名称 */
    private String name;
    /* 权限URL*/
    private String url;
    /* 排序 */
    private Integer sort = Integer.valueOf(1);
    /* 是否是菜单 */
    private Boolean isMenu;
    /* 是否启用 */
    private Boolean isEnable;

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Boolean getMenu() {
        return isMenu;
    }

    public void setMenu(Boolean menu) {
        isMenu = menu;
    }

    public Boolean getEnable() {
        return isEnable;
    }

    public void setEnable(Boolean enable) {
        isEnable = enable;
    }
}
