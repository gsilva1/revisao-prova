package br.edu.ifrs.canoas.revisaoapp.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Reserva
 *
 */
@Entity

public class Reserva implements Serializable {
	private Date data;
	private double valor;
	private Pessoa cliente;
	private DiariaReservada diarias;
	
	private static final long serialVersionUID = 1L;

	public Reserva() {
		super();
	}
   
}
