public class pratice {

    public static int calcfactorial (int n){
        if(n==1||n==0){
            return 1;
        }
      int  fac_nm1 =calcfactorial (n-1);
      int fac_n = n * fac_nm1 ;
      return fac_n;
      }

      public static void main(String args[]){
        int n = 5 ;
        int ans = calcfactorial(n);
        System.out.println(ans);
      }

    
}
