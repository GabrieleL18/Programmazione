public class SelectionSort {

    public static void main(String[] args) {
        new SelectionSort(new int[]{10,3,1,7,8,4,11,13,2});
        //new SelectionSort(new int[]{9,8,7,6,5,4,3,2,1});
        //new SelectionSort(new int[]{1,2,3,4,5,6,7,8,9});

    }

    SelectionSort(int[] A) {
        int posMin = 0;
        for(int pos1 = 0; pos1 < A.length; pos1++){
            int min = A[pos1];
            for(int pos2 = pos1; pos2 < A.length; pos2++){
                if (min >= A[pos2]){
                    min = A[pos2];
                    posMin = pos2;
                }
            }
            A[posMin] = A[pos1];
            A[pos1] = min;
        }
        printResult(A);
    }

    public void printResult(int A[]){
        for(int i=0; i<A.length; i++){
            System.out.println(A[i]);
        }
    }
}
