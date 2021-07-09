package c.impl.list;

public abstract class AbstractList implements List {
    public abstract void clear();
    public abstract void add();
    public abstract void update(int index, Object value);
    public abstract void remove(int index);
    public abstract Object getValue(int index);
}
