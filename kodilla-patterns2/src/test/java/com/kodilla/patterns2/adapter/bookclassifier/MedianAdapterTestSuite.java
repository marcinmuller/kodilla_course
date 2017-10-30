package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Marcin Muller on 30.10.17.
 */
public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest(){
        //given
        Book book1 = new Book("aa","aaa",1999,"aaaa");
        Book book2 = new Book("bb","bbb",2004,"bbbb");
        Book book3 = new Book("cc","ccc",1990,"cccc");
        Book book4 = new Book("dd","ddd",2007,"dddd");
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        MedianAdapter medianAdapter=new MedianAdapter();
        //when
        int result=medianAdapter.publicationYearMedian(bookSet);
        //then
        Assert.assertEquals(2001,result);
    }
}
