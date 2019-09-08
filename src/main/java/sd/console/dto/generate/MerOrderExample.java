package sd.console.dto.generate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MerOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MerOrderExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andPlatSeqNbrIsNull() {
            addCriterion("PLAT_SEQ_NBR is null");
            return (Criteria) this;
        }

        public Criteria andPlatSeqNbrIsNotNull() {
            addCriterion("PLAT_SEQ_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andPlatSeqNbrEqualTo(String value) {
            addCriterion("PLAT_SEQ_NBR =", value, "platSeqNbr");
            return (Criteria) this;
        }

        public Criteria andPlatSeqNbrNotEqualTo(String value) {
            addCriterion("PLAT_SEQ_NBR <>", value, "platSeqNbr");
            return (Criteria) this;
        }

        public Criteria andPlatSeqNbrGreaterThan(String value) {
            addCriterion("PLAT_SEQ_NBR >", value, "platSeqNbr");
            return (Criteria) this;
        }

        public Criteria andPlatSeqNbrGreaterThanOrEqualTo(String value) {
            addCriterion("PLAT_SEQ_NBR >=", value, "platSeqNbr");
            return (Criteria) this;
        }

        public Criteria andPlatSeqNbrLessThan(String value) {
            addCriterion("PLAT_SEQ_NBR <", value, "platSeqNbr");
            return (Criteria) this;
        }

        public Criteria andPlatSeqNbrLessThanOrEqualTo(String value) {
            addCriterion("PLAT_SEQ_NBR <=", value, "platSeqNbr");
            return (Criteria) this;
        }

        public Criteria andPlatSeqNbrLike(String value) {
            addCriterion("PLAT_SEQ_NBR like", value, "platSeqNbr");
            return (Criteria) this;
        }

        public Criteria andPlatSeqNbrNotLike(String value) {
            addCriterion("PLAT_SEQ_NBR not like", value, "platSeqNbr");
            return (Criteria) this;
        }

        public Criteria andPlatSeqNbrIn(List<String> values) {
            addCriterion("PLAT_SEQ_NBR in", values, "platSeqNbr");
            return (Criteria) this;
        }

        public Criteria andPlatSeqNbrNotIn(List<String> values) {
            addCriterion("PLAT_SEQ_NBR not in", values, "platSeqNbr");
            return (Criteria) this;
        }

        public Criteria andPlatSeqNbrBetween(String value1, String value2) {
            addCriterion("PLAT_SEQ_NBR between", value1, value2, "platSeqNbr");
            return (Criteria) this;
        }

        public Criteria andPlatSeqNbrNotBetween(String value1, String value2) {
            addCriterion("PLAT_SEQ_NBR not between", value1, value2, "platSeqNbr");
            return (Criteria) this;
        }

        public Criteria andTransDateIsNull() {
            addCriterion("TRANS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTransDateIsNotNull() {
            addCriterion("TRANS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTransDateEqualTo(Date value) {
            addCriterionForJDBCDate("TRANS_DATE =", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("TRANS_DATE <>", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateGreaterThan(Date value) {
            addCriterionForJDBCDate("TRANS_DATE >", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TRANS_DATE >=", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateLessThan(Date value) {
            addCriterionForJDBCDate("TRANS_DATE <", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TRANS_DATE <=", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateIn(List<Date> values) {
            addCriterionForJDBCDate("TRANS_DATE in", values, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("TRANS_DATE not in", values, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TRANS_DATE between", value1, value2, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TRANS_DATE not between", value1, value2, "transDate");
            return (Criteria) this;
        }

        public Criteria andPayerNameIsNull() {
            addCriterion("PAYER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPayerNameIsNotNull() {
            addCriterion("PAYER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPayerNameEqualTo(String value) {
            addCriterion("PAYER_NAME =", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameNotEqualTo(String value) {
            addCriterion("PAYER_NAME <>", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameGreaterThan(String value) {
            addCriterion("PAYER_NAME >", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameGreaterThanOrEqualTo(String value) {
            addCriterion("PAYER_NAME >=", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameLessThan(String value) {
            addCriterion("PAYER_NAME <", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameLessThanOrEqualTo(String value) {
            addCriterion("PAYER_NAME <=", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameLike(String value) {
            addCriterion("PAYER_NAME like", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameNotLike(String value) {
            addCriterion("PAYER_NAME not like", value, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameIn(List<String> values) {
            addCriterion("PAYER_NAME in", values, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameNotIn(List<String> values) {
            addCriterion("PAYER_NAME not in", values, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameBetween(String value1, String value2) {
            addCriterion("PAYER_NAME between", value1, value2, "payerName");
            return (Criteria) this;
        }

        public Criteria andPayerNameNotBetween(String value1, String value2) {
            addCriterion("PAYER_NAME not between", value1, value2, "payerName");
            return (Criteria) this;
        }

        public Criteria andTransAmtIsNull() {
            addCriterion("TRANS_AMT is null");
            return (Criteria) this;
        }

        public Criteria andTransAmtIsNotNull() {
            addCriterion("TRANS_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andTransAmtEqualTo(BigDecimal value) {
            addCriterion("TRANS_AMT =", value, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtNotEqualTo(BigDecimal value) {
            addCriterion("TRANS_AMT <>", value, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtGreaterThan(BigDecimal value) {
            addCriterion("TRANS_AMT >", value, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_AMT >=", value, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtLessThan(BigDecimal value) {
            addCriterion("TRANS_AMT <", value, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_AMT <=", value, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtIn(List<BigDecimal> values) {
            addCriterion("TRANS_AMT in", values, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtNotIn(List<BigDecimal> values) {
            addCriterion("TRANS_AMT not in", values, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_AMT between", value1, value2, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_AMT not between", value1, value2, "transAmt");
            return (Criteria) this;
        }

        public Criteria andMerFeeAmtIsNull() {
            addCriterion("MER_FEE_AMT is null");
            return (Criteria) this;
        }

        public Criteria andMerFeeAmtIsNotNull() {
            addCriterion("MER_FEE_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andMerFeeAmtEqualTo(BigDecimal value) {
            addCriterion("MER_FEE_AMT =", value, "merFeeAmt");
            return (Criteria) this;
        }

        public Criteria andMerFeeAmtNotEqualTo(BigDecimal value) {
            addCriterion("MER_FEE_AMT <>", value, "merFeeAmt");
            return (Criteria) this;
        }

        public Criteria andMerFeeAmtGreaterThan(BigDecimal value) {
            addCriterion("MER_FEE_AMT >", value, "merFeeAmt");
            return (Criteria) this;
        }

        public Criteria andMerFeeAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MER_FEE_AMT >=", value, "merFeeAmt");
            return (Criteria) this;
        }

        public Criteria andMerFeeAmtLessThan(BigDecimal value) {
            addCriterion("MER_FEE_AMT <", value, "merFeeAmt");
            return (Criteria) this;
        }

        public Criteria andMerFeeAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MER_FEE_AMT <=", value, "merFeeAmt");
            return (Criteria) this;
        }

        public Criteria andMerFeeAmtIn(List<BigDecimal> values) {
            addCriterion("MER_FEE_AMT in", values, "merFeeAmt");
            return (Criteria) this;
        }

        public Criteria andMerFeeAmtNotIn(List<BigDecimal> values) {
            addCriterion("MER_FEE_AMT not in", values, "merFeeAmt");
            return (Criteria) this;
        }

        public Criteria andMerFeeAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MER_FEE_AMT between", value1, value2, "merFeeAmt");
            return (Criteria) this;
        }

        public Criteria andMerFeeAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MER_FEE_AMT not between", value1, value2, "merFeeAmt");
            return (Criteria) this;
        }

        public Criteria andMerSeqNbrIsNull() {
            addCriterion("MER_SEQ_NBR is null");
            return (Criteria) this;
        }

        public Criteria andMerSeqNbrIsNotNull() {
            addCriterion("MER_SEQ_NBR is not null");
            return (Criteria) this;
        }

        public Criteria andMerSeqNbrEqualTo(String value) {
            addCriterion("MER_SEQ_NBR =", value, "merSeqNbr");
            return (Criteria) this;
        }

        public Criteria andMerSeqNbrNotEqualTo(String value) {
            addCriterion("MER_SEQ_NBR <>", value, "merSeqNbr");
            return (Criteria) this;
        }

        public Criteria andMerSeqNbrGreaterThan(String value) {
            addCriterion("MER_SEQ_NBR >", value, "merSeqNbr");
            return (Criteria) this;
        }

        public Criteria andMerSeqNbrGreaterThanOrEqualTo(String value) {
            addCriterion("MER_SEQ_NBR >=", value, "merSeqNbr");
            return (Criteria) this;
        }

        public Criteria andMerSeqNbrLessThan(String value) {
            addCriterion("MER_SEQ_NBR <", value, "merSeqNbr");
            return (Criteria) this;
        }

        public Criteria andMerSeqNbrLessThanOrEqualTo(String value) {
            addCriterion("MER_SEQ_NBR <=", value, "merSeqNbr");
            return (Criteria) this;
        }

        public Criteria andMerSeqNbrLike(String value) {
            addCriterion("MER_SEQ_NBR like", value, "merSeqNbr");
            return (Criteria) this;
        }

        public Criteria andMerSeqNbrNotLike(String value) {
            addCriterion("MER_SEQ_NBR not like", value, "merSeqNbr");
            return (Criteria) this;
        }

        public Criteria andMerSeqNbrIn(List<String> values) {
            addCriterion("MER_SEQ_NBR in", values, "merSeqNbr");
            return (Criteria) this;
        }

        public Criteria andMerSeqNbrNotIn(List<String> values) {
            addCriterion("MER_SEQ_NBR not in", values, "merSeqNbr");
            return (Criteria) this;
        }

        public Criteria andMerSeqNbrBetween(String value1, String value2) {
            addCriterion("MER_SEQ_NBR between", value1, value2, "merSeqNbr");
            return (Criteria) this;
        }

        public Criteria andMerSeqNbrNotBetween(String value1, String value2) {
            addCriterion("MER_SEQ_NBR not between", value1, value2, "merSeqNbr");
            return (Criteria) this;
        }

        public Criteria andMerNoIsNull() {
            addCriterion("MER_NO is null");
            return (Criteria) this;
        }

        public Criteria andMerNoIsNotNull() {
            addCriterion("MER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMerNoEqualTo(String value) {
            addCriterion("MER_NO =", value, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoNotEqualTo(String value) {
            addCriterion("MER_NO <>", value, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoGreaterThan(String value) {
            addCriterion("MER_NO >", value, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoGreaterThanOrEqualTo(String value) {
            addCriterion("MER_NO >=", value, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoLessThan(String value) {
            addCriterion("MER_NO <", value, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoLessThanOrEqualTo(String value) {
            addCriterion("MER_NO <=", value, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoLike(String value) {
            addCriterion("MER_NO like", value, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoNotLike(String value) {
            addCriterion("MER_NO not like", value, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoIn(List<String> values) {
            addCriterion("MER_NO in", values, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoNotIn(List<String> values) {
            addCriterion("MER_NO not in", values, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoBetween(String value1, String value2) {
            addCriterion("MER_NO between", value1, value2, "merNo");
            return (Criteria) this;
        }

        public Criteria andMerNoNotBetween(String value1, String value2) {
            addCriterion("MER_NO not between", value1, value2, "merNo");
            return (Criteria) this;
        }

        public Criteria andTransTimeIsNull() {
            addCriterion("TRANS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTransTimeIsNotNull() {
            addCriterion("TRANS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTransTimeEqualTo(Date value) {
            addCriterion("TRANS_TIME =", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeNotEqualTo(Date value) {
            addCriterion("TRANS_TIME <>", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeGreaterThan(Date value) {
            addCriterion("TRANS_TIME >", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TRANS_TIME >=", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeLessThan(Date value) {
            addCriterion("TRANS_TIME <", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeLessThanOrEqualTo(Date value) {
            addCriterion("TRANS_TIME <=", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeIn(List<Date> values) {
            addCriterion("TRANS_TIME in", values, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeNotIn(List<Date> values) {
            addCriterion("TRANS_TIME not in", values, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeBetween(Date value1, Date value2) {
            addCriterion("TRANS_TIME between", value1, value2, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeNotBetween(Date value1, Date value2) {
            addCriterion("TRANS_TIME not between", value1, value2, "transTime");
            return (Criteria) this;
        }

        public Criteria andCheckDateIsNull() {
            addCriterion("CHECK_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCheckDateIsNotNull() {
            addCriterion("CHECK_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckDateEqualTo(Date value) {
            addCriterionForJDBCDate("CHECK_DATE =", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CHECK_DATE <>", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateGreaterThan(Date value) {
            addCriterionForJDBCDate("CHECK_DATE >", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CHECK_DATE >=", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateLessThan(Date value) {
            addCriterionForJDBCDate("CHECK_DATE <", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CHECK_DATE <=", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateIn(List<Date> values) {
            addCriterionForJDBCDate("CHECK_DATE in", values, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CHECK_DATE not in", values, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CHECK_DATE between", value1, value2, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CHECK_DATE not between", value1, value2, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNull() {
            addCriterion("CHECK_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNotNull() {
            addCriterion("CHECK_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusEqualTo(String value) {
            addCriterion("CHECK_STATUS =", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotEqualTo(String value) {
            addCriterion("CHECK_STATUS <>", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThan(String value) {
            addCriterion("CHECK_STATUS >", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_STATUS >=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThan(String value) {
            addCriterion("CHECK_STATUS <", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThanOrEqualTo(String value) {
            addCriterion("CHECK_STATUS <=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLike(String value) {
            addCriterion("CHECK_STATUS like", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotLike(String value) {
            addCriterion("CHECK_STATUS not like", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIn(List<String> values) {
            addCriterion("CHECK_STATUS in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotIn(List<String> values) {
            addCriterion("CHECK_STATUS not in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusBetween(String value1, String value2) {
            addCriterion("CHECK_STATUS between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotBetween(String value1, String value2) {
            addCriterion("CHECK_STATUS not between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("ORDER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("ORDER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("ORDER_STATUS =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("ORDER_STATUS <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("ORDER_STATUS >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_STATUS >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("ORDER_STATUS <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("ORDER_STATUS <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("ORDER_STATUS like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("ORDER_STATUS not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("ORDER_STATUS in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("ORDER_STATUS not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("ORDER_STATUS between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("ORDER_STATUS not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andRespMsgIsNull() {
            addCriterion("RESP_MSG is null");
            return (Criteria) this;
        }

        public Criteria andRespMsgIsNotNull() {
            addCriterion("RESP_MSG is not null");
            return (Criteria) this;
        }

        public Criteria andRespMsgEqualTo(String value) {
            addCriterion("RESP_MSG =", value, "respMsg");
            return (Criteria) this;
        }

        public Criteria andRespMsgNotEqualTo(String value) {
            addCriterion("RESP_MSG <>", value, "respMsg");
            return (Criteria) this;
        }

        public Criteria andRespMsgGreaterThan(String value) {
            addCriterion("RESP_MSG >", value, "respMsg");
            return (Criteria) this;
        }

        public Criteria andRespMsgGreaterThanOrEqualTo(String value) {
            addCriterion("RESP_MSG >=", value, "respMsg");
            return (Criteria) this;
        }

        public Criteria andRespMsgLessThan(String value) {
            addCriterion("RESP_MSG <", value, "respMsg");
            return (Criteria) this;
        }

        public Criteria andRespMsgLessThanOrEqualTo(String value) {
            addCriterion("RESP_MSG <=", value, "respMsg");
            return (Criteria) this;
        }

        public Criteria andRespMsgLike(String value) {
            addCriterion("RESP_MSG like", value, "respMsg");
            return (Criteria) this;
        }

        public Criteria andRespMsgNotLike(String value) {
            addCriterion("RESP_MSG not like", value, "respMsg");
            return (Criteria) this;
        }

        public Criteria andRespMsgIn(List<String> values) {
            addCriterion("RESP_MSG in", values, "respMsg");
            return (Criteria) this;
        }

        public Criteria andRespMsgNotIn(List<String> values) {
            addCriterion("RESP_MSG not in", values, "respMsg");
            return (Criteria) this;
        }

        public Criteria andRespMsgBetween(String value1, String value2) {
            addCriterion("RESP_MSG between", value1, value2, "respMsg");
            return (Criteria) this;
        }

        public Criteria andRespMsgNotBetween(String value1, String value2) {
            addCriterion("RESP_MSG not between", value1, value2, "respMsg");
            return (Criteria) this;
        }

        public Criteria andRespCodeIsNull() {
            addCriterion("RESP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRespCodeIsNotNull() {
            addCriterion("RESP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRespCodeEqualTo(String value) {
            addCriterion("RESP_CODE =", value, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeNotEqualTo(String value) {
            addCriterion("RESP_CODE <>", value, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeGreaterThan(String value) {
            addCriterion("RESP_CODE >", value, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeGreaterThanOrEqualTo(String value) {
            addCriterion("RESP_CODE >=", value, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeLessThan(String value) {
            addCriterion("RESP_CODE <", value, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeLessThanOrEqualTo(String value) {
            addCriterion("RESP_CODE <=", value, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeLike(String value) {
            addCriterion("RESP_CODE like", value, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeNotLike(String value) {
            addCriterion("RESP_CODE not like", value, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeIn(List<String> values) {
            addCriterion("RESP_CODE in", values, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeNotIn(List<String> values) {
            addCriterion("RESP_CODE not in", values, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeBetween(String value1, String value2) {
            addCriterion("RESP_CODE between", value1, value2, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeNotBetween(String value1, String value2) {
            addCriterion("RESP_CODE not between", value1, value2, "respCode");
            return (Criteria) this;
        }

        public Criteria andCrtDateTimeIsNull() {
            addCriterion("CRT_DATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCrtDateTimeIsNotNull() {
            addCriterion("CRT_DATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCrtDateTimeEqualTo(Date value) {
            addCriterion("CRT_DATE_TIME =", value, "crtDateTime");
            return (Criteria) this;
        }

        public Criteria andCrtDateTimeNotEqualTo(Date value) {
            addCriterion("CRT_DATE_TIME <>", value, "crtDateTime");
            return (Criteria) this;
        }

        public Criteria andCrtDateTimeGreaterThan(Date value) {
            addCriterion("CRT_DATE_TIME >", value, "crtDateTime");
            return (Criteria) this;
        }

        public Criteria andCrtDateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CRT_DATE_TIME >=", value, "crtDateTime");
            return (Criteria) this;
        }

        public Criteria andCrtDateTimeLessThan(Date value) {
            addCriterion("CRT_DATE_TIME <", value, "crtDateTime");
            return (Criteria) this;
        }

        public Criteria andCrtDateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CRT_DATE_TIME <=", value, "crtDateTime");
            return (Criteria) this;
        }

        public Criteria andCrtDateTimeIn(List<Date> values) {
            addCriterion("CRT_DATE_TIME in", values, "crtDateTime");
            return (Criteria) this;
        }

        public Criteria andCrtDateTimeNotIn(List<Date> values) {
            addCriterion("CRT_DATE_TIME not in", values, "crtDateTime");
            return (Criteria) this;
        }

        public Criteria andCrtDateTimeBetween(Date value1, Date value2) {
            addCriterion("CRT_DATE_TIME between", value1, value2, "crtDateTime");
            return (Criteria) this;
        }

        public Criteria andCrtDateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CRT_DATE_TIME not between", value1, value2, "crtDateTime");
            return (Criteria) this;
        }

        public Criteria andDateLastmaintIsNull() {
            addCriterion("DATE_LASTMAINT is null");
            return (Criteria) this;
        }

        public Criteria andDateLastmaintIsNotNull() {
            addCriterion("DATE_LASTMAINT is not null");
            return (Criteria) this;
        }

        public Criteria andDateLastmaintEqualTo(Date value) {
            addCriterion("DATE_LASTMAINT =", value, "dateLastmaint");
            return (Criteria) this;
        }

        public Criteria andDateLastmaintNotEqualTo(Date value) {
            addCriterion("DATE_LASTMAINT <>", value, "dateLastmaint");
            return (Criteria) this;
        }

        public Criteria andDateLastmaintGreaterThan(Date value) {
            addCriterion("DATE_LASTMAINT >", value, "dateLastmaint");
            return (Criteria) this;
        }

        public Criteria andDateLastmaintGreaterThanOrEqualTo(Date value) {
            addCriterion("DATE_LASTMAINT >=", value, "dateLastmaint");
            return (Criteria) this;
        }

        public Criteria andDateLastmaintLessThan(Date value) {
            addCriterion("DATE_LASTMAINT <", value, "dateLastmaint");
            return (Criteria) this;
        }

        public Criteria andDateLastmaintLessThanOrEqualTo(Date value) {
            addCriterion("DATE_LASTMAINT <=", value, "dateLastmaint");
            return (Criteria) this;
        }

        public Criteria andDateLastmaintIn(List<Date> values) {
            addCriterion("DATE_LASTMAINT in", values, "dateLastmaint");
            return (Criteria) this;
        }

        public Criteria andDateLastmaintNotIn(List<Date> values) {
            addCriterion("DATE_LASTMAINT not in", values, "dateLastmaint");
            return (Criteria) this;
        }

        public Criteria andDateLastmaintBetween(Date value1, Date value2) {
            addCriterion("DATE_LASTMAINT between", value1, value2, "dateLastmaint");
            return (Criteria) this;
        }

        public Criteria andDateLastmaintNotBetween(Date value1, Date value2) {
            addCriterion("DATE_LASTMAINT not between", value1, value2, "dateLastmaint");
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