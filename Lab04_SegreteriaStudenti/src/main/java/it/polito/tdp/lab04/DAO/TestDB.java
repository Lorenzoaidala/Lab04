package it.polito.tdp.lab04.DAO;

import it.polito.tdp.lab04.model.Corso;
import it.polito.tdp.lab04.model.Studente;

public class TestDB {

	public static void main(String[] args) {

		/*
		 * 	This is a main to check the DB connection
		 */
		
		CorsoDAO cdao = new CorsoDAO();
		//cdao.getTuttiICorsi();
		
		StudenteDAO dao = new StudenteDAO();
		Studente s =dao.cercaStudente(177725);
		System.out.println(s);
		
		Corso c = new Corso("01KSUPG" ,8, "Gestione dell' innovazione e sviluppo prodotto", 2);
		System.out.println(cdao.getStudentiIscrittiAlCorso(c));
	}

}
