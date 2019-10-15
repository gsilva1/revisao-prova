package br.edu.ifrs.canoas.revisaoapp.pojo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: PessoaJuridica
 *
 */
@Entity

public class PessoaJuridica extends Pessoa implements Serializable {
	private String razaoSocial;
	private String cnpj;
	private String inscricaoEstadual;
	private String inscricaoMunicipal;
	
	private static final long serialVersionUID = 1L;

	public PessoaJuridica() {
		super();
	}
   
}
