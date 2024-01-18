package com.snippetstest.snippettest.service;

import com.snippetstest.snippettest.models.Shape;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShapeServiceTest {
private ShapeService underTest;

@BeforeEach
    public void innit(){
    underTest = new ShapeService();
}

@Test
    void shouldReturnAllShapes()throws Exception{
    List<Shape> returned = underTest.getShapes();

    assertFalse(returned == null);
    assertTrue(returned.size() == 2);
}

@Test
void shouldEncrypt() throws Exception{
    String key = "1234567890123456";
    String name = "Laila";
    Cipher cipher = Cipher.getInstance("AES");
    SecretKey secretKey = new SecretKeySpec(key.getBytes(), "AES");
    cipher.init(Cipher.ENCRYPT_MODE, secretKey);
    byte[] encrypted = cipher.doFinal(name.getBytes());

    System.out.println(new String(encrypted));

    cipher.init(Cipher.DECRYPT_MODE, secretKey);
    byte[] decrypted = cipher.doFinal(encrypted);

    System.out.println(new String(decrypted));
}
}