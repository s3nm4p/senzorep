/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jobamatching;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class DBClass {
    
    
    private Connection conector;
    Statement stmnt;
    ResultSet resultset;
    ResultSetMetaData tblmetadata;
    String sql;
    public boolean code = true;
    
    public DBClass() throws ClassNotFoundException, SQLException{
        connect("root","admin");
    }
    
    public DBClass(String username,String password) throws ClassNotFoundException, SQLException{
       connect(username,password);
    }
    
      public void connect(String username,String password) throws ClassNotFoundException, SQLException{
       
            Class.forName ("com.mysql.jdbc.Driver");
            conector=DriverManager.getConnection("jdbc:mysql://localhost:3306/JOBMATCH",username,password);
        
          
    }
      public boolean update(String sql) throws SQLException{
        boolean query=true;
          
            stmnt=conector.createStatement();
            stmnt.executeUpdate(sql);
            
       
        return query;
      }
      
      public DefaultTableModel query(String sql) throws SQLException{         
          DefaultTableModel tbmodel = null;
          
            stmnt=conector.createStatement();
            resultset=stmnt.executeQuery(sql);
            tblmetadata=resultset.getMetaData();
            int numcols = tblmetadata.getColumnCount();
            String[] cols = new String[numcols];
            for(int i=1;i<=numcols;i++){
                cols[i-1]=tblmetadata.getColumnName(i);    
            }
            Object[] row = new Object[numcols+1];
            
             tbmodel = new DefaultTableModel(cols, 0);
            
            while(resultset.next()){
                for(int col=1;col<=numcols;col++){  
                    Object object = resultset.getObject(col);  
                    if(object==null)
                        object="None";
                    row[col-1] =    object;                 
                }                
                tbmodel.addRow(row);                 
            }
                
        
        return tbmodel;
          
      }
      public Object[] row(String sql) throws SQLException{
          stmnt=conector.createStatement();
            resultset=stmnt.executeQuery(sql);
            ArrayList<Object> row = new ArrayList<Object>();
            int i=1;
            while(resultset.next()){              
                row.add(resultset.getObject(i));
                i++;
            }
            
            
        return row.toArray();
      }
      public boolean validate(String name,String tableName,String colName) throws SQLException{
         boolean query=false;
          
                      
            stmnt = conector.createStatement();                        
            sql="select "+colName+" from "+tableName+" where "+colName+"='"+name+"'";
            resultset=stmnt.executeQuery(sql);
            if(resultset.next())
                query=true;
            
        
          return query;
      }
}
