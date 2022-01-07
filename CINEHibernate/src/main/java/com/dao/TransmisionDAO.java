package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Cine;
import com.entity.Pelicula;
import com.entity.Transmision;
import com.general.Metodos;

public class TransmisionDAO implements Metodos{
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	EntityManager em  = emf.createEntityManager();
	
	Transmision transmision = null;
	Cine cine = null;
	Pelicula pelicula = null;
	@Override
	public String guardar(Object ob) {
		transmision = (Transmision) ob;
		pelicula = em.find(Pelicula.class, transmision.getPelicula().getIdpelicula());
		cine = em.find(Cine.class, transmision.getCine().getIdcine());
		em.getTransaction().begin();
		String resultado = null;
		try {
			em.persist(transmision);
			em.persist(cine);
			em.persist(pelicula);
			em.getTransaction().commit();
			resultado = "1";
			System.out.println("Registro insertado");
		}catch(Exception e) {
			em.getTransaction().rollback();
			resultado = e.getMessage();
			System.out.println("No pudo insertarse");
		}
		em.close();
		return resultado;
	}
	
	@Override 
	public String editar(Object ob) {
		transmision=(Transmision) ob;
		Transmision transmsiondb = em.find(Transmision.class, transmision.getIdtransmision());
		Cine cinedb = em.find(Cine.class, transmision.getCine().getIdcine());
		Pelicula peliculadb = em.find(Pelicula.class, transmision.getPelicula().getIdpelicula());
		
		System.out.println(cinedb);
		System.out.println(peliculadb);
		String r = null;
		em.getTransaction().begin();
		try {
			transmsiondb.setHorario(transmision.getHorario());
			transmsiondb.setSala(transmision.getSala());
		//	transmsiondb.setIdcine(transmsiondb.getIdcine());
			//transmsiondb.setIdpelicula(transmsiondb.getIdpelicula());
			transmsiondb.setCine(cinedb);
			transmsiondb.setPelicula(peliculadb);
			em.getTransaction().commit();
			System.out.println("Editado correctamente");
			r = "1";
		}catch(Exception e) {
			em.getTransaction().rollback();
			System.out.println("No se pudo editar");
			r = e.getMessage();
		}
		return r;
	}
	@Override
	public String eliminar(int id) {
		String r = null;
		transmision =  em.find(Transmision.class, id);
		em.getTransaction().begin();
		try {
			em.remove(transmision);
			em.getTransaction().commit();
			System.out.println("Se ha eliminado el registro");
			r = "1";
		}catch(Exception e) {
			em.getTransaction().rollback();
			System.out.println("No se pudo eliminar");
			r = e.getMessage();
		}
		return r;
	}
	@Override
	public Object buscar (int id) {
		transmision =em.find(Transmision.class, id);
		return transmision;
	}
	@Override
	public List mostrar() {
		List<Transmision> ls = em.createQuery("From Transmision").getResultList();
		return ls;
	}

}
