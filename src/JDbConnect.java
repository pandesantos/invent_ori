
import java.sql.*;
import javax.swing.JOptionPane;


public class JDbConnect { 
    private static Connection con = null;
    public static Connection dbConnect(){
        try{
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\spd12\\OneDrive\\Documents\\NetBeansProjects\\First\\db\\test.db");
        }catch(ClassNotFoundException | SQLException e){
           JOptionPane.showMessageDialog(null,e);
        }
        return con;
    }
}
