package entities;

public class Employee {
    private String name;
    private final Integer id;
    private Double salary;

    public Employee(String name, Integer id, Double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return this.id;
    }

    public Double getSalary() {
        return this.salary;
    }

    public void percentageIncrease(Double percentage) {
        this.salary = this.salary + this.salary * (percentage / 100.0);
    }

    public String toString() {
        return "Name of the employee: " + this.name + "\nID: " + this.id + "\nSalary: " + this.salary + "\n";
    }
}
