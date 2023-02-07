package com.farm.backend.service;

import com.farm.backend.datatable.ToolsEntity;
import com.farm.backend.models.FarmerRQ;
import com.farm.backend.models.ToolsRQ;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ComponentScan(basePackages = {"com.farm.*"})
@Import({FarmerService.class})
public class ToolsServiceTests {

    @Autowired
    ToolsService toolsService;

    @BeforeEach
    public void createTestData() {
        try {
            for (int i = 1; i <= 100; i++) {
                ToolsRQ toolsRQ = ToolsRQ.builder()
                        .toolType("TOOL_TYPE_" + i)
                        .toolName("TOOL_NAME_" + i)
                        .purchaseDate(new Date())
                        .price((double) (10 + i))
                        .build();
                toolsService.createTools(toolsRQ);
            }
        } catch (Exception e) {
            fail(e);
        }
    }

    @Test
    void testCreateTools() {
        ToolsRQ toolsRQ = ToolsRQ.builder()
                .toolType("TOOL_TYPE_")
                .toolName("TOOL_NAME_")
                .purchaseDate(new Date())
                .price((double) (10))
                .build();
        ToolsEntity toolsEntity = toolsService.createTools(toolsRQ);
        assertEquals(toolsEntity.getToolName(), toolsRQ.getToolName());
        assertEquals(toolsEntity.getToolType(), toolsRQ.getToolType());
        assertEquals(toolsEntity.getPrice(), toolsRQ.getPrice());
        assertEquals(toolsEntity.getPurchaseDate(), toolsRQ.getPurchaseDate());
    }


    @Test
    void testFetchTools() {
        List<ToolsEntity> toolsEntities = toolsService.fetchAllTools();
        assertNotNull(toolsEntities);
    }


    @Test
    void testCreateTools_1() {
        ToolsRQ toolsRQ = ToolsRQ.builder()
                .toolType("TOOL_TYPE_")
                .toolName("TOOL_NAME_")
                .purchaseDate(new Date())
                .price((double) (10))
                .build();
        ToolsEntity toolsEntity = toolsService.createTools(toolsRQ);
        assertEquals(toolsEntity.getToolName(), toolsRQ.getToolName());
        assertEquals(toolsEntity.getToolType(), toolsRQ.getToolType());
        assertEquals(toolsEntity.getPrice(), toolsRQ.getPrice());
        assertEquals(toolsEntity.getPurchaseDate(), toolsRQ.getPurchaseDate());
    }


    @Test
    void testFetchTools_1() {
        List<ToolsEntity> toolsEntities = toolsService.fetchAllTools();
        assertNotNull(toolsEntities);
    }

    @Test
    void testCreateTools_2() {
        ToolsRQ toolsRQ = ToolsRQ.builder()
                .toolType("TOOL_TYPE_")
                .toolName("TOOL_NAME_")
                .purchaseDate(new Date())
                .price((double) (10))
                .build();
        ToolsEntity toolsEntity = toolsService.createTools(toolsRQ);
        assertEquals(toolsEntity.getToolName(), toolsRQ.getToolName());
        assertEquals(toolsEntity.getToolType(), toolsRQ.getToolType());
        assertEquals(toolsEntity.getPrice(), toolsRQ.getPrice());
        assertEquals(toolsEntity.getPurchaseDate(), toolsRQ.getPurchaseDate());
    }


    @Test
    void testFetchTools_2() {
        List<ToolsEntity> toolsEntities = toolsService.fetchAllTools();
        assertNotNull(toolsEntities);
    }

    @Test
    void testCreateTools_3() {
        ToolsRQ toolsRQ = ToolsRQ.builder()
                .toolType("TOOL_TYPE_")
                .toolName("TOOL_NAME_")
                .purchaseDate(new Date())
                .price((double) (10))
                .build();
        ToolsEntity toolsEntity = toolsService.createTools(toolsRQ);
        assertEquals(toolsEntity.getToolName(), toolsRQ.getToolName());
        assertEquals(toolsEntity.getToolType(), toolsRQ.getToolType());
        assertEquals(toolsEntity.getPrice(), toolsRQ.getPrice());
        assertEquals(toolsEntity.getPurchaseDate(), toolsRQ.getPurchaseDate());
    }


