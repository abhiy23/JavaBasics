public class Array
{
    public static void main(String[] args){

        // Array initialization and creation
        // dataType[] arr; (or) dataType []arr;, (or) datatype arr[];
        // int nums[] = {2, 3, 5,6}; // Method 1

        // int nums[] = new int[4]; // It will create a size 4 array initialize defaul value 0;

        // nums[1]=8;

        // System.out.println(nums[1]);

        // 2D array

        int nums[][]= new int[3][4];


        // Assiging value
        for(int i=0; i<3; i++){
            for(int j=0;j<4; j++){
                nums[i][j]= (int)(Math.random() * 10);
            }
        }

        //printing array
        for(int i=0; i<3; i++){
            for(int j=0;j<4; j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

        // print with inhanced loop method

        System.out.println("Using enhanced for loop. see the code ..");

        for(int n[]: nums){
            for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println();
        }

        // array IndexOutofBound Exception

        int arr[]={10,20,30,40};
        for(int i=0; i<5;i++){
            System.out.print(arr[i]);
        }


    }
}