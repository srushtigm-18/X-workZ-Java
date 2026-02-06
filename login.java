import java.util.Scanner; 

class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Username: ");
        String user = sc.nextLine();
        System.out.print("Password: ");
        String pass = sc.nextLine();
        if (user.equals("admin") && pass.equals("1234")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid credentials.");
        }
        sc.close();
    }
}