package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Coachs{
	public static final String[] attributes = { "EID", "CNAME", "CPHONE" };
	private Connection con;
	
	public Coachs() {
	      try
	      {
	          Class.forName("oracle.jdbc.driver.OracleDriver"); 
	          con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:" + DatabaseInfo.SID, User.name, User.password); 

	          Statement stmt = con.createStatement();

	          try
	          {
	              String query =   "CREATE TABLE COACHS ( "
	              				 + "CID NUMBER(3) PRIMARY KEY,"
	              				 + "CNAME VARCHAR(20),"
	              				 + "CPHONE NUMBER(10)"
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
                ResultSet resSet = stmt.executeQuery("SELECT * FROM COACHS");

                System.out.println("Details of COACHS are: \n");
                for( int i=0 ; i<attributes.length ; i++ )
              	  System.out.printf("%10s", attributes[i]);
                System.out.println();
                
                while(resSet.next())
                  {
                  	for( int i=0 ; i<attributes.length ; i++ )
                  		System.out.printf("%10s", resSet.getString(attributes[i]));
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
	
    public void insert(String cName, int cPhone, int cID){
        try
        {
            int rowsUpdated;
            Statement stmt = con.createStatement();

            try
            {  
                PreparedStatement prepStmt = con.prepareStatement("INSERT INTO COACHS (CNAME,CPHONE,CID) VALUES ( ?, ?, ?)");
                prepStmt.setString( 1, cName);
                prepStmt.setInt( 2, cPhone);
                prepStmt.setInt( 3, cID);  
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

    public void update(String cName, int cPhone, int cID){
        try
        {
            int rowsUpdated;
            Statement stmt = con.createStatement();

            try
            {  
                PreparedStatement prepStmt = con.prepareStatement("UPDATE COACHS SET CPHONE=?, CNAME=? WHERE CID=?");
                prepStmt.setInt( 1, cPhone);
                prepStmt.setString( 2, cName);
                prepStmt.setInt( 3, cID);
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

    public void delete(int cID){
        try
        {
            int rowsUpdated;
            Statement stmt = con.createStatement();

            try
            {
                rowsUpdated = stmt.executeUpdate("DELETE FROM COACHS WHERE CID=" + cID );
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