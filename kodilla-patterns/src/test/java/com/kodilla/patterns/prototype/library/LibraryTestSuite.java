package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

/**
 * Created by Marcin Muller on 17.08.17.
 */
public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //given
        Library library=new Library("Biblioteka");
        LocalDate date=LocalDate.of(1900,01,01);
        IntStream.range(1,10)
                .forEach(s->library.getBooks().add(new Book("książka nr "+s,"autor nr "+s, date)));

        Library clonedLibrary=null;
        try{
            clonedLibrary=library.deepCopy();
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }
        //when
        int size=library.getBooks().size();
        clonedLibrary.getBooks().add(new Book("dodana1","dodany1",date));
        clonedLibrary.getBooks().add(new Book("dodana2","dodany2",date));
        //then
        System.out.println(library.getName());
        for(Book b: library.getBooks()){
            System.out.println(b);
        }
        System.out.println("------------------------------------\n"+clonedLibrary.getName());
        for (Book b: clonedLibrary.getBooks()){
            System.out.println(b);
        }


        Assert.assertEquals(9,size);
        Assert.assertEquals(11,clonedLibrary.getBooks().size());
    }
}
