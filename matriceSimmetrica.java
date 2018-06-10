public class matriceSimmetrica{

    public static boolean simmetrica (int[][] h){
        boolean answer = false;
        for(int i = 0; i < h.length; i++){ 
            for(int j = i+1; j < h[0].length; j++){
                if (h[i][j] == h[j][i]){
                    answer = true;
                }else{
                    answer = false;
                }
            }
        } return answer;
    }

    public static void main(String[] args) {
         int[][] lista1 ={{1, 2} , {2, 1}};
         System.out.println("Matrice simmetrica: " + simmetrica(lista1) );
         int[][] lista2 ={{1, 2} , {4, 5}};
         System.out.println("Matrice NON simmetrica: " +simmetrica(lista2)); 
    }
}

