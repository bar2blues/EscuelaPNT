package principal;

public class funciones {
	
	public static Producto[] carga_productos() {
		Producto[] losProductos = new Producto[4];
		   
	       losProductos[0] = new Producto("Coca Cola Zero", "Litros: 1.5", 20);
	       losProductos[1] = new Producto("Coca Cola", "Litros: 1.5", 18);
	       losProductos[2] = new Producto(" Shampoo Sedal", "Contenido: 500mm",30);
	       losProductos[3] = new Producto("Frutillas", "Unidad de venta: por kilo", 64);
	       
	       for(int i= 0; i < losProductos.length -1; i++)
	       {
	       System.out.println("Nombre: " + losProductos[i].GetNombre() +" /// " + losProductos[i].GetTipoCapacidad() 
	    		               + " /// " + " Precio: $" + losProductos[i].GetPrecio());
	       }
	       System.out.println("Nombre: " + losProductos[3].GetNombre() + " /// " + " Precio: $" + losProductos[3].GetPrecio()
	    		              +" /// " + losProductos[3].GetTipoCapacidad());
	       System.out.println("==============================");
	       
	       return losProductos;
	       

	}
	
	public static void max_min(Producto[] losProductos){
		int max, min;
		String prodMin, prodMax;

		min=max=losProductos[0].GetPrecio();
		prodMin=prodMax=losProductos[0].GetNombre();

		for(int i = 0; i < losProductos.length; i++)
		{
			if(min>losProductos[i].GetPrecio())
			{
				min=losProductos[i].GetPrecio();
				prodMin=losProductos[i].GetNombre();
			}
			
			if(max<losProductos[i].GetPrecio())
			{
				max=losProductos[i].GetPrecio();
				prodMax=losProductos[i].GetNombre();
			}
		} 	
		System.out.println("Producto más caro: " + prodMax );
		System.out.println("Producto más barato: " + prodMin);
	}

	

}
