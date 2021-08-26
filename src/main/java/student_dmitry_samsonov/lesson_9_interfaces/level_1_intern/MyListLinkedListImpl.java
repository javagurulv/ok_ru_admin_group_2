package student_dmitry_samsonov.lesson_9_interfaces.level_1_intern;

import jdk.jshell.spi.ExecutionControl;

class MyListLinkedListImpl implements MyList{
    MyListLinkedListElem[] array = new MyListLinkedListElem[0];
    Integer headIndex = null;
    Integer tailIndex = null;

    @Override
    public void add(Object obj) {
        int length = this.array.length;
        MyListLinkedListElem[] newArray;
        if (length==0){
            newArray = new MyListLinkedListElem[1];
            newArray[0] = new MyListLinkedListElem(obj);
            this.headIndex = 0;
            this.tailIndex = 0;
        } else {
            newArray = new MyListLinkedListElem[length + 1];
            for (Integer index = 0; index < length; index++) {
                newArray[index] = this.array[index];
                if (index.equals(this.tailIndex)) {
                    newArray[index].nextIndex = index + 1;
                }
            }
            newArray[length] = new MyListLinkedListElem(obj);
            this.tailIndex = length;
        }
        this.array = newArray;
    }

    @Override
    public void remove(Object obj) {
        // Count elements to delete
        int found = 0;
        int length = this.array.length;
        for (MyListLinkedListElem o : this.array) {
            if (o.obj.equals(obj)) {
                found++;
            }
        }
        // Do nothing
        if (found==0) {
            return;
        }
        // Remove the only element from list is the same as creating new array
        if (found==1) {
            this.array = new MyListLinkedListElem[0];
            this.headIndex = null;
            this.tailIndex = null;
            return;
        }
        // Unlink elements before actual removal
        for (MyListLinkedListElem o : this.array) {
            if (o.obj.equals(obj)) {
                if (o.prevIndex == null && o.nextIndex != null) {
                    this.array[o.nextIndex].prevIndex = null;
                    this.headIndex = o.nextIndex;
                } else if (o.nextIndex == null && o.prevIndex != null) {
                    this.array[o.prevIndex].nextIndex = null;
                    this.tailIndex = o.prevIndex;
                } else if (o.nextIndex != null && o.prevIndex != null) {
                    this.array[o.prevIndex].nextIndex = o.nextIndex;
                    this.array[o.nextIndex].prevIndex = o.prevIndex;
                }
                // Case with o.prevIndex == null && o.nextIndex == null is same as found==1 higher in the method
            }
        }
        // Actual removal
        MyListLinkedListElem[] newArray = new MyListLinkedListElem[length-found];
        int removed = 0;
        for (int index=0; index<length; index++) {
            if (this.array[index].obj.equals(obj)) {
                removed++;
            } else {
                newArray[index-removed] = this.array[index];
            }
        }
        this.array = newArray;
    }

    @Override
    public void removeAll(Object[] obj) {
        for ( Object o : obj) {
            remove(o);
        }
    }

    @Override
    public void replace(Object oldObj, Object newObj) {
        for (int index = 0; index < this.array.length; index++) {
            if (this.array[index].obj.equals(oldObj)) {
                this.array[index].obj = newObj;
            }
        }
    }

    @Override
    public void sort() throws ExecutionControl.NotImplementedException{
        throw new ExecutionControl.NotImplementedException("Not implemented");
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
        return this.array[index].obj;
    }

    @Override
    public boolean contains(Object obj) {
        for (MyListLinkedListElem o : this.array) {
            if (o.obj.equals(obj)) {
                return true;
            }
        }
        return false;
    }
}
