public class Arr
{
    public static void main(String arg[])
    {
        int arr1 []  = {1,2,3,4};
        int arr2 [] = {5,6,7,8};
        int arr3 [] = new int [arr1.length + arr2.length];
        for(int i =0; i<arr3.length ; i++)
        {
            if(i>=0 && i<4)
            {
                arr3[i] = arr1[i];
                System.out.println("Element: "+ arr3[i]);
            }
            else
            {
                arr3[i]  = arr2[i-arr1.length];
                System.out.println("Element: "+ arr3[i]);
            }
        }
    }
}