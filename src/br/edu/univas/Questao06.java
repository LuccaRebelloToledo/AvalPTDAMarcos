package br.edu.univas;

public class Questao06 {
    public static void main(String[] args) {
        String palavra = "Invertido";
        System.out.println(stringInvertida(palavra));
    }
    public static String stringInvertida(String palavra){
        String palavraInvertida = "";
        for(int i = palavra.length() - 1; i >= 0; i--){
            palavraInvertida = palavraInvertida.concat(String.valueOf(palavra.charAt(i)));
        }
        return palavraInvertida;
    }
}
