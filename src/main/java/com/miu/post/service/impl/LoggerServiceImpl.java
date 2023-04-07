package com.miu.post.service.impl;

import com.miu.post.entity.Logger;
import com.miu.post.repo.CommentRepo;
import com.miu.post.repo.LoggerRepo;
import com.miu.post.service.LoggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;

@Service
public class LoggerServiceImpl  implements LoggerService {
    @Autowired
    private LoggerRepo loggerRepo;


    @Override
    public void save(String log) {
        Logger logger = new Logger();
        logger.setDate(LocalDate.now());
        logger.setTime(LocalTime.now());
        logger.setPrinciple("Tushar");
        logger.setOperation(log);
        loggerRepo.save(logger);
    }
}
