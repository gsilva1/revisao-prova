package br.edu.ifrs.canoas.revisaoapp.pojo;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Pessoa
 *
 */
@Entity

public class Pessoa implements Serializable {
	private String nome;
	private String telefone;
	private String email;
	private Endereco endereco;
	private Collection<DiariaAvulsa> diariasAvulsas;
	private Collection<Reserva> reservas;
	
	private static final long serialVersionUID = 1L;

	public Pessoa() {
		super();
	}
   
}
