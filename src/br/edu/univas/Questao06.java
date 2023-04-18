package br.edu.univas;

public class Questao06 {
    public static void main(String[] args) {
        System.out.println(nomeInvertido("Teste"));
    }
    public static String nomeInvertido(String nome){
        String nomeInvertido = "";
        for(int i = nome.length() - 1; i >= 0; i--){
            nomeInvertido = nomeInvertido.concat(String.valueOf(nome.charAt(i)));
        }
        return nomeInvertido;
    }
}
