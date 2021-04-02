import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập năm: ");
        int year = sc.nextInt();

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println(+year+ " là năm nhuận");
                } else {
                    System.out.println(+year+ "là năm không nhuận");
                }
            } else {
                System.out.println(+year+ " là năm nhuận");
            }
        } else {
            System.out.println(+year+ "là năm không nhuận");
        }
    }
}
