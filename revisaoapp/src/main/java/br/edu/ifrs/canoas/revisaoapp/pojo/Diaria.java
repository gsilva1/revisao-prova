package br.edu.ifrs.canoas.revisaoapp.pojo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Diaria
 *
 */
@Entity

public class Diaria implements Serializable {
	private Date data;
	private Collection<PessoaFisica> hospedes;
	private Quarto quarto;
	
	private static final long serialVersionUID = 1L;

	public Diaria() {
		super();
	}
   
}
