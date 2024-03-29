/*
 * $Id: CityStroller.java 21939 2011-05-18 13:32:09Z aperepel $
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sjo.esb.ser.impl;

import java.util.concurrent.atomic.AtomicBoolean;

import com.sjo.esb.ser.GpsCoord;
import com.sjo.esb.ser.ICityStroller;

/**
 * Generates a random walk around a city
 */
public class CityStroller implements ICityStroller
{

    public static final GpsCoord SAN_FRANCISCO = new GpsCoord(37.789167f, -122.419281f);
    public static final GpsCoord LONDON = new GpsCoord(37.788423f, -122.39823f);
    public static final GpsCoord VALLETTA = new GpsCoord(35.898504f, 14.514313f);


    private volatile GpsCoord currentCoord = SAN_FRANCISCO;
    private AtomicBoolean firstTime = new AtomicBoolean(true);

    //could use a better algorithm here or real test data for better results
    /* (non-Javadoc)
	 * @see com.sjo.esb.ser.impl.ICityStroller#generateNextCoord()
	 */
    @Override
	public GpsCoord generateNextCoord()
    {
        if (firstTime.get())
        {
            firstTime.set(false);
        }
        else
        {
            double dist = Math.random() * 0.002;
            double angle = Math.random() * Math.PI;


            float lat = currentCoord.getLatitude() + (float) (dist * Math.sin(angle));
            float lng = currentCoord.getLongitude() + (float) (dist * Math.cos(angle));

            currentCoord = new GpsCoord(lat, lng);
        }
        return currentCoord;
    }

    /* (non-Javadoc)
	 * @see com.sjo.esb.ser.impl.ICityStroller#getCurrentCoord()
	 */
    @Override
	public GpsCoord getCurrentCoord()
    {
        return currentCoord;
    }

    public void setCurrentCoord(GpsCoord currentCoord)
    {
        this.currentCoord = currentCoord;
        firstTime.set(false);
    }
}
