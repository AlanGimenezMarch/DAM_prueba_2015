
public class Pokemon {

	public static void main(String[] args) {
		
		String frase = "Paco@es@un c1ch4nd4";
		String fraseCodificada ="";
		int mitad = frase.length()/2;
		
		for(int i=0; i<mitad; i++){
			
			if(frase.charAt(i)=='@'){
				
				fraseCodificada = fraseCodificada+" ";
				
			}else{
				
				fraseCodificada = fraseCodificada+frase.charAt(i);
			}	
		}
		
		for(int i=mitad; i<frase.length(); i++){
			
			if(frase.charAt(i)=='1'){
				
				fraseCodificada = fraseCodificada+"a";
		
			}else if(frase.charAt(i)=='4'){
				
				fraseCodificada = fraseCodificada+"o";
				
			}else{
				
				fraseCodificada = fraseCodificada+frase.charAt(i);
			}	
		}
		System.out.println(fraseCodificada);
	}
}