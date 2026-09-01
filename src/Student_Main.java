public class Student_Main {
    class Student {
        int studentID;
        String firstName;
        String lastName;
        String emailAddress;
        int age;
        int[] grades;

        int getStudentID (int studentID) {
            return this.studentID;
        }
        void setStudentID(int studentID) {
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

        void print() {};
    }

    void main() {
        String[] students = {"1,John,Smith,John1989@gmail.com,20,88,79,59",
                "2,Suzan,Erickson,Erickson_1990@gmail.com,19,91,72,85",
                "3,Jack,Napoli,The_lawyer99yahoo.com,19,85,84,87",
                "4,Erin,Black,Erin.black@comcast.net,22,91,98,82",
                "5,Jessica,Murphy,jmurph91@wgu.edu,27,90,96,94"};
    }
}