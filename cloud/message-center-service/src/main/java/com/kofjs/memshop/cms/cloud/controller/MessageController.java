package com.kofjs.memshop.cms.cloud.controller;

import com.kofjs.memshop.cms.cloud.producer.MessageProducer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "message")
public class MessageController {

    @Resource
    private MessageProducer messageProducer;

}
