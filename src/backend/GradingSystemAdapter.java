package backend;

public class GradingSystemAdapter implements SystemIntegration {
    private GradingSystem gradingSystem;

    public GradingSystemAdapter(GradingSystem gradingSystem){
        this.gradingSystem = gradingSystem;
    }

    @Override
    public String integrateSystem(){
        return gradingSystem.recordGrades();
    }
}
