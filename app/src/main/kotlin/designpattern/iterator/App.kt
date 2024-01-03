package designpattern.iterator

class App {
    fun main() {
        println("iterator")
        val bookShelf = BookShelf()
        bookShelf.appendBook(Book("Around the World in 80 Days"))
        bookShelf.appendBook(Book("Bible"))
        bookShelf.appendBook(Book("Cinderella"))
        bookShelf.appendBook(Book("Daddy-Long-Legs"))
        val it = bookShelf.iterator()
        while (it.hasNext()) {
            val book = it.next() as Book
            println(book.getName())
        }
    }
}
