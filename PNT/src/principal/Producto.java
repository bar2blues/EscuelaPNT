package principal;

public class Producto {
	private String  Nombre;
	private String TipoCapacidad;
	private int Precio;
	

	public Producto(String Nombre,String TipoCapacidad, int Precio )
	{
		this.Nombre = Nombre;
		this.TipoCapacidad = TipoCapacidad;
		this.Precio = Precio;
	}
	
	public void SetNombre(String Nombre)
	{
		this.Nombre = Nombre ;
	}

	public void SetTipoCapacidad(String TipoCapacidad)
	{
		this.TipoCapacidad = TipoCapacidad;
	}
	
	public void SetPrecio(int Precio)
	{
		this.Precio = Precio;
	}
	
	public String GetNombre()
	{
		return this.Nombre;
	}
	
	public String GetTipoCapacidad()
	{
		return this.TipoCapacidad;
	}
	
	public int GetPrecio()
	{
		return this.Precio;
	}



}
