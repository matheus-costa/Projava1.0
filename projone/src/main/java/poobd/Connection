package connection;


import java.sql.Connection;
import java.sql.DriverManager;

public class SingleConnection {
	
	private static String url = "jdbc:postgresql://localhost:5432/projone";
	private static String password = "postgresql";
	private static String user = "postgres";
	private static Connection connection = null;
	
	public SingleConnection() {
		conectar();
	}
	
	static {
		conectar();
	}
	
	private static void conectar() {
		try {
			if(connection == null) {
				Class.forName("org.postgresql.Driver");
				connection = DriverManager.getConnection(url, user, password);
				connection.setAutoCommit(false);
				
				//System.out.println("Conectou com Sucesso Uhhhhuuuuuuu!!");		
			}	
			
		}catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	public static Connection getConnection() {
		return connection;
		
	}

	public static Connection setConnection() {
		return connection;
		
	}


}