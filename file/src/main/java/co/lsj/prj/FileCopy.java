package co.lsj.prj;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public void CopyStart() {
		File original = new File("C:/Temp/test1.exe");
		File copy = new File("C:/Temp/test2.exe");

		try {
			FileInputStream original2 = new FileInputStream(original);
			FileOutputStream copy2 = new FileOutputStream(copy);

			while (true) {
				int inputData = original2.read();
				if (inputData == -1)
					break;
				copy2.write(inputData);
			}

			original2.close();
			copy2.close();
			System.out.println("복사를 완료하였습니다!!!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일을 찾을수 없습니다!!!");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("파일 복사 오류입니다!!!");
		}
	}
}
