package br.edu.ifrs.canoas.revisaoapp.pojo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Endereco
 *
 */
@Entity

public class Endereco implements Serializable {
	private String logradouro;
	private int numero;
	private String complemento;
	private String cep;
	private String bairro;
	private String uf;
	
	private static final long serialVersionUID = 1L;

	public Endereco() {
		super();
	}
   
}