    @Test
    void testFetchTools_3() {
        List<ToolsEntity> toolsEntities = toolsService.fetchAllTools();
        assertNotNull(toolsEntities);
    }


    @Test
    void testCreateTools_4() {
        ToolsRQ toolsRQ = ToolsRQ.builder()
                .toolType("TOOL_TYPE_")
                .toolName("TOOL_NAME_")
                .purchaseDate(new Date())
                .price((double) (10))
                .build();
        ToolsEntity toolsEntity = toolsService.createTools(toolsRQ);
        assertEquals(toolsEntity.getToolName(), toolsRQ.getToolName());
        assertEquals(toolsEntity.getToolType(), toolsRQ.getToolType());
        assertEquals(toolsEntity.getPrice(), toolsRQ.getPrice());
        assertEquals(toolsEntity.getPurchaseDate(), toolsRQ.getPurchaseDate());
    }


    @Test
    void testFetchTools_4() {
        List<ToolsEntity> toolsEntities = toolsService.fetchAllTools();
        assertNotNull(toolsEntities);
    }

    @Test
    void testCreateTools_5() {
        ToolsRQ toolsRQ = ToolsRQ.builder()
                .toolType("TOOL_TYPE_")
                .toolName("TOOL_NAME_")
                .purchaseDate(new Date())
                .price((double) (10))
                .build();
        ToolsEntity toolsEntity = toolsService.createTools(toolsRQ);
        assertEquals(toolsEntity.getToolName(), toolsRQ.getToolName());
        assertEquals(toolsEntity.getToolType(), toolsRQ.getToolType());
        assertEquals(toolsEntity.getPrice(), toolsRQ.getPrice());
        assertEquals(toolsEntity.getPurchaseDate(), toolsRQ.getPurchaseDate());
    }


    @Test
    void testFetchTools_5() {
        List<ToolsEntity> toolsEntities = toolsService.fetchAllTools();
        assertNotNull(toolsEntities);
    }

    @Test
    void testCreateTools_6() {
        ToolsRQ toolsRQ = ToolsRQ.builder()
                .toolType("TOOL_TYPE_")
                .toolName("TOOL_NAME_")
                .purchaseDate(new Date())
                .price((double) (10))
                .build();
        ToolsEntity toolsEntity = toolsService.createTools(toolsRQ);
        assertEquals(toolsEntity.getToolName(), toolsRQ.getToolName());
        assertEquals(toolsEntity.getToolType(), toolsRQ.getToolType());
        assertEquals(toolsEntity.getPrice(), toolsRQ.getPrice());
        assertEquals(toolsEntity.getPurchaseDate(), toolsRQ.getPurchaseDate());
    }


    @Test
    void testFetchTools_6() {
        List<ToolsEntity> toolsEntities = toolsService.fetchAllTools();
        assertNotNull(toolsEntities);
    }

    @Test
    void testCreateTools_7() {
        ToolsRQ toolsRQ = ToolsRQ.builder()
                .toolType("TOOL_TYPE_")
                .toolName("TOOL_NAME_")
                .purchaseDate(new Date())
                .price((double) (10))
                .build();
        ToolsEntity toolsEntity = toolsService.createTools(toolsRQ);
        assertEquals(toolsEntity.getToolName(), toolsRQ.getToolName());
        assertEquals(toolsEntity.getToolType(), toolsRQ.getToolType());
        assertEquals(toolsEntity.getPrice(), toolsRQ.getPrice());
        assertEquals(toolsEntity.getPurchaseDate(), toolsRQ.getPurchaseDate());
    }


    @Test
    void testFetchTools_7() {
        List<ToolsEntity> toolsEntities = toolsService.fetchAllTools();
        assertNotNull(toolsEntities);
    }
}
