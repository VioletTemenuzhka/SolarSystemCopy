package com.syntax;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SolarSystem Xfac = new SolarSystem();
        Xfac.sun = "1";
        Xfac.moon = "4";
        Xfac.planet = "2";
        Xfac.stars = "10000";

    // adding features to our sun
        FeatureSun Xfact = new FeatureSun();
        Xfact.color = "Orange";
        Xfact.radius = "1000000000000km";
        Xfact.heat = "1231313137666777kj";

    // adding the features for star in the Solar System
        FeatureStars FacX = new FeatureStars();
        FacX.color = "green";
        FacX.radius = "1232432434km";
        FacX.size = "9999999999999m";

    }
}