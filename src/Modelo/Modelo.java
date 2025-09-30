package Modelo;

public class Modelo {
    // Método para sumar dos números hexadecimales de 16 bits
    public String sumar16Bits(String numA, String numB) {
        // Convertir strings hexadecimales a enteros
        int a = Integer.parseInt(numA, 16);
        int b = Integer.parseInt(numB, 16);
        
        // Realizar la suma
        int suma = (a + b) & 0xFFFF; // Mantener solo los 16 bits menos significativos
        
        // Convertir el resultado a hexadecimal con 4 dígitos
        String resultado = String.format("%04X", suma);
        
        return resultado;
    }
    
    // Método para simular la suma bit a bit
    public String[] simularSumaBitABit(String numA, String numB) {
        // Convertir a binario de 16 bits
        String binA = String.format("%16s", Integer.toBinaryString(Integer.parseInt(numA, 16))).replace(' ', '0');
        String binB = String.format("%16s", Integer.toBinaryString(Integer.parseInt(numB, 16))).replace(' ', '0');
        
        StringBuilder resultado = new StringBuilder();
        StringBuilder carries = new StringBuilder();
        int carry = 0;
        
        // Realizar la suma bit a bit, de derecha a izquierda
        for (int i = 15; i >= 0; i--) {
            int bitA = binA.charAt(i) - '0';
            int bitB = binB.charAt(i) - '0';
            
            // Sumar los bits y el carry
            int sumaBits = bitA + bitB + carry;
            
            // Calcular el nuevo carry y el bit de resultado
            carry = sumaBits / 2;
            int bitResultado = sumaBits % 2;
            
            // Agregar al inicio del resultado y los carries
            resultado.insert(0, bitResultado);
            carries.insert(0, carry);
        }
        
        // Devolver un array con el resultado binario y los carries
        return new String[]{
            resultado.toString(),
            carries.toString()
        };
    }
}
