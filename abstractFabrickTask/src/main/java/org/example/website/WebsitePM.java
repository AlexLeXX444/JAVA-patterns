package org.example.website;

import org.example.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Manages website...");
    }
}
