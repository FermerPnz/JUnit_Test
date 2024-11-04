import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NomenclatureTest {
    Nomenclature sum;

    @BeforeEach
    void DataTest() {
        sum = new Nomenclature(3,256 , "Инструмент", "Молоток");
    }


    @Test
    void getId() {
        assertEquals(sum.id, 3);
    }

    @Test
    void setNameTest() {
        sum.setName("Отвертка");
        assertEquals("Отвертка",sum.getName());
    }

    @Test
    void setNameIfTest() {
        sum = new Nomenclature(3,256 , "Инструмент", "");
        sum.setName("Отвертка");
        assertEquals("Отвертка", sum.getName());
    }
}