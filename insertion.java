/* Insertion sort */
public class insertion{
    public static void isort(int[] arr){
        int n = arr.length;
        for(int j = 1; j<n; j++)
        {
            int key = arr[j];
            int i = j-1;
            while((i>-1) && (arr[i]>key)){
                arr[i+1] = arr[i];
                i--;
            }

            arr[i+1] = key;
        }

    }
    public static void main(String[] args){
        int arr[] = {3,62,35,2,-45,320,5,17,32,90};
        System.out.println("Before Sorting");
        for(int i =0; i<arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
        isort(arr);
        System.out.println("After Sorting");
        for(int i =0; i<arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
}