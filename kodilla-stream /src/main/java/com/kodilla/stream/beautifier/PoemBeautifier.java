package com.kodilla.stream.beautifier;

/**
 * Created by Marcin Muller on 26.07.17.
 */
public class PoemBeautifier {
    public void beautify(String text, PoemDecorator poemDecorator){
        System.out.println(poemDecorator.decorate(text));
    }
}
