package io.dorune.book.puzzler.quiz39;

public class HelloGoodbye {
    public static void main(String[] args) {
        try {
            System.out.println("Hello world");
            System.exit(0);
        } finally {
            System.out.println("Goodbye world");
        }
    }
    
    /**
     * finally 구문의 Goodbye world 를 출력하기 위한 개선된 처리 방식
     */
    public static void improve() {
    	System.out.println("Hello world");
    	Runtime.getRuntime().addShutdownHook(new Thread() {
    		public void run() {
    			System.out.println("Goodbye world");
    		}
    	});
    	System.exit(0);
    }
    
}
