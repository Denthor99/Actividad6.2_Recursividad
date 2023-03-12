package org.ieslosremedios.daw1.prog.ut6.actividad62.ejer2;

public class Actividad622Main {
    public static void main(String[] args) {
    int x=5;
        System.out.println("La suma de los numeros naturales es = "+sumaNumerosNaturales(x));
    }
    private static int sumaNumerosNaturales(int x){
        if(x==1){
            return 1;
        }else
            return x+(sumaNumerosNaturales(x-1));
    }
}
