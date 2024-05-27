public class Client {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 3, 3);

        String[] edges = {
                "b",
                "c",
                "a",
                "c",
                "b",
        };

        float[] values = {
                4,
                5,
                4,
                2,
                3,
        };

        for (int index = 0; index < edges.length; index++) {
            switch (edges[index]) {
                case "a":
                    triangle.setA(values[index]);
                    break;
                case "b":
                    triangle.setB(values[index]);
                    break;
                case "c":
                    triangle.setC(values[index]);
                    break;
            }

            System.out.println("Square = " + triangle.square());
        }

        Caretaker caretaker = new Caretaker(triangle);

        caretaker.save();
        System.out.println("Initial triangle: " + triangle);
        System.out.println("triangle area: " + triangle.square());

        triangle.setA(3);
        System.out.println("Updated triangle: " + triangle);
        System.out.println("triangle area: " + triangle.square());


        caretaker.restore();
        System.out.println("Origin triangle: " + triangle);
        System.out.println("triangle area: " + triangle.square());
    }

}
