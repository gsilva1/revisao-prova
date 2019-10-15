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
 * Entity implementation class for Entity: Reserva
 *
 */
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Reserva implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Date data;
	private double valor;
	private Pessoa cliente;
	private DiariaReservada diarias;
	
	private static final long serialVersionUID = 1L;


}
