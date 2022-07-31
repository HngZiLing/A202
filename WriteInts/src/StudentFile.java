import java.io.*;
import java.util.*;

public class StudentFile
{
    static StudentInfo [] studentList = new StudentInfo[5];
    public static void main (String[] args) throws IOException
    {
        inputData();
        writeFile();
        readFile();
    }

    public static void inputData()
    {
        for (int i = 0; i < studentList.length; i++)
        {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter student name : ");
            String name = scan.nextLine();
            System.out.print("Enter student matric number : ");
            String matricNo = scan.nextLine();
            System.out.print("Enter student total marks : ");
            double totalMarks = scan.nextDouble();

            studentList[i] = new StudentInfo();
            studentList[i].setInfo(name, matricNo);
            studentList[i].setMark(totalMarks);
            studentList[i].computeGrade();
            System.out.println(studentList[i].toString());
        }
    }

    public static void writeFile() throws IOException
    {
        File outFile = new File("student.data");
        FileWriter outFileStream = new FileWriter(outFile);
        PrintWriter outStream = new PrintWriter(outFileStream);

        for (int i = 0; i < studentList.length; i++)
        {
            outStream.println(studentList[i].toString());
        }
    }

    public static void readFile() throws IOException
    {
        File inFile = new File("student.data");
        System.out.println("—— Read from a file ——");
        Scanner scan = new Scanner (inFile);
        while(scan.hasNextLine())
        {
            String line = scan.nextLine();
            System.out.println(line);
        }
        scan.close();
    }
}
