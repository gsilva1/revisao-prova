package br.edu.ifrs.canoas.revisaoapp.pojo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: DiariaAvulsa
 *
 */
@Entity

public class DiariaAvulsa extends Diaria implements Serializable {
	private Pessoa cliente;
	
	private static final long serialVersionUID = 1L;

	public DiariaAvulsa() {
		super();
	}
   
}
