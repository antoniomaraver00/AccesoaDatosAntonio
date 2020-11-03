package es.studium.practica1;

import java.io.Serializable;

public class ArticuloAcomprar implements Serializable
{

	public static final long serialVersionUID =1L;
		
	//Atributos
	private String descripcion;
	private int cantidad;
	private String unidad;
	
	//Constructor vac�o
	public ArticuloAcomprar() {
		descripcion = "";
		cantidad = 0;
		unidad = "";
	}
	
	//Constructor por par�metros
	public ArticuloAcomprar(String descripcion, int cantidad, String unidad)
	{
		this.descripcion = descripcion;
		this.cantidad =cantidad;
		this.unidad = unidad;
	}
	
	//M�todos get y set cada atributo
	public String getDescripcion()
	{
		return descripcion;
	}
	
	public void setDescripcion(String descripcion)
	{
		this.descripcion = descripcion;
	}
	
	public int getCantidad()
	{
		return cantidad;
	}
	
	public void setCantidad(int cantidad)
	{
		this.cantidad = cantidad;
	}
	
	public String getUnidad()
	{
		return unidad;
	}
	
	public void setUnidad(String unidad)
	{
		this.unidad = unidad;
	}
	
}