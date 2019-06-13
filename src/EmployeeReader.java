import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EmployeeReader {
    Employee[] readToArray(String fileName) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(fileName)); //CZY TU MUSI BYĆ 'new File'
        int numberOfLines = countLines(fileName);
        Employee[] staffArray = new Employee[numberOfLines];
        int i = 0;
        while (sc.hasNextLine()) {
            String lineData = sc.nextLine();
            String[] split = lineData.split(";");
            staffArray[i] = new Employee(split[0], split[1], split[2], split[3], Double.valueOf(split[4]));
            i++;
        }
        return staffArray;
    }

    private int countLines(String fileName) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(fileName));
        int counter = 0;
        while (sc.hasNextLine()) {
            counter++;
            sc.nextLine();
        }
        sc.close();
        return counter;
    }
}
