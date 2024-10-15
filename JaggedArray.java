public class JaggedArray {
    public static void main(String args[]){

        int arr[][] = new int[2][];
        arr[0]=new int[1];
        arr[1]=new int[2];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(1);
            }
            System.out.println();
        }

        //Enhanced Forloop
        // for(int m[]: arr){
        //     for(int n: m){
        //         System.out.print(1);
        //     }
        //     System.out.println();
        // }

    }
}

