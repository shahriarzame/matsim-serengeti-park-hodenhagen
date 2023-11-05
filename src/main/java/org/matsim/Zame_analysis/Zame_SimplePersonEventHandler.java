package org.matsim.Zame_analysis;

import org.matsim.api.core.v01.events.PersonArrivalEvent;
import org.matsim.api.core.v01.events.PersonDepartureEvent;
import org.matsim.api.core.v01.events.handler.PersonArrivalEventHandler;
import org.matsim.api.core.v01.events.handler.PersonDepartureEventHandler;

public class Zame_SimplePersonEventHandler implements PersonDepartureEventHandler, PersonArrivalEventHandler {
    @Override
    public void handleEvent(PersonArrivalEvent personArrivalEvent) {

        System.out.println("Arrival: " + personArrivalEvent.getTime() + ": " + personArrivalEvent.getPersonId());

    }

    @Override
    public void handleEvent(PersonDepartureEvent personDepartureEvent) {

        System.out.println("Departure: " + personDepartureEvent.getTime() + ": " + personDepartureEvent.getPersonId());
    }
}
