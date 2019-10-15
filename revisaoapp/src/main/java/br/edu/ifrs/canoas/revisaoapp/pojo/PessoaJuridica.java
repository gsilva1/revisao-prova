package br.edu.ifrs.canoas.revisaoapp.pojo;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
/**
 * Entity implementation class for Entity: PessoaJuridica
 *
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class PessoaJuridica extends Pessoa implements Serializable {
	private String razaoSocial;
	private String cnpj;
	private String inscricaoEstadual;
	private String inscricaoMunicipal;
	
	private static final long serialVersionUID = 1L;
   
}
