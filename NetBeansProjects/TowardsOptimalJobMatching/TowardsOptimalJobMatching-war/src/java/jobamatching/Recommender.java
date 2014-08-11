/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jobamatching;


import java.sql.SQLException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class Recommender {
   public static JTextArea results = new JTextArea();
    private String sql;
    private DBClass db;
    private String input;
    
    public Recommender(String input) throws ClassNotFoundException, SQLException{
        this.input=input;
        db = new DBClass();
    }
      public Recommender() throws ClassNotFoundException, SQLException{
        db = new DBClass();
    }
    public String[] splitWords(String criteria){
        StringTokenizer token = new StringTokenizer(criteria,", %~");
        String[] words = new String[token.countTokens()];
        int count=0;
        while(token.hasMoreTokens()){
            words[count]=token.nextToken();
            count++;
        }
        return words;        
    }
    
    public double calcScore(String criteria,String user,double w){
        
        String[] words=splitWords(criteria);
        String[] userWords=splitWords(user);
        
        System.out.println("-------------------now matching-----------------------\n");
        System.out.println(criteria+"  ||  "+user+" || "+w);
        
        results.append("-------------------now matching-----------------------\n");
        results.append(criteria+"  ||  "+user+" || "+w);
        int points, userPoints = 0;            
            points=words.length;
            for(int i=0;i<userWords.length;i++){
                for(int j=0;j<words.length;j++){
                    if(userWords[i].equalsIgnoreCase(words[j])){
                        userPoints=userPoints+1;
                        System.out.print(words[j]+" ");
                    }
                }
            }
           
           double score=(userPoints*1.0/points)*w;      
           System.out.println(score);
           results.append(score+"\n");
        return score;        
    }
    
  
    public void recommendations(){
       try {
                    
               String applicants="select ApID from applications where JobRef='"+input+"'";  
               
               //get all applicants               
                DefaultTableModel tbmodel = db.query(applicants);
                Object[] appids = new Object[tbmodel.getRowCount()];
                Object[] applicant = new Object[25];
                for(int i=0;i<tbmodel.getRowCount();i++){
                    appids[i]=tbmodel.getValueAt(i, 0);
                    
                    Object[] model
                        = db.row("select disability,achievements,personality,education,experience,skills,associations,age,nationality,languages,gender,ethnicity from userprofile where apid='"+appids[i]+"'");
                    System.out.println(appids[i]);
                }
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(new JTextField(8), ex.getMessage());
       }   
            
    }
    
 
    private String[] row(int index,DefaultTableModel table){
        String[] row = new String[table.getColumnCount()];
        
          
        if(row.length>1)
        for(int i=0;i<row.length;i++){
            String val=table.getValueAt(index, i).toString();
            if(val==null)
                val="none";
            row[i]=val;
        }     
     
        
        return row;
    }
    private String[] getCols(DefaultTableModel model){
        String[] cols = new String[model.getColumnCount()];
        for(int i=0;i<cols.length;i++)
            cols[i]=model.getColumnName(i);
        
        return cols;
    }
    //total weight of all attributes
    private double getTotalWeight(){
        double totw=0;
        for (int i = 0; i < getWeight().length; i++) {
            totw+=getWeight()[i];
        }
        return totw;
    }
    //get weight for each attribute
    public double[] getWeight(){
     
           double[] w = new double[5];
          try {
               sql="select Age,Gender,Ethnicity,Citizenship,Disability,Languages,"
                       + "Achievements,Associations,Personality,Education,"
                       + "Experience,skills from weight where jobref='"+input+"'";
               
               String[] weight = row(0, db.query(sql));
                w=new double[weight.length];
               
               for (int i = 0; i < weight.length; i++) {
                    w[i]=Double.parseDouble(weight[i]); 
               }
               
       } catch (SQLException ex) {
           Logger.getLogger(Recommender.class.getName()).log(Level.SEVERE, null, ex);
       }
     return w;
    }
    
    public double result(String candidate) {
       double w,totScore=0;
        try {
           
               double totW = 0;
              
               DefaultTableModel tbl;
               //applications
            
               //criteria
               sql ="select Age,Gender,Ethnicity,Citizenship,Disability,Languages,Achievements,"
                       + "Associations,Personality,Education,Experience,"
                       + "skills from idealcand where jobref='"+input+"'";
               tbl=(db.query(sql));
               String[] idealCand = row(0,tbl);
                  
                 //user profile
                 sql ="select Age,Gender,Ethnicity,nationality,Disability,Languages,Achievements,"
                         + "Associations,Personality,Education,Experience,skills from "
                         + "userprofile where apid='"+candidate+"'";
               
               String[] cand = row(0,tbl);
                      
               //weight
            
               
               double[] score = new double[cand.length];
               
               
               
               
               for(int i=0;i<cand.length;i++){     
                              w=getWeight()[i];
                   score[i]=calcScore(idealCand[i], cand[i],w );
                   totScore+=score[i];
                   totW+=w;
               }
               
               double sRate=(totScore/totW)*100;
              // System.out.println(totScore+"\t"+totW);
          
         
       } catch (SQLException ex) {
           Logger.getLogger(Recommender.class.getName()).log(Level.SEVERE, null, ex);
       }
       return totScore;
    }
      public static final void main(String... aArgs) throws ClassNotFoundException, SQLException{
      Recommender rec = new Recommender("JJI9943");
      rec.recommendations();
     //JobApp jb = new JobApp();
    
     //double rs=jb.result("21394652");
      System.out.println();
      
  }
    
}
    
