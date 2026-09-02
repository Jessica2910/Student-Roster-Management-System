import java.util.ArrayList;
import java.util.Locale;

public class Student_Main {
    public class Student {
        String studentID;
        String firstName;
        String lastName;
        String emailAddress;
        int age;
        int[] grades;

        //Accessors & Mutators for each variable
        String getStudentID () {
            return this.studentID;
        }
        void setStudentID(String studentID) {
            this.studentID = studentID;
        }

        String getFirstName () { return this.firstName; }
        void setFirstName (String firstName) {
            this.firstName = firstName;
        }

        String getLastName () {
            return this.lastName;
        }
        void setLastName (String lastName) {
            this.lastName = lastName;
        }

        String getEmailAddress () {
            return this.emailAddress;
        }
        void setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
        }

        int getAge () {
            return this.age;
        }
        void setAge (int age) {
            this.age = age;
        }

        int[] getGrades () {
            return this.grades;
        }
        void setGrades (int[] grades) {
            this.grades = grades;
        }

        //Constructor for students
        public Student() {
            this.studentID = getStudentID();
            this.firstName = getFirstName();
            this.lastName = getLastName();
            this.emailAddress = getEmailAddress();
            this.age = getAge();
            this.grades = getGrades();
        }

        //Print student info
        void print() {};
    }

    class Student_Roster {
        ArrayList<Student> studentList = new ArrayList<>();

        public void add(String studentID, String firstName, String lastName, String emailAddress,
                               int age, int grade1, int grade2, int grade3) {

            Student student = new Student();
            student.setStudentID(studentID);
            student.setFirstName(firstName);
            student.setLastName(lastName);
            student.setEmailAddress(emailAddress);
            student.setAge(age);

            studentList.add(student);
        }

        public void remove(String studentID) {}

        public void print_all() {}

        public void print_average_grade(String studentID) {}

        public void print_invalid_emails() {}
    }

    void main() {
        //List of students
        String[] students = {"1,John,Smith,John1989@gmail.com,20,88,79,59",
                "2,Suzan,Erickson,Erickson_1990@gmail.com,19,91,72,85",
                "3,Jack,Napoli,The_lawyer99yahoo.com,19,85,84,87",
                "4,Erin,Black,Erin.black@comcast.net,22,91,98,82",
                "5,Jessica,Murphy,jmurph91@wgu.edu,27,90,96,94"};

        Student_Roster studentRoster = new Student_Roster();

        for (String student : students) {
            String[] student_array = student.split(",");

            studentRoster.add(student_array[0], student_array[1], student_array[2], student_array[3],
                    Integer.parseInt(student_array[4]), Integer.parseInt(student_array[5]),
                    Integer.parseInt(student_array[6]), Integer.parseInt(student_array[7]));
        }

        studentRoster.print_all();
        //Student_Roster.print_invalid_emails();

        //Student_Roster.print_average_grade();
        //Student_Roster.remove("3");
        //Student_Roster.remove("3");
    }
}