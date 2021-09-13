package ejercicio06;

public class Consultor{
    private int codigo;
    private String nombre;
    private int horasTrabajadas;
    private double tarifaPorHora;
    
    private static int contarConsultor=0;
    private static double acumuladoSueldosNetos=0; 
    public static final double descAFP=0.10;
    public static final double descEPS=0.05;
    
    public Consultor(int codigo, String nombre, int horasTrabajadas, double tarifaPorHora){
    this.codigo = codigo;
    this.nombre = nombre;
    this.horasTrabajadas = horasTrabajadas;
    this.tarifaPorHora = tarifaPorHora;
    contarConsultor++;
    acumuladoSueldosNetos += sueldoNeto();
    }
    
    public Consultor(int codigo, String nombre, int horasTrabajadas){
        this(codigo, nombre, horasTrabajadas, 65);
    }
 
    public Consultor(){
        this(333,"Juan",30);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    public static int getContarConsultor() {
        return contarConsultor;
    }

    public static double getAcumuladoSueldosNetos() {
        return acumuladoSueldosNetos;
    }

    public static double getDescAFP() {
        return descAFP;
    }

    public static double getDescEPS() {
        return descEPS;
    }
    
    public double sueldoBruto(){
        return (horasTrabajadas*tarifaPorHora);
    }
    
    public double descuentoAFP(){
        return sueldoBruto()*descAFP;
    }
    
    public double descuentoEPS(){
        return sueldoBruto()*descEPS;
    }
    
    public double sueldoNeto(){
        return (sueldoBruto()-descuentoAFP()-descuentoEPS());
    }
    
    
}


