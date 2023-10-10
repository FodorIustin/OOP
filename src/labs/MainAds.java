package labs;

 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java. util. *; 
public class MainAds {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/ads";
		String user = "root";
		String pass = "";
		
		try {
			System.out.println("Connecting to db..");
			Connection com = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection done");

			// Create EVENT
			String name = "Catena";
			int amount = 2;
			Date date = new Date(System.currentTimeMillis());
			int views = 23;
			

			String insertAd = "insert into requiress (title, amount, published_at, views) values " + "('" + name
				+ "','" + amount + "','" + date + "','" + views + "')";
			

				Statement s = com.createStatement();
				s.executeUpdate(insertAd);
					System.out.println("inserted ad");
			
					//Read
					//String readAllQuerry = "select * from description";
				//	Statement s2 = con.createStatement();
				//	ResultSet rs = s2.executeQuery(readAllQuerry);
					
				//	while(rs.next()) {
				//		System.out.println("______");
					//	System.out.println(rs.getString("title"));
					//	System.out.println(rs.getString("amount"));
					//	System.out.println(rs.getString("published_at"));
					//}
					
					
					//Update
				//	String updateQuery = "update ads set title= 'BRD' where amount= 4";
				//	Statement s3 = com.createStatement();
				 //       s3.executeUpdate(updateQuery);
					
					
			com.close();
		}
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Finish");
	}

}
