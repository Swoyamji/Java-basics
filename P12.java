package Recurrences;

public class P12 {
    public static void moveAllX(String str, int idx, int count, String newString){
        if(idx==str.length()){
            for (int i=0; i<count;i++){
                newString+='a';
            }
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(idx);
        if(currChar=='a'){
            count++;
            moveAllX(str,idx+1,count,newString);
        }
        else{
            newString += currChar;
            moveAllX(str, idx+1, count, newString);

        }

         
    }
    public static void main(String[] args) {
        String str="axbcaxxd";
        moveAllX(str, 0, 0, " ");

        

    }
}
