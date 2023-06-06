/**
 * ClassName: Employee
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Musteqqim
 * @Create 6/6/2023 3:51 PM
 * @Version 1.0
 */
public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name,double salary,int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double max(){
        if (salary <= 1000){
            return  0 ;
        }else {
            return salary * 0.03;
        }
    }

    public double bonus(){
        if (workHours > 40){
            int extraHours = workHours - 40 ;
            return extraHours * 30;
        }else {
            return 0;
        }
    }

    public double raiseSalary(){
        int yearsOfWork = 2021 - hireYear;
        double raisePercentage;
        if (yearsOfWork < 10){
            raisePercentage = 0.05;
        } else if (yearsOfWork < 20) {
            raisePercentage = 0.1;
        }else{
            raisePercentage = 0.15;
        }
        return salary * raisePercentage;
    }

    public String toString(){
        double totalSalary = salary + bonus() - max() + raiseSalary();
        return "Adi: " + name +
                "\nMaasi: " + salary +
                "\nCalisma Saati : " + workHours +
                "\nBaslangic Yili : " + hireYear +
                "\nVergi : " + max() +
                "\nBounus : " + bonus() +
                "\nMaas Artisi : " + raiseSalary() +
                "\nVergi ve Bonuslar ile birlikte maas : " +
                "\nToplam Maas : " + totalSalary;
    }

}

