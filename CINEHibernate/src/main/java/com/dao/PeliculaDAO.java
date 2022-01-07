package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Pelicula;
import com.general.Metodos;

public class PeliculaDAO implements Metodos{
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	EntityManager em = emf.createEntityManager();
	Pelicula pelicula = null;
	@Override
	public String guardar(Object ob) {
		pelicula =(Pelicula) ob;
		em.getTransaction().begin();
		String resultado = null;
		try {
			em.persist(pelicula);
			em.getTransaction().commit();
			resultado = "1";
			System.out.println("Registro insertado");
		}catch(Exception e) {
			em.getTransaction().rollback();
			resultado = e.getMessage();
			System.out.println("No pud insertarse");
		}
		em.close();
		return resultado;
	}
	@Override
	public String editar(Object ob) {
		pelicula =(Pelicula) ob;
		Pelicula peliculadb = em.find(Pelicula.class, pelicula.getIdpelicula());
		String r = null;
		em.getTransaction().begin();
		try {
			peliculadb.setNombre(pelicula.getNombre());
			peliculadb.setHorario_pases(peliculadb.getHorario_pases());
			peliculadb.setDirector(peliculadb.getDirector());
			peliculadb.setProtagonistas(peliculadb.getProtagonistas());
			peliculadb.setGenero(peliculadb.getGenero());
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
	public String eliminar (int id) {
		String r;
		pelicula = em.find(Pelicula.class, id);
		em.getTransaction().begin();
		try {
			em.remove(pelicula);
			em.getTransaction().commit();
			System.out.println("Se ha eliminado con exito");
			r="1";
		}catch(Exception e) {
			em.getTransaction().rollback();
			System.out.println("No se pudo eliminar");
			r = e.getMessage();
		}
		return r;
	}
	@Override
	public Object buscar (int id) {
		pelicula = em.find(Pelicula.class, id);
		return pelicula;
	}
	@Override 
	public List mostrar() {
		List<Pelicula> ls = em.createQuery("From Pelicula").getResultList();
		return ls;
	}

}
