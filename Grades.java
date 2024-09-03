import java.util.Scanner;

public class Grades 
{
public static void main(String[] args)
{
    Scanner n = new Scanner(System.in);
    System.out.println("Enter the number of students: ");
    int num = n.nextInt();

    float[] grades = new float[num];

    int i=0;

    for(i=0;i<num;i++)
    {
        System.out.printf("Enter the grade of the subject %d: ",i+1);
        grades[i] = n.nextFloat();

    }

    System.out.println("Grades entered : ");
    for (float grade : grades){
        System.out.println(grade);
    }

    float sum =0;
    for (float grade : grades){
        sum += grade;
    }

    float average = sum/num;

    System.out.printf("Average of grades is: %.2f%n", average);
}
}