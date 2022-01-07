package com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.TransmisionDAO;
import com.entity.Transmision;
import com.general.Status;

import oracle.net.aso.s;

@Path("transmision")
public class TransmisionService {
	
	Transmision transmision= null;
	TransmisionDAO dao = null;
	
	@Path("mostrar")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Transmision> mostrar(){
		dao = new TransmisionDAO();
		List<Transmision> list  = dao.mostrar();
		System.out.println("datos: " +list);
		return list;
	}
	
	@Path("guardar")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status guardar(Transmision t) {
		System.out.println("Transmision a guardar: " + t);
		Status state  = new Status();
		state.setOb(t);
		
		dao = new TransmisionDAO();
		String res = dao.guardar(t);
		
		if (res.equals("1")) {
			state.setMensaje("Guardado con exito");
			state.setRespuesta(res);
		}else {
			state.setMensaje("No se pudo guardar");
			state.setRespuesta(res);
		}
		return state;
	}
	
	@Path("eliminar/{id}")
	@GET
	@Consumes({MediaType.APPLICATION_JSON})
	public Status eliminar(@PathParam("id") int id) {
		Status state = new Status();
		state.setOb(id);
		
		dao = new TransmisionDAO();
		String res = dao.eliminar(id);
		
		if (res.equals("1")) {
			state.setMensaje("Eliminado con exito");
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
	public Status editar(Transmision t) {
		Status state = new Status();
		state.setOb(t);
		
		dao = new TransmisionDAO();
		String res = dao.editar(t);
		
		if (res.equals("1")) {
			state.setMensaje("Actualizado exitosamente");
			state.setRespuesta(res);
		}else {
			state.setMensaje("No se pudo actualizar");
			state.setRespuesta(res);
		}
		return state;
	}
	
	@Path("buscar-por-id/{id}")
	@GET
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Transmision buscar(@PathParam("id") int id) {
		dao = new TransmisionDAO();
		transmision = (Transmision) dao.buscar(id);
		System.out.println("Se encontro el registro");
		return transmision;
	}
	

}
