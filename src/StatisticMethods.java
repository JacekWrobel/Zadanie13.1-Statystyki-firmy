public class StatisticMethods {

    public double avarngeSalary(Employee[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i].getSalary();
        }
        return sum / array.length;
    }

    public int employeeNumber(Employee[] array) {
        return array.length;
    }

    public double topSalary(Employee[] array) {
        double top = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getSalary() >= top) {
                top = array[i].getSalary();
            }
        }
        return top;
    }

    public double lowSalary(Employee[] array) {
        double low = avarngeSalary(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i].getSalary() <= low) {
                low = array[i].getSalary();
            }
        }
        return low;
    }

    public int divisionCapacity(Employee[] array, String divisionName) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getDivision().equals(divisionName)) {
                counter++;
            }
        } return counter;
    }
}