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
    this.setHours(hours);
  }

  public String getName() {
    return this.name;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public double getHourlyWage() {
    return this.hourlyWage;
  }

  public void setHourlyWage(double hourlyWage) {
    this.hourlyWage = hourlyWage;
  }

  public int getDayIndex() {
    return this.dayIndex;
  }

  public int[] getHours() {
    return this.hours;
  }

  public int getHours(int idx) {
    return this.hours[idx % this.days];
  }

  public void setHours(int[] hours) {
    for (int i = 0; i < hours.length; ++i)
      this.hours[i % days] = hours[i];
    for (int j = hours.length; j < days; ++j)
      this.hours[j % days] = 0;
    this.dayIndex = hours.length;
  }

  public void newDay(int hours) {
    this.hours[dayIndex] = hours;

    if (++dayIndex > days) {
      dayIndex = 0;
      int[] zeroedHours = new int[days];
      this.setHours(zeroedHours);
    }
  }

  public double calculateSalary() {
    double total = 0;
    for (int i = 0; i < days; ++i)
      total += this.hours[i] * hourlyWage;

    return total;
  }

  public String toString() {
    return name + "(" + this.dayIndex + "), " + title.toUpperCase() + ": " + calculateSalary() + "€";
  }
}
