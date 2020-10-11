import java.util.*;

public class BinarySearch {
    static int count=0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();  //Input Size of Array


        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        int x = binary_search(arr, 0, size-1);

        if(x==-1)
            System.out.println("NOT_FOUND");

            else
                System.out.println(x);


    }

    public static int binary_search(int[] arr, int low, int high) {

        if(high >= low)  // Terminating condition
        {

            int mid = (low + high)/2;
            if(mid+1 == arr[mid])  // In case middle element is equal to index, checking further in lower half to find if there is any further occurance
            {
                int y= binary_search(arr,low,mid-1);

                if(y==-1)
                  return mid+1;

            }
            if(mid+1 > arr[mid])  //Middle element is less than index
            {

                return binary_search(arr, (mid + 1), high);
            }
            else //Middle element is greater than index
                {


                return binary_search(arr, low, (mid - 1));

            }
        }


        return -1; // Return if match is found

    }



    }
