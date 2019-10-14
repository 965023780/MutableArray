public class Text {
    public static void main(String[] agrs) {
        mutable_array.MutableStringArray mutableStringArray = new mutable_array.MutableStringArray();
        String[] StringArray = {"A", "B", "C"};
        String ch = "A";
        int length;
        Boolean flag;
        for (int i = 0; i < 10; i++) {
            mutableStringArray.add(ch + i);
        }
        mutableStringArray.putOut();
        mutableStringArray.add(StringArray);
        mutableStringArray.putOut();
        mutableStringArray.addAt("A", 5);
        mutableStringArray.putOut();
        length = mutableStringArray.getLength();
        System.out.println("length=" + length);
        System.out.println("size=" + mutableStringArray.size);
        mutableStringArray.deleteLast();
        mutableStringArray.putOut();
        mutableStringArray.deleteAt(5);
        mutableStringArray.putOut();
        mutableStringArray.changeAt("d", 3);
        mutableStringArray.putOut();
        flag = mutableStringArray.contains("A1");
        System.out.println(flag);
        flag = mutableStringArray.contains("A10");
        System.out.println(flag);
        mutableStringArray.clear();
        mutableStringArray.putOut();
    }
}
