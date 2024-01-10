package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import utils.Conexion;

public class Dao {
	
	public static Boolean comprobar(String user, String pass) {
		Connection con;
		Conexion cn = new Conexion();
		
		PreparedStatement stmt;
		ResultSet rs;
		String us = "";
		Boolean valido = false;
		String sentence = "SELECT * FROM usuario WHERE username = ? AND password = ?";
		
		try {
			
			con = cn.getConnection();
			stmt = con.prepareStatement(sentence);
			stmt.setString(1,user);
			stmt.setString(2,pass);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				us = rs.getString("username");
			}
			if(us!=""||us!=null) {
				valido = true;
			} else {
				valido = false;
			}
			
		} catch (Exception e) {}
		return valido;
	}
	
	public static String responder(String user, String pass) {
		Connection con;
		Conexion cn = new Conexion();
		
		PreparedStatement stmt;
		ResultSet rs;
		String us = "";
		String sentence = "SELECT CONCAT('Nombre: ',nombre,' ',apellido,' - Telefono: ',telefono,' - Fecha Ingreso: ',fechaIngreso) AS respuesta"
				+ " FROM persona WHERE rut IN (SELECT rut FROM usuario WHERE username = ? AND password = ?)";
		
		try {
			
			con = cn.getConnection();
			stmt = con.prepareStatement(sentence);
			stmt.setString(1,user);
			stmt.setString(2,pass);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				us = rs.getString("respuesta");
			}
			if(us!=""||us!=null) {
				return us;
			} else {
				return us = "";
			}
		} catch (Exception e) {
			return us = "";
		}
	}
}
