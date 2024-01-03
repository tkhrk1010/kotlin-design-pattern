package designpattern.iterator

interface Aggregate<T> {
    fun iterator(): Iterator<T>
}