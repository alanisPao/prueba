
package calculoimc;

public class imc {

public double calcularIMC(double alt, double pes){
    double imc;
    imc = pes/(Math.pow(alt, 2));
    imc = Math.rint(imc*100)/100;
    
    return imc;               
}

public String clasificaIMC(String sex, double imc){
    
    String clasificacion = "";
    
    if (sex.equals("M") || sex.equals("m")){
        if(imc < 20){
            clasificacion = "Bajo peso";
	} else if(imc >=20 && imc < 25){
            clasificacion = "Normal";
	} else if(imc >=25 && imc < 30){
            clasificacion = "Obesidad leve";
	} else if(imc >=30 && imc <= 40){
            clasificacion = "Obesidad severa";
	} else {
            clasificacion = "Obesidad muy severa";
        } 
        
    } else {
        if(imc < 20){
            clasificacion = "Bajo peso";
	} else if(imc >=20 && imc < 24){
            clasificacion = "Normal";
	} else if(imc >=24 && imc < 29){
            clasificacion = "Obesidad leve";
	} else if(imc >=29 && imc <= 37){
            clasificacion = "Obesidad severa";
	} else {
            clasificacion = "Obesidad muy severa";
        }         
    }   
	//System.out.println("\nTu índice de masa corporal es: " + imc);
	//System.out.println("Atendiendo al IMC, tiene: " + clasificacion);      
    return clasificacion;
    }
}