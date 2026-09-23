package backend;

public class SchoolManagementApp{
    public static void main(String args[]){
        AttendanceSystem attendance = new AttendanceSystem();
        SystemIntegration attendanceAdapter = new AttendanceSystemAdapter(attendance);

        GradingSystem grading = new GradingSystem();
        SystemIntegration gradingAdapter = new GradingSystemAdapter(grading);

        LibrarySystem library = new LibrarySystem();
        SystemIntegration libraryAdapter = new LibrarySystemAdapter(library);

        // Testing methods 

        System.out.println(attendanceAdapter.integrateSystem());
        System.out.println(gradingAdapter.integrateSystem());
        System.out.println(libraryAdapter.integrateSystem());
    }
}
