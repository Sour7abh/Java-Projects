import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

public class PreparedStatementDemo {
       public static void main(String[] args) {
    	   try {
			Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/flyawaydb",
						"root",
						"root");
				String query = "insert into flightdata values (?,?,?,?,?,?,?)";
				
				//String query = "delete from flight where flight_id = 1";
				//String query = "update flight set source = 'Mumbai' where flight_id = 6";
				PreparedStatement preparedStatement = connection.prepareStatement(query);
				preparedStatement.setInt(1, 6);
				preparedStatement.setString(2, "Spice_jet");
				preparedStatement.setString(3, "Mumbai");
				preparedStatement.setString(4, "Goa");
				preparedStatement.setString(5, "MONDAY, TUESDAY, THURSDAY, SATURDAY, FRIDAY, WEDNESDAY");
				preparedStatement.setString(6,"8000");
				preparedStatement.setTimestamp(7, getCurrentTimeStamp());
				
				
				int val = preparedStatement.executeUpdate();
				if (val > 0)
					System.out.println("record inserted");
				else
					System.out.println("record not inserted");
			} catch (SQLException | ClassNotFoundException e1) {
				e1.printStackTrace();
			}
		
		
	}

	private static Timestamp getCurrentTimeStamp() {
		// TODO Auto-generated method stub
		return null;
	}
}
