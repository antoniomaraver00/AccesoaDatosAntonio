package es.studium.practica1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ListaDeLaCompra implements Serializable
{

	public static final long serialVersionUID = 1L; 
	
	/*Atributos*/
	private String nombreLista;
	private ArrayList<ArticuloAcomprar> listaCompra = new ArrayList<ArticuloAcomprar>();
	
	/*Constructor vacío*/
	public ListaDeLaCompra() {
		nombreLista = "";
	}
	/*Constructor por parámetros*/
	public ListaDeLaCompra(String nombreLista)
	{
		this.nombreLista = nombreLista;
	}
	/*Métodos get y set del atributo nombreLista*/
	public String getNombreLista()
	{
		return nombreLista;
	}
	public void setNombreLista(String nombreLista)
	{
		this.nombreLista = nombreLista;
	}
	/*Métodos*/
	public void agregarProductoAComprar(ArticuloAcomprar articulo) {
		listaCompra.add(articulo);
	}

	public void eliminarArticulo(String descripcionArticulo)
	{
		for (int i = 0; i< listaCompra.size(); i++)
			eliminaSicoinciden(descripcionArticulo,listaCompra.get(i));
	}
	private void eliminaSicoinciden(String descripcionArticulo, ArticuloAcomprar articulo)
	{
		if (articulo.getDescripcion().contentEquals(descripcionArticulo))
			listaCompra.remove(articulo);
	}
	
	public List<ArticuloAcomprar> getArticulos() {
		return listaCompra;
	}
	
	public void almacenarListaCompra() {
		try {
			File archivoAlmacenar = new File(".\\" + nombreLista + ".dat");
			FileOutputStream fos = new FileOutputStream(archivoAlmacenar);
			ObjectOutputStream salida = new ObjectOutputStream(fos);
			
			salida.writeObject(this);
			
			salida.close();
			fos.close();
		}catch(Exception e) {
			e.getStackTrace();
			e.getMessage();
			System.out.println("Ha ocurrido un error");
		}
		
	}
	public static ListaDeLaCompra recuperarListaDeLaCompra(String archivo) {
		ListaDeLaCompra listaRecuperada = new ListaDeLaCompra(archivo);
		try {
			File archivoRecuperar = new File(".\\" + archivo + ".dat");
			FileInputStream fis = new FileInputStream(archivoRecuperar);
			ObjectInputStream entrada = new ObjectInputStream(fis);
			
			listaRecuperada = (ListaDeLaCompra) entrada.readObject();
			
			entrada.close();
			fis.close();
		}catch(Exception e) {
			e.getStackTrace();
			e.getMessage();
			System.out.println("Ha ocurrido un error");
			
		}
		return listaRecuperada;
	}
}
