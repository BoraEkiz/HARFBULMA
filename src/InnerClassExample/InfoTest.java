package InnerClassExample;

public class InfoTest {

    public static void main(String[] args) {

        CalısanInfo emp1 = new CalısanInfo("Ali", "Yılmaz", "0555 123 4567", "ali.yilmaz@example.com");
        emp1.displayEmployeeInfo();

        System.out.println();

        CalısanInfo emp2 = new CalısanInfo("Ayşe", "Demir", "0544 987 6543", "ayse.demir@example.com");
        emp2.displayEmployeeInfo();
    }
}
