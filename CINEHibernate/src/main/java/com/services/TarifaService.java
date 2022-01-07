package com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.TarifaDAO;
import com.entity.Tarifa;
import com.general.Status;

@Path ("tarifa")
public class TarifaService {
	
	Tarifa tarifa = null;
	TarifaDAO dao = null;
	
	@Path("mostrar")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Tarifa> mostrar(){
		dao = new TarifaDAO();
		List<Tarifa> list = dao.mostrar();
		System.out.println("datos: " + list);
		return list;
	}
	
	@Path("guardar")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status guardar(Tarifa t){
		System.out.println("Cliente a guardar: " + t);
		Status state  = new Status();
		state.setOb(t);
		
		dao = new TarifaDAO();
		String res = dao.guardar(t);
		
		if(res.equals("1")) {
			state.setMensaje("Guardado exitosamente");
			state.setRespuesta(res);
		}else {
			state.setMensaje("No fue posible guardar");
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
		
		dao = new TarifaDAO();
		String res = dao.eliminar(id);
		
		if(res.equals("1")) {
			state.setMensaje("Eliminado exitosamente");
			state.setRespuesta(res);
		}else {
			state.setMensaje("No fue posible eliminarlo");
			state.setRespuesta(res);
		}
		return state;
	}
	
	@Path("editar")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	
	public Status editar(Tarifa t) {
		Status state = new Status();
		state.setOb(t);
		
		dao = new TarifaDAO();
		String res = dao.editar(t);
		
		if(res.equals("1")) {
			state.setMensaje("Actualizado exitosamente");
			state.setRespuesta(res);
		}else {
			state.setMensaje("No fue posible actualizar este registro");
			state.setRespuesta(res);
		}
		return state;
	}
	
	@Path("buscar-por-id/{id}")
	@GET
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Tarifa buscar(@PathParam("id") int id) {
		dao = new TarifaDAO();
		tarifa = (Tarifa) dao.buscar(id);
		System.out.println("Se encontro el registro");
		return tarifa;
	}
	
	
	
}
