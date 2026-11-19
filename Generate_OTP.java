import java.util.Random;

public class random_number_otp {
    public static void main(String[] args) {
        int otp = (int)(Math.random() * 9000) + 1000;
        System.out.println("OTP: " + otp);
    }
}
