public class StudentInfo
{
    private String name,matricNo;
    private double totalMarks;
    private String grade;

    public StudentInfo(){
        totalMarks=0;
        grade="";
    }

    public void setInfo(String name,String matricNo)
    {
        this.name=name;
        this.matricNo=matricNo;
    }

    public String getName(){
        return name;
    }
    public String getMatricNo(){
        return matricNo;
    }

    public double getTotalMarks(){
        return totalMarks;
    }


    public void setMark(double totalMarks){
        this.totalMarks=totalMarks;
    }


    public void computeGrade(){
        if(totalMarks >=85)
            grade = "A";
        else if (totalMarks >=60)
            grade = "B";
        else if (totalMarks >=50)
            grade = "C";
        else if (totalMarks >=40)
            grade = "D";
        else
            grade = "F";
    }

    public String getGrade(){
        return grade;
    }

    public String toString(){
        return "\nName : " + name + "\nMatric No : " + matricNo +"\nMarks : " + totalMarks + "\nGrade : " + grade + "\n";
    }
}
