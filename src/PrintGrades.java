/*
    Program that uses a while loop to prompt the user to enter any number of exam scores
    and the resulting program will print out the grad: A, B, C, D or F.
*/


import java.util.Scanner;

public class PrintGrades {
    public static void main(String[] arg){
        // initialize variables
        int score = 0;
        String usrResponse = "", msg = "";
        char cont = 'Y';

        Scanner keyboard = new Scanner(System.in);

        while ((cont == 'Y') || (cont == 'y')) {
            System.out.println("Enter an exam score: ");

            // read user's input as a string and then convert to integer
            usrResponse = keyboard.next();
            score = Integer.parseInt(usrResponse);

            if (score < 60)                                    // check for failing grade
                msg = "Your grade is F. Go back to school.";
            else {
                msg = "Good Job! Your grade is ";
                if (score < 70)                                // grade D
                    msg = msg + "D.";
                else if (score < 80) {                         // grade C
                    if (score < 74)
                        msg = msg + "C-.";
                    else if (score < 77)
                        msg = msg + "C.";
                    else
                        msg = msg + "C+.";
                }
                else if (score < 90) {                         // grade B
                    if (score < 84)
                        msg = msg + "B-.";
                    else if (score < 87)
                        msg = msg + "B.";
                    else
                        msg = msg + "B+.";
                }
                else {                                        // grade A
                    if (score < 94)
                        msg = msg + "A-.";
                    else if (score < 97)
                        msg = msg + "A.";
                    else
                        msg = msg + "A+.";
                }
            }

            System.out.println(msg);

            // check if a user wants to continue
            System.out.println("Do you want to enter another score (Y/N)? ");
            usrResponse = keyboard.next();

            // retrieve first character of a string
            cont = usrResponse.charAt(0);
        }
    }

}
