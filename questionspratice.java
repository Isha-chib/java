public class questionspratice {
    public static void printNumb(int i,int n,int sum ){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        
         sum+=i;
        printNumb(i+1,n,sum);
        System.out.println(i);
    }
    public static void main (String args[]){
        int n = 0;
        printNumb(1,5,0);
    }
}

