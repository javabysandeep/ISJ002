package operators.conditional.controlStatements.conditionalStatements;

public class Demo10 {
    public static void main(String[] args) {
        String username = "admin";
        String password = "pass";
        if(username.equals("admin")&& password.equals("Admin123")){
            System.out.println("Login successfully");
        } else{
            System.out.println("Invalid credentials");
        }
    }
}
