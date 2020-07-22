package com.ngyb.mybaitsgenerator.beans.basic;

import java.util.ArrayList;
import java.util.List;

public class TimeSettingQueryHelper {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TimeSettingQueryHelper() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLoginExpiredIsNull() {
            addCriterion("login_expired is null");
            return (Criteria) this;
        }

        public Criteria andLoginExpiredIsNotNull() {
            addCriterion("login_expired is not null");
            return (Criteria) this;
        }

        public Criteria andLoginExpiredEqualTo(Integer value) {
            addCriterion("login_expired =", value, "loginExpired");
            return (Criteria) this;
        }

        public Criteria andLoginExpiredNotEqualTo(Integer value) {
            addCriterion("login_expired <>", value, "loginExpired");
            return (Criteria) this;
        }

        public Criteria andLoginExpiredGreaterThan(Integer value) {
            addCriterion("login_expired >", value, "loginExpired");
            return (Criteria) this;
        }

        public Criteria andLoginExpiredGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_expired >=", value, "loginExpired");
            return (Criteria) this;
        }

        public Criteria andLoginExpiredLessThan(Integer value) {
            addCriterion("login_expired <", value, "loginExpired");
            return (Criteria) this;
        }

        public Criteria andLoginExpiredLessThanOrEqualTo(Integer value) {
            addCriterion("login_expired <=", value, "loginExpired");
            return (Criteria) this;
        }

        public Criteria andLoginExpiredIn(List<Integer> values) {
            addCriterion("login_expired in", values, "loginExpired");
            return (Criteria) this;
        }

        public Criteria andLoginExpiredNotIn(List<Integer> values) {
            addCriterion("login_expired not in", values, "loginExpired");
            return (Criteria) this;
        }

        public Criteria andLoginExpiredBetween(Integer value1, Integer value2) {
            addCriterion("login_expired between", value1, value2, "loginExpired");
            return (Criteria) this;
        }

        public Criteria andLoginExpiredNotBetween(Integer value1, Integer value2) {
            addCriterion("login_expired not between", value1, value2, "loginExpired");
            return (Criteria) this;
        }

        public Criteria andRsaPubKeyIsNull() {
            addCriterion("rsa_pub_key is null");
            return (Criteria) this;
        }

        public Criteria andRsaPubKeyIsNotNull() {
            addCriterion("rsa_pub_key is not null");
            return (Criteria) this;
        }

        public Criteria andRsaPubKeyEqualTo(String value) {
            addCriterion("rsa_pub_key =", value, "rsaPubKey");
            return (Criteria) this;
        }

        public Criteria andRsaPubKeyNotEqualTo(String value) {
            addCriterion("rsa_pub_key <>", value, "rsaPubKey");
            return (Criteria) this;
        }

        public Criteria andRsaPubKeyGreaterThan(String value) {
            addCriterion("rsa_pub_key >", value, "rsaPubKey");
            return (Criteria) this;
        }

        public Criteria andRsaPubKeyGreaterThanOrEqualTo(String value) {
            addCriterion("rsa_pub_key >=", value, "rsaPubKey");
            return (Criteria) this;
        }

        public Criteria andRsaPubKeyLessThan(String value) {
            addCriterion("rsa_pub_key <", value, "rsaPubKey");
            return (Criteria) this;
        }

        public Criteria andRsaPubKeyLessThanOrEqualTo(String value) {
            addCriterion("rsa_pub_key <=", value, "rsaPubKey");
            return (Criteria) this;
        }

        public Criteria andRsaPubKeyLike(String value) {
            addCriterion("rsa_pub_key like", value, "rsaPubKey");
            return (Criteria) this;
        }

        public Criteria andRsaPubKeyNotLike(String value) {
            addCriterion("rsa_pub_key not like", value, "rsaPubKey");
            return (Criteria) this;
        }

        public Criteria andRsaPubKeyIn(List<String> values) {
            addCriterion("rsa_pub_key in", values, "rsaPubKey");
            return (Criteria) this;
        }

        public Criteria andRsaPubKeyNotIn(List<String> values) {
            addCriterion("rsa_pub_key not in", values, "rsaPubKey");
            return (Criteria) this;
        }

        public Criteria andRsaPubKeyBetween(String value1, String value2) {
            addCriterion("rsa_pub_key between", value1, value2, "rsaPubKey");
            return (Criteria) this;
        }

        public Criteria andRsaPubKeyNotBetween(String value1, String value2) {
            addCriterion("rsa_pub_key not between", value1, value2, "rsaPubKey");
            return (Criteria) this;
        }

        public Criteria andRsaPriKeyIsNull() {
            addCriterion("rsa_pri_key is null");
            return (Criteria) this;
        }

        public Criteria andRsaPriKeyIsNotNull() {
            addCriterion("rsa_pri_key is not null");
            return (Criteria) this;
        }

        public Criteria andRsaPriKeyEqualTo(String value) {
            addCriterion("rsa_pri_key =", value, "rsaPriKey");
            return (Criteria) this;
        }

        public Criteria andRsaPriKeyNotEqualTo(String value) {
            addCriterion("rsa_pri_key <>", value, "rsaPriKey");
            return (Criteria) this;
        }

        public Criteria andRsaPriKeyGreaterThan(String value) {
            addCriterion("rsa_pri_key >", value, "rsaPriKey");
            return (Criteria) this;
        }

        public Criteria andRsaPriKeyGreaterThanOrEqualTo(String value) {
            addCriterion("rsa_pri_key >=", value, "rsaPriKey");
            return (Criteria) this;
        }

        public Criteria andRsaPriKeyLessThan(String value) {
            addCriterion("rsa_pri_key <", value, "rsaPriKey");
            return (Criteria) this;
        }

        public Criteria andRsaPriKeyLessThanOrEqualTo(String value) {
            addCriterion("rsa_pri_key <=", value, "rsaPriKey");
            return (Criteria) this;
        }

        public Criteria andRsaPriKeyLike(String value) {
            addCriterion("rsa_pri_key like", value, "rsaPriKey");
            return (Criteria) this;
        }

        public Criteria andRsaPriKeyNotLike(String value) {
            addCriterion("rsa_pri_key not like", value, "rsaPriKey");
            return (Criteria) this;
        }

        public Criteria andRsaPriKeyIn(List<String> values) {
            addCriterion("rsa_pri_key in", values, "rsaPriKey");
            return (Criteria) this;
        }

        public Criteria andRsaPriKeyNotIn(List<String> values) {
            addCriterion("rsa_pri_key not in", values, "rsaPriKey");
            return (Criteria) this;
        }

        public Criteria andRsaPriKeyBetween(String value1, String value2) {
            addCriterion("rsa_pri_key between", value1, value2, "rsaPriKey");
            return (Criteria) this;
        }

        public Criteria andRsaPriKeyNotBetween(String value1, String value2) {
            addCriterion("rsa_pri_key not between", value1, value2, "rsaPriKey");
            return (Criteria) this;
        }

        public Criteria andRsaPubKeyLikeInsensitive(String value) {
            addCriterion("upper(rsa_pub_key) like", value.toUpperCase(), "rsaPubKey");
            return (Criteria) this;
        }

        public Criteria andRsaPriKeyLikeInsensitive(String value) {
            addCriterion("upper(rsa_pri_key) like", value.toUpperCase(), "rsaPriKey");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}