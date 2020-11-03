package es.studium.practica1;

public class Main {

	public static void main(String[] args)
	{
		//Creamos los artículos
		ArticuloAcomprar art1 = new ArticuloAcomprar("Coca cola", 2, "L");
		ArticuloAcomprar art2 = new ArticuloAcomprar("Fideos", 1, "Kg");
		ArticuloAcomprar art3 = new ArticuloAcomprar("Zumo de Naranja", 3, "L");
		ArticuloAcomprar art4 = new ArticuloAcomprar("Pechuga de Pollo", 2, "Kg");
		ArticuloAcomprar art5 = new ArticuloAcomprar("Agua Garrafa", 5, "L");
		ArticuloAcomprar art6 = new ArticuloAcomprar("Azucar", 1, "Kg");
		
		
		//Creamos las listas de la compra
		ListaDeLaCompra lista1 = new ListaDeLaCompra("SuperSur");
		ListaDeLaCompra lista2 = new ListaDeLaCompra("Dia");
		ListaDeLaCompra lista3 = new ListaDeLaCompra("Carrefour");
		
		//Agregamos los articulos a la lista
		
		lista2.agregarProductoAComprar(art6);
		lista2.agregarProductoAComprar(art5);
		lista2.agregarProductoAComprar(art4);
		lista2.agregarProductoAComprar(art3);
		
		lista3.agregarProductoAComprar(art2);
		lista3.agregarProductoAComprar(art1);
		
		//Mostramos las listas por consola
		System.out.println("Se han creado 3 listas de la compra:" + "\n");
		System.out.println("La lista de la compra llamada " + lista1.getNombreLista() + ", contiene:");
		
		for (ArticuloAcomprar articulo : lista1.getArticulos())
		{
			System.out.println(articulo.getDescripcion()+" - "
								+articulo.getCantidad()+" - "
								+articulo.getUnidad());
		}
		
		System.out.println("\nLa segunda lista de la compra llamada " + lista2.getNombreLista() + ", contiene:");
		
		for (ArticuloAcomprar articulo : lista2.getArticulos())
		{
			System.out.println(articulo.getDescripcion()+" - "
								+articulo.getCantidad()+" - "
								+articulo.getUnidad());
		}
		
		System.out.println("\nLa segunda lista de la compra llamada " + lista3.getNombreLista() + ", contiene:");
		
		for (ArticuloAcomprar articulo : lista3.getArticulos())
		{
			System.out.println(articulo.getDescripcion()+" - "
								+articulo.getCantidad()+" - "
								+articulo.getUnidad());
		}
		
		
		//Guardamos las 3 listas en los ficheros con sus propios nombres
		System.out.println("\nLa tres listas de la compra se han guardado correctamente.");
		lista1.almacenarListaCompra();
		lista2.almacenarListaCompra();
		lista3.almacenarListaCompra();
		
		//Recuperamos las listas de la compra leyendo de los ficheros que se han creado
		System.out.println("\nRecuperamos la primera lista de la compra para modificarla:");
		
		ListaDeLaCompra listaRecuperada = ListaDeLaCompra.recuperarListaDeLaCompra("Supersur");
		
		for (ArticuloAcomprar articulo : listaRecuperada.getArticulos())
		{
			System.out.println(articulo.getDescripcion()+" - "
					+articulo.getCantidad()+" - "
					+articulo.getUnidad());
		}
		
		System.out.println("\nEliminamos la 'Azucar' de la primera lista.");
		listaRecuperada.eliminarArticulo("Azucar");
		
		System.out.println("\nAsí ha quedado la lista:");
		for (ArticuloAcomprar articulo : listaRecuperada.getArticulos())
		{
			System.out.println(articulo.getDescripcion()+" - "
					+articulo.getCantidad()+" - "
					+articulo.getUnidad());
		}
		
		
		//Lista 2
		System.out.println("\nRecuperamos la segunda lista de la compra para modificarla:");
		
		ListaDeLaCompra listaRecuperada2 = ListaDeLaCompra.recuperarListaDeLaCompra("Dia");
		
		for (ArticuloAcomprar articulo : listaRecuperada2.getArticulos())
		{
			System.out.println(articulo.getDescripcion()+" - "
					+articulo.getCantidad()+" - "
					+articulo.getUnidad());
		}
		
		System.out.println("\nEliminamos la 'Pechuga de Pollo' de la segunda lista de la compra");
		listaRecuperada2.eliminarArticulo("Pechuga de Pollo");
		
		System.out.println("\nAsí ha quedado la lista:");
		for (ArticuloAcomprar articulo : listaRecuperada2.getArticulos())
		{
			System.out.println(articulo.getDescripcion()+" - "
					+articulo.getCantidad()+" - "
					+articulo.getUnidad());
		}
		
		//Lista 3
				System.out.println("\nRecuperamos la tercera lista de la compra para modificarla:");
				
				ListaDeLaCompra listaRecuperada3 = ListaDeLaCompra.recuperarListaDeLaCompra("Carrefour");
				
				for (ArticuloAcomprar articulo : listaRecuperada3.getArticulos())
				{
					System.out.println(articulo.getDescripcion()+" - "
							+articulo.getCantidad()+" - "
							+articulo.getUnidad());
				}
				
				System.out.println("\nEliminamos el 'Zumo de Naranja' de la tercera lista de la compra");
				listaRecuperada3.eliminarArticulo("Zumo de Naranja");
				
				System.out.println("\nAsí ha quedado la lista:");
				for (ArticuloAcomprar articulo : listaRecuperada3.getArticulos())
				{
					System.out.println(articulo.getDescripcion()+" - "
							+articulo.getCantidad()+" - "
							+articulo.getUnidad());
				}
	}
}
