import java.io.*;

class path{

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
        for (String line; (line = br.readLine()) != null;) {
            System.out.print(line);
        }
        br.close();
    }
}