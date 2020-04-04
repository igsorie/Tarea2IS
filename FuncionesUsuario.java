public class funcionesUsuario {

    public float retornarImpuestos(Usuario usuario){
        float descuento = 0;
        if (usuario.edad < 18)
	{
            descuento = 0;
        } else if (usuario.edad() > 18 && usuario.edad() < 30)
	{
            descuento = 2000;
        } else if (usuario.edad() > 30 && usuario.edad() < 65)
	{
            descuento = 7000;
        } else 
	{
            descuento = 2000;
        }
	int cantidad= usuario.cantHijos();
	if((cantidad*3) > 50)
	{
		descuento = descuento - (descuento * 0.50);	
	}
	else
	{
        	descuento = descuento - (descuento * (0.03 * cantidad);
    	}
	return descuento+usuario.servicio;
   }

		
}