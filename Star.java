public class Star {
   public static void main(String[] args) {
           int n=5;
           for(int i=1;i<=n;i++) {                 // i=row
           for (int j = 1; j <= n; j++) {          // j=colm
               System.out.print("* ");
           }
           System.out.println();
       }
   }
}
    //    * * * * *
    //    * * * * *
    //    * * * * *
    //    * * * * *
    //    * * * * *

//    ****************************************************************

public class Star {
   public static void main(String[] args) {
           int n=1;
           for(int i=1;i<=4;i++) {
               System.out.print("Sun  ");
           for (int j = 1; j <= 7; j++) {
               if(n<=31) {
                   System.out.print(n++ + "   ");
               }
           }
           System.out.println();
       }
   }
}
    //    Sun  1   2   3   4   5   6   7
    //    Sun  8   9   10   11   12   13   14
    //    Sun  15   16   17   18   19   20   21
    //    Sun  22   23   24   25   26   27   28

// ****************************************************************

public class Star {
   public static void main(String[] args) {
       int n=5;
       for(int i=1;i<=n;i++) {
           for (int j = 1; j <= i; j++) {
               System.out.print("* ");
           }
           System.out.println();
       }
   }
}
    //    *
    //    * *
    //    * * *
    //    * * * *
    //    * * * * *

// ****************************************************************

public class Star {
   public static void main(String[] args) {
       int n=5;
       for(int i=1;i<=n-1;i++) {
           for (int j = 1; j <= i; j++) {
               System.out.print("*  ");
           }
           System.out.println();
       }
       for(int i=n;i>=1;i--) {
           for (int j = 1; j <= i; j++) {
               System.out.print("*  ");
           }
           System.out.println();
       }
   }
}

    //    *
    //    *  *
    //    *  *  *
    //    *  *  *  *
    //    *  *  *  *  *
    //    *  *  *  *
    //    *  *  *
    //    *  *
    //    *

// ****************************************************************

public class Star {
   public static void main(String[] args) {
       int n=5;
       for(int i=1;i<=n;i++) {
           for (int j = 1; j <= i; j++) {
               System.out.print("1 ");
           }
           System.out.println();
       }
   }
}
    //    1
    //    1 1
    //    1 1 1
    //    1 1 1 1
    //    1 1 1 1 1

// ****************************************************************

public class Star {
   public static void main(String[] args) {
       int n=5 ,num=1;
       for(int i=1;i<=n;i++) {
           for (int j = 1; j <= i; j++) {
               System.out.print(num+" ");
               num++;
           }
           System.out.println();
       }
   }
}
    //    1
    //    2 3
    //    4 5 6
    //    7 8 9 10
    //    11 12 13 14 15

// ****************************************************************

public class Star {
   public static void main(String[] args) {
       int n=5 ;
       for(int i=1;i<=n;i++) {
           for (int j = 1; j <= i; j++) {
               System.out.print(j+" ");
           }
           System.out.println();
       }
   }
}
    //    1
    //    1 2
    //    1 2 3
    //    1 2 3 4
    //    1 2 3 4 5

// ****************************************************************

public class Star {
   public static void main(String[] args) {
       int n=5 ;
       for(int i=1;i<=n;i++) {
           for (int j = 1; j <= i; j++) {
               System.out.print(i+" ");
           }
           System.out.println();
       }
   }
}
//        1
//        2 2
//        3 3 3
//        4 4 4 4
//        5 5 5 5 5

// ****************************************************************

public class Star {
   public static void main(String[] args) {
       int n=5 ;
       char nn='@';
       for(int i=1;i<=n;i++) {
           ++nn;
           for (int j = 1; j <= i; j++) {
               System.out.print(nn+" ");

           }
           System.out.println();
       }
   }
}
    //    A
    //    B B
    //    C C C
    //    D D D D
    //    E E E E E

// ****************************************************************

public class Star {
   public static void main(String[] args) {
       int n=5;
       for(int i=n;i>=1;i--) {
           for (int j = 1; j <= i; j++) {
               System.out.print("* ");
           }
           System.out.println();
       }
   }
}
    //    * * * * *
    //    * * * *
    //    * * *
    //    * *
    //    *

// ****************************************************************

public class Star {
   public static void main(String[] args) {
       for(int i=5;i>=1;i--) {
           int alp=65;
           for (int j = 0; j <= i; j++) {
               System.out.print((char)(alp+j)+" ");
           }
           System.out.println();
       }
       for(int i=0;i<=5;i++) {
           int alp=65;
           for (int j = 0; j <= i; j++) {
               System.out.print((char)(alp+j)+" ");
           }
           System.out.println();
       }
   }
}
    //    A B C D E F
    //    A B C D E
    //    A B C D
    //    A B C
    //    A B
    //    A
    //    A B
    //    A B C
    //    A B C D
    //    A B C D E
    //    A B C D E F

// ****************************************************************

public class Star {
   public static void main(String[] args) {
       int n=5;
       for(int i=n;i>=1;i--) {
           for (int k=1;k<=n-i;k++){
               System.out.print(" ");
           }
           for (int j = 1; j <= i; j++) {
               System.out.print("* ");
           }
           System.out.println();
       }
   }
}
    //    * * * * *
    //     * * * *
    //      * * *
    //       * *
    //        *

// ****************************************************************

public class Star {
   public static void main(String[] args) {
       int n=5;
       for(int i=1;i<=n;i++) {
           for (int k=1;k<=n-i;k++){
               System.out.print(" ");
           }
           for (int j = 1; j <= i; j++) {
               System.out.print("* ");
           }
           System.out.println();
       }
   }
}

    //        *
    //       * *
    //      * * *
    //     * * * *
    //    * * * * *

// ****************************************************************

