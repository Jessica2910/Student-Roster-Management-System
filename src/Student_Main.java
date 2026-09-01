import java.util.ArrayList;

public class Student_Main {
    public class Student {
        String studentID;
        String firstName;
        String lastName;
        String emailAddress;
        int age;
        int[] grades;

        //Accessors & Mutators for each variable
        String getStudentID (String studentID) {
            return this.studentID;
        }
        void setStudentID(String studentID) {
            this.studentID = studentID;
        }

        String getFirstName (String firstName) {
            return this.firstName;
        }
        void setFirstName (String firstName) {
            this.firstName = firstName;
        }

        String getLastName (String lastName) {
            return this.lastName;
        }
        void setLastName (String lastName) {
            this.lastName = lastName;
        }

        String getEmailAddress (String emailAddress) {
            return this.emailAddress;
        }
        void setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
        }

        int getAge (int age) {
            return this.age;
        }
        void setAge (int age) {
            this.age = age;
        }

        int[] getGrades (int[] grades) {
            return this.grades;
        }
        void setGrades (int[] grades) {
            this.grades = grades;
        }

        //Constructor for students
        public Student(String studentID, String firstName, String lastName,
                       String emailAddress, int age, int[] grades) {
            this.studentID = studentID;
            this.firstName = firstName;
            this.lastName = lastName;
            this.emailAddress = emailAddress;
            this.age = age;
            this.grades = grades;
        }

        //Print student info
        static void print() {};
    }

    static class Student_Roster {
        ArrayList<Student> students;

        static public void add(String studentID, String firstName, String lastName, String emailAddress,
                        int age, int grade1, int grade2, int grade3) {
        }

        static public void remove(String studentID) {}

        static public void print_all() {}

        static public void print_average_grade(String studentID) {}

        static public void print_invalid_emails() {}
    }

    void main() {
        //List of students
        String[] students = {"1,John,Smith,John1989@gmail.com,20,88,79,59",
                "2,Suzan,Erickson,Erickson_1990@gmail.com,19,91,72,85",
                "3,Jack,Napoli,The_lawyer99yahoo.com,19,85,84,87",
                "4,Erin,Black,Erin.black@comcast.net,22,91,98,82",
                "5,Jessica,Murphy,jmurph91@wgu.edu,27,90,96,94"};

        Student_Roster.add();
        Student_Roster.print_all();
        Student_Roster.print_invalid_emails();

        Student_Roster.print_average_grade();
        Student_Roster.remove("3");
        Student_Roster.remove("3");
    }
}