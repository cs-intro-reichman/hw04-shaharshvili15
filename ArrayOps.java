public class ArrayOps {
    public static void main(String[] args) {
        //findMissingInt(new int[] {3, 0, 1});
        //System.out.print(secondMaxValue(new int[] {-202, 48, 13, 7, 8}));
        //System.out.print(isSorted(new int[] {1, 1, 500}));
        //System.out.print(containsTheSameElements(new int[] {2,3}, new int[] {2,3,5}));
    }
    
    public static int findMissingInt (int [] array) {
        for(int i =0 ; i<=array.length ; i++){
            boolean isInArray = false;
            for(int j = 0 ; j<array.length ;j++){
                if(array[j] == i){
                    isInArray = true;
                    break;
                }
            }
            if(!isInArray){
                return i;
            }
        }
        return -1;
    }

    public static int secondMaxValue(int [] array) {
        int max = Math.max(array[0], array[1]);
        int secondMax = Math.min(array[0], array[1]);
        if(array.length == 2){
            return secondMax;
        }
        for(int i = 2 ;i<array.length; i++){
            if(array[i] >= max){
                secondMax = max;
                max = array[i];
            }
            if(array[i] < max && array[i] > secondMax){
                secondMax = array[i];
            }

        }
        return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        for (int i = 0 ; i< array1.length;i++){
            boolean isContainedInArray2 = false;
            for (int j = 0 ; j<array2.length; j++){
                if(array2[j] == array1[i]){
                    isContainedInArray2 = true;
                }
            }
            if(!isContainedInArray2){
                return false;
            }
        }
        for (int i = 0 ; i< array2.length;i++){
            boolean isContainedInArray1 = false;
            for (int j = 0 ; j<array1.length; j++){
                if(array1[j] == array2[i]){
                    isContainedInArray1 = true;
                }
            }
            if(!isContainedInArray1){
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted(int [] array) {
        int numberBefore = array[0];
        boolean increasing = false;
        boolean decreasing = false;
        for (int i = 1; i< array.length ; i++){
            if(!increasing && !decreasing){
                if(numberBefore > array[i]){
                    decreasing = true;
                }
                if(numberBefore< array[i]){
                    increasing = true;
                }
            }
            else{
                if(increasing && (numberBefore > array[i])){
                    return false;
                }
                if(decreasing && (numberBefore < array[i])){
                    return false;
                }
            }
        }
        return true;
    }

}
