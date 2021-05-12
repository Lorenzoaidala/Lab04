package it.polito.tdp.lab04.DAO;

import java.sql.*;

import it.polito.tdp.lab04.model.Studente;

public class StudenteDAO {

	public Studente cercaStudente(Integer matricola) {
		String sql ="SELECT * FROM studente WHERE matricola=?";
		try {
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			st.setInt(1, matricola);
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				Studente s = new Studente(rs.getInt("matricola"), rs.getString("nome"), rs.getString("cognome"), rs.getString("CDS"));
				conn.close();
				return s;
			}
			else {
				conn.close();
				return null;
			}
		} catch(SQLException e) {
			throw new RuntimeException();
		}
	}
}
