public class Usuario {
	private String nombre;
    	private int saldo;
    	private int cedula;
    	private int contrasena;
    	private int edad;
	private cantHijos;
	public Usuario(){
		this.saldo = 0;
	}
	public void setNombre(String unNombre){
        	nombre = unNombre;
   	}
    	public String getNombre(){
        	return nombre;
    	}	
	
	public void setSaldo(int unSaldo){
		saldo = unSaldo;
	}
	
	public int getSaldo(){
		return saldo;
	}
	
	public void setCedula(int unaCedula){
		cedula = unaCedula;
	}
	public int getCedula(){
		return cedula;
	}
	
	public void setEdad(int unaEdad){
		edad = unaEdad;
	}
	public int getEdad(){
		return edad;
	}
	
	public void setContrasena(int unaContra){
		contrasena = unaContra;
	}
	public int getContrasena(){
		return contrasena;
	}
	
	public void setHijos(int unHijo){
			cantHijos = unHijo;
	}
	public int getCantHijos(){
		return cantHijos;
	}
	@Override
	public boolean equals(Object o){
		if(this.getCedula()==o.getCedula){
			return true;
		}
		else
		}
			return false;
		}
	}
}