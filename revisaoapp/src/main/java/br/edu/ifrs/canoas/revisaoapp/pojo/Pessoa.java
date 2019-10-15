package br.edu.ifrs.canoas.revisaoapp.pojo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import javax.persistence.*;

import br.edu.ifrs.canoas.revisaoapp.pojo.Diaria.DiariaBuilder;

/**
 * Entity implementation class for Entity: Pessoa
 *
 */
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Pessoa implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	private String telefone;
	private String email;
	private Endereco endereco;
	private Collection<DiariaAvulsa> diariasAvulsas;
	private Collection<Reserva> reservas;
	
	private static final long serialVersionUID = 1L;
   
}
