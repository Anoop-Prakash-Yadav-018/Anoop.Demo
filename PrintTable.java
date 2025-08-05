package Recursion;

public class PrintTable {
    static void printTable(int n, int i) {
        if (i > 10) {
            return; // Base case
        }

        System.out.println(n + " * " + i + " = " + (n * i)); //  multiplication
        printTable(n, i + 1); // Recursive call
    }

    static String printTable2(int num, int i){
        if(i == 11){
            return "";
        }
        String r1 = printTable2(num, i + 1);
        return num + "*" + i + "=" + (num *i) + "\n" + r1;
    }

    public static void main(String[] args) {
        //int number = 5;
        //printTable(number, 1); // Call the function with number and starting value 1
         String table = printTable2(5, 1);
         System.out.println(table);
    }
}
