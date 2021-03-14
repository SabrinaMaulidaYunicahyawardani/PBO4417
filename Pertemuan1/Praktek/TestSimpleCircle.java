public class TestSimpleCircle {
    /**main Method
     * @param argsd*/
    public static void main(String[] argsd){
        //create a circle with radius 1
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());
        
        //creat a circle with radius 20
        SimpleCircle circle2 = new SimpleCircle(20);
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea ());

        //creat a circle with radius 150
        SimpleCircle circle3 = new SimpleCircle(150);
        System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea ());

        //modify circle radius
        circle2.radius = 100;
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
    }
}