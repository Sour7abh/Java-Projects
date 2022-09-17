import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo {
        public static void main(String[] args) {
        	try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				try {
					Connection connection = DriverManager.getConnection(
							"jdbc:mysql://localhost:3306/mytrgdb",
							"root",
							"root");
					Statement statement = connection.createStatement();
					String query = "insert into studentdata3 values (104,'reeta','Verma',10,'A+')";
					int val = statement.executeUpdate(query);
					if(val > 0) 
						System.out.println("record is inserted");
					else
				        System.out.println("record is not inserted");	
					
		//			query = "update studentdata set grade = 'B' where roll_no = 102";
		//			val = statement.executeUpdate(query);
		//			if(val > 0) 
		//				System.out.println("record updated");
		//			else
		//		        System.out.println("record not updated");
					
//					String query = "delete from studentdata where roll_no = 104";
//					int val = statement.executeUpdate(query);
//					if(val > 0) 
//						System.out.println("record is deleted");
//					else
//				        System.out.println("record is not deleted");	
				} catch (SQLException e) {
				e.printStackTrace();
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
        }
}
		

