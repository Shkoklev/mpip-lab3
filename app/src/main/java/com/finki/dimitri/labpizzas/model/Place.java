package com.finki.dimitri.labpizzas.model;

import com.google.android.gms.maps.model.LatLng;

public class Place {
    private String name;
    private Geometry geometry;

    public LatLng getLatLng() {
        return this.geometry.location.getLatLng();
    }

    public String getName() {
        return name;
    }

    class Geometry {
        public Location location;

    }

    class Location {
        private float lat;
        private float lng;

        public float getLat() {
            return lat;
        }

        public float getLng() {
            return lng;
        }

        public LatLng getLatLng() {
            return new LatLng(lat, lng);
        }

    }
}