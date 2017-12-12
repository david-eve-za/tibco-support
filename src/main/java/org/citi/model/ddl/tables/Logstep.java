/*
 * This file is generated by jOOQ.
*/
package org.citi.model.ddl.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.citi.model.ddl.Indexes;
import org.citi.model.ddl.Keys;
import org.citi.model.ddl.Public;
import org.citi.model.ddl.tables.records.LogstepRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class Logstep extends TableImpl<LogstepRecord> {

    private static final long serialVersionUID = -2009800629;

    /**
     * The reference instance of <code>PUBLIC.LOGSTEP</code>
     */
    public static final Logstep LOGSTEP = new Logstep();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LogstepRecord> getRecordType() {
        return LogstepRecord.class;
    }

    /**
     * The column <code>PUBLIC.LOGSTEP.ID</code>.
     */
    public final TableField<LogstepRecord, Long> ID = createField("ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("(NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_62ADF8A1_25C6_4569_82AB_45BDF920DA2A)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>PUBLIC.LOGSTEP.ACTIVITYNAME</code>.
     */
    public final TableField<LogstepRecord, String> ACTIVITYNAME = createField("ACTIVITYNAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.LOGSTEP.CSIAPPID</code>.
     */
    public final TableField<LogstepRecord, String> CSIAPPID = createField("CSIAPPID", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.LOGSTEP.DURATION</code>.
     */
    public final TableField<LogstepRecord, String> DURATION = createField("DURATION", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.LOGSTEP.EAGLEAPPID</code>.
     */
    public final TableField<LogstepRecord, String> EAGLEAPPID = createField("EAGLEAPPID", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.LOGSTEP.ENGINENAME</code>.
     */
    public final TableField<LogstepRecord, String> ENGINENAME = createField("ENGINENAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.LOGSTEP.ERRORMSG</code>.
     */
    public final TableField<LogstepRecord, String> ERRORMSG = createField("ERRORMSG", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.LOGSTEP.ERRORSEVERITY</code>.
     */
    public final TableField<LogstepRecord, String> ERRORSEVERITY = createField("ERRORSEVERITY", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.LOGSTEP.ERRORTYPE</code>.
     */
    public final TableField<LogstepRecord, String> ERRORTYPE = createField("ERRORTYPE", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.LOGSTEP.HOSTNAME</code>.
     */
    public final TableField<LogstepRecord, String> HOSTNAME = createField("HOSTNAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.LOGSTEP.IPADDRESS</code>.
     */
    public final TableField<LogstepRecord, String> IPADDRESS = createField("IPADDRESS", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.LOGSTEP.LOGID</code>.
     */
    public final TableField<LogstepRecord, String> LOGID = createField("LOGID", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.LOGSTEP.LOGLEVEL</code>.
     */
    public final TableField<LogstepRecord, String> LOGLEVEL = createField("LOGLEVEL", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.LOGSTEP.LOGTIMESTAMP</code>.
     */
    public final TableField<LogstepRecord, String> LOGTIMESTAMP = createField("LOGTIMESTAMP", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.LOGSTEP.MESSAGE</code>.
     */
    public final TableField<LogstepRecord, String> MESSAGE = createField("MESSAGE", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.LOGSTEP.OPERATIONNAME</code>.
     */
    public final TableField<LogstepRecord, String> OPERATIONNAME = createField("OPERATIONNAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.LOGSTEP.PAYLOAD</code>.
     */
    public final TableField<LogstepRecord, String> PAYLOAD = createField("PAYLOAD", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>PUBLIC.LOGSTEP.SERVICENAME</code>.
     */
    public final TableField<LogstepRecord, String> SERVICENAME = createField("SERVICENAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.LOGSTEP.SERVICEPROVIDER</code>.
     */
    public final TableField<LogstepRecord, String> SERVICEPROVIDER = createField("SERVICEPROVIDER", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.LOGSTEP.TRACKINGID</code>.
     */
    public final TableField<LogstepRecord, String> TRACKINGID = createField("TRACKINGID", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.LOGSTEP.UUID</code>.
     */
    public final TableField<LogstepRecord, String> UUID = createField("UUID", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.LOGSTEP.AUDITSTEPS_ID</code>.
     */
    public final TableField<LogstepRecord, Long> AUDITSTEPS_ID = createField("AUDITSTEPS_ID", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>PUBLIC.LOGSTEP</code> table reference
     */
    public Logstep() {
        this(DSL.name("LOGSTEP"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.LOGSTEP</code> table reference
     */
    public Logstep(String alias) {
        this(DSL.name(alias), LOGSTEP);
    }

    /**
     * Create an aliased <code>PUBLIC.LOGSTEP</code> table reference
     */
    public Logstep(Name alias) {
        this(alias, LOGSTEP);
    }

    private Logstep(Name alias, Table<LogstepRecord> aliased) {
        this(alias, aliased, null);
    }

    private Logstep(Name alias, Table<LogstepRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.LOGSTEP_AUDITSTEPS_FK_INDEX_3, Indexes.PRIMARY_KEY_3);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LogstepRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LogstepRecord>> getKeys() {
        return Arrays.<UniqueKey<LogstepRecord>>asList(Keys.CONSTRAINT_3);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<LogstepRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<LogstepRecord, ?>>asList(Keys.LOGSTEP_AUDITSTEPS_FK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Logstep as(String alias) {
        return new Logstep(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Logstep as(Name alias) {
        return new Logstep(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Logstep rename(String name) {
        return new Logstep(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Logstep rename(Name name) {
        return new Logstep(name, null);
    }
}