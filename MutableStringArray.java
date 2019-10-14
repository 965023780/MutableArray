package mutable_array;
public class MutableStringArray {
    public String[] data = new String[10];
    public int size = 0;
//在动态数组末尾添加新元素
    public boolean add(String s) {
        if (size < getLength() - 1)
            data[size++] = s;
        else {
            String[] newData = new String[size * 2];
            for (int i = 0; i < size; i++)
                newData[i] = data[i];
            newData[size++] = s;
            data = newData;
        }
        return true;
    }
//在动态数组末尾添加数组s中所有元素
    public void add(String[] s) {
        for (int i = 0; i < s.length; i++)
            add(s[i]);
    }
//在指定位置添加元素
    public boolean addAt(String s, int index) {
        if (index < 0 || index > getLength())
            return false;
        if (size < getLength() - 1) {
            for (int i = size; i > index; i--)
                data[i] = data[i - 1];
            data[index] = s;
        } else {
            String[] newData = new String[size * 2];
            for (int i = 0; i < index; i++)
                newData[i] = data[i];
            newData[index] = s;
            for (int i = index + 1; i < data.length; i++)
                newData[i] = data[i - 1];
            data = newData;
        }
        size++;
        return true;
    }
//删除末尾的元素
    public boolean deleteLast() {
        data[--size] = null;
        return true;
    }
//删除指定位置的元素
    public boolean deleteAt(int index) {
        if (index < 0 || index >= size)
            return false;
        for (int i = index; i < size; i++)
            data[i] = data[i + 1];
        data[size--] = null;
        return true;
    }
//清空数组元素
    public void clear() {
        data = new String[10];
    }
//改变指定位置元素
    public void changeAt(String s, int index) {
        data[index] = s;
    }
//得到指定位置元素
    public String get(int index) {
        return data[index];
    }
//检测数组是是否有字符串s
    public boolean contains(String s) {
        for (int i = 0; i < size; i++)
            if (data[i].equals(s))
                return true;
        return false;
    }
//得到数组长度
    public int getLength() {
        return data.length;
    }
//输出所有元素
    public void putOut() {
        System.out.print("数组元素为：");
        for (int i = 0; i < data.length; i++)
            if (data[i] != null)
                System.out.print(" " + data[i]);
        System.out.println();
    }
}
