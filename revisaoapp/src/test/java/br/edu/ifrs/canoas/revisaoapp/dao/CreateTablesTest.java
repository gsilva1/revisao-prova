package br.edu.ifrs.canoas.revisaoapp.dao;

import static org.assertj.core.api.Assertions.assertThat;

import javax.persistence.EntityManager;

import org.junit.Test;

import br.edu.ifrs.canoas.revisaoapp.pojo.Pessoa;
import br.edu.ifrs.canoas.revisaoapp.util.EntityManagerUtil;

public class CreateTablesTest {
	private EntityManager em;
	
	@Test
	public void test() {
		em = EntityManagerUtil.getEM();
		Pessoa pessoa = new Pessoa();
		pessoa.setEmail("email@email.com");
		em.getTransaction().begin();
		em.persist(pessoa);
		em.getTransaction().commit();
		em.close();
		assertThat(pessoa.getEmail()).isEqualTo("email@email.com");
	}

}
