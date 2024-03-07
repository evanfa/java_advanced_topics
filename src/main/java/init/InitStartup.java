package init;

public class InitStartup {
    private static final String DEFAULT_CONFIG_XML = "src/main/java/startup/init/config/xml/paths_config.xml";
    private static final String DEFAULT_CSV_FILE = "C:\\Users\\Public\\default.xml";
    public static final String DEFAULT_HOST = "localhost";
    public static final int JDBC_PORT = 1433;
    //public static final String DEFAULT_BD_NAME = "DBAPermitsPipelines";
    public static final String DEFAULT_BD_NAME = "SQL_Dumps";
    public static final String SERVER_CLASS = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static String DEFAULT_TABLE_COMS = "library_db_nov2023";
    public static String DEFAULT_TABLE_REPORT = "library_db_nov2023";
    public static String DEFAULT_ERROR_LOG = "error_log_db_test";
}
