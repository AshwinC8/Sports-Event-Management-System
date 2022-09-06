package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Event {
	public static final String[] attributes = { "EID", "ENAME", "EDATE" };
	private Connection con;
	
	public Event() {
      try
      {
          Class.forName("oracle.jdbc.driver.OracleDriver"); 
          con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:" + DatabaseInfo.SID, User.name, User.password); 

          Statement stmt = con.createStatement();

          try
          {
              String query =   "CREATE TABLE EVENT ( "
              				 + "EID NUMBER(3) PRIMARY KEY,"
              				 + "ENAME VARCHAR(20),"
              				 + "EDATE DATE"
              				 + ")";
              stmt.executeQuery(query);
              select();
          }
          catch (SQLException sqle)
          {
                  System.out.println(sqle);
                  System.out.println("Failed to execute CREATE * query");
          }
              
          stmt.close();
      }
      catch(ClassNotFoundException cnfe)
      {
          System.out.println(cnfe);
          System.out.println("Failed to load driver");
      }
      catch(SQLException sqle)
      {
          System.out.println(sqle);
      }	
	}

    public void select(){
        try
        {
            Statement stmt = con.createStatement();

            try
            {
                //Performing a Query on EVENT table
                ResultSet resSet = stmt.executeQuery("SELECT * FROM EVENT");

                System.out.println("Details of EVENT are: \n");
                for( int i=0 ; i<attributes.length ; i++ )
              	  System.out.printf("%18s", attributes[i]);
                System.out.println();
                
                while(resSet.next())
                  {
                  	for( int i=0 ; i<attributes.length ; i++ )
                  		System.out.printf("%18s", resSet.getString(attributes[i]));
                  	System.out.println();
                  }
            }
            catch (SQLException sqle)
            {
                    System.out.println(sqle);
                    System.out.println("Failed to execute SELECT * query");
            }
                
            stmt.close();
        }
        catch(SQLException sqle)
        {
            System.out.println(sqle);
        }
    }
	
    public void insert(int eID, String eName, String eDate){
        try
        {
            int rowsUpdated;
            Statement stmt = con.createStatement();

            try
            {  
                PreparedStatement prepStmt = con.prepareStatement("INSERT INTO EVENT (EID,ENAME,EDATE) VALUES ( ?, ?, '" + eDate + "')");
                prepStmt.setInt( 1, eID);
                prepStmt.setString( 2, eName);
                rowsUpdated = prepStmt.executeUpdate();
                if(rowsUpdated > 0)
                    System.out.println("Successfully inserted " + rowsUpdated + " row(s)");
                else
                    System.out.println("Failed to insert to table");
                
                prepStmt.close();
            }
            catch(SQLException sqle)
            {
                System.out.println(sqle);
                System.out.println("Failed to perform Insert using prepared statement");
            }

            stmt.close();
        }
        catch(SQLException sqle)
        {
            System.out.println(sqle);
        }
    }

    public void update(int eID, String eName, String eDate){
        try
        {
            int rowsUpdated;
            Statement stmt = con.createStatement();

            try
            {  
                PreparedStatement prepStmt = con.prepareStatement("UPDATE EVENT SET ENAME=? , EDATE='" + eDate + "' WHERE EID=?");
                prepStmt.setString( 1, eName);
                prepStmt.setInt( 2, eID);
                rowsUpdated = prepStmt.executeUpdate();
                
                if(rowsUpdated > 0)
                    System.out.println("Successfully updated " + rowsUpdated + " row(s)");
                else
                    System.out.println("Failed to update table");
                
                prepStmt.close();
            }
            catch(SQLException sqle)
            {
                System.out.println(sqle);
                System.out.println("Failed to perform Update using prepared statement");
            }

            stmt.close();
        }
        catch(SQLException sqle)
        {
            System.out.println(sqle);
        }
    }

    public void delete(int eid){
        try
        {
            int rowsUpdated;
            Statement stmt = con.createStatement();

            try
            {
                rowsUpdated = stmt.executeUpdate("DELETE FROM Event WHERE EID = " + eid );
                if(rowsUpdated > 0)
                    System.out.println("Successfully deleted " + rowsUpdated + " row(s)");
                else
                    System.out.println("Failed to delete from table");
            }
            catch(SQLException sqle)
            {
                System.out.println(sqle);
                System.out.println("Failed to perform Delete");
            }
        
            stmt.close();
        }
        catch(SQLException sqle)
        {
            System.out.println(sqle);
        }
    }

    protected void finalize() throws SQLException {
    	con.close();
    }

}