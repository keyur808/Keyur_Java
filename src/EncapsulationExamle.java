public class EncapsulationExamle
{
    public static void main(String[] args)
    {
        Emp e1 = new Emp();
        e1.setEmpId(3);
        e1.setEmpName("Keyur");

//        Emp e2 = new Emp();
//        e2.empId=5;
//        e2.empName="Hind"
        System.out.println(e1.getEmpName());

    }
}
class Emp
{
    private int empId;
    private String empName;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

}


