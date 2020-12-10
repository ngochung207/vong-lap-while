import java.util.Scanner;

public class vong_lap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap mat khau");
        String pass = scanner.nextLine();
        while (!pass.equals("vung oi mo ra")){
            System.out.println("Khong dung, nhap lai mat khau");
            pass = scanner.nextLine();
        }
        System.out.println("Dang nhap thanh cong");
    }
}
