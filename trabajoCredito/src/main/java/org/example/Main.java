package org.example;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Integer idDeudor;
        Integer tipoDocumento;
        String documento;
        String nombres;
        String apellidos;
        String telefonoMovil;
        String telefonoFijo;
        String direccion;

        Integer idFiador;
        String nombresFiador;
        String documentoFiador;
        Double valorBrutoMoto;
        Double montoTotalMoto;

        Boolean tieneLicenciaElConductor;
        String tipoCompra;


        Scanner leer = new Scanner(System.in);

        System.out.println("********************");
        System.out.println("MUNDO YAMAHA");
        System.out.println("********************");

        System.out.println("Apreciado cliente, usted cuenta con licencia?");
        tieneLicenciaElConductor = leer.nextBoolean();




        if(tieneLicenciaElConductor == true){

            System.out.println("Nombre del Cliente:");
            nombres = leer.nextLine();
            System.out.println("Apellidos del cliente:");
            apellidos = leer.nextLine();
            System.out.println("Tipo de documento:");
            tipoDocumento = leer.nextInt();
            System.out.println("Numero documento:");
            documento = leer.nextLine();
            System.out.println("Telefono celular:");
            telefonoMovil = leer.nextLine();
            System.out.println("Telefono fijo:");
            telefonoFijo = leer.nextLine();
            System.out.println("Ingrese la direccion:");
            direccion = leer.nextLine();

            System.out.println("Documento fiador:");
            documentoFiador = leer.nextLine();
            System.out.println("Nombre fiador: ");
            nombresFiador = leer.nextLine();

            System.out.println("Nuestras Motocicletas: ");
            System.out.println("1. Yamaha SZR-125--------$9000000");
            System.out.println("2. Yamaha crypton FI-----$8000000");
            System.out.println("3. Yamaha MT10-----------$72000000");
            System.out.println("4. Yamaha NMAX300--------$34000000");
            System.out.println("5. Yamaha XTZ125---------$10500000");

            Integer motoSeleccionada;

            System.out.println("Digite la motocicleta deseada: ");
            motoSeleccionada = leer.nextInt();

            Double valorMoto=0.0;

            if(motoSeleccionada==1){

                valorMoto = 9000000.0;


            }else if(motoSeleccionada==2){

                valorMoto=8000000.0;



            }else if(motoSeleccionada==3){

                valorMoto=72000000.0;


            }else if(motoSeleccionada==5){

                valorMoto = 34000000.0;

            }else if(motoSeleccionada==6){
                 valorMoto = 10500000.0;

            }else{

                System.out.println("Seleccion Invalida");

            }

            System.out.println("Digitae credito o contado para continuar su compra:");
            leer.nextLine();
            tipoCompra = leer.nextLine().toLowerCase(Locale.ROOT);

            if(tipoCompra.equals("credito")){

                double porcentajeCredito;

                System.out.println("Ingresa el prcentaje a financiar");
                porcentajeCredito = leer.nextDouble();

                if(porcentajeCredito == 1.0){

                    Double valorIntereses = 0.25;
                    valorMoto = valorMoto + (valorMoto*valorIntereses);

                } else if(porcentajeCredito == 0.7){

                    Double valorIntereses =  0.15;
                    valorMoto = valorMoto + (valorMoto*valorIntereses);

                }else if(porcentajeCredito == 0.5){

                    Double valorIntereses = 0.07;
                    valorMoto = valorMoto + (valorMoto*valorIntereses);

                }else{

                    System.out.println("Opcion invalida");

                }




            }else{

                System.out.println("Excelente le daremos un descuento del 10%");

            }


        }else{
            System.out.println("Apreciado usuario, no podemos continuar la transacion.");
            System.out.println("Lo invitamos a tramitar su licencia, vuelva pronto...");

        }






    }
}