package br.edu.ifrs.canoas.revisaoapp.dao;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;

import org.junit.Test;

import br.edu.ifrs.canoas.revisaoapp.pojo.Reserva;
import br.edu.ifrs.canoas.revisaoapp.util.EntityManagerUtil;

public class CreateTablesTest {
	EntityManager em = EntityManagerUtil.getEM();
	
	@Test
	public void test() {
		Reserva reserva = new Reserva();
		reserva.setValor(10);
		em.getTransaction().begin();
		em.persist(reserva);
		em.getTransaction().commit();
		em.close();
	}

}
