package org.matsim.Zame_analysis;

import org.matsim.core.events.EventsUtils;

public class Zame_SimpleAnalysis {

    public static void main(String[] args) {

        var handler = new Zame_SimplePersonEventHandler();
        var manager = EventsUtils.createEventsManager(); 

        manager.addHandler(handler);

        EventsUtils.readEvents(manager, "C:\\Education\\TUM\\Semester 7\\Applied Transport Modeling with MATSim\\MATSim\\matsim-serengeti-park-hodenhagen\\scenarios\\serengeti-park-v1.0\\output\\output-serengeti-park-v1.0-run1\\serengeti-park-v1.0-run1.output_events.xml");

    }


}
