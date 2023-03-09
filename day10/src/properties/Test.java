package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test {

	public static void main(String[] args) {
		Properties props = new Properties();
		String fileName = "file.txt";
		FileInputStream in = null;
		try {
			in = new FileInputStream(fileName);
			props.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {        // try 구문 안에 close 가 들어가면 Exception 발생시 종료되지 않음
			try {
				if(in !=  null) {    // in 이 발생했을 때만 close
				in.close();   
				}
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
		String ip = props.getProperty("IP_ADDR");
		System.out.println(ip);
	}

}
