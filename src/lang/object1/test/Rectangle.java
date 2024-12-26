package lang.object1.test;

public class Rectangle {

    private int width;
    private int height;

    public Rectangle(int width,int height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public String toString() {
        return "Rectangle{width="+width+", height="+height+"}";
    }
//    @Override
//    public boolean equals(Object object){
//        Rectangle rectangle=(Rectangle) object;
//        return rectangle.width==width&&rectangle.height==height;
//
//    }

    @Override
    public boolean equals(Object o){
        if(this==o)return true;
        if(o==null||getClass()!=o.getClass()) return false;

        Rectangle rectangle=(Rectangle)o;
        return width== rectangle.width && height== rectangle.height;
    }
}
