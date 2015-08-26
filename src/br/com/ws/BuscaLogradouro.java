package br.com.ws;

import javax.swing.JOptionPane;

/*
 * BuscaLogradouro.jav
 * a
 *
 * Criado em 4 de Junho de 2007, 10:27 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author Julio Leme
 */
public class BuscaLogradouro {

	public static void main(String[] args) {
		new BuscaLogradouro();
	}

	public BuscaLogradouro() {
		try {
			String cep = JOptionPane.showInputDialog(null, "Digite o CEP:");
			CepWebService cepWebService = new CepWebService(cep);
			if (cepWebService.getResultado() == 1) {
				StringBuilder sb = new StringBuilder();
				sb.append(cepWebService.getTipo_logradouro() + " "	+ cepWebService.getLogradouro() +"\n");
				sb.append(cepWebService.getCidade()+"\n");
				sb.append(cepWebService.getBairro());
				
				JOptionPane.showMessageDialog(null, sb.toString());
				
			} else {
				System.out.println("Servidor não está respondendo.");
			}

			/*
			 * String cep = "01226030";
			 * 
			 * 
			 * CepWebService cepWebService = new CepWebService(cep);
			 * 
			 * if (cepWebService.getResultado()==1) {
			 * System.out.println(cepWebService.getTipo_logradouro() + " " +
			 * cepWebService.getLogradouro());
			 * System.out.println(cepWebService.getCidade());
			 * System.out.println(cepWebService.getBairro());
			 * System.out.println(cepWebService.getResultado());
			 * System.out.println(cepWebService.getResultado_txt()); } else {
			 * System.out.println("Servidor não está respondendo."); }
			 */} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
