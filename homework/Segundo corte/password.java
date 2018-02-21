public class password{
public static void main(String[] args) {
       //1 mayuscula, 1 minuscula, 1 numero minimo
       String password = "Cristian199";
       char clave;
       byte  contNumero = 0, contLetraMay = 0, contLetraMin=0;
       for (byte i = 0; i < password.length(); i++) {
                clave = password.charAt(i);
               String passValue = String.valueOf(clave);
                if (passValue.matches("[A-Z]")) {
                    contLetraMay++;
                } else if (passValue.matches("[a-z]")) {
                    contLetraMin++;
                } else if (passValue.matches("[0-9]")) {
                    contNumero++;
                }
        }
        System.out.println("Cantidad de letras mayusculas:"+contLetraMay);
        System.out.println("Cantidad de letras minusculas:"+contLetraMin);
        System.out.println("Cantidad de numeros:"+contNumero);


    }
  }
