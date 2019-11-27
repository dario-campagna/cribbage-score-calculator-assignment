package test.cribbage;

import cribbage.CardParser;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ParseHandTest {

    @Test
    void parseOneCard() {
        assertThat(CardParser.parseCard("5H").rank(), is("5"));
        assertThat(CardParser.parseCard("5H").suite(), is("H"));
    }
}
