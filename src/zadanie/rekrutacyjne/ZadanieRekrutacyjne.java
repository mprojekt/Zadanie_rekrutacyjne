package zadanie.rekrutacyjne;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.stream.Stream;


public class ZadanieRekrutacyjne {

    public static void main(String[] args) {
        String filePath = "Plik z danymi.txt";
        if(args.length != 0) {
            filePath = args[0];
        }
        
        Path path = Paths.get(filePath);
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(Files.newInputStream(path), StandardCharsets.UTF_8))) {
            
            Stream<String> lines = br.lines();
            double sum = lines
                    .filter(s -> s.length() > 0)
                    .mapToDouble(s -> Double.parseDouble(s.substring(s.lastIndexOf("@") + 8, s.length() - 3).replaceAll(",", ".")))
                    .sum();
            
            System.out.println("Suma = " + String.format("%.2f", sum) + "zł");
            
        } catch (Exception ex) {
            System.out.println("Nieprawidłowy plik.\n" + ex);
        }
    }    
}