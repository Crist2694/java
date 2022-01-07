package com.services;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.PeliculaDAO;
import com.entity.Pelicula;
import com.general.Status;

@Path("pelicula")
public class PeliculaService {

	Pelicula pelicula = null;
	PeliculaDAO dao = null;
	
	@Path("mostrar")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Pelicula> mostrar(){
		dao = new PeliculaDAO();
		List<Pelicula> list = dao.mostrar();
		System.out.println("datos: " + list);
		return list;
	}
	
	@Path("guardar")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status guardar(Pelicula p) {
		System.out.println("Cliente a guardar: " + p);
		Status state =new Status();
		state.setOb(p);
		
		dao = new PeliculaDAO();
		String res = dao.guardar(p);
		
		if(res.equals("1")) {
			state.setMensaje("Guardado exitosamente");
			state.setRespuesta(res);
		}else {
			state.setMensaje("No se pudo guardar");
			state.setRespuesta(res);
		}
		return state;
	}
	
	@Path("eliminar/{id}")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Status eliminar(@PathParam("id") int id) {
		Status state = new Status();
		state.setOb(id);
		
		dao = new PeliculaDAO();
		String res = dao.eliminar(id);
		
		if(res.equals("1")) {
			state.setMensaje("Eliminado exitosamente");
			state.setRespuesta(res);
		}else {
			state.setMensaje("No se pudo eliminar");
			state.setRespuesta(res);
		}
		return state;
	}
	
	@Path("editar")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status editar(Pelicula p) {
		Status state = new Status();
		state.setOb(p);
		
		dao = new PeliculaDAO();
		String res = dao.editar(p);
		
		if (res.equals("1")) {
			state.setMensaje("Editado exitosamente");
			state.setRespuesta(res);
		}
		else {
			state.setMensaje("No se pudo actualizar");
			state.setRespuesta(res);
		}
		return state;
	}
	
	@Path("buscar-por-id/{id}")
	@GET
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Pelicula buscar(@PathParam("id") int id) {
		dao = new PeliculaDAO();
		pelicula = (Pelicula) dao.buscar(id);
		System.out.println("Se encontro el registro");
		return pelicula;
	}

}
