public class Inheritance {


     static class Animal {
        void eat() {
            System.out.println("the Animal eat food.");
        }
    }

    static class Dog extends Animal {
        void bark() {
            System.out.println("the dog bark.");
        }
    }


        public static void main(String[] args) {

            Dog dog = new Dog();

            dog.eat();
            dog.bark();
        }
    }


