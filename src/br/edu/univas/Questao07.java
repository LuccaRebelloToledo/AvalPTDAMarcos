package br.edu.univas;

public class Questao07 {
    public static void main(String[] args) {
        int[][] matrizA = {{1,2},{3,4}};
        int resultadoDeterminante = calculaDeterminante(matrizA);
        if(resultadoDeterminante == -1)
            System.out.println("A matriz não é válida!");
        else
            System.out.println(resultadoDeterminante);
    }
    public static int calculaDeterminante(int[][] matriz){
        if(matriz.length == 2){
            int diagPrin = 1;
            int diagSeg = 1;
            for(int i = 0; i < matriz.length;i++){
                for(int j = 0; j < matriz[i].length; j++){
                    if(i == j) {
                        diagPrin *= matriz[i][j];
                    }
                    if(i + j == matriz.length - 1) {
                        diagSeg *= matriz[i][j];
                    }
                }
            }
            return diagPrin - diagSeg;
        }
        return -1;
    }
}
