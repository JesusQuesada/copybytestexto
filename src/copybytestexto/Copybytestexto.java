package copybytestexto;

import java.io.*;

/**
 *
 * @author jquesadaabeijon
 */
public class Copybytestexto {

    public static void main(String[] args) throws IOException {

        File fis = new File("/home/local/DANIELCASTELAO/jquesadaabeijon/NetBeansProjects/copybytestexto/texto1.txt");
        File fos = new File("/home/local/DANIELCASTELAO/jquesadaabeijon/NetBeansProjects/copybytestexto/texto2.txt");
        leeryescribir(fis, fos, true);
    }

    public static void leeryescribir(File fis, File fos, boolean wr) throws IOException {

        int i = 0;

        FileInputStream fis1 = new FileInputStream(fis);
        FileOutputStream fos1 = new FileOutputStream(fos, wr);

        while ((i = fis1.read())!= -1) {
          
                fos1.write(i);

            } 
           
                fos1.close();
                fis1.close();
            System.out.println("El texto se ha copiado del archivo 'texto1' al archivo 'texto2'.");
        }

        
    }

