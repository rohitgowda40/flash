import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Set;

public class EmployeeObjectDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Set<EmployeeObjectPrepared> set = new HashSet();
		String query2="select * from  lecturer";
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/rohith1";
		String uname="root";
		String pwd = "root";
		Connection conn = DriverManager.getConnection(url,uname,pwd);
		PreparedStatement ps=conn.prepareStatement(query2);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			EmployeeObjectPrepared eo= new EmployeeObjectPrepared();

			eo.setE_id(rs.getInt(1));
			eo.setE_name(rs.getString(2));
			eo.setE_add(rs.getString(3));
			set.add(eo);

		}
		System.out.println(set);


	}

}
