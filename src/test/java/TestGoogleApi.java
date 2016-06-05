

import org.junit.Test;
import taxi.utils.geolocation.GoogleMapsAPI;
import taxi.utils.geolocation.GoogleMapsAPIImpl;
import taxi.utils.geolocation.Location;

public class TestGoogleApi {
    @Test
    public void testGoogleapi () {
        GoogleMapsAPI googleMapsAPI = new GoogleMapsAPIImpl();

        Location location = googleMapsAPI.findLocation("Україна Київ Бульва Лесі Українки 5");

        System.out.println(location);


        Location location1 = googleMapsAPI.findLocation("Україна", "Київ", "Бульва Лесі Українки", "5");
        Location location2 = googleMapsAPI.findLocation("Україна", "Київ", "Старокиєвська", "10");

        System.out.println(googleMapsAPI.getDistance(location1, location2));

    }
}

