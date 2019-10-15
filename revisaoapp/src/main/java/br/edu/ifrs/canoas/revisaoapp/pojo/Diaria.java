package br.edu.ifrs.canoas.revisaoapp.pojo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.*;

import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;

/**
 * Entity implementation class for Entity: Diaria
 *
 */
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Diaria implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Date data;
	private Collection<PessoaFisica> hospedes;
	private Quarto quarto;
	
	private static final long serialVersionUID = 1L;


   
}
