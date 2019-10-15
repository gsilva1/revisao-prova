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
 * Entity implementation class for Entity: PessoaFisica
 *
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class PessoaFisica extends Pessoa implements Serializable {	
	private String cpf;
	private String rg;
	private Date dataNascimento;
	private Sexo sexo;
	private Collection<Diaria> diarias;
	
	private static final long serialVersionUID = 1L;
   
}
