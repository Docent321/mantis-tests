package ru.stqa.pft.mantis.model;

public class Issue {
    private int id;
    private String summary;
    private String descriprion;
    private Project project;

    public int getId() {
        return id;
    }

    public Issue withId(int id) {
        this.id = id;
        return this;
    }

    public String getSummary() {
        return summary;
    }

    public Issue withSummary(String summary) {
        this.summary = summary;
        return this;
    }

    public String getDescriprion() {
        return descriprion;
    }

    public Issue withDescriprion(String descriprion) {
        this.descriprion = descriprion;
        return this;
    }

    public Project getProject() {
        return project;
    }

    public Issue withProject(Project project) {
        this.project = project;
        return this;
    }
}
