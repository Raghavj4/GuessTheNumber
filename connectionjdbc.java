package javaProject;
import java.sql.*;
public class connectionjdbc 
{
	public static void main(String[]args)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","123");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM useraccount ");
			while(rs.next())
			{
				String data = rs.getString(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+" : "+rs.getString(4);
				System.out.println(data);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
