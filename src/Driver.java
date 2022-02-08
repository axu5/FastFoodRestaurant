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
    Employee axu = new Employee("Axu", "CTO", 120.0);
    Employee frank = new Employee("Frank", "developer", 10.0, new int[] { 8, 8, 8, 8, 8, 8, 8 });
    Employee eren = new Employee("Eren", "designer", 10.0, new int[] { 4, 4, 4, 4, 4 });

    System.out.println(axu);
    System.out.println(frank);

    axu.newDay(10);
    axu.newDay(10);

    eren.newDay(4);
    eren.newDay(4);

    System.out.println(axu);
    System.out.println(frank);
    System.out.println(eren);
  }
}