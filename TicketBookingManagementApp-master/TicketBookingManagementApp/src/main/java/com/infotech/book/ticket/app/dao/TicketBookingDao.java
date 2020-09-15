package com.infotech.book.ticket.app.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.infotech.book.ticket.app.entities.Ticket;

public interface TicketBookingDao extends MongoRepository<Ticket, Integer>{

}
