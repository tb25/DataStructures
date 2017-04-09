import java.util.Arrays;

public class BinarySearch{
    public static <T extends Comparable<T>> int binarySearch(T[]a, T x){
        return binarySearch(a, x, 0, a.length -1);
    }

    private static <T extends Comparable<T>> int binarySearch(T[]a, T x, int low, int high){
        if(high < low){
            return -1;
        }

        int mid = (high+low)/2;
        if(a[mid].compareTo(x)==0){
            return mid;
        }
        else if(a[mid].compareTo(x)<0){
            return binarySearch(a, x, mid+1, high);
        }
        else{
            return binarySearch(a, x, low, mid-1);
        }
    }



    public static void main(String[] args){
        int count = 100;
        Rectangle[] rect = new Rectangle[count];
        for(int i = 0; i < count; i++){
            rect[i] = new Rectangle(i, i+100);
        }
        Arrays.sort(rect);
        System.out.println(binarySearch(rect, new Rectangle(0, 100)));
        System.out.println(binarySearch(rect, new Rectangle(1, 100)));
    }
}
