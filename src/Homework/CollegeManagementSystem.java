import java.util.ArrayList;
import java.util.List;

// Class to represent a Student
class Student {
    private String firstName;
    private String lastName;
    private String sex;
    private int age;
    private String dateOfBirth;
    private String cnp;  // CNP - Personal Numeric Code
    private String address;

    public Student(String firstName, String lastName, String sex, int age, String dateOfBirth, String cnp, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.cnp = cnp;
        this.address = address;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Student: " + firstName + " " + lastName + ", Sex: " + sex + ", Age: " + age +
                ", DOB: " + dateOfBirth + ", CNP: " + cnp + ", Address: " + address);
    }
}

// Class to represent a Professor
class Professor {
    public String firstName;
    public String lastName;
    private String sex;
    private int age;
    private String dateOfBirth;
    private String cnp;
    private String address;

    public Professor(String firstName, String lastName, String sex, int age, String dateOfBirth, String cnp, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.cnp = cnp;
        this.address = address;
    }

    // Method to display professor details
    public void displayProfessorDetails() {
        System.out.println("Professor: " + firstName + " " + lastName + ", Sex: " + sex + ", Age: " + age +
                ", DOB: " + dateOfBirth + ", CNP: " + cnp + ", Address: " + address);
    }
}

// Class to represent a Course
class Course {
    public String name;
    private String schedule;
    private String duration;
    private String description;
    private Professor assignedProfessor;

    public Course(String name, String schedule, String duration, String description) {
        this.name = name;
        this.schedule = schedule;
        this.duration = duration;
        this.description = description;
    }

    // Method to assign a professor to this course
    public void assignProfessor(Professor professor) {
        this.assignedProfessor = professor;
    }

    // Method to display course details along with assigned professor
    public void displayCourseDetails() {
        System.out.println("Course: " + name + ", Schedule: " + schedule + ", Duration: " + duration +
                ", Description: " + description);
        if (assignedProfessor != null) {
            System.out.print("Assigned Professor: ");
            assignedProfessor.displayProfessorDetails();
        } else {
            System.out.println("Assigned Professor: None");
        }
    }
}

// Class to represent the College
class College {
    private List<Student> students;
    private List<Professor> professors;
    private List<Course> courses;

