package problem2;

public class IntegerList
{
    int[] list; //values in the list
    private int  currentSize;
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
        currentSize = 0;
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++) {
            list[i] = (int) (Math.random() * 100) + 1;
            currentSize++;
        }
    }
    public void increaseSize(){
        int[] New = new int[list.length * 2];
        for(int i = 0 ; i < list.length;i++){
            New[i] = list[i];
        }
        list = New;
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }
    public void  addElement(int newVal){
        if(currentSize == list.length){
            increaseSize();
        }
        list[currentSize] = newVal;
        currentSize++;
    }

    public void removeFirst(int newVal){
        for(int i = 0 ; i < currentSize ; i++){
            if(list[i] == newVal){
                for(int j = i ; j < currentSize - 1 ; j++){
                    list[j] = list[j+1];
                }
                currentSize -= 1;
                break;
            }
        }
    }
    public void removeAll(int newVal){
        for(int i = 0 ; i < currentSize ; i++){
            if(list[i] == newVal){
                for(int j = i ; j < currentSize - 1 ; j++){
                    list[j] = list[j+1];
                }
                currentSize -= 1;
            }
        }
    }

}