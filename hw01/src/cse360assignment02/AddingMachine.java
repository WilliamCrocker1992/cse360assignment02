package cse360assignment02;
/**
 * The AddingMachine program implements an application that can add to a total, 
 * subtract from a total, 
 * retrieve a total, 
 * put to string the total, 
 * and clear the application
 * 
 * @author w.c.c.
 * @version 1.0
 * @since 2020-04-10
 */

/*creating the public class adding machine, and making a total integer
*/
public class AddingMachine {
  private int total;
  /*simply establishing the already initiated variable total is equal to 0
   * setting up a string called counter and having it start out as being zero
   */
  private String counter = "0";
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  /*getting the total through calling the getTotal Function
   * and returning the total
    */
  public int getTotal () {
    return total;
  }
  /*adding to the total value with the add function by adding the value entered
   * updating the counter string variable
   */
  public void add (int value) {
	  total += value; 
	  counter += " + " + value;
  }
/*subtracting from the total value with the subtract function with the value entered
 * updating the counter string variable 
 */
  public void subtract (int value) {
	  total -= value; 
	  counter += " - " + value;
  }
/*putting counter to a string and it is already updated with all the inputs 
 */
  public String toString () {
    return counter;
  }
/*clearing the memory of what was done so that total is back to zero and the counter is also back
 * to being "zero"
 */
  public void clear() {
	  total = 0;
	  counter = "0";
  }
}


/**
 * The myCalculator program implements an application that creates a class and calls
 * the functions from AddingMachine and prints out the lines of what was entered.
 * @author w.c.c.
 * @version 1.0
 * @since 2020-04-10
 */


