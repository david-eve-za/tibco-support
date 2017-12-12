/*
 * This file is generated by jOOQ.
*/
package org.citi.model.ddl.tables.records;


import javax.annotation.Generated;

import org.citi.model.ddl.tables.Logstep;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record22;
import org.jooq.Row22;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LogstepRecord extends UpdatableRecordImpl<LogstepRecord> implements Record22<Long, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, Long> {

    private static final long serialVersionUID = 2068902132;

    /**
     * Setter for <code>PUBLIC.LOGSTEP.ID</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.LOGSTEP.ID</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>PUBLIC.LOGSTEP.ACTIVITYNAME</code>.
     */
    public void setActivityname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.LOGSTEP.ACTIVITYNAME</code>.
     */
    public String getActivityname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>PUBLIC.LOGSTEP.CSIAPPID</code>.
     */
    public void setCsiappid(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>PUBLIC.LOGSTEP.CSIAPPID</code>.
     */
    public String getCsiappid() {
        return (String) get(2);
    }

    /**
     * Setter for <code>PUBLIC.LOGSTEP.DURATION</code>.
     */
    public void setDuration(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>PUBLIC.LOGSTEP.DURATION</code>.
     */
    public String getDuration() {
        return (String) get(3);
    }

    /**
     * Setter for <code>PUBLIC.LOGSTEP.EAGLEAPPID</code>.
     */
    public void setEagleappid(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>PUBLIC.LOGSTEP.EAGLEAPPID</code>.
     */
    public String getEagleappid() {
        return (String) get(4);
    }

    /**
     * Setter for <code>PUBLIC.LOGSTEP.ENGINENAME</code>.
     */
    public void setEnginename(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>PUBLIC.LOGSTEP.ENGINENAME</code>.
     */
    public String getEnginename() {
        return (String) get(5);
    }

    /**
     * Setter for <code>PUBLIC.LOGSTEP.ERRORMSG</code>.
     */
    public void setErrormsg(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>PUBLIC.LOGSTEP.ERRORMSG</code>.
     */
    public String getErrormsg() {
        return (String) get(6);
    }

    /**
     * Setter for <code>PUBLIC.LOGSTEP.ERRORSEVERITY</code>.
     */
    public void setErrorseverity(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>PUBLIC.LOGSTEP.ERRORSEVERITY</code>.
     */
    public String getErrorseverity() {
        return (String) get(7);
    }

    /**
     * Setter for <code>PUBLIC.LOGSTEP.ERRORTYPE</code>.
     */
    public void setErrortype(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>PUBLIC.LOGSTEP.ERRORTYPE</code>.
     */
    public String getErrortype() {
        return (String) get(8);
    }

    /**
     * Setter for <code>PUBLIC.LOGSTEP.HOSTNAME</code>.
     */
    public void setHostname(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>PUBLIC.LOGSTEP.HOSTNAME</code>.
     */
    public String getHostname() {
        return (String) get(9);
    }

    /**
     * Setter for <code>PUBLIC.LOGSTEP.IPADDRESS</code>.
     */
    public void setIpaddress(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>PUBLIC.LOGSTEP.IPADDRESS</code>.
     */
    public String getIpaddress() {
        return (String) get(10);
    }

    /**
     * Setter for <code>PUBLIC.LOGSTEP.LOGID</code>.
     */
    public void setLogid(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>PUBLIC.LOGSTEP.LOGID</code>.
     */
    public String getLogid() {
        return (String) get(11);
    }

    /**
     * Setter for <code>PUBLIC.LOGSTEP.LOGLEVEL</code>.
     */
    public void setLoglevel(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>PUBLIC.LOGSTEP.LOGLEVEL</code>.
     */
    public String getLoglevel() {
        return (String) get(12);
    }

    /**
     * Setter for <code>PUBLIC.LOGSTEP.LOGTIMESTAMP</code>.
     */
    public void setLogtimestamp(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>PUBLIC.LOGSTEP.LOGTIMESTAMP</code>.
     */
    public String getLogtimestamp() {
        return (String) get(13);
    }

    /**
     * Setter for <code>PUBLIC.LOGSTEP.MESSAGE</code>.
     */
    public void setMessage(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>PUBLIC.LOGSTEP.MESSAGE</code>.
     */
    public String getMessage() {
        return (String) get(14);
    }

    /**
     * Setter for <code>PUBLIC.LOGSTEP.OPERATIONNAME</code>.
     */
    public void setOperationname(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>PUBLIC.LOGSTEP.OPERATIONNAME</code>.
     */
    public String getOperationname() {
        return (String) get(15);
    }

    /**
     * Setter for <code>PUBLIC.LOGSTEP.PAYLOAD</code>.
     */
    public void setPayload(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>PUBLIC.LOGSTEP.PAYLOAD</code>.
     */
    public String getPayload() {
        return (String) get(16);
    }

    /**
     * Setter for <code>PUBLIC.LOGSTEP.SERVICENAME</code>.
     */
    public void setServicename(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>PUBLIC.LOGSTEP.SERVICENAME</code>.
     */
    public String getServicename() {
        return (String) get(17);
    }

    /**
     * Setter for <code>PUBLIC.LOGSTEP.SERVICEPROVIDER</code>.
     */
    public void setServiceprovider(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>PUBLIC.LOGSTEP.SERVICEPROVIDER</code>.
     */
    public String getServiceprovider() {
        return (String) get(18);
    }

    /**
     * Setter for <code>PUBLIC.LOGSTEP.TRACKINGID</code>.
     */
    public void setTrackingid(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>PUBLIC.LOGSTEP.TRACKINGID</code>.
     */
    public String getTrackingid() {
        return (String) get(19);
    }

    /**
     * Setter for <code>PUBLIC.LOGSTEP.UUID</code>.
     */
    public void setUuid(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>PUBLIC.LOGSTEP.UUID</code>.
     */
    public String getUuid() {
        return (String) get(20);
    }

    /**
     * Setter for <code>PUBLIC.LOGSTEP.AUDITSTEPS_ID</code>.
     */
    public void setAuditstepsId(Long value) {
        set(21, value);
    }

    /**
     * Getter for <code>PUBLIC.LOGSTEP.AUDITSTEPS_ID</code>.
     */
    public Long getAuditstepsId() {
        return (Long) get(21);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record22 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<Long, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, Long> fieldsRow() {
        return (Row22) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<Long, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, Long> valuesRow() {
        return (Row22) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Logstep.LOGSTEP.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Logstep.LOGSTEP.ACTIVITYNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Logstep.LOGSTEP.CSIAPPID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Logstep.LOGSTEP.DURATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Logstep.LOGSTEP.EAGLEAPPID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Logstep.LOGSTEP.ENGINENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Logstep.LOGSTEP.ERRORMSG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Logstep.LOGSTEP.ERRORSEVERITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Logstep.LOGSTEP.ERRORTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Logstep.LOGSTEP.HOSTNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Logstep.LOGSTEP.IPADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Logstep.LOGSTEP.LOGID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return Logstep.LOGSTEP.LOGLEVEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return Logstep.LOGSTEP.LOGTIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return Logstep.LOGSTEP.MESSAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return Logstep.LOGSTEP.OPERATIONNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return Logstep.LOGSTEP.PAYLOAD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return Logstep.LOGSTEP.SERVICENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field19() {
        return Logstep.LOGSTEP.SERVICEPROVIDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field20() {
        return Logstep.LOGSTEP.TRACKINGID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field21() {
        return Logstep.LOGSTEP.UUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field22() {
        return Logstep.LOGSTEP.AUDITSTEPS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getActivityname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getCsiappid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getDuration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getEagleappid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getEnginename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getErrormsg();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getErrorseverity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getErrortype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getHostname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getIpaddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getLogid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getLoglevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getLogtimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getMessage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getOperationname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getPayload();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component18() {
        return getServicename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component19() {
        return getServiceprovider();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component20() {
        return getTrackingid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component21() {
        return getUuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component22() {
        return getAuditstepsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getActivityname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCsiappid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDuration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getEagleappid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getEnginename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getErrormsg();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getErrorseverity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getErrortype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getHostname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getIpaddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getLogid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getLoglevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getLogtimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getMessage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getOperationname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getPayload();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getServicename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value19() {
        return getServiceprovider();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value20() {
        return getTrackingid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value21() {
        return getUuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value22() {
        return getAuditstepsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogstepRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogstepRecord value2(String value) {
        setActivityname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogstepRecord value3(String value) {
        setCsiappid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogstepRecord value4(String value) {
        setDuration(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogstepRecord value5(String value) {
        setEagleappid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogstepRecord value6(String value) {
        setEnginename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogstepRecord value7(String value) {
        setErrormsg(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogstepRecord value8(String value) {
        setErrorseverity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogstepRecord value9(String value) {
        setErrortype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogstepRecord value10(String value) {
        setHostname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogstepRecord value11(String value) {
        setIpaddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogstepRecord value12(String value) {
        setLogid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogstepRecord value13(String value) {
        setLoglevel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogstepRecord value14(String value) {
        setLogtimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogstepRecord value15(String value) {
        setMessage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogstepRecord value16(String value) {
        setOperationname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogstepRecord value17(String value) {
        setPayload(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogstepRecord value18(String value) {
        setServicename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogstepRecord value19(String value) {
        setServiceprovider(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogstepRecord value20(String value) {
        setTrackingid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogstepRecord value21(String value) {
        setUuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogstepRecord value22(Long value) {
        setAuditstepsId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogstepRecord values(Long value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, String value13, String value14, String value15, String value16, String value17, String value18, String value19, String value20, String value21, Long value22) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        value22(value22);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LogstepRecord
     */
    public LogstepRecord() {
        super(Logstep.LOGSTEP);
    }

    /**
     * Create a detached, initialised LogstepRecord
     */
    public LogstepRecord(Long id, String activityname, String csiappid, String duration, String eagleappid, String enginename, String errormsg, String errorseverity, String errortype, String hostname, String ipaddress, String logid, String loglevel, String logtimestamp, String message, String operationname, String payload, String servicename, String serviceprovider, String trackingid, String uuid, Long auditstepsId) {
        super(Logstep.LOGSTEP);

        set(0, id);
        set(1, activityname);
        set(2, csiappid);
        set(3, duration);
        set(4, eagleappid);
        set(5, enginename);
        set(6, errormsg);
        set(7, errorseverity);
        set(8, errortype);
        set(9, hostname);
        set(10, ipaddress);
        set(11, logid);
        set(12, loglevel);
        set(13, logtimestamp);
        set(14, message);
        set(15, operationname);
        set(16, payload);
        set(17, servicename);
        set(18, serviceprovider);
        set(19, trackingid);
        set(20, uuid);
        set(21, auditstepsId);
    }
}
