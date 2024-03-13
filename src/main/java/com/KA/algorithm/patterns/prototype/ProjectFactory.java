package com.KA.algorithm.patterns.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProjectFactory {
    Project project;

    public Project cloneProject() {
        return (Project)project.copy();
    }
}
