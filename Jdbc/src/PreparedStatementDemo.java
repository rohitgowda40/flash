import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementDemo {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.jdbc.Driver");
	Scanner sc=new Scanner(System.in);
	String url="jdbc:mysql://localhost:3306/rohith1";
	String uname="root";
	String pwd = "root";
	Connection conn = DriverManager.getConnection(url,uname,pwd);
	
	String query1="insert into lecturer values(?,?,?)";
	String query2="select * from  lecturer";
conn.setAutoCommit(false);
	PreparedStatement ps = conn.prepareStatement(query1);
	
	
	for(int i=1;i<=2;i++)
	{
		System.out.println("enter lid");
		int lid = sc.nextInt();
		System.out.println("enter lname");
		String lname = sc.next();
		System.out.println("enter ladress");
		String ladress = sc.next();
		ps.setInt(1, lid);
		ps.setString(2, lname);
		ps.setString(3, ladress);

		ps.executeUpdate();
	}
	ResultSet r = ps.executeQuery(query2);
	while(r.next())
	{
		String ldetails = r.getInt(1) +":"+r.getString(2)+":"+ r.getString(3);
		System.out.println(ldetails);
	}
		ps.close();
		conn.close();
	conn.commit();

	
}
}
