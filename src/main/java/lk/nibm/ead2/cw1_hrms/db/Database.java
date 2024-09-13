package lk.nibm.ead2.cw1_hrms.db;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
 
public class Database {
 
	private static final String HSQLDB_CONNECTION_STRING = "jdbc:hsqldb:hsql://localhost/HRMS"
			+ "";
	private static final String HSQLDB_USERNAME = "SA";
	private static final String HSQLDB_PASSWORD = "";
 
	private static Database database;
	private Connection connection;
 
	private Database() throws SQLException {
		this.connection = connect();
		System.out.println("HSQLDB database connection established...");
	}
 
	public static Database getDatabase() throws SQLException {
		if(database == null) {
			database = new Database();
		}
 
		return database;
	}
	private Connection connect() throws SQLException {
		DriverManager.registerDriver(new org.hsqldb.jdbcDriver());
		Connection conn = DriverManager.getConnection(HSQLDB_CONNECTION_STRING,HSQLDB_USERNAME,HSQLDB_PASSWORD);
		return conn;
	}
 
	public PreparedStatement getPreparedStatement(String sql) throws SQLException {
		return this.connection.prepareStatement(sql);
	}
 
	public void close() throws SQLException {
		this.connection.close();
	}
}
 




