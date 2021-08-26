package student_dmitry_samsonov.lesson_9_interfaces.level_1_intern;

class MyListLinkedListElem {
    public Object obj;
    public Integer prevIndex;
    public Integer nextIndex;

    public MyListLinkedListElem() {
    }

    public MyListLinkedListElem(Object obj) {
        this.obj = obj;
        this.prevIndex = prevIndex;
        this.nextIndex = nextIndex;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public int getPrevIndex() {
        return prevIndex;
    }

    public void setPrevIndex(int prevIndex) {
        this.prevIndex = prevIndex;
    }

    public int getNextIndex() {
        return nextIndex;
    }

    public void setNextIndex(int nextIndex) {
        this.nextIndex = nextIndex;
    }
}
