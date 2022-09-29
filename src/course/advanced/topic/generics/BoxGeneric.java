package course.advanced.topic.generics;

public class BoxGeneric<T> {
   private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}
