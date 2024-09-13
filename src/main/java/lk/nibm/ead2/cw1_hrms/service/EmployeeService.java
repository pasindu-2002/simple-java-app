package lk.nibm.ead2.cw1_hrms.service;
 
import java.sql.PreparedStatement;
import java.sql.SQLException;
 
import lk.nibm.ead2.cw1_hrms.db.Database;
import lk.nibm.ead2.cw1_hrms.model.Employee;
 
public class EmployeeService {
 
	private static final int status = 0;

	public boolean insert(Employee employee) throws SQLException {
		String sql = "INSERT INTO public.employee(FirstName,LastName,Designation,Email,Telephone,Age) VALUES(?,?,?,?,?,?)";
		Database db = Database.getDatabase();
		PreparedStatement ps = db.getPreparedStatement(sql);
		
			ps.setString(1, employee.getFirstname());
		    ps.setString(2, employee.getLastname());
		    ps.setString(3, employee.getDesignation());
		    ps.setString(4, employee.getEmail());
		    ps.setString(5, employee.getTelephone());
		    ps.setInt(6, employee.getAge());
		    
		    int rowsInserted = ps.executeUpdate(); // executeUpdate() returns the number of rows affected
		    ps.close();
		
		return status > 0;
	}
}
 

