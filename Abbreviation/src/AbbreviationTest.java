import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AbbreviationTest {

    @Test
    public void abbreviationOnlyWords() {
        String abbreviation = Abbreviation.abbreviation("теория функций комплексной переменной");
        assertEquals("ТФКП", abbreviation);
    }

    @Test
    public void abbreviationWithPunctuation() {
        String abbreviation = Abbreviation.abbreviation("университет информационных технологий, механики и оптики");
        assertEquals("УИТМО", abbreviation);
    }

    @Test
    public void abbreviationWithHyphen() {
        String abbreviation = Abbreviation.abbreviation("Научно-испытательный Тренажёр Корабельной Авиации");
        assertEquals("НИТКА", abbreviation);
    }

    @Test
    public void abbreviationWithVariousCase() {
        String abbreviation = Abbreviation.abbreviation("Проблемы ХРОнологии и культурной принадлежНОСТИ археологических памяТНИков Западной Сибири");
        assertEquals("ПХКПАПЗС", abbreviation);
    }

    @Test
    public void abbreviationWrongPunctuation() {
        String abbreviation = Abbreviation.abbreviation("московский   , государственный :? университет.");
        assertEquals("МГУ", abbreviation);
    }
}