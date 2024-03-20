public class MyString {
    private String str;

    public MyString(String str) {
        this.str = str;
    }

    public MyString() {
        this.str = "";
    }

    public String getStr() {
        return str;
    }

    @Override
    public String toString() {
        return this.str;
    }

    public void append(String str) {
        this.str += str;
    }

    public void append(MyString str) {
        append(str.getStr());
    }

    public void incert(String str, int index) {
        if (index < 0 || index > this.str.length()) {
            throw new IndexOutOfBoundsException();
        }
        this.str = this.str.substring(0, index) + str + this.str.substring(index);
    }

    public void incert(MyString str, int index) {
        incert(str.getStr(), index);
    }

    public void deleteSubString(int start, int length) {
        if (start < 0 || start > this.str.length() || length < 0 || (start + length) > this.str.length()) {
            throw new IndexOutOfBoundsException();
        }
        this.str = this.str.substring(0, start) + this.str.substring(start + length);
    }

    public void replace(String str, int start, int length) {
        if (start < 0 || start > this.str.length() || length < 0 || (start + length) > this.str.length()) {
            throw new IndexOutOfBoundsException();
        }
        this.str = this.str.substring(0, start) + str + this.str.substring(start + length);
    }

    public void replace(MyString str, int start, int length) {
        replace(str.getStr(), start, length);
    }
}
