package kotlinDesignPattern.Iterator

interface Iterator<T> {
    fun hasNext(): Boolean
    fun next(): Any
}