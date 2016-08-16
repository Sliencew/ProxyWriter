import java.io.*;


public class ReadHttpProxy {

	public static void main(String[] args) {
		File file = new File("C:/Users/gxy/Desktop/proxy.txt");
		try{
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line = bufferedReader.readLine();
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			while (line != null){
				String[] proxyString = line.split("\t");
				bufferedWriter.write(proxyString[0]);
				bufferedWriter.newLine();
				for(int i=0; i<4; i++){
					line = bufferedReader.readLine();
				}
			}
			bufferedReader.close();
			bufferedWriter.close();
		}
		catch (IOException ex){
			System.out.println(ex.getMessage());
		}

	}

}
