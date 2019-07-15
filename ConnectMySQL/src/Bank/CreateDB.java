package Bank;

import com.mysql.cj.jdbc.DatabaseMetaData;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class CreateDB {

	public static void main(String[] args) {

		//String driver = "org.apache.derby.jdbc.EmbeddedDriver";
		//String protocol = "jdbc:derby:";

		String driver = "com.mysql.cj.jdbc.Driver";
		//javatest is the database what I created in MySQL by MySQL Workbench
		String protocol = "jdbc:mysql://localhost:3306/javauser";


		String USER = "root"; //DB username
		String PASS = ""; // DB password

		Connection conn = null;

		// First load the embedded driver
		try
		{
			Class.forName(driver).newInstance();
			//System.out.println("Loaded the embedded driver.");

			//System.out.println("Connecting Database ...");
			//conn = DriverManager.getConnection(protocol,USER,PASS);

		}
		catch (Exception err)  // Must catch ClassNotFoundException, InstantiationException, IllegalAccessException
		{
			System.err.println("Unable to load the embedded driver.");
			err.printStackTrace(System.err);
			System.exit(0);
		}

		// Create a new database and connect to it
		// In the connection string we could also supply a username and password
		// if applicable by adding "user=username;password=dbuserpwd".
		// This will create a folder named "BookDatabase" in the
		// program's directory that contains the database files

		//String dbName = "BookDatabase";
		//Connection conn = null;
		try
		{
			System.out.println("Connecting the database server...");
			//conn = DriverManager.getConnection(protocol + dbName + ";create=true");
			conn = DriverManager.getConnection(protocol,USER,PASS);

			//System.out.println("Database created.");

			// Create a statement object for running SQL statements
			Statement s = conn.createStatement();


			// Create a table named "names" with three fields.
			// One is for author, which holds a string up to 50 characters.
			// author_id is a numeric ID number for each author.
			// url is a varchar, which is a String that holds 80 characters
//			s.execute("CREATE TABLE names" +
//					"(author varchar(50), author_id int, url varchar(80))");
//			System.out.println("Created 'names' table.");
//
//			// Add some sample data.  Would be more efficient to use prepareStatement
//			// but leave off for simplicity
//			System.out.println("Inserting authors.");
//			s.execute("INSERT INTO names " +
//					"VALUES ('Adams, Douglas', 1, 'http://www.douglasadams.com')");
//			s.execute("INSERT INTO names " +
//					"VALUES ('Simmons, Dan', 2, 'http://www.dansimmons.com')");
//			s.execute("INSERT INTO names " +
//					"VALUES ('Stephenson, Neal', 3, 'http://www.nealstephenson.com')");
//
//			System.out.println("Authors inserted.");

			String strSelect = "Select * from names";
			//List<String> myRsult = new ArrayList<String>();
			s.execute(strSelect);

			conn.close();
		}
		catch (SQLException err)
		{
			System.err.println("SQL error.");
			err.printStackTrace(System.err);
			System.exit(0);
		}
	}



}




