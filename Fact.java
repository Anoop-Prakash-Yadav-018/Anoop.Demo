package Recursion;

public class Fact {

    static int fact(int num){
        // Base case
        if(n == 1){
            return 1;
        }
        int smallResult = fact(num - 1);
         // Backtrack
        return smallResult * num;
    }
    public void fact(int num, int result){
        if (num == 1){
            System.out.println(" Fact is " + result);
            return;
        }
        fact(num-1, result * num); // 5 --> 4 --> ...1

    
    }
    public static void main(String[] args) {
    
        Fact obj = new Fact();
        obj.fact (5, 1); // 5*4*3*2*1=120
    } 
    
}
