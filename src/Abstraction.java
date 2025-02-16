public class Abstraction {


   static abstract class Shape{
    abstract void draw();
    }

   static class Circle extends Shape {
        void draw() {
            System.out.println("drawing a circle. ");
        }
    }

    public class AbstractionExample {

        public static void main(String[] args){

            Shape shape = new Circle();

            shape.draw();
        }
    }
}
