public class Text {
    //TextDemo
    public static void main(String[] agrs) {
        mutable_array.MutableStringArray mutableStringArray = new mutable_array.MutableStringArray();
        String[] StringArray = {"A", "B", "C"};
        String ch = "A";
        int length;
        Boolean flag;
        //Add A1——A9 at the end
        for (int i = 0; i < 10; i++) {
            mutableStringArray.add(ch + i);
        }
        mutableStringArray.putOut();
        //Add elements in StringArray
        mutableStringArray.add(StringArray);
        mutableStringArray.putOut();
        //Add String "A" at data[5]"
        mutableStringArray.addAt("A", 5);
        mutableStringArray.putOut();
        //Print the length of array(length) and the number of elements(size)
        length = mutableStringArray.getLength();
        System.out.println("length=" + length);
        System.out.println("size=" + mutableStringArray.size);
        //Delete the last data
        mutableStringArray.deleteLast();
        mutableStringArray.putOut();
        //Delete the data at data[5]
        mutableStringArray.deleteAt(5);
        mutableStringArray.putOut();
        //Change the data at data[5] for String "d"
        mutableStringArray.changeAt("d", 3);
        mutableStringArray.putOut();
        //Determine whether String "A1" is in the array
        flag = mutableStringArray.contains("A1");
        System.out.println(flag);
        //Determine whether String "A10" is in the array
        flag = mutableStringArray.contains("A10");
        System.out.println(flag);
        //Get and print the data at data[3]
        System.out.println(mutableStringArray.get(3));
        //Clear the mutablearray
        mutableStringArray.clear();
        mutableStringArray.putOut();
    }
}
