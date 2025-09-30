package Vista;

import java.util.Scanner;

public class Vista {
    public int pedirdatoInt(String texto) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(texto);
        teclado.nextLine();
        return 0;
    }

    public String pedirdatoString(String texto) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(texto);
        return teclado.nextLine();
    }
    public String mostrarTexto(String texto) {
        System.out.println(texto);
        return texto;
    }

}
