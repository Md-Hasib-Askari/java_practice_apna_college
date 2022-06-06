public class ButterFlyPattern {
    public static void main(String[] args){
        int n = 8;
        for (int i = 1; i <= n; i++){
//          *** Upper Part ***
            if (i <= n/2){
                // Left '*'
                for (int j = 1; j<=i; j++){
                    System.out.print("*");
                }
                //  Middle Space
                for (int j = n-2*i; j >= 1; j--){
                    System.out.print(" ");
                }
                // Right '*'
                for (int j = i; j>=1; j--){
                    System.out.print("*");
                }
//          *** Lower Part ***
            } else {
                // Left '*'
                for (int j = n-i+1; j>=1; j--){
                    System.out.print("*");
                }
                // Middle Space
                for (int j = 1; j <= 2*i-n-2; j++){
                    System.out.print(" ");
                }
                // Right '*'
                for (int j = 1; j<=n-i+1; j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

//      *      *
//      **    **
//      ***  ***
//      ********
//      ********
//      ***  ***
//      **    **
//      *      *