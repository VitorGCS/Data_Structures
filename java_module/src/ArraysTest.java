import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysTest {

    Arrays dataStructure;

    @BeforeEach
    public void initEach(){
        dataStructure = new Arrays();
    }


    @Test
    void checkDataStructure(){
        assertEquals("Array", dataStructure.dataStructureInTest());
    }

}