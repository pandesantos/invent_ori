
import java.sql.*;
import javax.swing.JOptionPane;


public class JDbConnect { 
    private static Connection con = null;
    public static Connection dbConnect(){
        try{
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\spd12\\OneDrive\\Documents\\NetBeansProjects\\invent_ori\\db\\stockin.sqlite");
        }catch(ClassNotFoundException | SQLException e){
           JOptionPane.showMessageDialog(null,e);
        }
        return con;
    }
}
