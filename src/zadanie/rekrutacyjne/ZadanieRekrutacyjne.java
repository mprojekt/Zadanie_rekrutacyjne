package zadanie.rekrutacyjne;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Marcin
 */
public class ZadanieRekrutacyjne {

    public static void main(String[] args) {
        String filePath;
        if(args.length == 0)
            filePath = "Plik z danymi.txt";
        else {
            filePath = args[0];
        }
        
        double sum = 0d;
        
        try {
            Scanner in = new Scanner(new File(filePath));
            while(in.hasNextLine()){
                String line = in.nextLine();
                if(!line.isEmpty())
                    sum += getAmmount(line);                
            }
        } catch (FileNotFoundException ex) {
            
        }
        
        System.out.println("Suma = " + String.format( "%.2f", sum));
    }
    
    private static double getAmmount(String line){
        StringTokenizer valueTokenizer = new StringTokenizer(line, "@");
        String amountStr = valueTokenizer.nextToken();
        while(valueTokenizer.hasMoreTokens())
            amountStr = valueTokenizer.nextToken();
        
        StringTokenizer ammountTokenizer = new StringTokenizer(amountStr, ":");
        String dou = ammountTokenizer.nextToken();
        while(ammountTokenizer.hasMoreTokens())
            dou = ammountTokenizer.nextToken();
        
        String saldoStr = dou.substring(0, dou.length()-3).replaceAll(",", ".");        
        double saldo = Double.parseDouble(saldoStr);
        
        return saldo;
    }
    
}
