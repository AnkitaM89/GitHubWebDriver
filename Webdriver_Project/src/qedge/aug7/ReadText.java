package qedge.aug7;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadText {

	public static void main(String[] args) throws Throwable {
		//read path of file from system
				FileReader fr = new FileReader("D:/Ankita/WebSample.txt");
				BufferedReader br = new BufferedReader(fr);
				String str="";
				while((str = br.readLine())!=null)
				{
					Thread.sleep(1000);
					System.out.println(str);
				}

           br.close();
	}

}
