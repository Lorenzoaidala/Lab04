package it.polito.tdp.lab04.model;

import java.util.List;

import it.polito.tdp.lab04.DAO.CorsoDAO;
import it.polito.tdp.lab04.DAO.StudenteDAO;

public class Model {
	CorsoDAO corsoDao = new CorsoDAO();
	StudenteDAO studenteDao = new StudenteDAO();

	public List<Corso> getTuttiICorsi(){
		return corsoDao.getTuttiICorsi();
	}
	public Studente cercaStudente(Integer matricola) {
		return studenteDao.cercaStudente(matricola);
	}
}
