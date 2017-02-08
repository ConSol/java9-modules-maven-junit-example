package de.consol.devday.talk.service;

import de.consol.devday.service.EventService;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TalkService implements EventService {

    public List<String> getEvents() {
        return Stream.of(
                "Deep Learning",
                "Java 9 Modules in a Nutshell",
                "Containerized End-2-End-Testing and Monitoring",
                "JavaScript Lightning Talks",
                "Citrus & Microservices (Kubernetes)",
                "Apache Cassandra vs. MongoDB"
            )
            .map(TalkService::prefix)
            .collect(Collectors.toList());
    }

    static String prefix(String input) {
        return "Talk: " + input;
    }
}
