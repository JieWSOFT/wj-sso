package com.wj.sso.server.dao;

import com.wj.sso.common.tool.model.PersistentModel;

import java.util.Date;

public class App extends PersistentModel{

    private static final long serialVersionUID = -8042429023589022263L;
    /** 名称 */
    private String name;
    /** 编码 */
    private String code;
    /** 排序 */
    private Integer sort = Integer.valueOf(1);
    /** 创建时间 */
    private Date createTime;
    /** 是否启用 */
    private Boolean isEnable = Boolean.valueOf(true);

    public App(){}

    public App(String name , String code,Integer sort,Boolean isEnable){
        super();
        this.name= name;
        this.code = code;
        this.sort = sort;
        this.isEnable = isEnable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
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
