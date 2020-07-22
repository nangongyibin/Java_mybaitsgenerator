package com.ngyb.mybaitsgenerator.beans.basic;

import java.io.Serializable;

public class Student implements Serializable {
    private Integer id;

    private String name;

    private Integer english;

    private Integer math;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getEnglish() {
        return english;
    }

    public void setEnglish(Integer english) {
        this.english = english;
    }

    public Integer getMath() {
        return math;
    }

    public void setMath(Integer math) {
        this.math = math;
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
        Student other = (Student) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getEnglish() == null ? other.getEnglish() == null : this.getEnglish().equals(other.getEnglish()))
            && (this.getMath() == null ? other.getMath() == null : this.getMath().equals(other.getMath()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getEnglish() == null) ? 0 : getEnglish().hashCode());
        result = prime * result + ((getMath() == null) ? 0 : getMath().hashCode());
        return result;
    }
}