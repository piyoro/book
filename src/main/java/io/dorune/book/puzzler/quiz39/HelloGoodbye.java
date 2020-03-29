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
     * finally ������ Goodbye world �� ����ϱ� ���� ������ ó�� ���
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
