package TaskOne;

import static org.junit.jupiter.api.Assertions.*;

/* TV tv1 = new TV();
 tv1.turnOn();
 tv1.setChannel(30);
 tv1.setVolume(3);

 TV tv2 = new TV();
 tv2.channelUp();
 tv2.channelUp();
 tv2.turnOn();
 tv2.volumeUp(); */

class TVTest {

    @org.junit.jupiter.api.Test
    void test1() {
        TV tv1 = new TV();
        assertEquals(true,tv1.turnOn());
        assertEquals(30,tv1.setChannel(30));
        assertEquals(3,tv1.setVolume(3));
    }

    @org.junit.jupiter.api.Test
    void test2() {
        TV tv2 =  new TV();
        assertEquals(0,tv2.channelUp());
        assertEquals(0,tv2.channelUp());
        assertEquals(true,tv2.turnOn());
        assertEquals(1,tv2.volumeUp());
    }

}