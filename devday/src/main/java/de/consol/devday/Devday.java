package de.consol.devday;

import de.consol.devday.service.EventService;
import de.consol.devday.markdown.MarkdownService;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public class Devday {

    private static List<EventService> eventServices = new ArrayList<>();
    private static MarkdownService markdownService = new MarkdownService();

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("ConSol Devday Schedule");
        System.out.println("======================");

        ServiceLoader.load(EventService.class).forEach(eventServices::add);

        List<String> events = new ArrayList<>();

        eventServices.stream()
                .map(EventService::getEvents)
                .forEach(events::addAll);

        System.out.println(markdownService.formatList(events));
    }
}
