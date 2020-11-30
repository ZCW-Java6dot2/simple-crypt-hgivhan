import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CaesarCipherTest {

        @Test
        public void cryptCaesarTest1() {
            // Given
            CaesarCipher cc = new CaesarCipher();

            String Q1 = "Hi There!";
            String A1 = "Ij Uifsf!";

            // When
            String actual = cc.crypt(Q1, 1);
            System.out.println(Q1);
            System.out.println(A1);
            // Then
            assertTrue(actual.equals(A1));

        }


//        @Test
//        public void cryptCaesarTest2() {
//            // Given
//            CaesarCipher cc = new CaesarCipher();
//
//            String Q1 = "Why did the chicken cross the road?";
//            System.out.println(Q1);
//
//            // When
//            String actual = cc.crypt(cc.crypt(Q1, 3));
//            System.out.println(actual);
//            // Then
//            assertTrue(actual.equals(Q1));
//        }


    }

