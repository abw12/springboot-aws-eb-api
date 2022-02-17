package com.abw12.springbootawsebapi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Players {

    private String playename;
    private double runsScored;
    private int age;
    private String nation;
}
