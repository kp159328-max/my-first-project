public class Rectangle {
    private int length;
    private int breadth;

    Rectangle(int length , int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    // methods ....
// 1.
    public int area(){
        return length*breadth;
    }
    // 2.

    public int parimeter(){
        return 2*(this.length+this.breadth);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", breadth=" + breadth +
                '}';
    }
}
