package br.edu.univas;

public class Questao08 {
    public static void main(String[] args) {
        String[] listaDeStrings = {
                "Esta",
                "é",
                "uma",
                "lista",
                "de",
                "Strings"
        };
        String unicaString = retornaUnicaString(listaDeStrings);
        System.out.println(unicaString);
    }
    public static String retornaUnicaString(String[] lista){
        String unicaString = "";
        for(String fraseLista : lista){
            unicaString = unicaString.concat(fraseLista);
        }
        return unicaString;
    }
}
