package repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Usuario;

public class Database {
	private String server = "java0.database.windows.net:1433;";
	private String databaseName = "Test03;";
	private String userName = "funbuy@java0;";
	private String password = "Microsoft123;";
	private String connectionUrl = "jdbc:sqlserver://" + server + "database=" + databaseName + "user=" + userName
			+ "password=" + password;
	private ResultSet resultSet = null;
	private Connection connection = null;

	private static Database database = null;

	public Database() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
			connection = DriverManager.getConnection(connectionUrl);
		} catch (Exception e) {
			System.out.println("Database connection error");
			e.printStackTrace();
		}
	}

	public static Database getDatabase() {
		if (database == null) {
			database = new Database();
		}
		return database;
	}

	public List<Usuario> cargarUsuarios() {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		try {
			Statement st = connection.createStatement(); // SQLmanager=new query
			String query = "SELECT* FROM dbo.Users";
			resultSet = st.executeQuery(query);// SQL Manager ejecutar f5
			while (resultSet.next()) {
				String nombre = resultSet.getString("Name");
				String password = resultSet.getString("Password");
				usuarios.add(new Usuario(nombre, password));
			}

		} catch (Exception error) {
			System.out.println("error al cargar usuarios");
		}
		return usuarios;

	}

	public void borrarUsers(String[] users) {
		for (String string : users) {
			Usuario user = findByName(string);
			if (user != null) {
				try {
					Statement st = connection.createStatement();
					String query = "DELETE FROM dbo.Users WHERE Name='" + user.getNombre() + "';";
					st.executeUpdate(query);
				} catch (Exception e) {

				}
			}
		}

	}

	public Usuario findByName(String name) {
		for (Usuario usuario : cargarUsuarios()) {
			if (usuario.getNombre().equals(name)) {
				return usuario;
			}
		}
		return null;
	}

	public void addUsuario(Usuario u) {
		cargarUsuarios().add(u);
	}

}
