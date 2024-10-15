public class ArrayTwoDimension {
    public static void main(String args[]){
        int num[][] = new int[2][3];

        for(int i=0;i<2;i++) {

            for(int j=0;j<3;j++) {

                num[i][j] = (int)(Math.random() * 100);

            }
        }

        for(int i=0;i<2;i++) {

            for(int j=0;j<3;j++) {

               System.out.print(" " + num[i][j]);

            }

            System.out.println();
        }

    }
}


// Advanced Looping of 2D Array

// public class ArrayTwoDimension {
//     public static void main(String args[]) {
//         int num[][] = new int[2][3];

//         for (int i = 0; i < 2; i++) {

//             for (int j = 0; j < 3; j++) {

//                 num[i][j] = (int) (Math.random() * 100);

//             }
//         }

//         for (int n[] : num) {
//             for (int m : n) {
//                 System.out.print(" " + m);
//             }
//             System.out.println();
//         }

//     }
// }
