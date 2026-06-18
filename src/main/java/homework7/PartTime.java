/** @author Giorgi Gogua */
package homework7;

public class PartTime extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTime(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    public static void main(String[] args) {
        Employee[] team = {
                new FullTime("Anna", 5000),
                new PartTime("Beka", 25, 80)
        };

        for (Employee employee : team) {
            employee.printInfo();
            System.out.println(employee.calculateSalary());
        }
    }
}
