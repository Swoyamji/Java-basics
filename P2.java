package Recurrences;

public class P2 {
    public static void printSum(int i,int n, int sum){
        if(i==n){                                //base case
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;                                 //function     
        printSum(i+1,n,sum);                   // recursive function
        System.out.println(i);
    }
    public static void main(String[] args) {
        printSum(1,5,0);
    }
}
