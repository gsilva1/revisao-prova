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
 * Entity implementation class for Entity: Quarto
 *
 */
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Quarto implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String numero;
	
	private static final long serialVersionUID = 1L;
   
}
