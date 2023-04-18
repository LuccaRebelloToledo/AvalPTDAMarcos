package br.edu.univas;

public class Questao10 {
    public static void main(String[] args) {
        String frase = "Eu curso sistemas de informação";
        String palavra = "sistemas";
        if(existeNaString(frase, palavra))
            System.out.println("A palavra informada contém na string.");
        else
            System.out.println("A palavra informada não contém na string.");
    }
    public static boolean existeNaString(String frase, String palavra){
        String[] fraseDividida = frase.split(" ");
        for (String palavraSolta : fraseDividida) {
            if (palavraSolta.equals(palavra)) return true;
        }
        return false;
    }
}
