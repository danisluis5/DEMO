package Version3.model;

import Version3.bean.Job;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModelJob {
    private PreparedStatement pst;
    private Statement st;
    private ResultSet rs;
    private ModelConnectDB mConnect;
    
    private String tbName = "job";
    private String idName = "id";
	
    public ModelJob(){
	mConnect = new ModelConnectDB();
    }
    
    public ArrayList<Job> getList(){
        Connection conn = mConnect.getConnectMySQL();
        String sql = "SELECT * FROM "+tbName;
        ArrayList<Job> listItems = new ArrayList<Job>();
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                listItems.add(new Job(rs.getInt("id"), rs.getString("name")));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }  
        return listItems;
    }
}
