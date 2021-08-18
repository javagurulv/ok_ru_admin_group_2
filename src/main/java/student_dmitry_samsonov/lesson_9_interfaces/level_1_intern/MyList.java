package student_dmitry_samsonov.lesson_9_interfaces.level_1_intern;

interface MyList {
    public void add(Object obj);
    // Создаёт новый массив длинной старый массив плюс 1, присваивает каждому элементу значение элемента с таким же
    // индексом старого массива, в последний индекс присваивает obj
    public void remove(Object obj);
    // Итерируется по массиву, считая количество элементов, которые equals obj.
    // Создаёт новый массив длинной старый массив минус кол-во совпадений, присваивает каждому элементу значение
    // элемента с таким же индексом старого массива, если этот элемент не equals obj
    public void removeAll(Object[] obj);
    // Так же как предыдущий, но equals сравнивает с каждым элементом массива obj
    public void replace(Object oldObj, Object newObj);
    // Итерируется по массиву, если текущий элемент equals oldObj, то присвоить на его место newObj
    public void sort();
    // Выполняет сортировки массива
    public Integer size();
    // Возвращает длинну массива
    public Boolean isEmpty();
    // Возвращает true, если size() equals 0
    public Object get(Integer index);
    // Возвращает объект с индексом index
    public Boolean contains(Object obj);
    // Итерируется по массиву, проверяет equals каждого элемента с obj, возвращает true при первом совпадении
}
