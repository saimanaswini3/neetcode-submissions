class DynamicArray {
    private int a[];
    private int size;
    private int capacity;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.a = new int[capacity];

    }

    public int get(int i) {
        return a[i];

    }

    public void set(int i, int n) {
        
        a[i] = n;
        

    }

    public void pushback(int n) {
        if(size == capacity)
        {
            resize();;
        }
        a[size] = n;
        size++;
    }

    public int popback() {
        size--;
        return a[size];
    }

    private void resize() {
        capacity = capacity * 2;
        int[] newArr = new int[capacity];
        for(int i=0;i<size;i++)
        {
            newArr[i] = a[i];
        }
        a = newArr;

    }

    public int getSize() {
        return size;

    }

    public int getCapacity() {
        return capacity;

    }
}