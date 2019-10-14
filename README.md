# MutableArray
## MredRock's Hoomwork
  ***Mrearock NB!***  
  ***Mrearock NB!***  
  ***Mrearock NB!***  
## MutableStringArray
### Class MutableStringArray (mutable_array package)  
#### Address：https://github.com/965023780/MutableArray/blob/master/MutableStringArray.java  
##### Example:   
   **1.add new data at the end**     
   
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
    
   **2.add new data to the index**  
  
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
###  Text  
#### Address：https://github.com/965023780/MutableArray/blob/master/Text.java  
##### Example:
