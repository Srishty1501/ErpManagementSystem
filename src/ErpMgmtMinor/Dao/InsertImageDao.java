package ErpMgmtMinor.Dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Utilities.ConnectionPool;

public class InsertImageDao {
	public void insert_FImage(int f_id,String str) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
 
        try {
            File image = new File(str);
            FileInputStream inputStream = new FileInputStream(image);
            InputStream ins = (InputStream) inputStream;
 
            
            String str1="insert into facultyimage(f_id, f_image) values(?,?)";
            PreparedStatement ps=conn.prepareStatement(str1);
            ps.setInt(1, f_id);
            ps.setBinaryStream(2, ins , (int)(image.length()));
 
            int rs=ps.executeUpdate();
            if(rs==0) {
            	System.out.println("record not inserted");
            }
            else
            {
            	System.out.println("record inserted successfully");
            }
 
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: - " + e);
        } catch (SQLException e) {
            System.out.println("SQLException: - " + e);
        } finally {
        
    			pool.putConnection(conn);
    		
             }
    }
	public void insert_SImage(int s_id,String str) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
 
        try {
            File image = new File(str);
            FileInputStream inputStream = new FileInputStream(image);
            InputStream ins = (InputStream) inputStream;
 
            
            String str1="insert into studentimage(s_id, f_image) values(?,?)";
            PreparedStatement ps=conn.prepareStatement(str1);
            ps.setInt(1, s_id);
            ps.setBinaryStream(2, ins , (int)(image.length()));
 
            int rs=ps.executeUpdate();
            if(rs==0) {
            	System.out.println("record not inserted");
            }
            else
            {
            	System.out.println("record inserted successfully");
            }
 
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: - " + e);
        } catch (SQLException e) {
            System.out.println("SQLException: - " + e);
        } finally {
        
    			pool.putConnection(conn);
    		
             }
    }

}
