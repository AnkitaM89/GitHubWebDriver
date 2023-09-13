package qedge.aug7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriteText {

	public static void main(String[] args) throws Throwable {
		File f = new File("D:/Ankita/WriteTextDemo.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write("It is a bright and sunny morning.");
		bw.newLine();
		bw.write("But its likely to rain the afternoon.");
		bw.newLine();
		bw.write("Write and erase.");
		bw.flush();
		bw.close();

	}

}
