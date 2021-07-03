package com.propertyaccessservice.beans;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data

@Component
@ConfigurationProperties(prefix = "property-file")
public class PropertyAccessBean {
    private String name;
    private String description;
}
