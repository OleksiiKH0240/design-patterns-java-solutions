public class Main {

    public static void main(String[] args) {
        PrintableString hello = new PrintableString("Hello, World!");
        hello.print();

        System.out.println();

        PrintableInterface component = new PrintableString("");
        component = new PostComaDecorator(component);
        component = new PostSpaceDecorator(component);
        component = new PreWordDecorator(component, "Hello");
        component = new PostWordDecorator(component, "World");
        component = new PostExclaimDecorator(component);
        component = new PostEndlDecorator(component);
        component.print();
    }

}