    public College() {
        this.students = new ArrayList<>();
        this.professors = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    // Add a new student
    public void addStudent(Student student) {
        students.add(student);
    }

    // Add a new professor
    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    // Add a new course
    public void addCourse(Course course) {
        courses.add(course);
    }

    // Assign a professor to a course
    public void assignProfessorToCourse(String courseName, Professor professor) {
        for (Course course : courses) {
            if (courseName.equalsIgnoreCase(course.name)) {
                course.assignProfessor(professor);
                System.out.println("Assigned " + professor.firstName + " " + professor.lastName + " to " + courseName);
                return;
            }
        }
        System.out.println("Course not found.");
    }

    // Display details of all courses
    public void viewCourses() {
        for (Course course : courses) {
            course.displayCourseDetails();
        }
    }

    // Display details of all students
    public void viewStudents() {
        for (Student student : students) {
            student.displayStudentDetails();
        }
    }

    // Display details of all professors
    public void viewProfessors() {
        for (Professor professor : professors) {
            professor.displayProfessorDetails();
        }
    }
}

// Main class to run the program
public class CollegeManagementSystem {
    public static void main(String[] args) {
        // Create an instance of College
        College college = new College();

        // Create some students
        Student student1 = new Student("Sorin", "Nastase", "Male", 25, "1999-01-01", "1010199702468", "4 Aurara St.");
        Student student2 = new Student("Aura", "Pascale", "Female", 27, "1997-02-02", "2020297796413", "25 Portitei St.");
        Student student3 = new Student("Aurel", "Pascale", "Male", 25, "1999-03-03", "1030399874685", "35 Eternitati St.");
        Student student4 = new Student("Veronica", "Micle", "Female", 27, "1997-04-04", "2040497873216", "45 Garoafei St.");
        Student student5 = new Student("Florian", "Tanase", "Male", 25, "1999-05-05", "2050599678234", "25 Minciuni St.");
        Student student6 = new Student("Florica", "Tanase", "Female", 28, "1996-06-06", "1060696874321", "28 Libera St.");
        Student student7 = new Student("Bogdan", "Mocanu", "Male", 26, "1998-07-07", "1070798873541", "57 Ocupata St.");
        Student student8 = new Student("Mihaela", "Padureanu", "Female", 24, "1998-08-08", "2080898762432", "35 Sovata St.");

        // Add students to the college
        college.addStudent(student1);
        college.addStudent(student2);
        college.addStudent(student3);
        college.addStudent(student4);
        college.addStudent(student5);
        college.addStudent(student6);
        college.addStudent(student7);
        college.addStudent(student8);

        // Create some professors
        Professor professor1 = new Professor("Bogdan", "Petrescu", "Male", 45, "1979-03-03", "3567924678642", " 25 Moldoveanu S. St.");
        Professor professor2 = new Professor("Andreea", "Lipovenescu", "Female", 40, "1983-04-04", "2468721647832", "26 Garoafei St.");
        Professor professor3 = new Professor("Martina", "Agache", "Female", 50, "1973-05-05", "1356789432545", "29 Eternitati St.");
        Professor professor4 = new Professor("Bogdan", "Pascale", "Male", 55, "1968-06-06", "1246783216579", "38 Aurora St.");
        Professor professor5 = new Professor("Nicolae", "Ion", "Male", 52, "1971-07-07", "2346789412562", "60 Dobrogeanu Ghe. St.");
        Professor professor6 = new Professor("Petrica", "Pascale", "Male", 48, "1976-08-08", "1327856743259", "54 Pascale I. St.");
        Professor professor7 = new Professor("David", "Florian", "Male", 60, "1963-09-09", "1325796435824", "23 Apelor St.");
        Professor professor8 = new Professor("Ancuta", "Moldoveanu", "Female", 43, "1980-10-10", "23465876354126", "3 Eterna St.");

        // Add professors to the college
        college.addProfessor(professor1);
        college.addProfessor(professor2);
        college.addProfessor(professor3);
        college.addProfessor(professor4);
        college.addProfessor(professor5);
        college.addProfessor(professor6);
        college.addProfessor(professor7);
        college.addProfessor(professor8);

        // Create some courses
        Course course1 = new Course("Math", "Mon/Wed/Fri 9-10am", "3 months", "Advanced Calculus");
        Course course2 = new Course("Computer Science", "Tue/Thu 2-4pm", "4 months", "Intro to Programming");
        Course course3 = new Course("Physics", "Mon/Wed/Fri 10-11am", "3 months", "Mechanics and Waves");
        Course course4 = new Course("Chemistry", "Tue/Thu 9-11am", "4 months", "Organic Chemistry");
        Course course5 = new Course("Biology", "Mon/Wed 1-2pm", "3 months", "Genetics and Evolution");
        Course course6 = new Course("Geography", "Tue/Thu 10-11:30am", "4 months", "Physical Geography");
        Course course7 = new Course("English", "Mon/Wed/Fri 11am-12pm", "3 months", "Shakespearean Literature");
        Course course8 = new Course("History", "Tue/Thu 1-3pm", "4 months", "World History");

        // Add courses to the college
        college.addCourse(course1);
        college.addCourse(course2);
        college.addCourse(course3);
        college.addCourse(course4);
        college.addCourse(course5);
        college.addCourse(course6);
        college.addCourse(course7);
        college.addCourse(course8);

        // Assign professors to courses
        college.assignProfessorToCourse("Math", professor1);
        college.assignProfessorToCourse("Computer Science", professor2);
        college.assignProfessorToCourse("Physics", professor3);
        college.assignProfessorToCourse("Chemistry", professor4);
        college.assignProfessorToCourse("Biology", professor5);
        college.assignProfessorToCourse("Geography", professor6);
        college.assignProfessorToCourse("English", professor7);
        college.assignProfessorToCourse("History", professor8);

        // Display all courses
        System.out.println("\n--- Courses Offered ---");
        college.viewCourses();

        // Display all students
        System.out.println("\n--- Student List ---");
        college.viewStudents();

        // Display all professors
        System.out.println("\n--- Professor List ---");
        college.viewProfessors();
    }
}