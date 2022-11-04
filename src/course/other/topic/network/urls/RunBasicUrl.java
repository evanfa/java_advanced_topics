package course.other.topic.network.urls;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class RunBasicUrl {
    public static void main(String[] args) {
        try {
            URL urlT = new URL("http://es.wikipedia.org/");
            URL jInfo = new URL(urlT, "wiki/Wikipedia:Portada");

            System.out.println(
                    jInfo.getProtocol() + "\n" +
                            jInfo.getAuthority() + "\n" +
                            jInfo.getHost() + "\n" +
                            jInfo.getPort() + "\n" +
                            jInfo.getPath() + "\n" +
                            jInfo.getQuery() + "\n" +
                            jInfo.getFile() + "\n" +
                            jInfo.getRef()
            );

               /* BufferedReader in = new BufferedReader(new InputStreamReader(jInfo.openStream()));
                String lineR;
                while ((lineR = in.readLine())!= null){
                    System.out.println("Content: ");
                    System.out.println(lineR);
                }*/

            HttpURLConnection htpC = (HttpURLConnection) jInfo.openConnection();
            htpC.connect();
            System.out.println(
                    htpC.getHeaderFields() + "\n" +
                            htpC.getHeaderField(2) + "\n" +
                            htpC.getContentEncoding() + "\n" +
                            htpC.getContentLength() + "\n" +
                            htpC.getDate() + "\n" +
                            htpC.getExpiration() + "\n" +
                            htpC.getLastModified()
            );


            InputStream inS = htpC.getInputStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(inS));
            String lineR;
            while ((lineR = in.readLine())!= null){
                System.out.println("Content: ");
                System.out.println(lineR);
            }

            inS.close();
                //in.close();


        } catch (MalformedURLException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
