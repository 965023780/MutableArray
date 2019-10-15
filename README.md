# MutableArray
 ## Apology
 <font size=4> It's the fisrt time for me to use GitHub.There may be trouble in the standard coding format ,MrakDown(readme) writing or somewehere else,whitch may disturb you.I apologize first here for the possible trouble. </font>
## MreaRock's Homework
   **The repository is intended for the homework**  
  ***Mrearock NB!***  
## MutableStringArray
### Class MutableStringArray (mutable_array package)  
#### Address：https://github.com/965023780/MutableArray/blob/master/MutableStringArray.java 
#### Behavior:  
●**public boolean add(String s)**  //Add new data at the end  
●**public void add(String[] s)**  //Add elements in an other array at the end  
●**public boolean addAt(String s, int index)** //Add new data in the spcified location  
●**public boolean deleteLast()** //Delete the data at the end  
●**public boolean deleteAt(int index)**  //Delete the data in the specifed location  
●**public void clear()** //Empty the mutable array  
●**public void changeAt(String s, int index)** //Change the data in the specifed location  
●**public String get(int index)**  //Get and return the data in the specifed location  
●**public boolean contains(String s)**  //Determine whether the data is in the array  
●**public int getLength()** //Get and return the length of the array  
●**public void putOut()**  //print elements in the array  
#### Example:   
   **1.Add new data at the end**     
   
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
    
   **2.Add elements in an other array at the end**  
  
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
###  TextDemo
#### Address：https://github.com/965023780/MutableArray/blob/master/Text.java  
##### Example:
  **Input**  
 ![**Input**](https://github.com/965023780/MutableArray/blob/master/TextInput.png)  
 **Result**  
 ![**Result**](https://github.com/965023780/MutableArray/blob/master/Result.png)
