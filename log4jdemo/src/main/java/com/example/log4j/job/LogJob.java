package com.example.log4j.job;

import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by ROBIN on 2017/6/30.
 */

@Component
@Log4j2
public class LogJob {
    private static Logger logger = LogManager.getLogger("LogJob");
    /**
     * 2秒钟执行1次
     */
    @Scheduled(fixedRate = 2 * 1000)
    public void logging(){
        Date now = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        logger.info(simpleDateFormat.format(now));
        logger.debug("-------DEBUG---------");
        logger.error(now.getTime());
    }

}
