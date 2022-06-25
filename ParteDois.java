public class ParteDois {
    public static int[][] vetor_matriz (int[] vetor, int l, int c) {
        int[][] matriz = new int[l][c];
        int lin = 0, i = 0;
        while (i < vetor.length) {
            for (int col = 0; col < c; col++) {
                matriz[lin][col] = vetor[i++];
            }
            lin++;
        }
        return matriz;
    }
    public static int[] matriz_vetor (int[][] matriz) {
        int[] vetor = new int[matriz.length*matriz[0].length];
        int p = 0;
        while (p<vetor.length) {
            for (int l = 0; l < matriz.length; l++) {
                for (int c = 0; c < matriz[l].length; c++) {
                    vetor[p++]=matriz[l][c];
                }
            }
        }
        return vetor;
    }
    public static int[] insere (int[] vetor, int valor, int index) {
        int[] vetor2 = new int[vetor.length + 1];
        for (int n=0;n<vetor.length;n++) {
            vetor2[n]=vetor[n];
        }
        for (int i = vetor2.length-1;i>index; i--) {
            int aux = vetor2[i-1];
            vetor2[i-1]=vetor2[i];
            vetor2[i]=aux;
        }
        vetor2[index] = valor;
        return vetor2;
    }

    public static int[] remove (int[] vetor, int index) {
        int[] vetor2 = new int[vetor.length-1];
        for (int n=0;n<index;n++) {
            vetor2[n]=vetor[n];
        }
        for (int i=index;i<vetor2.length;i++) {
            vetor2[i]=vetor[i+1];
        }
        return vetor2;
    }

    public static void main (String [] args) {
        int[] vetor = {1,2,3,4,5,6,7,8,9,10};
        System.out.println ("Vetor transcrito em uma matriz");
        imprime_matriz(vetor_matriz(vetor,2,5));
        System.out.println ("\n\nMatriz transcrita em um vetor");
        imprime_vetor(matriz_vetor(vetor_matriz(vetor,2,5)));
        System.out.println ("\n\nInsere valor no vetor");
        imprime_vetor(insere(vetor, 11,10));
        System.out.println ("\n\nRemove valor no vetor");
        imprime_vetor(remove(vetor, 4));
    }
    public static void imprime_matriz(int[][] matriz) {
        for (int l=0;l<matriz.length;l++) {
            System.out.print ("\n");
            for (int c=0;c<matriz[l].length;c++) {
                System.out.print (matriz[l][c] + "   ");
            }
        }
    }
    public static void imprime_vetor(int[] vetor) {
        for (int i=0;i<vetor.length;i++) {
            System.out.print (vetor[i] + " ");
        }
    }
}
