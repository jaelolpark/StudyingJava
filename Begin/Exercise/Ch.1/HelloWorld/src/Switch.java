public class Switch {
    public static void main(String[] args) {
        int score = 44;

        String grade;
        switch (score / 10) {
            case 10:
                grade = "A+";
                break;
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            default:
                grade = "F";
                break;
        }
//==================================================

        switch (grade) {
            case "A+":
            case "A":
            case "B":
                System.out.println("Good job!");
                break;
            case "C":
            case "D":
                System.out.println("Study more!");
                break;
            case "F":
                System.out.println("Fail.");
            default:
                System.out.println("You need to retake!");
                break;



        }
        System.out.println("You are score is " + grade);
    }
}
