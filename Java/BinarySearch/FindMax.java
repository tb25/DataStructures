public class FindMax{
    public static<T extends Comparable<T>> T findMax(T[]a){
        int m = 0;
        for(int i = 0; i<a.length; i++){
            if(a[i].compareTo(a[m])>0){
                m=i;
            }
        }
        return a[m];
    }

    public static void main(String[] args){
        Rectangle[] rect = new Rectangle[100];

        for(int i = 0; i < 100; i++){
            rect[i] = new Rectangle(i, i +100);
        }

        System.out.println(findMax(rect).equals(rect[99]));
        System.out.println(findMax(rect));
    }
}
