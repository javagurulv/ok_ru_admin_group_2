package student_dmitry_samsonov.lesson_9_interfaces.level_1_intern;

import java.util.Arrays;

class MyListArrayImpl implements MyList{
    Object[] array = new Object[0];

    @Override
    public void add(Object obj) {
        int length = this.array.length;
        Object[] newArray = new Object[length+1];
        for (int index=0; index<length; index++) {
            newArray[index] = this.array[index];
        }
        newArray[length] = obj;
        this.array = newArray;
    }

    @Override
    public void remove(Object obj) {
        int found = 0;
        int length = this.array.length;
        for (Object o : this.array) {
            if (o.equals(obj)) {
                found++;
            }
        }
        if (found==0) {
            return;
        }

        Object[] newArray = new Object[length-found];
        int removed = 0;
        for (int index=0; index<length; index++) {
            if (this.array[index].equals(obj)) {
                removed++;
            } else {
                newArray[index-removed] = this.array[index];
            }
        }
        this.array = newArray;
    }

    @Override
    public void removeAll(Object[] obj) {
        int found = 0;
        int length = this.array.length;
        for (Object o : this.array) {
            for (Object objToRemove: obj){
                if (o.equals(objToRemove)) {
                    found++;
                    break;
                }
            }
        }
        if (found==0) {
            return;
        }

        Object[] newArray = new Object[length-found];
        int removed = 0;
        for (int index=0; index<length; index++) {
            for (Object objToRemove: obj) {
                if (this.array[index].equals(objToRemove)) {
                    removed++;
                } else {
                    newArray[index-removed] = this.array[index];
                }
            }
        }
        this.array = newArray;
    }

    @Override
    public void replace(Object oldObj, Object newObj) {
        for (int index = 0; index < this.array.length; index++) {
            if (this.array[index].equals(oldObj)) {
                this.array[index] = newObj;
            }
        }
    }

    @Override
    public void sort() {
        Arrays.sort(this.array);
    }

    @Override
    public Integer size() {
        return this.array.length;
    }

    @Override
    public boolean isEmpty() {
        return this.array.length == 0;
    }

    @Override
    public Object get(Integer index) {
        return this.array[index];
    }

    @Override
    public boolean contains(Object obj) {
        for (Object o : this.array) {
            if (o.equals(obj)) {
                return true;
            }
        }
        return false;
    }
}
