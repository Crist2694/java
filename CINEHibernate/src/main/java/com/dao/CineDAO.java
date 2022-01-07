package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Cine;
import com.entity.Tarifa;
import com.general.Metodos;

public class CineDAO implements Metodos{
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	EntityManager em = emf.createEntityManager();
	Cine cine = null;
	Tarifa tarifa =null;
	@Override
	public String guardar (Object ob) {
		cine = (Cine) ob;
		tarifa = em.find(Tarifa.class, cine.getTarifa().getIdtarifa());
		em.getTransaction().begin();
		String resultado = null;
		try {
			em.persist(cine);// este es el insert
			em.persist(tarifa);
			em.getTransaction().commit();
			resultado = "1";
			System.out.println("Registro insertado");
		}catch(Exception e) {
			em.getTransaction().rollback();
			resultado = e.getMessage();
			System.out.println("No se pudo guardar");
		}
		em.close();
		return resultado;
	}
	
	@Override
	public String editar(Object ob) {
		cine = (Cine) ob;
		Cine cinedb = em.find(Cine.class, cine.getIdcine());
		Tarifa tarifadb = em.find(Tarifa.class, cine.getTarifa().getIdtarifa());
		
//		System.out.println(tarifadb);
		
		String r  = null;
		em.getTransaction().begin();
		try {
			cinedb.setNombre(cine.getNombre());
			cinedb.setCalle(cine.getCalle());
			cinedb.setNumero(cine.getNumero());
			cinedb.setTarifa(tarifadb);
			em.getTransaction().commit();
			System.out.println("Editado correctamente");
			r = "1";
		}catch(Exception e){
			em.getTransaction().rollback();
			System.out.println("No se pudo editar");
			r = e.getMessage();
		}
		return r;
	}
	@Override
	public String eliminar(int id) {
		String r = null;
		cine = em.find(Cine.class, id);
		em.getTransaction().begin();
		try {
			em.remove(cine);
			em.getTransaction().commit();
			System.out.println("Se ha eliminado el registro");
			r = "1";
		}catch(Exception e) {
			em.getTransaction().rollback();
			System.out.println("No se pudo eliminar el registro");
			r = e.getMessage();
		}
		return r;
	}
	
	@Override
	public Object buscar(int id) {
		cine = em.find(Cine.class, id);
		return cine;
	}
	@Override
	public List mostrar() {
		List<Cine> ls = em.createQuery("From Cine").getResultList();
		return ls;
	}
	
}
