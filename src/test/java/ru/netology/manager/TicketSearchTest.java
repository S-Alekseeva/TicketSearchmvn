package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Ticket;
import ru.netology.repository.TicketRepository;

public class TicketSearchTest {

    TicketRepository repo = new TicketRepository();
    TicketManager manager = new TicketManager(repo);

    Ticket ticket1 = new Ticket(1111, 5_000, 120, "MOW", "KUF");
    Ticket ticket2 = new Ticket(2222, 20_000, 480, "MOW", "VVO");
    Ticket ticket3 = new Ticket(3333, 12_000, 240, "NUX", "MOW");
    Ticket ticket4 = new Ticket(4444, 80_000, 600, "NYC", "MOW");
    Ticket ticket5 = new Ticket(5555, 7_000, 180, "SVX", "LED");
    Ticket ticket6 = new Ticket(6666, 5_500, 125, "MOW", "KUF");
    Ticket ticket7 = new Ticket(7777, 7_000, 180, "LED", "SVX");
    Ticket ticket8 = new Ticket(8888, 4_500, 120, "MOW", "KUF");
    Ticket ticket9 = new Ticket(9999, 12_000, 245, "MOW", "NUX");
    Ticket ticket10 = new Ticket(1010, 90_000, 630, "MOW", "NYC");
    Ticket ticket11 = new Ticket(1011, 4_900, 120, "MOW", "KUF");
    Ticket ticket12 = new Ticket(1012, 30_000, 500, "VVO", "MOW");


    @Test
    public void shouldSortByAllTicketPrice() {
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);
        manager.add(ticket11);
        manager.add(ticket12);

        Ticket[] actual = {ticket8, ticket11, ticket1, ticket6};
        Ticket[] expected = manager.findAll("MOW", "KUF");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddTicket() {
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket12);

        Ticket[] actual = repo.findAll();
        Ticket[] expected = {ticket1, ticket2,ticket6, ticket7, ticket8, ticket9, ticket12};

        Assertions.assertArrayEquals(expected, actual);
    }
}