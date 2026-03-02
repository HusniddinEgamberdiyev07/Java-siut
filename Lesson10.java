class ArrayPass {
    int getMin(int[] a){
        // int highest = a[0];
        int lowest = a[0];
        
        for (int i = 1; i < a.length; i++) {
            // if(highest<a[i]){
            //     highest=a[i];
            // }
            if(lowest>a[i]){
                lowest=a[i];
            }
        }
        a[0] = 1000;
        return lowest;
    }
    // ArrayPass(){} -> default constructor
}


class Lesson10 {
    public static void main(String[] args) {
        ArrayPass arrObj = new ArrayPass();

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(arrObj.getMin(arr));
        System.out.println(arr[0]);
    }
}