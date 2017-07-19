package com.wj.sso.common.tool.model;

import java.io.Serializable;

public class PersistentModel implements Serializable {

    private static final long serialVersionUID = 3605961549050238726L;

    /**
     * 主键ID
     */
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 覆盖原来的hashCode方法 ，用主键的hashCode代替原来对象的hashCode，可以简化铸就化对象的比较
     *
     * @return
     */
    @Override
    public int hashCode() {
        if (id == null) {
            return Integer.valueOf(0);
        }
        return id.hashCode();
    }

    /**
     * 覆盖原equals方法，只要对象类型相同并且主键相同，那么返回true，表示对象相等
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PersistentModel)) {
            return false;
        }
        PersistentModel other = (PersistentModel) obj;
        return id.equals(other.getId());
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[id=" + this.id + "]";
    }
}
