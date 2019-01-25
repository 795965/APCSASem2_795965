
/**
 * Prints Student Objects.
 * hello
 *
 * @author (Ziggy Sheynin)
 * @version (Project 1025)
 */
import java.util.Scanner;

public class StudentRunner
{
    public static  void main() {
        boolean done = false;//starts unfinished
        StudentList StudentList = new StudentList(); // creates new student object 
        while (done == false){ // when code is unifinsed...
            int demand  = menuNumber();
            if (demand == 7) {
                done = true; // when the use types 7 , the program is finished

            } else if (demand == 1){ // the user wants to add a student
                Scanner demand1 = new Scanner (System.in);
                System.out.println("Enter student name:"); //instructions for adding a new student
                String name = demand1.nextLine();
                System.out.println("Enter student number:");
                int number = demand1.nextInt();
                System.out.println ("Enter student GPA:");
                double GPA = demand1.nextDouble(); 
                StudentList.addStudentList(name, number, GPA); 
                System.out.println ("Student has been added"); 
                System.out.println (); 
            }else if(demand==2) { // if the user wants to a remove a student
                Scanner demand2 = new Scanner (System.in); 
                System.out.println ("Enter student last name");
                String name = demand2.nextLine(); 
                StudentList.deleteStudent(name); //calls method to delete student
                if (StudentList.deleteStudent(name)== true) { //if student has been deleted

                    System.out.println ("Student removed.");

                } else {
                    System.out.println("Student not found");    
                }
                System.out.println(); 

            } else if (demand ==3) { // if user wants to edit  astudent 
                Scanner demand3 = new Scanner (System.in); 
                System.out.println ("Do you want to edit student by name or number"); 
                System.out.println ("Press 1 for student number"); 
                System.out.println ("Press 2 for last name."); 
                int option  = demand3.nextInt(); 
                if(option == 1){//if they want to edit by student number 
                    Scanner demand31 = new Scanner(System.in);
                    System.out.println ("Enter student number"); 
                    int number = demand31.nextInt();
                    if (countDigits(number) == 6){ //checks that input is 6 digits 
                        Scanner demand32 = new Scanner (System.in); 
                        System.out.println("Enter updated name"); 
                        String name = demand32.nextLine(); 
                        // if 
                        System.out.println ("Enter new GPA:"); 
                        double GPA = demand32.nextDouble(); 
                        String last = null; 
                        if (StudentList.editStudentList(number, name, GPA) == true) { 
                            System.out.println ("Student edited"); 

                        }else {
                            System.out.println ("Student not found");
                        }

                    }else {
                        tryAgain();
                    }
                } else if (option ==2) { //if they want to edit by last name
                    Scanner demand31 = new Scanner(System.in);
                    System.out.println ("Enter student last name"); 
                    String last = demand31.nextLine();

                    Scanner demand32 = new Scanner (System.in); 
                    System.out.println("Enter updated name"); 
                    String name = demand31.nextLine(); 
                    // if 
                    System.out.println ("Enter new GPA:"); 
                    double GPA = demand32.nextDouble(); 
                    int number =0; 
                    if (StudentList.editStudentList(number, name, GPA) == true) { //if it has been updated
                        System.out.println ("Student edited"); 

                    }else {
                        System.out.println ("Student not found,");
                    }
                }else{
                    tryAgain();

                }
                System.out.println(); 
            } else if (demand ==4) { //clear whole list 
                StudentList.clearList();//uses method in ArrayList Class
                System.out.println("List Cleared");
                System.out.println();
            } else if (demand == 5) { // print student list
                System.out.println ("Here is student list: "); 
                System.out.println (); 
                StudentList.printStudentList(); //ArrayList method
                System.out.println();
            } else if(demand ==6){//user wants to print specific student
                Scanner demand6 = new Scanner(System.in);
                System.out.println("Would you like to search for your student:");
                System.out.println("Press 1 for by student number");
                System.out.println("Press 2 for by last name");
                int choice = demand6.nextInt();
                if (choice == 1) {
                    Scanner command61 = new Scanner(System.in);
                    System.out.print("Enter student number.");
                    int number = command61.nextInt();
                    if(countDigits(number) == 6) {
                        //figure out how to actually print 
                        //StudentList.printsStudent(int number, String last, String name, double gpa); 
                    } else {
                        tryAgain();
                    }
                } else if (choice == 2) {
                    Scanner command62 = new Scanner(System.in);
                    System.out.print("Enter student last name.");
                    String last = command62.nextLine();
                    // StudentList.printStudent();
                } else {
                    tryAgain();
                }
                System.out.println();
            } else {
                tryAgain();
            } 
            tryAgain();
        }

    }

    public static int menuNumber(){ // creates menu for user 
        Scanner scr = new Scanner(System.in); 
        System.out.println ("Choose an action"); 
        System.out.println ("1. Add a student"); 
        System.out.println ("2. Remove a student");
        System.out.println ("3. Edit a student"); 
        System.out.println ("4. Clear list of students"); 
        System.out.println ("5. Print list of students"); 
        System.out.println ("6. Print one student"); 
        System.out.println ("7. End the program"); 
        int input  = scr.nextInt(); 
        return input;  

    }

    public static int countDigits (int input ) { // to count digits in the input 
        int number = input; 
        int count = 0; 
        while (number> 0 ){
            number  = number  / 10; 
            count += 1; 
        }
        return count; 
    }

    public static void tryAgain () { // for bad inputs ( in wrong format)
        System.out.println ("Wrong input, try again"); 

    }
}
