package calculoimc;

import java.util.Scanner;

public class CalculoIMC {

    public static void main(String[] args) {
        
        Usuarios users = new Usuarios();
        String usuCorreo = "";
        String usuCorreo2 = "";
        boolean okCorreo = false;
        String okConf = "";
        String usuConf = "";
        boolean okFecha = false;
        String usuFechaPeso = "";
        String okSex = "";
        String usuSexo = "";
        String okTipo = "";
        String usuTipo = "";
        boolean okAltura = false;
        boolean okPeso = false;
        String usuAltura = "";
        String usuPeso = ""; 
        
        System.out.println("¿Qué acción desea realizar?");
		System.out.println("(1) Inscribirse");
		System.out.println("(2) Salir");
        
        Scanner ingresoSistema = new Scanner(System.in);		
	int ingSist = ingresoSistema.nextInt();
        
        //INSCRIPCION
        if(ingSist == 1){
            
            System.out.println("*************************************************");
            System.out.println("****Bienvenido a la INSCRIPCION de personas****");
            System.out.println("*************************************************");
            
            do{
                System.out.println("Ingrese su correo electrónico (que será su nombre de usuario): ");
                Scanner ingCorreo = new Scanner(System.in);
                usuCorreo = ingCorreo.nextLine();
                okCorreo = users.esEmail(usuCorreo);
                if (okCorreo == false){
                    System.out.println("Error de ingreso, intentar nuevamente......");
                }
            }while(okCorreo == false);
            
            System.out.println("Ingrese su contraseña:");
            Scanner ingPass = new Scanner(System.in);
            String usuContraseña = ingPass.nextLine();
            	
            do{    
                System.out.println("Desea ingresar ahora y calcular su IMC? (S/N)");
                Scanner ingConf = new Scanner(System.in);
                usuConf = ingConf.nextLine();
                okConf = users.Conf(usuConf);
                if (okConf.equals("NOOK")){
                    System.out.println("Error de ingreso, intentar nuevamente......");
                }      
            }while(okConf.equals("NOOK"));   
            
            if(usuConf.equals("S") || usuConf.equals("s")){
                                
                                //INGRESO
                                try (Scanner scanner = new Scanner(System.in)) {
                                       System.out.println("******************"); 
                                       System.out.println("******LOGIN*******");
                                       System.out.println("******************");
                                    do{
                                        System.out.println("Ingrese su nombre de usuario (Correo electrónico): ");
                                        Scanner ingCorreo2 = new Scanner(System.in);
                                        usuCorreo2 = ingCorreo2.nextLine();
                                        okCorreo = users.esEmail(usuCorreo2);
                                        if (okCorreo == false){
                                            System.out.println("Error de ingreso, intentar nuevamente......");
                                        }
                                    }while(okCorreo == false);

                                    System.out.print("Ingrese su contraseña: ");
                                    Scanner ingPass2 = new Scanner(System.in);
                                    String usuContraseña2 = ingPass2.nextLine();

                                    if (usuCorreo.equals(usuCorreo2) && usuContraseña.equals(usuContraseña2)) {
                                        System.out.println("***********************************************");
                                        System.out.println("****BIENVENIDO AL SISTEMA DE CALCULO DE IMC****");
                                        System.out.println("***********************************************");
                                        
                                        //SISTEMA IMC CAPTURA DE DATOS
                                        if(ingSist == 2 || usuConf.equals("S") || usuConf.equals("s")){
                                        do{
                                            System.out.println("Ingresar la última fecha en que se peso (dd/mm/yyyy): ");
                                            Scanner ingFechaPeso = new Scanner(System.in);
                                            usuFechaPeso = ingFechaPeso.nextLine();
                                            okFecha = users.esFecha(usuFechaPeso);
                                            if (okFecha == false){
                                                System.out.println("Error de ingreso, intentar nuevamente......");
                                            }
                                        }while(okFecha == false);                                      
                                        System.out.println("Ingrese su nombre: ");
                                        Scanner ingNombre = new Scanner(System.in);
                                        String usuNombre = ingNombre.nextLine();            
                                        System.out.println("Ingrese su apellido: ");
                                        Scanner ingApellido = new Scanner(System.in);
                                        String usuApellido = ingApellido.nextLine(); 
                                        do{    
                                            System.out.println("Ingrese su sexo (M o F): ");
                                            Scanner ingSexo = new Scanner(System.in);
                                            usuSexo = ingSexo.nextLine();
                                            okSex = users.esSexo(usuSexo);
                                            if (okSex.equals("NOOK")){
                                                System.out.println("Error de ingreso, intentar nuevamente......");
					}      
                                        }while(okSex.equals("NOOK"));          
                                        String usuFNac = "";
                                        do{
                                            System.out.println("Ingresar fecha de nacimiento (dd/mm/yyyy): ");
                                            Scanner ingFNac = new Scanner(System.in);
                                            usuFNac = ingFNac.nextLine();
                                            okFecha = users.esFecha(usuFNac);
                                        if (okFecha == false){
                                            System.out.println("Error de ingreso, intentar nuevamente......");
                                            }
                                        }while(okFecha == false);
                                        do{    
                                            System.out.println("Ingrese A si es atleta o N si es persona normal: ");
                                            Scanner ingTipo = new Scanner(System.in);
                                            usuTipo = ingTipo.nextLine();
                                            okTipo = users.esTipo(usuTipo);
                                            if (okTipo.equals("NOOK")){
                                                System.out.println("Error de ingreso, intentar nuevamente......");
                                            }      
                                        }while(okTipo.equals("NOOK"));  
                                        do{
                                            System.out.println("Ingresar altura en metros (ej: 1.65): ");
                                            Scanner ingAltura = new Scanner(System.in);
                                            usuAltura = ingAltura.nextLine();
                                            okAltura = users.esDecimal(usuAltura);
                                            if (okAltura == false){
                                                System.out.println("Error de ingreso, intentar nuevamente......");
                                            }
                                        }while(okAltura == false);
                                        do{
                                            System.out.println("Ingresar peso en kilos (ej: 50.6): ");
                                            Scanner ingPeso = new Scanner(System.in);
                                            usuPeso = ingPeso.nextLine();
                                            okPeso = users.esDecimal(usuPeso);
                                            if (okPeso == false){
                                                System.out.println("Error de ingreso, intentar nuevamente......");
                                            }
                                        }while(okPeso == false);
                                        
                                        //TRANSFORMAR A DECIMAL
                                        double dusuAltura = Double.parseDouble(usuAltura);
                                        double dusuPeso = Double.parseDouble(usuPeso);
                                        
                                        //CALCULO DE IMC
                                        imc cimc = new imc();                            
                                        double imc = cimc.calcularIMC(dusuAltura, dusuPeso);
                                        String clasificacion = cimc.clasificaIMC(usuSexo, imc);
                                        
                                        //DESPLEGAR DATOS EN PANTALLA
                                        System.out.println("\n");
                                        System.out.println("****************************");
                                        System.out.println("****DATOS DE LA PERSONA:****");
                                        System.out.println("****************************");
                                        System.out.println("Nombre: "+usuNombre);
                                        System.out.println("Apellido: "+usuApellido);
                                        System.out.println("Correo electrónico: "+usuCorreo);
                                        if(usuSexo.equals("M") || usuSexo.equals("m")){
                                            System.out.println("Sexo: Masculino");
                                        }else{
                                            System.out.println("Sexo: Femenino");
                                        }                                       
                                        System.out.println("Fecha Nacimiento: "+usuFNac);
                                        //System.out.println("Atleta o Normal: "+usuTipo);
                                        if(usuTipo.equals("A") || usuTipo.equals("a")){
                                            System.out.println("Tipo de persona: Atleta");
                                        }else{
                                            System.out.println("Tipo de persona: Normal");
                                        }  
                                        System.out.println("Altura: "+dusuAltura);
                                        System.out.println("Peso: "+dusuPeso);
                
                                        System.out.println("\nTu índice de masa corporal es: " + imc);
                                        System.out.println("Según su IMC, usted se encuentra en la siguiente categoría: " + clasificacion);
                                        }
                                        } else {
                                        System.out.println("El usuario o contraseña ingresados son incorrectos....");
                                        //System.out.println("Hasta pronto....");
                                        }
                                    }	
                                }else{
                                //System.out.println("Hasta pronto....");
                            }            
                        }
                        System.out.println("Hasta pronto....");
                    }
                }