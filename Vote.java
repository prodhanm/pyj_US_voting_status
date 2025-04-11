import java.util.Scanner;

class Vote {
    public static boolean voteStatus(int age, boolean citizen) {

        if(age >= 18) {
            if(!citizen) {
                return false;
            }
            else {
                return true;
            }
        } 
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        int age;
        boolean citizen;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = inp.nextInt();
        System.out.print("Are you a citizen? (true/false): ");
        citizen = inp.nextBoolean();
        boolean status = voteStatus(age, citizen);
        if (status) {
            System.out.println("You are eligible to vote.");
        } 
        else {
            System.out.println("You are not eligible to vote.");
        }
    }
}