
/**
 * Write a description of class StudentList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class StudentList {
    ArrayList<Student> studList = new ArrayList<Student>(); //initializes and declares array list of name studList with Student Objects 

    public void addStudentList(String name, int number, double gpa){
        //creates student object s1, with a first, middle, and last name and number and gpa and adds it to the array with method add()
        Student s1 = new Student ();
        s1.setFirstName(name);
        s1.setMiddleName(name);
        s1.setlastName(name);
        s1.setstuNumber(number);
        s1.setgpa(gpa);
        studList.add(s1);

    }

    public boolean deleteStudent(String last){
        boolean deleted = false;
        for(int i = 0; i < studList.size(); i++){
            if(studList.get(i).getLastName().equals(last)){
                studList.remove(i); //if the last name searched is the same as i, get rid of that student
                deleted = true; //if it is deleted then the action is complete
            }
        }

        return deleted;
    }//if the student was or was not deleted (true if yes, false if no)

    public boolean editStudentList(int number, String name, double gpa){
        boolean edited = false; //starts unedited
        for (int i = 0; i < studList.size(); i++){
            if(studList.get(i).getstuNumber() == number){
                Student student = new Student();// creates new student object to edit
                student.setFirstName(name); //gives new student first last and middle name, gpa and number
                student.setMiddleName(name);
                student.setlastName(name);
                student.setgpa(gpa);
                studList.set(i, student);
                edited = true; //once edited boolen equals true
            }
        }
        return edited;
    }

    public void clearList(){
        studList.clear(); //uses ArrayList method clear() to get rid of all objects in arraylist
    }

    public void printStudentList(){
        if(studList.size() > 0){
            for (int i = 0; i < studList.size(); i++){
                System.out.println(i+1 + ". Name: " + studList.get(i).getfullName() + ". Student Number: " + studList.get(i).getstuNumber() +",GPA: " + studList.get(i).getgpa()); //creates the student list array

            }
        }else {
            System.out.println("Your list is empty");
        }
    }

    public void parseUserInput(Student s1, String name) {
        int comma = name.indexOf(","); 
        int space = name.indexOf (" "); 
        if (comma == -1 && findSpace(name) == 1){ // if no comma and two spaces -> First middle last
           s1.setFirstName(name.substring(0, space));
           s1.setMiddleName(null);
           s1.setlastName(name.substring(name.indexOf(" ", space +1) +1));
        }else if (comma != -1 && findSpace(name) == 1){ // if comma and one space -> last, first
            s1.setFirstName(name.substring(comma +1, name.indexOf(" ", comma +2)));
            s1.setMiddleName(name.substring(name.indexOf(" ", comma +2)+1));
            s1.setlastName(name.substring(0, comma));
        } else if (comma != -1 && findSpace(name) == 2 || findSpace(name) == 1 ) { // if comma and two spaces -> last, first middle
            s1.setFirstName(name.substring(0, comma));
            s1.setMiddleName(name.substring(space +1, name.indexOf(" ", space +1)));
            s1.setlastName(name.substring(name.indexOf(" ", space +1) +1));
        } else{
            s1.setFirstName(null);
            s1.setMiddleName(null);
            s1.setlastName(null);

        }
    }

    public int findSpace(String name){
        String changeName = name.toLowerCase();
        int count = 0;
        for (int i = 0; i < (changeName.length() -1); i++){
            if (changeName.substring(i, i+1).equals(" ")){
                count ++;
            }
        }
        if(changeName.substring(changeName.length() -1).equals(changeName)){
            count++;
        }
        return count;
    }
     public void sortList() {
        if(studList.size() == 0) {
            System.out.print("Your list has no students");
        } else {
            mergeSort(studList, studList.size());
            System.out.println("Students sorted by student number: ");
            printStudentList();
        }
    }
         public void mergeSort(ArrayList<Student> a, int n){ // uses merge sort
        if (n < 2){
            return;
        } // base case
        int mid = n/2;
        ArrayList<Student> l = new ArrayList<Student>(); // one half of array
        ArrayList<Student> r = new ArrayList<Student>(); // other half of array
        for(int i = 0; i < mid; i++){
            l.add(a.get(i)); // initializes array
        }
        for(int i = mid; i < n; i++){
            r.add(a.get(i)); // initializes array
        }
        
        // recursive part
        mergeSort(l, mid);
        mergeSort(r, n - mid);
        // to merge the smaller arrays
        merge(a, l, r, mid, n - mid);
    }
    
    public void merge(ArrayList<Student> a, ArrayList<Student> l, ArrayList<Student> r, int left, int right){
        // merge method for merge sort
        // instance variables to keep track of index within array
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < left && j < right){
            // runs through array until reaching the end (middle)
            if(l.get(i).getstuNumber() <= r.get(j).getstuNumber()){
                a.set(k++, l.get(i++)); // adds the left value to the array
            } else {
                a.set(k++, r.get(j++)); // adds the right value to the array
            }
        }
        while(i < left) {
            a.set(k++, l.get(i++)); // incrementation
        }
        while(j < right) {
            a.set(k++, r.get(j++)); // incrementation
        }
    }
    
     public void callBinarySearch(int n) {
        if(studList.size() == 0) {
            System.out.print("Your list has no students in it!");
        } else {
            mergeSort(studList, studList.size());
            binarySearch(studList, n, 0, studList.size());
        }
    }
    
    public void binarySearch(ArrayList<Student> a, int n, int start, int end) {
        int index = (end-start)/2;
        if(a.get(index).getstuNumber() == n){
            System.out.println();
            System.out.println("The student number " + n + " is:");
            System.out.println("Name: " + studList.get(index).getfullName() + ", Student Number: " + n + ", GPA: " + studList.get(index).getgpa());
            return;
        }
        if(a.get(index).getstuNumber() < n){
            binarySearch(a, n, index, end);
        } else {
            binarySearch(a, n, 0, index);
        }
    }
}


