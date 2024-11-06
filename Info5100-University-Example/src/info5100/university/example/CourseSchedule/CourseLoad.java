/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseSchedule;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class CourseLoad {

    String semester;
    ArrayList<SeatAssignment> seatassignments;

    public CourseLoad(String s) {
        seatassignments = new ArrayList();
        semester = s;
    }

    public SeatAssignment newSeatAssignment(CourseOffer co) {

        Seat seat = co.getEmptySeat(); // seat linked to courseoffer
        if (seat == null) {
            return null;
        }
        SeatAssignment sa = seat.newSeatAssignment(this);
        seatassignments.add(sa);  //add to students course 
        return sa;
    }

    public void registerStudent(SeatAssignment sa) {

        sa.assignSeatToStudent(this);
        seatassignments.add(sa);
    }

    public float getSemesterScore() { //total score for a full semeter
        float sum = 0;
        for (SeatAssignment sa : seatassignments) {
            sum = sum + sa.GetCourseStudentScore();
        }
        return sum;
    }

    public ArrayList<SeatAssignment> getSeatAssignments() {
        return seatassignments;
    }

    public double calculateTuition() {
        double totalTuition = 0;

        for (SeatAssignment seatAssignment : seatassignments) {
            CourseOffer courseOffer = seatAssignment.getSeat().getCourseOffer();  // Get the course offer from the seat
            double coursePrice = courseOffer.getCourse().getCoursePrice();  // Get the price of the course
            totalTuition += coursePrice;  // Add to total tuition
        }

        return totalTuition;
    }

    public void registerCourse(CourseOffer courseOffer) {
        // Check if the course is already registered
        for (SeatAssignment sa : seatassignments) {
            if (sa.getSeat().getCourseOffer().getCourse().getCourseNumber().equals(courseOffer.getCourse().getCourseNumber())) {
                System.out.println("Already registered for course: " + courseOffer.getCourse().getName());
                return;
            }
        }

        // Create a new SeatAssignment for this course offer
        SeatAssignment seatAssignment = newSeatAssignment(courseOffer);
        if (seatAssignment != null) {
            System.out.println("Successfully registered for course: " + courseOffer.getCourse().getName());
        } else {
            System.out.println("Course registration failed: " + courseOffer.getCourse().getName());
        }
    }

}
