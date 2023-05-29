package com.github.bproenca.dbins;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

	private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    
	@Autowired
	private JdbcTemplate jdbcTemplate;

    @Scheduled(fixedRateString = "${myapp.fixedRate}")
	public void insertData() {
		log.info("# Insert data {}", dateFormat.format(new Date()));
		jdbcTemplate.update("insert into ATABLE (INS_DATE) values (sysdate)");
	}

}