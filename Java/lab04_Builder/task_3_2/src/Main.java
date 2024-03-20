public class Main {
    public static void main(String[] args) {
        MyStringBuilder myStringBuilder = new MyStringBuilder();
        MyString myString = myStringBuilder
                .append("Hello ")
                .append("World")
                .append(".")
                .incert("Windows", 6)
                .incert(" ", 13)
                .replace("Admin", 14, 5)
                .deleteSubString(5, 8)
                .build();
        System.out.println(myString);
    }
}
