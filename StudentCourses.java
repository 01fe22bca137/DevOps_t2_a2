class StudentCourses {
    public void displayStudentMarks() {
        // Assuming some courses and marks for the fourth semester
        String[] courses = {"C#", "ST", "ML", "Devops"};
        int[] marks = {90, 85, 95, 80};

        System.out.println("\nFourth Semester Courses and Marks:");
        for (int i = 0; i < courses.length; i++) {
            System.out.println(courses[i] + ": " + marks[i]);
        }
    }
}