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
   */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  /*getting the total through calling the getTotal Function
    */
  public int getTotal () {
    return 0;
  }
  /*adding to the int value with the add function
   */
  public void add (int value) {
  }
/*subtracting from the int value with the subtract function
 
 */
  public void subtract (int value) {
  }
/*putting something to a string with the toString function
 */
  public String toString () {
    return "";
  }
/*clearing the memory of what was done so that total is back to zero
 */
  public void clear() {
  }
}