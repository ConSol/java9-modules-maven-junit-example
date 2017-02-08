package de.consol.devday.markdown;

import de.consol.devday.service.EventService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MarkdownService {

    private static List<EventService> eventServices = new ArrayList<>();

    public String formatList(List<String> events) {
        return events.stream()
                .map((e) -> "* " + e)
                .collect(Collectors.joining("\n"));
    }
}
