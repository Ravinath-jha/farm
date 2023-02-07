package com.farm.backend.service;

import com.farm.backend.datatable.ToolsEntity;
import com.farm.backend.models.ToolsRQ;
import com.farm.backend.repository.ToolsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class ToolsService {

    @Autowired
    ToolsRepository toolsRepository;

    public List<ToolsEntity> fetchAllTools() {
        List<ToolsEntity> toolsEntities = toolsRepository.findAll();
        if (CollectionUtils.isEmpty(toolsEntities)) {
            toolsEntities = new ArrayList<>();
        }
        return toolsEntities;
    }

    public ToolsEntity createTools(ToolsRQ request) {

        return toolsRepository.save(
                ToolsEntity.builder()
                        .toolType(request.getToolType())
                        .toolName(request.getToolName())
                        .purchaseDate(request.getPurchaseDate())
                        .price(request.getPrice())
                        .build()
        );
    }
}
