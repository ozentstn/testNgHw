package muhasebe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen personelin adını giriniz: ");
        String name = input.nextLine();

        System.out.print("Lütfen personelin çalıştığı gün sayısını giriniz: ");
        int workDay = input.nextInt();

        if(workDay < 25){
            System.out.println("Prim için eksik gün çalıştınız");
        } else if (workDay > 31) {
            System.out.println("Hatalı gün sayısı girdiniz. Lütfen tekrar yazınız.");
        } else {
            System.out.print("Lütfen personelin aylık maaş bilgisini giriniz: ");
            int monthSalary = input.nextInt();

            Employee employee=new Employee(name);
            EmployeeSalary employeeSalary = new EmployeeSalary(workDay,monthSalary);

            System.out.println(employee.name + " isimli personelin aylık çalıştığı gün sayısı " +
                    employeeSalary.workDay +
                    " ve aylık maaşı " + employeeSalary.monthSalary+ "'dir.\n" +
                    "Prim dahil toplam maaşı " + employeeSalary.salaryCalculate() + " olarak hesaplanmıştır.");
        }
    }
}