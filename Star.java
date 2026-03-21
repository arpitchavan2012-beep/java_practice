public class Star {
    public static void main(String[] a){

        for(int i = 1;i<=4; i++){
            for(int j=1;j<=4;j++){
                if(i==1 || i==4 || j==1 || j==4){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }System.out.println();
        for(int i = 1;i<=4; i++){
            for(int j=1;j<=4;j++){
                System.out.print("* ");
            }
                System.out.println();}
                System.out.println();
                for(int i = 1;i<=4; i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
                System.out.println();}
                System.out.println();

                for(int i = 1;i<=4; i++){
                     for(int j=1;j<=4;j++){
                         System.out.print("* ");
            }
                System.out.println();}
                for(int i = 0; i <=4;i++){
                    for(int j = 1 ; j<=4-i;j++){
                        System.out.print(" ");
                }
                for (int j = 1;j<=2 * i-1;j++){
                    System.out.print("*");
                }
                System.out.println();}
    }
}
