package jobamatching;

import java.sql.SQLException;
import java.util.Date;
import javax.swing.table.DefaultTableModel;




public final class GenerateId {

  public static final void main(String... aArgs) throws ClassNotFoundException, SQLException{
      Recommender rec = new Recommender("JJI9943");
      rec.recommendations();
     //JobApp jb = new JobApp();
    
     //double rs=jb.result("21394652");
      System.out.println();
      
  }
  
  private static void log(Object aObject){
    System.out.println( String.valueOf(aObject) );
  }
} 