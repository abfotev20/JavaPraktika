package _13_02_24;

public interface GenericInterface<T> {
    void add(T element);
    void remove(T element);
    T get(int Index);
}