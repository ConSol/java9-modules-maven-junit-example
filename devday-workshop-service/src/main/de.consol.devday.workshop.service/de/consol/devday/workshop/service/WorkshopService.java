package de.consol.devday.workshop.service;

import de.consol.devday.service.EventService;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WorkshopService implements EventService {

    public List<String> getEvents() {
        return Stream.of(
                "Kubernetes",
                "Gamification"
            )
            .map(WorkshopService::prefix)
            .collect(Collectors.toList());
    }

    static String prefix(String input) {
        return "Workshop: " + input;
    }
}
