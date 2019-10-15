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
import lombok.experimental.SuperBuilder;
import lombok.EqualsAndHashCode;
/**
 * Entity implementation class for Entity: DiariaAvulsa
 *
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class DiariaAvulsa extends Diaria implements Serializable {
	private Pessoa cliente;
	
	private static final long serialVersionUID = 1L;

}
