import java.util.Scanner;

public class MyArray
{
    static int smallestNum, largestNum, averageValue;

    public static void main(String[] args)
    {
        int arraySize;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Enter the length of an array: ");
            arraySize = scan.nextInt();

            if (arraySize < 5 || arraySize > 7)
                System.out.println("The length of the array cannot less than 5 or more than 7, please enter again!\n");

        } while (arraySize < 5 || arraySize > 7);


        int[] num = new int[arraySize];

        for (int i = 0; i < num.length ; i++)
        {
            System.out.printf("Please enter num[%d]: ", i);
            num[i] = scan.nextInt();
        }

        System.out.println();

        smallestNum = getMinimumNumber(num);
        System.out.println("Minimum: " + smallestNum);

        largestNum = getMaximumNumber(num);
        System.out.println("Maximum: " + largestNum);

        averageValue = getAverageValue(num);
        System.out.println("Average: " + averageValue);
    }

    public static int getMinimumNumber(int[] num)
    {
        int minIndex = 0;

        for (int i = 1; i < num.length ; i++)
        {
            if (num[minIndex] > num[i])
                minIndex = i;
        }
        smallestNum = num[minIndex];
        return smallestNum;
    }

    public static int getMaximumNumber(int[] num)
    {
        int maxIndex = 0;

        for (int i = 1; i < num.length; i++)
        {
            if (num[maxIndex] < num[i])
                maxIndex = i;
        }
        largestNum = num[maxIndex];
        return largestNum;
    }

    public static int getAverageValue(int[] num)
    {
        int sum;

        sum = 0;
        for (int i = 0; i < num.length; i++)
            sum = sum + num[i];

        if (num.length != 0)
            averageValue = sum / num.length;

        else
            averageValue = 0;

        return averageValue;
    }
}