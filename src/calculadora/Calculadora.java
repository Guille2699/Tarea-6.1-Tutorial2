
package calculadora;

/**
 *
 * @author Guillermo Jarana
 */
public class Calculadora {
    // clase con constructor pasando dos numeros reales, setters , getters y métodos para devolver el resultado de sumar, restar , multiplicar y dividir
    private String nombre;
    private double numero1, numero2;

    public Calculadora(double numero1, double numero2){
        this.numero1=numero1;
        this.numero2=numero2;
    }

    public Calculadora(String nombre, double numero1, double numero2) {
        this.nombre = nombre;
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Calculadora() {
    }

    // sets and gets

    public void setNumero1(double numero1) {
        this.numero1=numero1;
    }
    public void setNumero2(double numero2) {
        this.numero2=numero2;
    }

    public double getNumero1(){
        return numero1;
    }
    public double getNumero2(){
        return numero2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        //métodos

    public double suma() {
        double suma=numero1+numero2;
        return suma;
    }

    public double resta() {
        double resta=numero1-numero2;
        return resta;
    }
      public double multiplicacion(){
        double multiplicacion=numero1*numero2;
        return multiplicacion;
    }
}
