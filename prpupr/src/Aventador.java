
public class Aventador extends Coche {
	public Aventador(){
		this.modelo="Aventador";
	}
	private void altaVelocidad(){
		System.out.println("estas en una velocidad de 300km/h");
	}
	protected void velocidadPermitida(){
		System.out.println("usa la volicidad permitida por la ley");
	}
}
