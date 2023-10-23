package java_programme;

/**
 * The class needs to have two constructors.
 * The first constructor does not have any parameters (no-arg constructor).
 * The second constructor has parameters width and height of type double
 * and it needs to initialize the fields.
 * In case the width is less than 0 it needs to set the width field value to 0,
 * in case the height parameter is less than 0 it needs to set the height field value to 0.
 */


public class Wall {
    private double width;
    private double height;

    public Wall() {
        //no arg constructor
    }
     public Wall(double width, double height) {
        //if condition
         if (width < 0) {
             this.width = 0;
         }else {
             this.width = width;
         }

         if (height < 0) {
             this.height = 0;
         }else {
             this.height =height;
         }
     }

     public double getWidth() {
        return width;
     }
     public double getHeight() {
        return  height;
     }

     public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        }else {
            this.width = width;
        }
     }

     public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        }else {
            this.height = height;
        }
     }
     public double getArea(){
        return width * height;
     }

     // Main Method
     public static void main(String[] args) {
         Wall wall = new Wall(5, 4);
         System.out.println("Area = " + wall.getArea());
         wall.setHeight(-1.5);
         System.out.println("Width = " + wall.getWidth());
         System.out.println("Height = " + wall.getHeight());
         System.out.println("Area = " + wall.getArea());
     }
}
