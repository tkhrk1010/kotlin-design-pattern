package kotlinDesignPattern.Iterator

interface Aggregate<T> {
    fun iterator(): Iterator<T>
}