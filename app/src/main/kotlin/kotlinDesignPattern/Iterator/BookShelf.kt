package kotlinDesignPattern.Iterator

// implement Aggregate
class BookShelf : Aggregate<Book> {
    private val books: ArrayList<Book> = ArrayList()

    fun getBookAt(index: Int): Book = books[index]

    fun appendBook(book: Book) {
        books.add(book)
    }

    fun getLength(): Int = books.size

    override fun iterator(): Iterator<Book> = BookShelfIterator(this)
}