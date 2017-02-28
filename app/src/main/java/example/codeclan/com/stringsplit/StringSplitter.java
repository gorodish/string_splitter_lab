package example.codeclan.com.stringsplit;

import java.util.ArrayList;

/**
 * Created by user on 27/02/2017.
 */

public class StringSplitter {

    protected ArrayList<String> stringsplitter;
    private String input;

    public StringSplitter() {
        stringsplitter = new ArrayList<String >();
        countWords();
    }

    public StringSplitter(String input) {
        this.input = input;
    }

    public int countWords() {
        String[] words = input.split(" ");
        int counter = 0;
        for (String s : words ) {
            counter ++ ;
        }

        return counter;
    }
}
