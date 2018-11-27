package fr.free.nrw.commons.nearby;

import fr.free.nrw.commons.Utils;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
 
import fr.free.nrw.commons.R;


public class PlaceTest {

    @Test
    public void tryEnStringLabel() {
        Place place = mock(Place.class);
        when(place.Label.fromText(anyString())).thenReturn(Place.Label.UNKNOWN);
        Assert.assertThat(place.Label.fromText(Utils.stripLocalizedString("building")).getIcon(), R.drawable.round_icon_unknown);
    }
    @Test
    public void trySkStringLabel() {
        Place place = mock(Place.class);
        when(place.Label.fromText(anyString())).thenReturn(Place.Label.UNKNOWN);
        Assert.assertThat(place.Label.fromText(Utils.stripLocalizedString("\"building\"@sk")).getIcon(), R.drawable.round_icon_unknown);
    }
    @Test
    public void tryEnIDLabel() {
        Place place = mock(Place.class);
        when(place.Label.fromText(anyString())).thenReturn(Place.Label.BUILDING);
        Assert.assertThat(place.Label.fromText(Utils.stripLocalizedString("Q41176")).getIcon(), R.drawable.round_icon_generic_building);
    }
    @Test
    public void trySkIDLabel() {
        Place place = mock(Place.class);
        when(place.Label.fromText(anyString())).thenReturn(Place.Label.BUILDING);
        Assert.assertThat(place.Label.fromText(Utils.stripLocalizedString("\"Q41176\"@sk")).getIcon(), R.drawable.round_icon_generic_building);
    }
    @Test
    public void tryCsIDLabel() {
        Place place = mock(Place.class);
        when(place.Label.fromText(anyString())).thenReturn(Place.Label.BUILDING);
        Assert.assertThat(place.Label.fromText(Utils.stripLocalizedString("\"Q41176\"@cs")).getIcon(), R.drawable.round_icon_generic_building);
    }
    @Test
    public void tryEnWrongIDLabel() {
        Place place = mock(Place.class);
        when(place.Label.fromText(anyString())).thenReturn(Place.Label.UNKNOWN);
        Assert.assertThat(place.Label.fromText(Utils.stripLocalizedString("Q411")).getIcon(), R.drawable.round_icon_unknown);
    }
    @Test
    public void trySkWrongIDLabel() {
        Place place = mock(Place.class);
        when(place.Label.fromText(anyString())).thenReturn(Place.Label.UNKNOWN);
        Assert.assertThat(place.Label.fromText(Utils.stripLocalizedString("\"Q411\"@sk")).getIcon(), R.drawable.round_icon_unknown);
    }
    @Test
    public void trySkNullLabel() {
        Place place = mock(Place.class);
        when(place.Label.fromText(anyString())).thenReturn(Place.Label.UNKNOWN);
        Assert.assertThat(place.Label.fromText(Utils.stripLocalizedString("\"\"@sk")).getIcon(), R.drawable.round_icon_unknown);
    }
    @Test
    public void tryEnNullIDLabel() {
        Place place = mock(Place.class);
        when(place.Label.fromText(anyString())).thenReturn(Place.Label.UNKNOWN);
        Assert.assertThat(place.Label.fromText(Utils.stripLocalizedString("")),R.drawable.round_icon_unknown);
    }
    @Test
    public void tryEnLongLabel() {
        Place place = mock(Place.class);
        when(place.Label.fromText(anyString())).thenReturn(Place.Label.UNKNOWN);
        String lab= "llllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllll";
        Assert.assertThat(place.Label.fromText(Utils.stripLocalizedString(lab)).getIcon(), R.drawable.round_icon_unknown);
    }
    @Test
    public void trySkLongLabel() {
        Place place = mock(Place.class);
        when(place.Label.fromText(anyString())).thenReturn(Place.Label.UNKNOWN);
        String lab= "\"šššššššššššššššššššššššššššššššššššššššššššššššššššššššššššššššššššššš\"@sk";
        Assert.assertThat(place.Label.fromText(Utils.stripLocalizedString(lab)).getIcon(), R.drawable.round_icon_unknown);
    }

}