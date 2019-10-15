package mutable_array;
public class MutableStringArray {
    private String[] data = new String[10];
    public int size = 0;
//Add new data at the end
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
//Add elements in an other array at the end  
    public void add(String[] s) {
        for (int i = 0; i < s.length; i++)
            add(s[i]);
    }
//Add new data in the spcified location 
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
//Delete the data at the end
    public boolean deleteLast() {
        data[--size] = null;
        return true;
    }
//Delete the data in the specifed location
    public boolean deleteAt(int index) {
        if (index < 0 || index >= size)
            return false;
        for (int i = index; i < size; i++)
            data[i] = data[i + 1];
        data[size--] = null;
        return true;
    }
//Empty the mutable array
    public void clear() {
        data = new String[10];
    }
//Change the data in the specifed location
    public void changeAt(String s, int index) {
        data[index] = s;
    }
//Get and return the data in the specifed location
    public String get(int index) {
        return data[index];
    }
//Determine whether the data is in the array
    public boolean contains(String s) {
        for (int i = 0; i < size; i++)
            if (data[i].equals(s))
                return true;
        return false;
    }
//Get and return the length of the array
    public int getLength() {
        return data.length;
    }
//print elements in the array
    public void putOut() {
        System.out.print("数组元素为：");
        for (int i = 0; i < data.length; i++)
            if (data[i] != null)
                System.out.print(" " + data[i]);
        System.out.println();
    }
}
