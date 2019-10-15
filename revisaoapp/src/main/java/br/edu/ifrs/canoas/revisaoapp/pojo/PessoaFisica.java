package br.edu.ifrs.canoas.revisaoapp.pojo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: PessoaFisica
 *
 */
@Entity

public class PessoaFisica implements Serializable {
	private String cpf;
	private String rg;
	private Date dataNascimento;
	private Sexo sexo;
	private Collection<Diaria> diarias;
	
	private static final long serialVersionUID = 1L;

	public PessoaFisica() {
		super();
	}
   
}
