package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sports{
	public static final String[] attributes = { "SID", "SNAME", "SLOC", "SDUR", "EID" };
	private Connection con;
	
	public Sports() {
	      try
	      {
	          Class.forName("oracle.jdbc.driver.OracleDriver"); 
	          con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:" + DatabaseInfo.SID, User.name, User.password); 

	          Statement stmt = con.createStatement();

	          try
	          {
	              String query =   "CREATE TABLE SPORTS ( "
	              				 + "SID NUMBER(4) PRIMARY KEY,"
	              				 + "SNAME VARCHAR(20),"
	              				 + "SLOC VARCHAR(40),"
	              				 + "SDUR NUMBER(3),"					//VALUES TIME('15:09:02') || VALUES '15:09:02'
	              				 + "EID NUMBER(3) REFERENCES EVENT (EID)"
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
                ResultSet resSet = stmt.executeQuery("SELECT * FROM SPORTS");

                System.out.println("Details of SPORTS are: \n");
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
	
    public void insert(int sID, String sName, String sLoc, String sDur, int eID){
        try
        {
            int rowsUpdated;
            Statement stmt = con.createStatement();

            try
            {  
                PreparedStatement prepStmt = con.prepareStatement("INSERT INTO SPORTS (SID,SNAME,SLOC,SDUR,EID) VALUES ( ?, ?, ?, ?, ?)");
                prepStmt.setInt( 1, sID);
                prepStmt.setString( 2, sName);
                prepStmt.setString( 3, sLoc);
                prepStmt.setString( 4, sDur);
                prepStmt.setInt( 5, eID);     
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

    public void update(int sID, String sName, String sLoc, String sDur, int eID){
        try
        {
            int rowsUpdated;
            Statement stmt = con.createStatement();

            try
            {  
                PreparedStatement prepStmt = con.prepareStatement("UPDATE Sports SET SNAME=? , SLOC=?, SDUR=? WHERE EID=? AND SID=?");
                prepStmt.setString( 1, sName);
                prepStmt.setString( 2, sLoc);
                prepStmt.setString( 3, sDur);
                prepStmt.setInt( 4, eID);
                prepStmt.setInt( 5, sID);
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

    public void delete(int sid, int eid){
        try
        {
            int rowsUpdated;
            Statement stmt = con.createStatement();

            try
            {
                rowsUpdated = stmt.executeUpdate("DELETE FROM SPORTS WHERE SID = " + sid + "AND EID = " + eid);
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
