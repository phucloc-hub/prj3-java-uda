module com.udacity.catpoint.security {
    requires com.udacity.catpoint2.image;
    requires miglayout;
    requires java.desktop;
    requires com.google.gson;
    requires java.prefs;
    requires com.google.common;
    opens com.udacity.catpoint.security.data to com.google.gson;
}