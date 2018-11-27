package fr.free.nrw.commons.nearby;

import fr.free.nrw.commons.R;
import fr.free.nrw.commons.location.LatLng;
import org.junit.Test;

import java.io.IOException;
import java.util.List;


import static org.junit.Assert.*;

public class NearbyPlacesTest {
        @Test
    public void  nearbyPlacesTest() throws IOException {
        NearbyPlaces nearbyPlaces =new NearbyPlaces();
        List<Place> places = nearbyPlaces.
                getFromWikidataQuery(new LatLng(48.720720, 21.257571, 1),"en_EN");
        for(Place place : places){
            if(place.getLongDescription().equals("building")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_generic_building);
            }
            else if(place.getLongDescription().equals("mountain")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_mountain);
            }
            else if(place.getLongDescription().equals("bridge")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_bridge);
            }
            else if(place.getLongDescription().equals("house")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_house);
            }
            else if(place.getLongDescription().equals("cottage")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_house);
            }
            else if(place.getLongDescription().equals("farmhouse")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_house);
            }
            else if(place.getLongDescription().equals("church")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_church);
            }
            else if(place.getLongDescription().equals("railway station")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_railway_station);
            }
            else if(place.getLongDescription().equals("gatehouse")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_gatehouse);
            }
            else if(place.getLongDescription().equals("milestone")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_milestone);
            }
            else if(place.getLongDescription().equals("inn")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_house);
            }
            else if(place.getLongDescription().equals("hotel")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_house);
            }
            else if(place.getLongDescription().equals("city")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_city);
            }
            else if(place.getLongDescription().equals("university")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_school);
            }
            else if(place.getLongDescription().equals("school")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_school);
            }
            else if(place.getLongDescription().equals("education")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_school);
            }
            else if(place.getLongDescription().equals("isle")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_island);
            }
            else if(place.getLongDescription().equals("airport")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_airport);
            }
            else if(place.getLongDescription().equals("road")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_road);
            }
            else if(place.getLongDescription().equals("forest")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_forest);
            }
            else if(place.getLongDescription().equals("park")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_park);
            }
            else if(place.getLongDescription().equalsIgnoreCase("river")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_river);
            }
            else if(place.getLongDescription().equalsIgnoreCase("waterfall")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_waterfall);
            }
            else if(place.getLongDescription().equalsIgnoreCase("temple")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_church);
            }
        }
    }

    @Test
    public void  nearbyPlacesSkTest() throws IOException {
        NearbyPlaces nearbyPlaces =new NearbyPlaces();
        List<Place> places = nearbyPlaces.
                getFromWikidataQuery(new LatLng(48.720720, 21.257571, 1),"sk_SK");
        for(Place place : places){
            if(place.getLongDescription().equals("\"budova\"@sk")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_generic_building);
            }
            else if(place.getLongDescription().equals("\"kopec\"@sk")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_mountain);
            }
            else if(place.getLongDescription().equals("bridge")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_bridge);
            }
            else if(place.getLongDescription().equals("\"dom\"@sk")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_house);
            }
            else if(place.getLongDescription().equals("\"chata\"@sk")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_house);
            }
            else if(place.getLongDescription().equals("\"statok\"@sk")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_house);
            }
            else if(place.getLongDescription().equals("\"kostol\"@sk")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_church);
            }
            else if(place.getLongDescription().equals("\"železničná stanica\"@sk")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_railway_station);
            }
            else if(place.getLongDescription().equals("\"maják\"@sk")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_gatehouse);
            }
            else if(place.getLongDescription().equals("\"míľnik\"@sk")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_milestone);
            }
            else if(place.getLongDescription().equals("\"hostinec\"@sk")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_house);
            }
            else if(place.getLongDescription().equals("hotel")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_house);
            }
            else if(place.getLongDescription().equals("\"mesto\"@sk")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_city);
            }
            else if(place.getLongDescription().equals("\"univerzita\"@sk")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_school);
            }
            else if(place.getLongDescription().equals("\"škola\"@sk")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_school);
            }
            else if(place.getLongDescription().equals("\"vzdelávanie\"@sk")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_school);
            }
            else if(place.getLongDescription().equals("\"ostrov\"@sk")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_island);
            }
            else if(place.getLongDescription().equals("\"letisko\"@sk")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_airport);
            }
            else if(place.getLongDescription().equals("\"cesta\"@sk")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_road);
            }
            else if(place.getLongDescription().equals("\"les\"@sk")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_forest);
            }
            else if(place.getLongDescription().equals("park")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_park);
            }
            else if(place.getLongDescription().equalsIgnoreCase("\"rieka\"@sk")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_river);
            }
            else if(place.getLongDescription().equalsIgnoreCase("\"vodopád\"@sk")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_waterfall);
            }
            else if(place.getLongDescription().equalsIgnoreCase("\"chrám\"@sk")){
                assertEquals(place.getLabel().getIcon(), R.drawable.round_icon_church);
            }
        }
    }
}