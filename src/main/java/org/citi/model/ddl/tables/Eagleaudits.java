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
import org.citi.model.ddl.tables.records.EagleauditsRecord;
import org.jooq.Field;
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
public class Eagleaudits extends TableImpl<EagleauditsRecord> {

    private static final long serialVersionUID = -1562918613;

    /**
     * The reference instance of <code>PUBLIC.EAGLEAUDITS</code>
     */
    public static final Eagleaudits EAGLEAUDITS = new Eagleaudits();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EagleauditsRecord> getRecordType() {
        return EagleauditsRecord.class;
    }

    /**
     * The column <code>PUBLIC.EAGLEAUDITS.ID</code>.
     */
    public final TableField<EagleauditsRecord, Long> ID = createField("ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("(NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_20CBB021_ACCB_4660_896C_AD7B857F82CD)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>PUBLIC.EAGLEAUDITS.ACTIVITYNAME</code>.
     */
    public final TableField<EagleauditsRecord, String> ACTIVITYNAME = createField("ACTIVITYNAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.EAGLEAUDITS.ADDITIONALINFO</code>.
     */
    public final TableField<EagleauditsRecord, String> ADDITIONALINFO = createField("ADDITIONALINFO", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>PUBLIC.EAGLEAUDITS.BUSINESSREFID</code>.
     */
    public final TableField<EagleauditsRecord, String> BUSINESSREFID = createField("BUSINESSREFID", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.EAGLEAUDITS.CSIAPPID</code>.
     */
    public final TableField<EagleauditsRecord, String> CSIAPPID = createField("CSIAPPID", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.EAGLEAUDITS.CSIAPPNAME</code>.
     */
    public final TableField<EagleauditsRecord, String> CSIAPPNAME = createField("CSIAPPNAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.EAGLEAUDITS.DURATION</code>.
     */
    public final TableField<EagleauditsRecord, String> DURATION = createField("DURATION", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.EAGLEAUDITS.EAGLEAPPNAME</code>.
     */
    public final TableField<EagleauditsRecord, String> EAGLEAPPNAME = createField("EAGLEAPPNAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.EAGLEAUDITS.EAGLEAPPID</code>.
     */
    public final TableField<EagleauditsRecord, String> EAGLEAPPID = createField("EAGLEAPPID", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.EAGLEAUDITS.ENGINENAME</code>.
     */
    public final TableField<EagleauditsRecord, String> ENGINENAME = createField("ENGINENAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.EAGLEAUDITS.ERRORMSG</code>.
     */
    public final TableField<EagleauditsRecord, String> ERRORMSG = createField("ERRORMSG", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.EAGLEAUDITS.ERRORSEVERITY</code>.
     */
    public final TableField<EagleauditsRecord, String> ERRORSEVERITY = createField("ERRORSEVERITY", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.EAGLEAUDITS.ERRORTYPE</code>.
     */
    public final TableField<EagleauditsRecord, String> ERRORTYPE = createField("ERRORTYPE", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.EAGLEAUDITS.HOSTNAME</code>.
     */
    public final TableField<EagleauditsRecord, String> HOSTNAME = createField("HOSTNAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.EAGLEAUDITS.IPADDRESS</code>.
     */
    public final TableField<EagleauditsRecord, String> IPADDRESS = createField("IPADDRESS", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.EAGLEAUDITS.LASTUPDATETIME</code>.
     */
    public final TableField<EagleauditsRecord, String> LASTUPDATETIME = createField("LASTUPDATETIME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.EAGLEAUDITS.LIBRARYVERSION</code>.
     */
    public final TableField<EagleauditsRecord, String> LIBRARYVERSION = createField("LIBRARYVERSION", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.EAGLEAUDITS.LOGID</code>.
     */
    public final TableField<EagleauditsRecord, String> LOGID = createField("LOGID", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.EAGLEAUDITS.LOGLEVEL</code>.
     */
    public final TableField<EagleauditsRecord, String> LOGLEVEL = createField("LOGLEVEL", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.EAGLEAUDITS.LOGTIMESTAMP</code>.
     */
    public final TableField<EagleauditsRecord, String> LOGTIMESTAMP = createField("LOGTIMESTAMP", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.EAGLEAUDITS.MESSAGE</code>.
     */
    public final TableField<EagleauditsRecord, String> MESSAGE = createField("MESSAGE", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.EAGLEAUDITS.OPERATION</code>.
     */
    public final TableField<EagleauditsRecord, String> OPERATION = createField("OPERATION", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.EAGLEAUDITS.ORIGAPP</code>.
     */
    public final TableField<EagleauditsRecord, String> ORIGAPP = createField("ORIGAPP", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.EAGLEAUDITS.SRCAPPNAME</code>.
     */
    public final TableField<EagleauditsRecord, String> SRCAPPNAME = createField("SRCAPPNAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.EAGLEAUDITS.SRCCOUNTRYCODE</code>.
     */
    public final TableField<EagleauditsRecord, String> SRCCOUNTRYCODE = createField("SRCCOUNTRYCODE", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.EAGLEAUDITS.SRCOPERATION</code>.
     */
    public final TableField<EagleauditsRecord, String> SRCOPERATION = createField("SRCOPERATION", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.EAGLEAUDITS.SRCSERVICE</code>.
     */
    public final TableField<EagleauditsRecord, String> SRCSERVICE = createField("SRCSERVICE", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.EAGLEAUDITS.SRCSERVICEVERSION</code>.
     */
    public final TableField<EagleauditsRecord, String> SRCSERVICEVERSION = createField("SRCSERVICEVERSION", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.EAGLEAUDITS.SRCUSER</code>.
     */
    public final TableField<EagleauditsRecord, String> SRCUSER = createField("SRCUSER", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.EAGLEAUDITS.SERVICE</code>.
     */
    public final TableField<EagleauditsRecord, String> SERVICE = createField("SERVICE", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.EAGLEAUDITS.SERVICEPROVIDER</code>.
     */
    public final TableField<EagleauditsRecord, String> SERVICEPROVIDER = createField("SERVICEPROVIDER", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.EAGLEAUDITS.SERVICEVERSION</code>.
     */
    public final TableField<EagleauditsRecord, String> SERVICEVERSION = createField("SERVICEVERSION", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.EAGLEAUDITS.TOTALPROCESSINGTIME</code>.
     */
    public final TableField<EagleauditsRecord, String> TOTALPROCESSINGTIME = createField("TOTALPROCESSINGTIME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.EAGLEAUDITS.TRACKINGID</code>.
     */
    public final TableField<EagleauditsRecord, String> TRACKINGID = createField("TRACKINGID", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.EAGLEAUDITS.TRANSACTIONSTATUS</code>.
     */
    public final TableField<EagleauditsRecord, String> TRANSACTIONSTATUS = createField("TRANSACTIONSTATUS", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>PUBLIC.EAGLEAUDITS.UUID</code>.
     */
    public final TableField<EagleauditsRecord, String> UUID = createField("UUID", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>PUBLIC.EAGLEAUDITS</code> table reference
     */
    public Eagleaudits() {
        this(DSL.name("EAGLEAUDITS"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.EAGLEAUDITS</code> table reference
     */
    public Eagleaudits(String alias) {
        this(DSL.name(alias), EAGLEAUDITS);
    }

    /**
     * Create an aliased <code>PUBLIC.EAGLEAUDITS</code> table reference
     */
    public Eagleaudits(Name alias) {
        this(alias, EAGLEAUDITS);
    }

    private Eagleaudits(Name alias, Table<EagleauditsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Eagleaudits(Name alias, Table<EagleauditsRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.PRIMARY_KEY_D);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EagleauditsRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_D;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EagleauditsRecord>> getKeys() {
        return Arrays.<UniqueKey<EagleauditsRecord>>asList(Keys.CONSTRAINT_D);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Eagleaudits as(String alias) {
        return new Eagleaudits(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Eagleaudits as(Name alias) {
        return new Eagleaudits(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Eagleaudits rename(String name) {
        return new Eagleaudits(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Eagleaudits rename(Name name) {
        return new Eagleaudits(name, null);
    }
}
