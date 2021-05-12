package it.polito.tdp.lab04;

import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

import it.polito.tdp.lab04.model.Corso;
import it.polito.tdp.lab04.model.Model;
import it.polito.tdp.lab04.model.Studente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	private Model model;
	//List<Corso> corsi;

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private ComboBox<Corso> ElencoCorsi;

	@FXML
	private Button btnCercaIscrittiCorso;

	@FXML
	private TextField txtMatricola;

	@FXML
	private Button btnCompleta;

	@FXML
	private TextField txtNome;

	@FXML
	private TextField txtCognome;

	@FXML
	private Button btnCercaCorsi;

	@FXML
	private Button btnIscrivi;

	@FXML
	private TextArea txtRisultato;

	@FXML
	private Button btnReset;

	@FXML
	void doCercaCorsi(ActionEvent event) {

	}

	@FXML
	void doCercaIscrittiCorso(ActionEvent event) {

	}

	@FXML
	void doCompleta(ActionEvent event) {
		txtNome.clear();
		txtCognome.clear();
		txtRisultato.clear();
		String txtmatricola = txtMatricola.getText();
		try {
			Integer matricola = Integer.parseInt(txtmatricola);
			Studente s = model.cercaStudente(matricola);
			if(s==null) {
				txtRisultato.setText("Studente non trovato o non esistente");
				return;
			} else {
				txtNome.setText(s.getNome());
				txtCognome.setText(s.getCognome());
				return;
			}
		} catch(NumberFormatException nfe) {
			txtRisultato.setText("Inserire una matricola valida");
		}
		
	}

	@FXML
	void doIscrivi(ActionEvent event) {

	}

	@FXML
	void doReset(ActionEvent event) {

	}
	/*public void setComboBox() {
		corsi = model.getTuttiICorsi();
		Collections.sort(corsi);
		ElencoCorsi.getItems().addAll(corsi);
	}*/

	@FXML
	void initialize() {
		assert ElencoCorsi != null : "fx:id=\"ElencoCorsi\" was not injected: check your FXML file 'Scene.fxml'.";
		assert btnCercaIscrittiCorso != null : "fx:id=\"btnCercaIscrittiCorso\" was not injected: check your FXML file 'Scene.fxml'.";
		assert txtMatricola != null : "fx:id=\"txtMatricola\" was not injected: check your FXML file 'Scene.fxml'.";
		assert btnCompleta != null : "fx:id=\"btnCompleta\" was not injected: check your FXML file 'Scene.fxml'.";
		assert txtNome != null : "fx:id=\"txtNome\" was not injected: check your FXML file 'Scene.fxml'.";
		assert txtCognome != null : "fx:id=\"txtCognome\" was not injected: check your FXML file 'Scene.fxml'.";
		assert btnCercaCorsi != null : "fx:id=\"btnCercaCorsi\" was not injected: check your FXML file 'Scene.fxml'.";
		assert btnIscrivi != null : "fx:id=\"btnIscrivi\" was not injected: check your FXML file 'Scene.fxml'.";
		assert txtRisultato != null : "fx:id=\"txtRisultato\" was not injected: check your FXML file 'Scene.fxml'.";
		assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

	}
	public void setModel(Model model) {
		this.model = model;
		ElencoCorsi.getItems().addAll(this.model.getTuttiICorsi());
	}
}
