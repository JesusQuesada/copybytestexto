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

//        String s = "";
        while (i != -1) {
            i = fis1.read();
//            s = s + String.valueOf((char) i);

            FileOutputStream fos1 = new FileOutputStream(fos, wr);
//            byte[] b = s.getBytes();
            if (i != -1) {
                fos1.write(i);

            } else {
                fos1.write(10);
                fos1.close();
                fis1.close();
            }
        }

        System.out.println("El texto se ha copiado del archivo 'texto1' al archivo 'texto2'.");
    }
}
