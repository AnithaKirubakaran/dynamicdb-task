package com.assissment.m2p.service;

import com.assissment.m2p.exception.TableNameNotExist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

@Service
public class DynamicTableServiceImpl {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Map<String, Object>> fetchAllDetails(String tableName){
        StringBuilder br = new StringBuilder("Select * from ").append(tableName);
        return jdbcTemplate.queryForList(br.toString());
    }
}
