package ar.com.codoacodo.DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class AdministradorDeConexiones {
    

    public static Connection getConnection() {
		String hosts = "127.0.0.1";//localhost
		String port = "3306";
		String username = "root";
		String password = "Chulove86!";
		
		//driver de conexion a la base de datos
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		
		//nombre de la base de datos
		String dbName = "javacac";
		
		//NO VOY A EXPLICAR TRY CATCH, SOLO LO VAMOS A USAR
		Connection connection;
		try {
			Class.forName(driverClassName);
			
			String url = "jdbc:mysql://" + hosts + ":"+ port +"/"+ dbName +"?allowPublicKeyRetrieval=true&serverTimeZone=UTC&useSSL=false";
			
			connection = DriverManager.getConnection(url, username, password);
		}catch(Exception e) {
           System.out.println("Error en la conexion: " + e.getMessage()); 
			connection = null;
		}
		
		return connection;
	}
}
