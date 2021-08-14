import java.util.Arrays;

public class Homework3 {

    public static void main(String[] args)
    {
        zadanie1();
        zadanie2();
        zadanie3();
        zadanie4();
        zadanie5(6, 6);
    }

    public static void zadanie1()

    {

        int[] arr = {1, 0, 0, 1, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++)

        {
            if (arr[i] == 0)

            {
                arr[i] = 1;
            }

            else

            {
                arr[i] = 0;
            }

        }

        System.out.println("1____________________");
        System.out.println();
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    public static void zadanie2()

    {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++)

            {
                arr[i] = 1 + i;
            }

        System.out.println("2____________________");
        System.out.println();
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    public static void zadanie3()
    {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < 6)

            {
               arr[i] = (arr[i]) * 2;
            }
        }

        System.out.println("3____________________");
        System.out.println();
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    public static void zadanie4()

    {
        System.out.println("4____________________");
        System.out.println();

        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                if (arr[0][0] == 0)
                    arr[0][0] = 1;
                if (arr[1][1] == 0)
                    arr[1][1] = 1;
                if (arr[2][2] == 0)
                    arr[2][2] = 1;
                if (arr[3][3] == 0)
                    arr[3][3] = 1;
                if (arr[3][0] == 0)
                    arr[3][0] = 1;
                if (arr[2][1] == 0)
                    arr[2][1] = 1;
                if (arr[1][2] == 0)
                    arr[1][2] = 1;
                if (arr[0][3] == 0)
                    arr[0][3] = 1;
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
        System.out.println();
    }

    public static int zadanie5(int len, int initialValue)
            // не совсем понял условия задания, надеюсь сделал правильно)
    {
        System.out.println("5____________________");
        System.out.println();

        int arr[] = new int[len];

            for (int i = 0; i < arr.length; i++)

                arr[i] = initialValue;

                return len;
    }
}

