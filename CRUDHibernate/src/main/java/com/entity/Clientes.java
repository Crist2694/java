package com.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name="CLIENTES")
public class Clientes {
	public Clientes() {}
	public Clientes(int id) {
		this.clienteID=id;
	}
		
	@Id
	@GeneratedValue (strategy=GenerationType.SEQUENCE, generator ="cid_auto")
	@SequenceGenerator(name="cid_auto", sequenceName="CLIENTE_SEQ")
	@Column(name="CLIENTE_ID", columnDefinition="NUMBER")
	int clienteID;
	
	@Column(name="NOMBRE", columnDefinition="NVARCHAR2(15)")
	String nombre;
	@Column(name="DIRECCION", columnDefinition="NVARCHAR2(40)")
	String direccion;
	@Column (name="INE", columnDefinition="NVARCHAR2(10)")
	String ine;
	@Column (name="TELEFONO", columnDefinition="NVARCHAR2(10)")
	String telefono;
	
	//Getters && setters
	
	public int getClienteID() {
		return clienteID;
	}
	public void setClienteID(int clienteID) {
		this.clienteID = clienteID;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getIne() {
		return ine;
	}
	public void setIne(String ine) {
		this.ine = ine;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	

}
