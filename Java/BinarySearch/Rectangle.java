public class Rectangle implements Comparable<Rectangle>{
    private int length, width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int compareTo(Rectangle o){
        int perimeter1 = 2*length+2*width;
        int perimeter2 = 2*o.length + 2*o.width;

        return perimeter1-perimeter2;
    }

    public String toString(){
        return String.format("Length:%d Width%d", length, width);
    }
}
