/**
 * Driver.java
 *
 * The driver class for the project
 *
 * @author axu5 <github.com/axu5>
 * @version 08.02.2022
 */
public class Driver {
  public static void main(String[] _args) {
    Employee axu = new Employee("aleksanteri aho", "CTO", 120.0);
    Employee frank = new Employee("frank", "developer", 40.0, new int[] { 8, 8, 8, 8, 8, 8, 8 });

    System.out.println(axu);
    System.out.println(frank);

    axu.newDay(10);
    axu.newDay(10);

    frank.newDay(8);

    System.out.println(axu);
    System.out.println(frank);
  }
}