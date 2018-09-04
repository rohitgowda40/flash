import java.sql.*;
public class Statement1 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	String url="jdbc:mysql://localhost:3306/rohith1";
	String uname="root";
	String pwd = "root";
	int sid=8;
	String sname="harish";
	String query1="insert into student values(7,'shoba')";
	String query="insert into student values(" + sid + ", '"+sname+"')";
	String query4="update student set sname='sowmya' where sname='ravi'";
	String query3="delete from student where sname='harish'";
	Class.forName("com.mysql.jdbc.Driver");
	String query2="select * from  student";

	Connection conn = DriverManager.getConnection(url,uname,pwd);
	Statement st = conn.createStatement();
	int no=st.executeUpdate(query3);
	ResultSet r = st.executeQuery(query2);
	boolean userData=r.absolute(2);
	/*while(r.next()){
		String userData =  	r.getInt(1)+  ":" + r.getString(2);
		
//String userData =  	r.getInt("sid") +  ":" + r.getString("sname");
System.out.println(userData);
	}*/
	if(userData)
	{	String userData1 = r.getInt(1)+  ":" + r.getString(2);
	
	System.out.println(userData1);}
	System.out.println(no);
st.close();
conn.close();
}
}
