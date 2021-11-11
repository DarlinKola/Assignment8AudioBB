package edu.temple.audiobb


import com.squareup.moshi.JsonClass
import java.io.Serializable

object BookList : Serializable{
    private val bookList : MutableList<Book> by lazy {
        ArrayList()
    }

    fun add(book: Book) {
        bookList.add(book)
    }

    fun addLibrary(library: List<Book>){
        for(book in library){
            add(book)
        }
    }

    fun remove(book: Book){
        bookList.remove(book)
    }

    fun clear(){
        bookList.clear()
    }

    operator fun get(index: Int) = bookList[index]

    fun size() = bookList.size



}