import java.util.ArrayList;

public class Student_Main {
    private static class Student {
        private String studentID;
        private String firstName;
        private String lastName;
        private String emailAddress;
        private int age;
        private int[] grades;

        //Accessors & Mutators for each variable
        String get_student_ID () {
            return this.studentID;
        }
        void set_student_ID(String studentID) {
            this.studentID = studentID;
        }

        String get_first_name () { return this.firstName; }
        void set_first_name (String firstName) {
            this.firstName = firstName;
        }

        String get_last_name () {
            return this.lastName;
        }
        void set_last_name (String lastName) {
            this.lastName = lastName;
        }

        String get_email_address () {
            return this.emailAddress;
        }
        void set_email_address(String emailAddress) {
            this.emailAddress = emailAddress;
        }

        int get_age () {
            return this.age;
        }
        void set_age (int age) {
            this.age = age;
        }

        int[] get_grades () {
            return this.grades;
        }
        void set_grades (int[] grades) {
            this.grades = grades;
        }

        //Constructor for students
        public Student() {
            this.studentID = get_student_ID();
            this.firstName = get_first_name();
            this.lastName = get_last_name();
            this.emailAddress = get_email_address();
            this.age = get_age();
            this.grades = get_grades();
        }

        //Print student info one at a time
        void print() {
            System.out.printf("%s\tFirst Name: %s\tLast Name: %s\tAge: %d\tGrades: {",
                    get_student_ID(), get_first_name(), get_last_name(), get_age());

            for (int i = 0; i < get_grades().length; i++) {
                System.out.printf("%d", get_grades()[i]);

                if (i != 2) {
                    System.out.print(", ");
                }
                else {
                    System.out.println("}");
                }
            }
        }
    }

    private static class Student_Roster {
        //Creates an arrayList of students
        private final ArrayList<Student> studentList = new ArrayList<>();

        //Creates a student object with the information provided and adds it to the arrayList
        private void add(String studentID, String firstName, String lastName, String emailAddress,
                               int age, int grade1, int grade2, int grade3) {

            //Makes an array of the grades provided
            int[] grades = new int[3];
            grades[0] = grade1;
            grades[1] = grade2;
            grades[2] = grade3;

            //Sets the information for the student
            Student student = new Student();
            student.set_student_ID(studentID);
            student.set_first_name(firstName);
            student.set_last_name(lastName);
            student.set_email_address(emailAddress);
            student.set_age(age);
            student.set_grades(grades);

            //Adds the student to the arrayList
            studentList.add(student);
        }

        //Removes a specific student from the roster if found, prints error code if not
        private void remove(String studentID) {
            int count = 0;

            for (int i = 0; i < studentList.size(); i++) {
                if (studentList.get(i).get_student_ID().equals(studentID)) {
                    studentList.remove(i);
                    count++;
                }
            }

            if (count == 0) {
                System.out.println("Student ID not found.");
            }
        }

        //Prints the information for each student
        private void print_all() {
            for (Student student : studentList) {
                student.print();
            }
        }

        //Calculates the average grade for each student and prints it out
        public void print_average_grade(String studentID) {
            for (Student student : studentList) {
                if (student.get_student_ID().equals(studentID)) {
                    int average = (student.get_grades()[0] +  student.get_grades()[1] + student.get_grades()[2]) / 3;

                    System.out.println(student.get_student_ID() + "\t" + average);
                }
            }
        }

        //Finds invalid emails and prints them
        public void print_invalid_emails() {
            for (Student student : studentList) {
                String email = student.get_email_address();
                if (!email.contains("@") || !email.contains(".")) {
                    System.out.println(email);
                }
            }
        }
    }

    static void main() {
        //List of students
        String[] students = {"1,John,Smith,John1989@gmail.com,20,88,79,59",
                "2,Suzan,Erickson,Erickson_1990@gmailcom,19,91,72,85",
                "3,Jack,Napoli,The_lawyer99yahoo.com,19,85,84,87",
                "4,Erin,Black,Erin.black@comcast.net,22,91,98,82",
                "5,Jessica,Murphy,jmurph91@wgu.edu,27,90,96,94"};

        //Creates the student roster
        Student_Roster studentRoster = new Student_Roster();

        //Populates the student roster
        for (String student : students) {
            String[] student_array = student.split(",");

            studentRoster.add(student_array[0], student_array[1], student_array[2], student_array[3],
                    Integer.parseInt(student_array[4]), Integer.parseInt(student_array[5]),
                    Integer.parseInt(student_array[6]), Integer.parseInt(student_array[7]));
        }

        studentRoster.print_all();
        studentRoster.print_invalid_emails();

        for (String student : students) {
            studentRoster.print_average_grade(student.substring(0, 1));
        }

        studentRoster.remove("3");
        studentRoster.remove("3");
    }
}