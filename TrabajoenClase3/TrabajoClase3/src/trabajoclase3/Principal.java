package trabajoclase3;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Trabajador t = new Trabajador();

        System.out.println("Número de nombres del trabajador 1 o 2");
        int numero_nombres = scanner.nextInt();
        scanner.nextLine();

        if (numero_nombres == 1) {
            System.out.println("Ingrese el nombre del trabajador");
            String nombre = scanner.nextLine();
            t.agregar_nombres(nombre);
        } else {
            System.out.println("Ingrese el nombre uno del trabajador");
            String nombre1 = scanner.nextLine();
            System.out.println("Ingrese el nombre dos del trabajador");
            String nombre2 = scanner.nextLine();
            t.agregar_nombres(nombre1, nombre2);

        }

        System.out.println("Ingrese el apellido del trabajador");
        String apellidos = scanner.nextLine();
        t.agregar_apellidos(apellidos);

        System.out.println("Ingrese 1 si desea agregar sueldo por semana y 2 para agregar sueldo por mes");
        int respuesta = scanner.nextInt();

//METODO IF
        
                if (respuesta == 1) {
                    System.out.println("Ingrese el sueldo de la 1era semana trabajador");
                    double s1 = scanner.nextDouble();
              
                    
                    System.out.println("Ingrese el sueldo de la 2da semana trabajador");
                    double s2 = scanner.nextDouble();
                 
        
                    System.out.println("Ingrese el sueldo de la 3era semana trabajador");
                    double s3 = scanner.nextDouble();
                   
        
                    System.out.println("Ingrese el sueldo de la 4ta semana trabajador");
                    double s4 = scanner.nextDouble();
               
                    t.agregar_sueldo(s1, s2, s3, s4);
                    
                } else {
                    if (respuesta == 2) {
                        System.out.println("Ingrese el sueldo mensual del trabajador");
                        double sueldo = scanner.nextDouble();
                        t.agregar_sueldo(sueldo);
                    }
                }


//METODO ARREGLO
        
//        double sueldos[] = new double[4];
//        for (int i = 0; i < sueldos.length; i++) {
//            System.out.printf("Ingrese sueldo de la semana", i);
//            sueldos[i] = scanner.nextDouble();
//            t.agregar_sueldo(sueldos[i]);
//        }
//        
        System.out.printf("Los datos del trabajador son: %s\n", t);

    }
}
