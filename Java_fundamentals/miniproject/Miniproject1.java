import java.util.Scanner;
public class Miniproject1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int inputEmpId = scanner.nextInt();
        scanner.close();

        int[] empIds = {1001, 1002, 1003, 1004, 1005, 1006, 1007};
        String[] empNames = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan ", "Suman", "Tanmay"};
        String[] joiningDates = {"01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "1/1/2000", "12/06/2006"};
        char[] designationCodes = {'e', 'c', 'k', 'r', 'm', 'e', 'c'};
        String[] departments = {"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};
        int[] basicSalaries = {20000, 30000, 10000, 12000, 50000, 23000, 29000};
        int[] hraValues = {8000, 12000, 8000, 6000, 20000, 9000, 12000};
        int[] incomeTaxes = {3000, 9000, 1000, 2000, 20000, 4400, 10000};

       
        char[] validDesigCodes = {'e', 'c', 'k', 'r', 'm'};
        String[] designationTitles = {"Engineer", "Consultant", "Clerk", "Receptionist", "Manager"};
        int[] daValues = {20000, 32000, 12000, 15000, 40000};

        boolean isEmployeeFound = false;

        for (int i = 0; i < empIds.length; i++) {
            if (empIds[i] == inputEmpId) {
                isEmployeeFound = true;


                String designation = "";
                int da = 0;

                for (int j = 0; j < validDesigCodes.length; j++) {
                    if (designationCodes[i] == validDesigCodes[j]) {
                        designation = designationTitles[j];
                        da = daValues[j];
                        break;
                    }
                }

                int totalSalary = basicSalaries[i] + hraValues[i] + da - incomeTaxes[i];

                System.out.println("Emp No.\tEmp Name\tDepartment\tDesignation\tSalary");
                System.out.println(empIds[i] + "\t" + empNames[i] + "\t\t" +
                        departments[i] + "\t" + designation + "\t" + totalSalary);
                break;
            }
        }

        if (!isEmployeeFound) {
            System.out.println("There is no employee with Employee ID: " + inputEmpId);
        }
    }
}
