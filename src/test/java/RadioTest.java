import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio rd = new Radio();
    @Test
    public void shouldSetTemperature() {
        rd.setCurrentStation(8);

        int expected = 8;
        int actual = rd.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIfSetStationAboveMax() {
        rd.setCurrentStation(10);

        int expected = 0;
        int actual = rd.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIfSetStationAboveMin() {
        rd.setCurrentStation(-1);

        int expected = 9;
        int actual = rd.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationNext() {
        rd.setCurrentStation(9);
        rd.next();

        int expected = 0;
        int actual = rd.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationNext2() {
        rd.setCurrentStation(0);
        rd.next();

        int expected = 1;
        int actual = rd.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationPrev() {
        rd.setCurrentStation(0);
        rd.prev();

        int expected = 9;
        int actual = rd.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationPrev2() {
        rd.setCurrentStation(1);
        rd.prev();

        int expected = 0;
        int actual = rd.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        rd.setCurrentVolume(800);

        int expected = 100;
        int actual = rd.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume2() {
        rd.setCurrentVolume(1);

        int expected = 1;
        int actual = rd.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIfSetVolumeAboveMax() {
        rd.setCurrentVolume(1000);

        int expected = 100;
        int actual = rd.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIfSetVolumeAboveMin() {
        rd.setCurrentVolume(-1);

        int expected = 0;
        int actual = rd.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void addVol() {
        rd.setCurrentVolume(98);
        rd.addVolume();

        int expected = 99;
        int actual = rd.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void addVol2() {
        rd.setCurrentVolume(100);
        rd.addVolume();

        int expected = 100;
        int actual = rd.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downVol() {
        rd.downVolume();

        int expected = 0;
        int actual = rd.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downVol2() {
        rd.setCurrentVolume(10);
        rd.downVolume();

        int expected = 9;
        int actual = rd.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void radioMaxStationConstructorDefault() {



        Assertions.assertEquals(10, rd.getMaxStation());
        Assertions.assertEquals(0, rd.getMinStation());
        Assertions.assertEquals(0, rd.getCurrentStation());
    }
    @Test
    public void radioMaxStationConstructorCustom1() {
        Assertions.assertEquals(10, rd.getMaxStation());
        Assertions.assertEquals(0, rd.getMinStation());
        Assertions.assertEquals(0, rd.getCurrentStation());
    }
    @Test
    public void radioMaxStationConstructorCustom2() {
        Radio rd = new Radio(98);



        Assertions.assertEquals(97, rd.getMaxStation());
        Assertions.assertEquals(0, rd.getMinStation());
        Assertions.assertEquals(0, rd.getCurrentStation());
    }
}