package org.assertj.db;

public class OracleDatabaseQueries extends DefaultDatabaseQueries {

    @Override
    public String getAllTablesQuery() {
        return "SELECT table_name, owner as table_schema FROM all_tables";
    }

    @Override
    public String getAllIndicesQuery() {
        return "select CONCAT(CONCAT(owner, '.'), index_name) as index_name from sys.all_indexes";
    }
}
