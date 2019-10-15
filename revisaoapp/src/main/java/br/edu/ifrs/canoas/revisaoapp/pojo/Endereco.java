package br.edu.ifrs.canoas.revisaoapp.pojo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.*;

import br.edu.ifrs.canoas.revisaoapp.pojo.Diaria.DiariaBuilder;
import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
/**
 * Entity implementation class for Entity: Endereco
 *
 */
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Endereco implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String logradouro;
	private int numero;
	private String complemento;
	private String cep;
	private String bairro;
	private String uf;
	
	private static final long serialVersionUID = 1L;
   
}
