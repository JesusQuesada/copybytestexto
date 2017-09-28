package copybytestexto;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author jquesadaabeijon
 */
public class Metodos {

//    File fil = new File("/home/local/DANIELCASTELAO/jquesadaabeijon/NetBeansProjects/copybytestexto/texto1.txt");
//    FileInputStream fis = null;
//    File fil2 = new File("/home/local/DANIELCASTELAO/jquesadaabeijon/NetBeansProjects/copybytestexto/texto2.txt");
//    FileOutputStream fio = null;
//
//    public void lerArquivo() throws IOException {
//
//        int content;
//
//        try {
//            fis = new FileInputStream(fil);
//            System.out.println("Tamaño total a leer en bytes: " + fis.available());
//
//            while ((content = fis.read()) != -1) {
//                System.out.println((char) content);
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (fis != null) {
//                    fis.close();
//                }
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//        }
//
//        if (!fil2.exists()) {
//            System.out.println("creando archivo txt: " + fil2.getName());
//            boolean result = false;
//
//            try {
//                fil2.createNewFile();
//                result = true;
//            } catch (SecurityException se) {
//            }
//            if (result) {
//                System.out.println("El archivo " + fil2.getName() + " ha sido creado");
//            }
//
//            try {
//                fio = new FileOutputStream(fil2);
//                System.out.println("Escribiendo en fichero 'texto2.txt'");
//
//                byte[] bytesArray = content.getBytes();
//
//                fio.write(bytesArray);
//                fio.flush();
//                System.out.println("Se ha escrito con éxito!");
//            }
//        } catch (IOException ioe) {
//	  ioe.printStackTrace();
//       } finally {
//	  try {
//	     if (fio != null) 
//	     {
//		 fio.close();
//	     }
//          } catch (IOException ioe) {
//	     System.out.println("Error in closing the Stream");
//	  }
//        }
//    }

//    public void crearyescribir() throws IOException {
//
//        if (!fil2.exists()) {
//            System.out.println("creando archivo txt: " + fil2.getName());
//            boolean result = false;
//
//            try {
//                fil2.createNewFile();
//                result = true;
//            } catch (SecurityException se) {
//            }
//            if (result) {
//                System.out.println("El archivo " + fil2.getName() + " ha sido creado");
//            }
//        }
}
