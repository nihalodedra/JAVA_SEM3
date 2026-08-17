abstract class Shape {
    abstract double area();
}

class Rectangle extends Shape{
    int l,b;
    Rectangle(int l,int b) {
        this.l=l;
        this.b= b;
    }
    double area(){
        return l*b;
    }
}



class Triangle extends Shape{
    int b,h;
    Triangle(int b,int h){
        this.b=b;
        this.h=h;
    }
    double area(){
        return b*h/2;
    }
}




class Circle extends Shape{
    int r;
    Circle(int r){
        this.r=r;
    }
    double area(){
        return (22*r*r/7);
    }
}




public class AreaOfShapes{
    public static void main(String[] args){
        Shape[]s={
            new Rectangle(10, 5),
            new Triangle(10, 4),
            new Circle(7)
        };

        double total=0;
        double largest=0;
        System.out.println("25AIML039");
        for (Shape x:s){
            double a=x.area();
            System.out.println("Area="+a);

            total+=a;
            if (a>largest){
                largest=a;
            }
        }
        System.out.println("Total="+total);
        System.out.println("Largest="+largest);
    }
}