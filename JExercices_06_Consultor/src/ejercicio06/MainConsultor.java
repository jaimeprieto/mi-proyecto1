package ejercicio06;

public class MainConsultor {
    
    public static void main(String[] args) {
        Consultor c1 = new Consultor(331, "José Luis", 20, 120);
        Consultor c2 = new Consultor(332, "José Gregorio",30);
        Consultor c3 = new Consultor();
        System.out.println("  BIENVENIDO AL SOFTWARE DE CONSULTORES");
        System.out.println("=========================================");
        listado(c1);
        listado(c2);
        listado(c3);
        System.out.println("\n------------------------------------");
        System.out.println(
                "\nCantidad de Consultores: "+Consultor.getContarConsultor()+
                "\nFactor descuento AFP   : "+Consultor.getDescAFP()+
                "\nFactor descuento ARP   : "+Consultor.getDescEPS()+
                "\nAcumulado Sueldos Netos: "+Consultor.getAcumuladoSueldosNetos());
        System.out.println("\n------------------------------------");
    }
    
    public static void listado(Consultor c){
        System.out.println(
                "\nCodigo          : "+c.getCodigo()+
                "\nNombre          : "+c.getNombre()+
                "\nHoras trabajadas: "+c.getHorasTrabajadas()+
                "\nTarifa horaria  : "+c.getTarifaPorHora()+
                "\nSueldo bruto    : "+c.sueldoBruto()+
                "\nDescuento AFP   : "+c.descuentoAFP()+
                "\nDescuento EPS   : "+c.descuentoEPS()+
                "\nSueldo Neto     : "+c.sueldoNeto()
        );
    } 
}
