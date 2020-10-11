import java.util.Scanner;

public class SolutionB {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int y = 0;

        int arr[] = new int[size];
        int key = input.nextInt();
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }


        if (size > 0) {
            int x = search(arr, key);
            if (x == -1)
                System.out.println("NOT_FOUND");
            else
                System.out.println(x+1);

        }

        else  // In case array size is 0
            System.out.println("NOT_FOUND");
    }

    public static int  search(int[] arr,int key) {
        int i = 1;
        int flag = 0;

        // This while loop will run till we find an element that is greater than key
        // that index will be using for our binary search instead of array.length

        try {

            while (arr[i-1] < key) {

                i = i * 2; // Incrementing i by 2 time in every increment to decrease the number of comparisons.
            }



        }

        catch(Exception e)
        {


             return -1;
        }

            int low = 0;
            int high = i; //Index at which key element becomes smaller than array element
            int x = binary_search(arr, low, high, key);
            if (x==-1)
                return -1;
            else
                return x;


    }
        public static int binary_search(int[] arr,int l,int r,int x)
        {

            if (r >= l) {
                int mid = l + (r - l) / 2;

                // If the element is present at the
                // middle itself
                if (arr[mid] == x)
                    return mid;

                // If element is smaller than mid, then
                // it can only be present in left subarray
                if (arr[mid] > x)
                    return binary_search(arr, l, mid - 1, x);

                // Else the element can only be present
                // in right subarray
                return binary_search(arr, mid + 1, r, x);
            }

            // We reach here when element is not present
            // in array
            return -1;

        }




    }
