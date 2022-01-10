public class MyString {

    char[] contents;

    MyString(char[] c) {
        this.contents = c;
    }

    MyString(String s) {
        s = this.contents.toString();
    }

    int length() {
        int len = 0;
        while (len <= contents.length) {
            len += 1;
        }
        return len;
    }

    void show() {
        for (int i = 0; i < contents.length; i++) {
            System.out.print(contents[i]);
        }
    }

    void append_char(char c) {
        int size = contents.length;
        char[] new_contents = new char[size + 1];
        for (int i = 0; i < new_contents.length; i++) {
            if (i == size + 1) {
                new_contents[i] = c;
            }
        }

    }

    void delete_char(int index) {
        char[] new_contents = new char[contents.length - 1];

        for (int i = 0, k = 0; i < contents.length; i++) {
            if (i == index) {
                continue;
            }

            new_contents[k++] = contents[i];
        }
    }
    
    void insert_char(int index, char c) {
        char[] new_contents = new char[contents.length + 1];
        for (int i = 0; i < new_contents.length; i++) {
            if (i < index - 1)
                new_contents[i] = contents[i];
            else if (i == index - 1)
                new_contents[i] = c;
            else
                new_contents[i] = contents[i - 1];
        }
    }

    void replace_char(int index, char c) {
        for (int i = 0; i < contents.length; i++) {
            if (i == index)
                contents[i] = c;
        }
    }



    public static void main(String[] args) {
        char[] a = { 'h', 'e', 'l', 'l', 'o' };

        MyString s1 = new MyString(a);

        s1 = new MyString("hello");
        s1.show();
        s1.append_char('w');
        s1.delete_char(0);
        s1.replace_char(s1.length() - 1, 'g');

        s1.show(); 
        s1.insert_char(s1.length(), 'a');
        s1.show();
    }
}
