public class MyStringBuilder {
    private final MyString str;

    public MyStringBuilder() {
        this.str = new MyString();
    }

    public MyStringBuilder append(String str) {
        this.str.append(str);
        return this;
    }

    public MyStringBuilder append(MyString str) {
        return append(str.getStr());
    }

    public MyStringBuilder incert(String str, int index) {
        this.str.incert(str, index);
        return this;
    }

    public MyStringBuilder incert(MyString str, int index) {
        return incert(str.getStr(), index);
    }

    public MyStringBuilder deleteSubString(int start, int length) {
        this.str.deleteSubString(start, length);
        return this;
    }

    public MyStringBuilder replace(String str, int start, int length) {
        this.str.replace(str, start, length);
        return this;
    }

    public MyStringBuilder replace(MyString str, int start, int length) {
        return replace(str.getStr(), start, length);
    }

    public MyString build() {
        return this.str;
    }
}
