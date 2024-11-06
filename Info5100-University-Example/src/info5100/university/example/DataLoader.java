/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.university.example;

import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.Persona.StudentProfile;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.SeatAssignment;

/**
 *
 * @author nanik
 */
public class DataLoader {

    Department department;

    public DataLoader() {
        // Initialize department with a name of choice
        this.department = new Department("Computer Science");

        // Populate courses, professors, students, and schedules
        createCourses();
        createProfessors();
        createStudents();
        createCourseSchedule("Fall2020");
    }

    private void createCourses() {
        CourseCatalog catalog = department.getCourseCatalog();
        catalog.newCourse("CS101", "Introduction to Programming", 4); // Core Course
        catalog.newCourse("CS102", "Data Structures", 4);
        catalog.newCourse("CS103", "Algorithms", 4);
        catalog.newCourse("CS104", "Operating Systems", 4);
        catalog.newCourse("CS105", "Computer Networks", 4);
        catalog.newCourse("CS106", "Machine Learning", 4); // Elective
    }

    private void createProfessors() {
        PersonDirectory personDir = department.getPersonDirectory();
//       FacultyProfile faculty1 = new FacultyProfile(personDir.newPerson("P001","Dr. John Smith"));
//       FacultyProfile faculty2 = new FacultyProfile(personDir.newPerson( "P002","Dr. Emily Brown"));
//       FacultyProfile faculty3 = new FacultyProfile(personDir.newPerson("P003","Dr. Michael White"));
//       FacultyProfile faculty4 = new FacultyProfile(personDir.newPerson("P004","Dr. Sarah Black"));
//       FacultyProfile faculty5 = new FacultyProfile(personDir.newPerson("P005","Dr. Laura Green"));
        department.setFacultydirectory(personDir.newPerson("P001", "Dr. John Smith"));
        department.setFacultydirectory(personDir.newPerson("P002", "Dr. Emily Brown"));
        department.setFacultydirectory(personDir.newPerson("P003", "Dr. Michael White"));
        department.setFacultydirectory(personDir.newPerson("P004", "Dr. Sarah Black"));
        department.setFacultydirectory(personDir.newPerson("P005", "Dr. Laura Green"));

    }

    private void createStudents() {
        StudentDirectory studentDir = department.getStudentDirectory();
        PersonDirectory personDir = department.getPersonDirectory();

        // Define student IDs and names
        String[] studentIds = {"S1001", "S1002", "S1003", "S1004", "S1005", "S1006", "S1007", "S1008", "S1009", "S1010"};
        String[] studentNames = {"Alice Johnson", "Bob Smith", "Carol Williams", "David Brown", "Emma Jones",
            "Frank Garcia", "Grace Lee", "Henry Martinez", "Ivy Rodriguez", "Jack Wilson"};

        for (int i = 0; i < studentIds.length; i++) {
            String id = studentIds[i];
            String name = studentNames[i];

            // Create Person with the specified ID and name
            Person person = personDir.newPerson(id, name);

            // Create StudentProfile using the Person object and add it to StudentDirectory
            studentDir.newStudentProfile(person);
        }
    }

    private void createCourseSchedule(String semester) {
        CourseSchedule schedule = department.newCourseSchedule(semester);
        FacultyDirectory facultyDir = department.getFacultydirectory();
        System.out.println(facultyDir.findTeachingFaculty("P001"));
        CourseCatalog courseCatalog = department.getCourseCatalog();
        System.out.println(courseCatalog.getCourseByNumber("CS101"));

        // Assign faculty profiles to course offers
        schedule.newCourseOffer("CS101").AssignAsTeacher(facultyDir.findTeachingFaculty("P001"));
        schedule.newCourseOffer("CS102").AssignAsTeacher(facultyDir.findTeachingFaculty("P002"));
        schedule.newCourseOffer("CS103").AssignAsTeacher(facultyDir.findTeachingFaculty("P003"));
        schedule.newCourseOffer("CS104").AssignAsTeacher(facultyDir.findTeachingFaculty("P004"));
        schedule.newCourseOffer("CS105").AssignAsTeacher(facultyDir.findTeachingFaculty("P005"));

        for (StudentProfile student : department.getStudentDirectory().getStudentlist()) {
            System.out.println("Line 100: "+student.getTranscript().getCourseList());
            CourseLoad courseLoad = student.getCourseLoadBySemester(semester);
            System.out.println(courseLoad);
                if (courseLoad == null) {
        courseLoad = student.newCourseLoad(semester);  // Create and add CourseLoad if missing
    }
            courseLoad.registerCourse(schedule.getCourseOfferByNumber("CS101"));
            courseLoad.registerCourse(schedule.getCourseOfferByNumber("CS102"));
            courseLoad.registerCourse(schedule.getCourseOfferByNumber("CS103"));
            courseLoad.registerCourse(schedule.getCourseOfferByNumber("CS104"));
            courseLoad.registerCourse(schedule.getCourseOfferByNumber("CS105"));
        }
    }

    public void printSemesterReport(String semester) {
        System.out.println("Semester Report for " + semester);
        System.out.println("====================================");

        // Access the Student Directory to get all students
        for (StudentProfile student : department.getStudentDirectory().getStudentlist()) {
            String studentId = student.getPerson().getPersonId();;  // Get student ID from Person
            String studentName = student.getPerson().getName();
            // Get student name from Person

            System.out.println("Student ID: " + studentId);
            System.out.println("Student Name: " + studentName);

            // Retrieve the CourseLoad for the semester
            CourseLoad courseLoad = student.getCourseLoadBySemester(semester);
                if (courseLoad == null) {
        courseLoad = student.newCourseLoad(semester);  // Create and add CourseLoad if missing
    }

            // Print courses and grades
            System.out.println("Courses and Grades:");
            double totalCredits = 0;
            double totalPoints = 0;

            for (SeatAssignment seatAssignment : courseLoad.getSeatAssignments()) {
                CourseOffer courseOffer = seatAssignment.getSeat().getCourseOffer();  // Get CourseOffer from SeatAssignment
                String courseNumber = courseOffer.getCourseNumber();
                String professorName = courseOffer.getFacultyProfile().getPerson().getName();
                float grade = seatAssignment.getGrade();
                int credits = courseOffer.getCreditHours();

                // Calculate points for GPA (Assuming a method to convert grade to points exists)
                double gradePoints = getGradePoints(grade);
                totalCredits += credits;
                totalPoints += gradePoints * credits;

                System.out.println("  - Course: " + courseNumber);
                System.out.println("    Professor: " + professorName);
                System.out.println("    Grade: " + grade);
            }

            // Calculate GPA
            double gpa = totalCredits > 0 ? totalPoints / totalCredits : 0;
            System.out.println("GPA: " + gpa);

            // Calculate and print tuition fees
            double tuition = courseLoad.calculateTuition();
            System.out.println("Tuition Paid: $" + tuition);

            System.out.println("====================================\n");
        }
    }

// Helper method to get grade points (adjust this as needed for your grading scale)
    private double getGradePoints(float grade) {
        if (grade == 4.0) {
            return 4.0;
        } else if (grade == 3.0) {
            return 3.0;
        } else if (grade == 2.0) {
            return 2.0;
        } else if (grade == 1.0) {
            return 1.0;
        } else {
            return 0.0;
        }

    }

}
