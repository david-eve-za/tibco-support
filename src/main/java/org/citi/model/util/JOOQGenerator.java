package org.citi.model.util;

import org.jooq.util.GenerationTool;
import org.jooq.util.jaxb.Configuration;
import org.jooq.util.jaxb.Database;
import org.jooq.util.jaxb.Generator;
import org.jooq.util.jaxb.Jdbc;
import org.jooq.util.jaxb.Target;

public class JOOQGenerator {
	public JOOQGenerator() {
		Configuration config = new Configuration()
				.withJdbc(new Jdbc().withDriver("org.hsqldb.jdbc.JDBCDriver")
						.withUrl("jdbc:hsqldb:file:./MegaDB")
						.withUser("root").withPassword("toor"))
				.withGenerator(new Generator()
						.withDatabase(new Database().withIncludeTables(true).withIncludeRoutines(true)
								.withIncludePackages(true).withIncludeUDTs(true).withIncludeSequences(true)
								.withIncludePrimaryKeys(true).withIncludeForeignKeys(true).withIncludeUniqueKeys(true)
								.withName("org.jooq.util.hsqldb.HSQLDBDatabase").withExcludes("")
								.withInputSchema("INFORMATION_SCHEMA")
								.withInputSchema("PUBLIC"))
						.withTarget(new Target().withPackageName("gon.cue.model.ddl").withDirectory("JOOQtarget/jooq")));

		try {
			GenerationTool.generate(config);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