public class Star {
   public static void main(String[] args) {
       int n=5;
       for(int i=1;i<=n-1;i++) {
           for (int k=1;k<=n-i;k++){
               System.out.print(" ");
           }
           for (int j = 1; j <= i; j++) {
               System.out.print("* ");
           }
           System.out.println();
       }
       for(int i=n;i>=1;i--) {
           for (int k=1;k<=n-i;k++){
               System.out.print(" ");
           }
           for (int j = 1; j <= i; j++) {
               System.out.print("* ");
           }
           System.out.println();
       }
   }
}
            //     *
            //    * *
            //   * * *
            //  * * * *
            // * * * * *
            //  * * * *
            //   * * *
            //    * *
            //     *

// ****************************************************************

public class Star {
   public static void main(String[] args) {
       int n = 5;
       for (int i = n; i >= 1; i--) {
           for (int k = 1; k <= n - i; k++) {
               System.out.print(" ");
           }
           for (int j = 1; j <= i; j++) {
               System.out.print("* ");
           }
           System.out.println();
       }
       for(int i=2;i<=n;i++) {
           for (int k=1;k<=n-i;k++){
               System.out.print(" ");
           }
           for (int j = 1; j <= i; j++) {
               System.out.print("* ");
           }
           System.out.println();
       }
   }
}
        //    * * * * *
        //     * * * *
        //      * * *
        //       * *
        //        *
        //       * *
        //      * * *
        //     * * * *
        //    * * * * *

// ****************************************************************

public class Star {
   public static void main(String[] args) {
       int n=5;
       for(int i=1;i<=n;i++) {
           for (int k=(n-i)*2;k>=1;k--){
               System.out.print(" ");
           }
           for (int j = 1; j <= i; j++) {
               System.out.print("* ");
           }
           System.out.println();
       }
   }
}

            //           *
            //         * *
            //       * * *
            //     * * * *
            //   * * * * *

// ****************************************************************

public class Star {
   public static void main(String[] args) {
       int n=5;
       for(int i=n;i>=1;i--) {
           for (int k=(n-i)*2;k>=1;k--){
               System.out.print(" ");
           }
           for (int j = 1; j <= i; j++) {
               System.out.print("* ");
           }
           System.out.println();
       }
   }
}
    //   * * * * *
    //     * * * *
    //       * * *
    //         * *
    //           *

// ****************************************************************

public class Star {
   public static void main(String[] args) {
       int n=5;
       int num=1;
       for(int i=n;i>=1;i--) {
           for (int k=(n-i)*2;k>=1;k--){
               System.out.print(" ");
           }
           for (int j = 1; j <= i; j++) {
               System.out.print(num +" ");
           }
           System.out.println();
       }
       for(int i=1;i<=n;i++) {
           for (int k=(n-i)*2;k>=1;k--){
               System.out.print(" ");
           }
           for (int j = 1; j <= i; j++) {
               System.out.print(num +" ");
           }
           System.out.println();
       }
   }
}
        //    1 1 1 1 1
        //      1 1 1 1
        //        1 1 1
        //          1 1
        //            1
        //            1
        //          1 1
        //        1 1 1
        //      1 1 1 1
        //    1 1 1 1 1

// ****************************************************************

public class Star {
   public static void main(String[] args) {
       int n=5;
       for(int i=1;i<=n;i++) {
           for (int j = 1; j <= i; j++) {
               int sum=i+j;
               if(sum %2==0){
                   System.out.print("1 ");
               }else{
                   System.out.print("0 ");
               }
           }
           System.out.println();
       }
   }
}
    //    1
    //    0 1
    //    1 0 1
    //    0 1 0 1
    //    1 0 1 0 1

// ****************************************************************

public class Star {
   public static void main(String[] args) {
           int n=5;
           for(int i=1;i<=n;i++) {
           for (int j = 1; j <= n; j++) {
               if(i==1 || j==1 || j==5 || i==5){
                   System.out.print("*  ");
               }else{
                   System.out.print("   ");
               }
           }
           System.out.println();
       }
   }
}

    //    *  *  *  *  *
    //    *           *
    //    *           *
    //    *           *
    //    *  *  *  *  *

// ****************************************************************

public class Star {
   public static void main(String[] args) {
       int n=5;
       for(int i=1;i<=n;i++) {
           for (int j = 1; j <= n; j++) {
               if(i==1 || j==1 || j==5 || i==5){
                   int sum=i+j;
                   if(sum %2==0){
                       System.out.print("1  ");
                   }
                   else{
                       System.out.print("0  ");
                   }
               }else{
                   System.out.print("   ");
               }
           }
           System.out.println();
       }
   }
}
    //    1  0  1  0  1
    //    0           0
    //    1           1
    //    0           0
    //    1  0  1  0  1

// ****************************************************************

public class Star {
   public static void main(String[] args) {
       int n=5;
       for(int i=1;i<=n-1;i++) {
           for (int k=1;k<=n-i;k++){
               System.out.print(" ");
           }
           for (int j = 1; j <= (2*i-1); j++) {
               if( j==1 || j==(2*i-1) ){
                       System.out.print("* ");
                   }else{
                   System.out.print(" ");
               }
           }
           System.out.println("");
       }
       for(int i=n;i>=1;i--) {
           for (int k=1;k<=n-i;k++){
               System.out.print(" ");
           }
           for (int j = 1; j <= (2*i-1); j++) {
               if(j==1 || j==(2*i-1) ) {
                   System.out.print("* ");
               }else{
                   System.out.print(" ");
               }
           }
           System.out.println("");
       }
   }
}
                //     *
                //    *  *
                //   *    *
                //  *      *
                // *        *
                //  *      *
                //   *    *
                //    *  *
                //     *


