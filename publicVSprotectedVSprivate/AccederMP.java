package publicVSprotectedVSprivate;

public class AccederMP {
	public static void main (String [] args){
	
		
	MetodosPrivate mprivate = new MetodosPrivate();//intentar acceder a los metodos private 
	
	mprivate.encenderLuz();   //da error
	mprivate.apagarLuz();	  //da error
	
	MetodosProtecte protecte = new MetodosProtecte();//intentar acceder a los metodos protected 
	protecte.ponerMusica();
	
	MetodosPublicos publicos = new MetodosPublicos();//intentar acceder a los metodos publicos 
	publicos.cantar();
	}
}
