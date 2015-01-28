
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aventador aventador = new Aventador();
		
		//acceder a publico
		aventador.apagar();
		aventador.encender();
		
		//acceder a privado
	//	aventador.chochar;//no complila por que es private en la clase Coche
	//	aventador.altavelocidad;no complila por que es private en la clase Aventador
		
		//acceder a protected
		aventador.encenderLuz();
		aventador.velocidadPermitida();
		
		
		
		//acceder a publico
		aventador.estado();
	}

}
