package com.example.test1;

import java.io.IOException;
import java.io.PrintStream;

public class Pen {
    public boolean capped = true;
    public String color = "black";
    public String text = "";

    public void cap() {
        capped = true;
    }

    public void uncap() {
        capped = false;
    }

    public void writeTo(Appendable appendable) throws IOException {
        if (capped) {
            throw new UnsupportedOperationException("pen is capped");
        }
        appendable.append("<p color=\""+color+"\">"+text+"</p>");
    }
}
