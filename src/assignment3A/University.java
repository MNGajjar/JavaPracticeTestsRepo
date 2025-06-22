package assignment3A;

public class University {
    static String universityName;
    static int totalStudents=0;
    static int totalProfessors=0;

    public static void setUniversityName(String universityName) {
        University.universityName = universityName;
    }

    public static void incrementTotalStudents() {
        totalStudents++;
    }

    public static void incrementTotalProfessors() {
        totalProfessors++;
    }

    public static String getUniversityName() {
        return universityName;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    public static int getTotalProfessors() {
        return totalProfessors;
    }

    public static String getStatics(){
        return "University Name: " + universityName + " " +
                "Total Students: " + totalStudents + " " +
                "Total Professors: " + totalProfessors;
    }
}
