public class Pattern1 {
    public static void main(String[]a){
        int n =4;
        for(int i=1 ; i<=n;i++){
            int num = i;
            for(int j=1 ;j<=n;j++){
                System.out.print(num+" ");
                num++;
                if(num>n){
                    num=1;
                }
            }
            System.out.println();
        }
        
    }
}
