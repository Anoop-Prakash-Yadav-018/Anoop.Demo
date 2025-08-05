package Recursion;

public class NamePrint {
    static void show( int n){
        //Base Case
        if(n==0){
            return;
        }
        System.out.println(" Anoop Prakash Yadav" + n); // pre logic 
        show(n-1);   // n-1 RR
        // past logic-Backtracking
        System.out.println("CSE Branch" + n);
    }
    public static void main(String[] args) {
        show(5);
    }
    
}
