import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.nio.Buffer;

import static org.junit.Assert.assertEquals;

public class SonnetTest {
    @Before
    public void setUp(){
        ROT13 cipher = new ROT13();
        cipher.encryptSonnet(new File("sonnet18.txt"));
        cipher.decryptSonnet(new File("sonnet18.enc"));
    }
    @Test
    public void testFileWriterROT13(){
        try{
            BufferedReader readerOriginalFile = new BufferedReader(new FileReader("sonnet18.txt"));
            BufferedReader readerDecryptedFile = new BufferedReader(new FileReader("sonnet18.dec"));
            String lineOriginal;
            String lineDecrypt;
            while((lineOriginal = readerOriginalFile.readLine()) != null && (lineDecrypt = readerDecryptedFile.readLine()) != null){
                lineOriginal = readerOriginalFile.readLine();
                lineDecrypt = readerDecryptedFile.readLine();
                Assert.assertEquals(lineOriginal, lineDecrypt);
            }
            readerOriginalFile.close();
            readerDecryptedFile.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}











//        @Test
//        public void sonnetEncryptText() throws IOException {
//            ROT13 cipher = new ROT13('a', 'n');
//
//            String toWrite = "Hello";
//            File tmpFile = File.createTempFile("test", ".tmp");
//            FileWriter writer = new FileWriter(tmpFile);
//            writer.write(toWrite);
//            writer.close();
//
//            String expected = "Uryyb";
//            cipher.encryptSonnet(tmpFile);
//
//            BufferedReader reader = new BufferedReader(new FileReader("sonnet18.enc"));
//            assertEquals(expected, reader.readLine());
//            reader.close();
//        }
//
//
//    }
//}
