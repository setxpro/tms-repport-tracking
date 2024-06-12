package com.github.setxpro.tms_repport_tracking.services;

import com.github.setxpro.tms_repport_tracking.domain.dtos.OcorenDTO;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OcorenConsumer {

    @KafkaListener(topics = "topics.sla.request.topic", groupId = "group_id")
    public void receivedOcoren(OcorenDTO ocorenDTOS) {
        System.out.println("Consumer Message: " + ocorenDTOS);
    }

}
