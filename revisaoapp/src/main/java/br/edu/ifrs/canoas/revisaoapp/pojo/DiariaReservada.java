package br.edu.ifrs.canoas.revisaoapp.pojo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: DiariaReservada
 *
 */
@Entity

public class DiariaReservada extends Diaria implements Serializable {
	private Reserva reserva;
	
	private static final long serialVersionUID = 1L;

	public DiariaReservada() {
		super();
	}
   
}
