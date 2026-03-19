class Lesson11 {
    public static void main(String[] args) {
        // int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        // System.out.println(arr.length + "\n");

        // for(int[] i : arr){
        // for(int j : i){
        // System.out.println(j);
        // }
        // }

        int[][] arr = new int[3][];
        arr[0] = new int[]{1,2};
        arr[1] = new int[]{34,50,70};
        arr[2] = new int[]{10,20,30,90,100};

        for(int[] i : arr){
            for(int j : i){
                System.out.println(j);
            }
        }

        System.out.println(arr[2][3]);
        
        int[] a; // null
        a=new int[]{1,2,3}; // creates a new array and puts {1,2,3}

        System.out.println("\n\n");

        int arr0[][] = {{1,2,3},{1,2},{1,2,3,4,5}};
        int arr1[][];
        arr1 = new int[3][];
        arr1 = arr0;
        System.out.println(arr1[2][2]);

        /* PROGRAM LISTING 2 - VARIABLE LENGTH ARRAYS */
        int arr3[][];
        arr3 = new int[3][];
        int OneD[] = {66,77,88,99};
        arr3[0] = OneD;
        System.out.println(arr3[0][2]);

        /* PROGRAM LISTING 3 - OTHER PERSPECTIVE */
        int arr4[][] = new int[3][];
        arr4[0] = new int[2];
        arr4[1] = new int[3];
        arr4[2] = new int[4];

        for(int i = 0; i < arr4[0].length; i++) 
            arr4[0][i] = i + 10;

        for(int i = 0; i < arr4[1].length; i++) 
            arr4[1][i] = i + 10;

        for(int i = 0; i < arr4[2].length; i++) 
            arr4[2][i] = i + 10;
    }
}

// 2d arrays

// column
// |1, 2| row
// |4, 5|

// int a can store integer
// int[] a can store one refrence of an array
// int[][] a can store a refrence of intger arrays

// [] this is an array and it refers to int[]
