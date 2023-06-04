import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetTemperature() {
        Radio rd = new Radio();
        rd.setCurrentStation(8);

        int expected = 8;
        int actual = rd.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIfSetStationAboveMax() {
        Radio rd = new Radio();
        rd.setCurrentStation(10);

        int expected = 0;
        int actual = rd.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIfSetStationAboveMin() {
        Radio rd = new Radio();
        rd.setCurrentStation(-1);

        int expected = 9;
        int actual = rd.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationNext() {
        Radio rd = new Radio();
        rd.next(9);

        int expected = 0;
        int actual = rd.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationNext2() {
        Radio rd = new Radio();
        rd.next(0);

        int expected = 1;
        int actual = rd.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationPrev() {
        Radio rd = new Radio();
        rd.prev(0);

        int expected = 9;
        int actual = rd.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationPrev2() {
        Radio rd = new Radio();
        rd.prev(1);

        int expected = 0;
        int actual = rd.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio rd = new Radio();
        rd.setCurrentVolume(800);

        int expected = 100;
        int actual = rd.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume2() {
        Radio rd = new Radio();
        rd.setCurrentVolume(1);

        int expected = 1;
        int actual = rd.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIfSetVolumeAboveMax() {
        Radio rd = new Radio();
        rd.setCurrentVolume(1000);

        int expected = 100;
        int actual = rd.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIfSetVolumeAboveMin() {
        Radio rd = new Radio();
        rd.setCurrentVolume(-1);

        int expected = 0;
        int actual = rd.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void addVol() {
        Radio rd = new Radio();
        rd.addVolume(98);

        int expected = 99;
        int actual = rd.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void addVol2() {
        Radio rd = new Radio();
        rd.addVolume(100);

        int expected = 100;
        int actual = rd.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downVol() {
        Radio rd = new Radio();
        rd.downVolume(0);

        int expected = 0;
        int actual = rd.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downVol2() {
        Radio rd = new Radio();
        rd.downVolume(10);

        int expected = 9;
        int actual = rd.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}