public class AttendanceSystemAdapter implements SystemIntegration{
    private AttendanceSystem attendance;

    public AttendanceSystemAdapter(AttendanceSystem attendance){
        this.attendance = attendance;
    }

    @Override
    public String integrateSystem(){
        return attendance.markAttendance();
    }
}