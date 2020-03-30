package io.dorune.book.puzzler.quiz41;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Stream {

	public static void main(String[] args) {
		// 실제 책에서 기능 테스트의 내용보다 copy 메서드 본문이 중요하다.
	}
	
	static void copy(String src, String dest) throws IOException {
		InputStream in = null;
		OutputStream out = null;
		try {
			in = new FileInputStream(src);
			out = new FileOutputStream(dest);
			byte[] buf = new byte[1024];
			int n;
			while((n = in.read(buf)) >= 0)
				out.write(buf, 0, n);
		} finally {
			if(in != null) in.close();
			if(out != null) out.close();
		}
	}

}
