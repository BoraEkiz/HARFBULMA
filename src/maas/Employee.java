package maas;

public class Employee {

    private int name;
    private double salary;
    private int workhours;
    private int hireYear;
    private double vergi;
    private double vergitam;
    private double raisesalary;


    public Employee(int name, double salary, int workhours, int hireYear, int vergi, double vergitam, double raisesalary) {
        this.name = name;
        this.salary = salary;
        this.workhours = workhours;
        this.hireYear = hireYear;
        this.vergi = vergi;
        this.vergitam = vergitam;
        this.raisesalary = raisesalary;
    }

    public void tax() {

        if (salary > 1000) {
            this.vergi = salary * 0.3;
        } else
            System.out.println("vergi indirimi uygulanmayacaktır.");

    }


    public double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else {
            return 0;
        }
    }


    public double raisesalary() {

        int currenttime = 2021;
        int worktime = currenttime - hireYear;

        if (workYear < 10) {
            return this.salary * 0.05;
        } else if (workYear >= 10 && workYear < 20) {
            return this.salary * 0.10;
        } else {
            return this.salary * 0.15;
        }

    }
}

