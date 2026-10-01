package rectangleproject;


public class RectangleProject {

   
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4,40);
        System.out.println("1. Diktortgenin genisligi : " + rectangle1.width);
        System.out.println("1. Diktorgenin yuksekligi : " + rectangle1.height);
        System.out.println("1. Diktorgenin alani : " + rectangle1.getArea());
        System.out.println("1. Diktorgenin cevresi : " + rectangle1.getPerimeter());
        
        Rectangle rectangle2 = new Rectangle(3.5,35.9);
        
        System.out.println("2. Diktortgenin genisligi : " + rectangle2.width);
        System.out.println("2. Diktorgenin yuksekligi : " + rectangle2.height);
        System.out.println("2. Diktorgenin alani : " + rectangle2.getArea());
        System.out.println("2. Diktorgenin cevresi : " + rectangle2.getPerimeter());   
        
    }
    
}

class Rectangle {
    double width = 1;
    double height = 1;
    
    Rectangle(){
    width = 1;
    height = 1;
    }
    Rectangle(double newwidth, double newheight){
    width = newwidth;
    height = newheight;
    }
    
    double getArea(){
    return width * height;
    }
    double getPerimeter(){
    return 2 * (width + height);
    }
}

