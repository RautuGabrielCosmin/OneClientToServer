import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        Socket socket = null;
        InputStream inputStreamReader = null;
        OutputStream outputStreamWriter = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try{
            socket = new Socket("localhost", 1234);

            inputStreamReader = new InputStreamReader(socket.getInputStream());
            outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());

            bufferedReader = new BufferedReader(inputStreamReader);
            bufferedWriter = new BufferedWriter(outputStreamWriter);

            Scanner scanner = new Scanner(System.in);

            while(true){

                String msgToSend = scanner.nextLine();

                bufferedWriter.write(msgToSend);
                bufferedWriter.newLine();
                bufferedWriter.flush();

                System.out.println("Server:" + bufferedReader.readLine());

                if(msgToSend.equals("exit")){
                    break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try{
                if(socket != null){
                    socket.close();
                }
                if(inputStreamReader != null){
                    inputStreamReader.close();
                }
                if(outputStreamWriter != null){
                    outputStreamWriter.close();
                }
                if(bufferedReader != null){
                    bufferedReader.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
