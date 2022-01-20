package n1Exercici1.N1Exercici1;

public class vehicle {
    //atributos
    private int velocidad;
    private int combustible;

    public vehicle(int velocidad, int combustible) {
        this.velocidad = velocidad;
        this.combustible = combustible;
    }

    public void iniciar(){
        this.velocidad = 0;
        System.out.println("Verifique si tiene combustible, antes de arrancar");
    }


}