package calculoimc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.*;

public class Usuarios {

public String esSexo(String sex){
    
    String okSex = "";
    
    if(sex.equals("M") || sex.equals("m")){
        okSex = "OK";
    } else if(sex.equals("F") || sex.equals("f")){
        okSex = "OK";    
    }else{
        okSex = "NOOK";
    }            
    return okSex;               
}


public boolean esFecha(String fecha) {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
        } catch (ParseException e) {
            return false;
        }
        return true;
    } 

public String esTipo(String tipo){
    
    String okTipo = "";
    
    if(tipo.equals("A") || tipo.equals("a")){
        okTipo = "OK";
    } else if(tipo.equals("N") || tipo.equals("n")){
        okTipo = "OK";    
    }else{
        okTipo = "NOOK";
    }            
    return okTipo;               
    }


public boolean esDecimal(String deci){

try
 {
   Double.parseDouble(deci);
   return true;
 }
 catch(NumberFormatException nfe)
 {
   return false;
 }
}

public boolean esEmail(String correo) {

        // Patrón para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mather = pattern.matcher(correo);

        return mather.find();

    }

public String Conf(String conf){
    
    String okConf = "";
    
    if(conf.equals("S") || conf.equals("s")){
        okConf = "OK";
    } else if(conf.equals("N") || conf.equals("n")){
        okConf = "OK";    
    }else{
        okConf = "NOOK";
    }            
    return okConf;               
    }
}