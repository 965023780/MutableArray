public class Text {
    //测试
    public static void main(String[] agrs) {
        mutable_array.MutableStringArray mutableStringArray = new mutable_array.MutableStringArray();
        String[] StringArray = {"A", "B", "C"};
        String ch = "A";
        int length;
        Boolean flag;
        //储存A1——A9
        for (int i = 0; i < 10; i++) {
            mutableStringArray.add(ch + i);
        }
        mutableStringArray.putOut();
        //储存StringArray数组
        mutableStringArray.add(StringArray);
        mutableStringArray.putOut();
        //在data[5]中插入"A"
        mutableStringArray.addAt("A", 5);
        mutableStringArray.putOut();
        //数组长度和已储存元素个数
        length = mutableStringArray.getLength();
        System.out.println("length=" + length);
        System.out.println("size=" + mutableStringArray.size);
        //删除最后一个元素
        mutableStringArray.deleteLast();
        mutableStringArray.putOut();
        //删除第五个元素
        mutableStringArray.deleteAt(5);
        mutableStringArray.putOut();
        //将data[3]中元素更替为"d"
        mutableStringArray.changeAt("d", 3);
        mutableStringArray.putOut();
        //检索数组中是否有A1
        flag = mutableStringArray.contains("A1");
        System.out.println(flag);
        //检索数组中是否有A2
        flag = mutableStringArray.contains("A10");
        System.out.println(flag);
        //输出data[3]中的元素
        System.out.println(mutableStringArray.get(3));
        //清空数组元素
        mutableStringArray.clear();
        mutableStringArray.putOut();
    }
}
