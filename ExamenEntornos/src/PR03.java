public class PR03 {

	public static void main(String[] args) {
		//declaramos variables
		String mensaje = "APUQTI OSEE  LIT OAM SUGPA OUQ EOCONCZO";
		String mensajeCodificado = "";
		String temporal = "";
		//convertimos mensaje a minusculas y lo guardamos en mensajeCodificado
		mensajeCodificado = mensaje.toLowerCase();
		//recorremos los car�cteres de mensajeCodificado
		for(int i=0; i<mensajeCodificado.length(); i++){
			//si i+1 es igual a la longitud de mensajeCodificado
			if(i+1 == mensajeCodificado.length()){
				//temporal es igual a temporal + car�cter en la posici�n i de mensajeCodificado
				temporal = temporal + mensajeCodificado.charAt(i);
			//si no	
			}else{
				//temporal es igual a temporal + car�cter en la posici�n i+1 de en la posici�n i + car�cter en la posici�n i de mensajeCodificado
				temporal = temporal + mensajeCodificado.charAt(i+1) + mensajeCodificado.charAt(i);
				
			}
			//sumamos 1 a la i
			i=i+1;
		}
		
		mensajeCodificado =	temporal;
		//Imprime por pantalla el mensaje codificado
		System.out.println(mensajeCodificado);
		
	}

}