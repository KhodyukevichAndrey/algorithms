package com.KA.algorithm.patterns.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project implements Copyable {
    private int id;
    private String name;
    private String code;

    @Override
    public Object copy() {
        Project copy = new Project(id, name, code);
        return copy;
    }
}
