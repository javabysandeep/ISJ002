package collectionFramework;

public class ArrayListCustom {
    private Object[] value;
    int size;
    int capacity = 5;

    public ArrayListCustom() {
        this.value = new Object[capacity];
        size = 0;
    }

    void add(Object value) {
        if (capacity > size) {
            this.value[size++] = value;
        } else {
            capacity = 2 * capacity;
            Object[] newArray = new Object[capacity];
            for (int i = 0; i < this.value.length; i++) {
                newArray[i] = this.value[i];
            }
            this.value = newArray;
            this.value[size++] = value;
        }
    }

    Object get(int index) {
        if (index >= 0 && index < this.value.length) {
            return this.value[index];
        }
        return -1;
    }


}
