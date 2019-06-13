public class Employee {

    private String name;
    private String lastName;
    private String pesel;
    private String division;
    private double salary;

    public Employee(String name, String lastName, String pesel, String division, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.pesel = pesel;
        this.division = division;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return
                name +" " +lastName +" " +pesel +" " +division +" " +salary;
    }
}
