public class Cuboid extends Rectangle{

    private int height;

    public Cuboid(int length,int breadth,int height){
        super(length,breadth);
        this.height =  height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int area(){
        return 2*super.area() + 2*super.getLength()*height + 2*super.getBreadth()*height; 
    }

    @Override
    public String toString() {
        return "Cuboid{" +
                "height=" + height +
                '}';
    }
}
