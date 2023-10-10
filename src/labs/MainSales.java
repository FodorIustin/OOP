package labs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MainSales {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/crud";
		String user = "root";
		String pass = "";
		try {
			System.out.println("Connecting to db..");
			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection done");

			// Create EVENT
			String name = "Chair";
			int price = 20;
			int complaints = 2;

		String insertSale = "insert into sales (name, price, number_of_complaints) values " + "('" + name
			+ "','" + price + "','" + complaints + "')";

			// execute
			// executeQuerry cand citesti tabele
			// executeUpdate stergere adaugare modificare

			Statement s = con.createStatement();
			s.executeUpdate(insertSale);
			System.out.println("inserted product");
			
			
			//Delete	
		//	String deleteQuerry = "delete from events where id = 5";
		//	Statement s1 = con.createStatement();
		//	s1.executeUpdate(deleteQuerry);
			
			//Read
			//String readAllQuerry = "select * from events";
		//	Statement s3 = con.createStatement();
		//	ResultSet rs = s3.executeQuery(readAllQuerry);
			
		//	while(rs.next()) {
		//		System.out.println("______");
			//	System.out.println(rs.getString("event_name"));
			//	System.out.println(rs.getString("presenter"));
			//	System.out.println(rs.getString("registration_duo"));
			//}
			
			
			//Update
//			String updateQuery = "update events set event_name= 'TED ' where id= 4";
		//	Statement s4 = con.createStatement();
		//        s4.executeUpdate(updateQuery);
			
			
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Finish");
	}

}
