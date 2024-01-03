package designpattern.iterator

interface Iterator<T> {
    fun hasNext(): Boolean
    fun next(): Any
}