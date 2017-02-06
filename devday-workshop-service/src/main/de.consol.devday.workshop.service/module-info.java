module de.consol.devday.workshop.service {

    requires de.consol.devday.service;

    exports de.consol.devday.workshop.service;

    provides de.consol.devday.service.EventService
        with de.consol.devday.workshop.service.WorkshopService;

}