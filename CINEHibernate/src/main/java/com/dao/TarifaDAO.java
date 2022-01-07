package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Tarifa;
import com.general.Metodos;

public class TarifaDAO implements Metodos {
	// carga los objetos (las clases definidas en el persistence)
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	//carga todas las operaciones (insert, update, delete, select, contar, etc)
	EntityManager em = emf.createEntityManager();
	Tarifa tarifa = null;
	@Override
	public String guardar(Object ob) {
		tarifa = (Tarifa) ob;
		em.getTransaction().begin();
		String resultado=null;
		try {
			em.persist(tarifa); //este es el insert
			em.getTransaction().commit();
			resultado ="1";
		System.out.println("Registro insertado");
		}catch(Exception e) {
			em.getTransaction().rollback();
			resultado = e.getMessage();
			System.out.println("No pudo insertarse");
		}
		em.close(); // es importante cerrar el entitymanager para liberar memoria
		return resultado;
	}
	@Override
	public String editar(Object ob) {
		tarifa = (Tarifa) ob;
		Tarifa tarifadb = em.find(Tarifa.class, tarifa.getIdtarifa());
		String r = null;
		em.getTransaction().begin();
		try {
			tarifadb.setDia(tarifadb.getDia());
			tarifadb.setPrecio(tarifadb.getPrecio());
			em.getTransaction().commit();
			System.out.println("Editado correctamente");
			r="1";
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
		tarifa = em.find(Tarifa.class, id);
		em.getTransaction().begin();
		try {
			em.remove(tarifa);
			em.getTransaction().commit();
			System.out.println("Se ha eliminado el registro");
			r = "1";
		}catch(Exception e) {
			em.getTransaction().rollback();
			System.out.println("no se pudo eliminar");
			r = e.getMessage();
		}
		return r;
	}
	@Override
	public Object buscar(int id) {
		tarifa = em.find(Tarifa.class, id);
		return tarifa;
	}
	
	@Override
	public List mostrar() {
		List<Tarifa> ls = em.createQuery("From Tarifa").getResultList();
		return ls;
	}

}
