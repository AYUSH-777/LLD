package org.example;

public class Cell {
    private String cellId;
    private Agent agent;

    public Cell(String cellId,Agent agent)
    {
        this.cellId = cellId;
        this.agent = agent;
    }

    public String getCellId() {
        return cellId;
    }

    public void setCellId(String cellId) {
        this.cellId = cellId;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }
}
