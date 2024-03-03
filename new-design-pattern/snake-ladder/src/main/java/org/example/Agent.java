package org.example;

public abstract class Agent {
    private AgentType agentType;
    private int startId;
    private int endId;

    public Agent(AgentType agentType, int startId, int endId) {
        this.agentType = agentType;
        this.startId = startId;
        this.endId = endId;
    }

    public AgentType getAgentType() {
        return agentType;
    }

    public void setAgentType(AgentType agentType) {
        this.agentType = agentType;
    }

    public int getStartId() {
        return startId;
    }

    public void setStartId(int startId) {
        this.startId = startId;
    }

    public int getEndId() {
        return endId;
    }

    public void setEndId(int endId) {
        this.endId = endId;
    }
}
