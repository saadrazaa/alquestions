package code.problems.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EncodeOrDecodeTest {

    @Test
    @DisplayName("Encode the given arrays of strings")
    void testEncode(){
        assertAll(()-> {
            assertEquals("4%Leet4%Code", EncodeOrDecode.encode(List.of("Leet", "Code")));
        });
    }

    @Test
    @DisplayName("Decode the given strings")
    void testDecode(){
        assertAll(()-> {
            assertEquals(List.of("Leet", "Code"), EncodeOrDecode.decode("4%Leet4%Code"));
        });
    }
}