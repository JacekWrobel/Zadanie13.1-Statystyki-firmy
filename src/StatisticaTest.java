import java.io.*;
import java.util.Scanner;

public class StatisticaTest {
    public static void main(String[] args) throws IOException {
        EmployeeReader er = new EmployeeReader();
        Employee[] staff = er.readToArray("companyfile.csv");
        for (Employee employee : staff) {
            System.out.println(employee);
        }
        StatisticMethods sm = new StatisticMethods();


        FileWriter fileWriter = new FileWriter("raport.txt");
        BufferedWriter bfw = new BufferedWriter(fileWriter);
        bfw.write("Średnia wypłat: " + sm.avarngeSalary(staff));
        bfw.newLine();
        bfw.write("Najmniejsza wypłata: " + sm.lowSalary(staff));
        bfw.newLine();
        bfw.write("Największa wypłata: " + sm.topSalary(staff));
        bfw.newLine();
        bfw.write("Łączna liczba pracowników: : " + sm.employeeNumber(staff));
        bfw.newLine();
        bfw.write("Liczba pracowników w dziale IT: " + sm.divisionCapacity(staff, "it"));
        bfw.newLine();
        bfw.write("Liczba pracowników w dziale Management: " + sm.divisionCapacity(staff, "Management"));
        bfw.newLine();
        bfw.write("Liczba pracowników w dziale Support: " + sm.divisionCapacity(staff, "Support"));
        bfw.newLine();
        bfw.close();
    }
}
