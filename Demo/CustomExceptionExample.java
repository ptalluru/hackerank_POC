import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class CustomExceptionExample {

	public static void main(String[] args) throws MyException {
		try {
			processFile(null);
			processFile("file.txt");
		} catch (MyException e) {
			processErrorCodes(e);
		}
	
	}

	private static void processErrorCodes(MyException e) throws MyException {
		switch(e.getErrorCode()){
		case "BAD_FILE_TYPE":
			System.out.println("Bad File Type, notify user");
			break;
		case "FILE_NOT_FOUND_EXCEPTION":
			System.out.println("File Not Found, notify user");
			break;
		case "FILE_CLOSE_EXCEPTION":
			System.out.println("File Close failed, just log it.");
			break;
		case "NULL_FILE_NAME":
			System.out.println("Enter the file name properly and it should not be \"null\"");
			break;
		default:
			System.out.println("Unknown exception occured, lets log it for further debugging."+e.getMessage());
			e.printStackTrace();
		}
	}

	private static void processFile(String file) throws MyException {		
		InputStream fis = null;
		try {
			if(file==null) throw new MyException("File name should not be null", "NULL_FILE_NAME");
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			throw new MyException(e.getMessage(),"FILE_NOT_FOUND_EXCEPTION");
		}finally{
			try {
				if(fis !=null)fis.close();
			} catch (IOException e) {
				throw new MyException(e.getMessage(),"FILE_CLOSE_EXCEPTION");
			}
		}
	}

}