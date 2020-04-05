package io.dorune.book.puzzler.quiz43;

public class SneakyThrow {
    public static void sneakyThrow(Throwable t) {
        Thread.currentThread().stop(t);
    }
}
