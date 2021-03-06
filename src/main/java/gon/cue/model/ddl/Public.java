/*
 * This file is generated by jOOQ.
*/
package gon.cue.model.ddl;


import gon.cue.model.ddl.tables.MegaConfigurations;
import gon.cue.model.ddl.tables.MegaUser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Public extends SchemaImpl {

    private static final long serialVersionUID = -1521007324;

    /**
     * The reference instance of <code>PUBLIC</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>PUBLIC.MEGA_CONFIGURATIONS</code>.
     */
    public final MegaConfigurations MEGA_CONFIGURATIONS = gon.cue.model.ddl.tables.MegaConfigurations.MEGA_CONFIGURATIONS;

    /**
     * The table <code>PUBLIC.MEGA_USER</code>.
     */
    public final MegaUser MEGA_USER = gon.cue.model.ddl.tables.MegaUser.MEGA_USER;

    /**
     * No further instances allowed
     */
    private Public() {
        super("PUBLIC", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            MegaConfigurations.MEGA_CONFIGURATIONS,
            MegaUser.MEGA_USER);
    }
}
