
public class Coche {
	String marca;
	String modelo;
	int numeroDePuertas;
	boolean encendido=false;
	private String codigoMotor;
	protected double peso;
	
	public Coche(){
		this.marca = "lamborghini";
		this.numeroDePuertas = 2;
		this.peso = 229.5;
	}
	protected double obtenerPeso(){
		return this.peso;
	}
	public void encender(){
		this.encendido=true;
		System.out.println("el lamborghini esta encendido");
	}
	public void apagar(){
		System.out.println("el lamborghini esta apagado");
	}
	protected void estado(){
		if(this.encendido == true){
			System.out.println("el lamborghini esta encendido");
		}
		else
			System.out.println("el aventador esta apagado");
	}
	private void chochar(){
		System.out.println("has estrellado el coche T.T");
	}
	protected void encenderLuz(){
		System.out.println("la luz esta encendida");
	}
}

