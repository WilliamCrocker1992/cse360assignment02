package cse360assignment02;
/**
 * The myCalculator program implements an application that creates a class and calls
 * the functions from AddingMachine and prints out the lines of what was entered.
 * @author w.c.c.
 * @version 1.0
 * @since 2020-04-10
 */
public class myCalculator {
   public static void main(String[] args) {
       /*
        * creating the class myCalculator from AddingMachine
        */
       AddingMachine myCalculator= new AddingMachine();
       /*
        * calling the add and subtract functions from AddingMachine
        */
       myCalculator.add(4); 
       myCalculator.subtract(2); 
       myCalculator.add(5);
       /*
        * printing out the counter string and also printing out the total
        */
       System.out.println(myCalculator.toString());
       System.out.println("Total = "+myCalculator.getTotal());
   }
}

