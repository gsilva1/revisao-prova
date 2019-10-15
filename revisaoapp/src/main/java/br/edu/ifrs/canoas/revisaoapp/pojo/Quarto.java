package br.edu.ifrs.canoas.revisaoapp.pojo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Quarto
 *
 */
@Entity

public class Quarto implements Serializable {
	private String numero;
	
	private static final long serialVersionUID = 1L;

	public Quarto() {
		super();
	}
   
}
