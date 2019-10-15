package br.edu.ifrs.canoas.revisaoapp.pojo;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
/**
 * Entity implementation class for Entity: DiariaReservada
 *
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class DiariaReservada extends Diaria implements Serializable {
	
	
	private Reserva reserva;
	
	private static final long serialVersionUID = 1L;

   
}
