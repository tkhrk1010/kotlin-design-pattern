class Aggregate<T>(val list: List<T>) {
    operator fun iterator(): Iterator<T> {
        return list.iterator()
    }
}