/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojava;

/**
 *
 * @author abp392
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class DemoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
     
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String entrada = br.readLine();
         int numero = Integer.parseInt(entrada);
         
         numeroPar(numero);
         
        
    }
    
    public static int numeroPar(int numero)
    {
        while(numero <= numero)
        {
            System.out.println(numero % 2 == 0 ? "el numero " + numero + " es par": "el numero " + numero + "no es par");
            break;
        }
        return numero;
    }


}
