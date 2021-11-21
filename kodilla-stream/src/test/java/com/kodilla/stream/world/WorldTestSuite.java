package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", new BigDecimal("38000000"));
        Country sweden = new Country("Sweden", new BigDecimal("10000000"));
        Country ukraine = new Country("Ukraine", new BigDecimal("44000000"));
        Country china = new Country("China", new BigDecimal("1400000000"));
        Country japan = new Country("Japan", new BigDecimal("126000000"));
        Country india = new Country("India", new BigDecimal("1380000000"));
        Country mongolia = new Country("Mongolia", new BigDecimal("3300000"));
        Country brazil = new Country("Brazil", new BigDecimal("213000000"));
        Country argentina = new Country("Argentina", new BigDecimal("45000000"));
        Country columbia = new Country("Columbia", new BigDecimal("51000000"));
        Country bolivia = new Country("Bolivia", new BigDecimal("12000000"));
        Country venezuela = new Country("Venezuela", new BigDecimal("483000000"));

        Continent europe = new Continent();
        europe.addCountry(poland);
        europe.addCountry(sweden);
        europe.addCountry(ukraine);

        Continent asia = new Continent();
        asia.addCountry(china);
        asia.addCountry(japan);
        asia.addCountry(india);
        asia.addCountry(mongolia);

        Continent southAmerica = new Continent();
        southAmerica.addCountry(brazil);
        southAmerica.addCountry(argentina);
        southAmerica.addCountry(columbia);
        southAmerica.addCountry(bolivia);
        southAmerica.addCountry(venezuela);

        World world = new World();

        //When
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(southAmerica);

        //Then
        assertEquals(new BigDecimal("3805300000"), world.getPeopleQuantity());
    }
}