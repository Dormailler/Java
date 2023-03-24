package chap16;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class URLTest {

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.google.com");
		InputStream daum = url.openStream();
		InputStreamReader isr = new InputStreamReader(daum);
		BufferedReader br = new BufferedReader(isr);
		FileWriter fw = new FileWriter("daum.txt");
		while(true) {
			String line = br.readLine();
			if(line == null) break;
			fw.write(line+"\n");
		}
		fw.close();

	}

}
