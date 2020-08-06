package com.assissment.m2p;

import com.assissment.m2p.controller.DynamicTableController;
import com.assissment.m2p.exception.TableNameNotExist;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class M2pApplicationTests {

    private static final String tableName = "PERSONS";

    @Autowired
    DynamicTableController dynamicTableController;

    @Test
   public void setDynamicTableService() throws TableNameNotExist {
        dynamicTableController.getAllDetails(tableName);
        assertNotNull(dynamicTableController);
    }

    @Test
    public void withoutTableName() throws TableNameNotExist {
        dynamicTableController.getAllDetails("");
        assertNotNull(tableName, "Table name is empty, provide valid table name");
    }
}
