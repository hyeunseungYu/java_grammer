package tryCatch;

import java.io.IOException;

public class temp {
    public static void main(String[] args) throws IOException {
        methodA();
    }

    static void methodA() throws IOException {
        throw new IOException();
    }
}
