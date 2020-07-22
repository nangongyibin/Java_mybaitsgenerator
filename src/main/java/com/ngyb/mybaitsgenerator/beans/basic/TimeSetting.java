package com.ngyb.mybaitsgenerator.beans.basic;

import java.io.Serializable;

public class TimeSetting implements Serializable {
    private Integer id;

    private Integer loginExpired;

    private String rsaPubKey;

    private String rsaPriKey;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLoginExpired() {
        return loginExpired;
    }

    public void setLoginExpired(Integer loginExpired) {
        this.loginExpired = loginExpired;
    }

    public String getRsaPubKey() {
        return rsaPubKey;
    }

    public void setRsaPubKey(String rsaPubKey) {
        this.rsaPubKey = rsaPubKey == null ? null : rsaPubKey.trim();
    }

    public String getRsaPriKey() {
        return rsaPriKey;
    }

    public void setRsaPriKey(String rsaPriKey) {
        this.rsaPriKey = rsaPriKey == null ? null : rsaPriKey.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TimeSetting other = (TimeSetting) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLoginExpired() == null ? other.getLoginExpired() == null : this.getLoginExpired().equals(other.getLoginExpired()))
            && (this.getRsaPubKey() == null ? other.getRsaPubKey() == null : this.getRsaPubKey().equals(other.getRsaPubKey()))
            && (this.getRsaPriKey() == null ? other.getRsaPriKey() == null : this.getRsaPriKey().equals(other.getRsaPriKey()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLoginExpired() == null) ? 0 : getLoginExpired().hashCode());
        result = prime * result + ((getRsaPubKey() == null) ? 0 : getRsaPubKey().hashCode());
        result = prime * result + ((getRsaPriKey() == null) ? 0 : getRsaPriKey().hashCode());
        return result;
    }
}