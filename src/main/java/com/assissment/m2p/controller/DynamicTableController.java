package com.assissment.m2p.controller;

import com.assissment.m2p.exception.TableNameNotExist;
import com.assissment.m2p.service.DynamicTableServiceImpl;
import com.assissment.m2p.utility.Util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class DynamicTableController {

    @Autowired
    DynamicTableServiceImpl dynamicTableServiceImpl;

    @GetMapping(path = "/dynamic", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Map<String, Object>> getAllDetails(@RequestParam String tableName) throws TableNameNotExist {
        if (Util.isEmpty(tableName)) {
            throw new TableNameNotExist("Table name is empty, provide valid table name");
        }
        return dynamicTableServiceImpl.fetchAllDetails(tableName);
    }
}
