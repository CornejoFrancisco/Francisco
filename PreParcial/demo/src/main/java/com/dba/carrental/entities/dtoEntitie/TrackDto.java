package com.dba.carrental.entities.dtoEntitie;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrackDto {
    private long TrackId;
    private String Name;
    private Integer album;
    private Integer mediaTypel;
    private Integer genre;
    private Integer composer;
    private Integer miliSeconds;
    private Integer bytes;
    private Integer unitPrice;


}
