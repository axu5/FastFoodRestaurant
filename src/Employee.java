public class Employee {
  private String name;
  private String title;
  private double hourlyWage;
  private int days = 7;
  private int dayIndex = 0;
  private int[] hours = new int[days];

  public Employee(String name, String title, double hourlyWage) {
    this.name = name;
    this.title = title;
    this.hourlyWage = hourlyWage;
  }

  public Employee(String name, String title, double hourlyWage, int[] hours) {
    this.name = name;
    this.title = title;
    this.hourlyWage = hourlyWage;

    int[] hoursCopy = new int[hours.length];

    for (int i = 0; i < Math.min(hours.length, days); ++i)
      hoursCopy[i] = hours[i];
    dayIndex = hours.length - 1;

    this.hours = hoursCopy;
  }

  public String getName() {
    return name;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public double getHourlyWage() {
    return hourlyWage;
  }

  public void setHourlyWage(double hourlyWage) {
    this.hourlyWage = hourlyWage;
  }

  public int getDayIndex() {
    return dayIndex;
  }

  public int[] getHours() {
    return hours;
  }

  public void newDay(int hours) {
    this.hours[dayIndex % days] = hours;
    dayIndex++;
  }

  public double calculateSalary() {
    double total = 0;
    for (int i = 0; i < days; ++i)
      total += hours[i] * hourlyWage;

    return total;
  }

  public String toString() {
    return name + " " + title + " $" + calculateSalary();
  }
}
