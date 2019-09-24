package com.stackroute.domain;

public class Movie {
    private Actor actorObj;

    public void setActorObj(Actor actorObj) {
        this.actorObj = actorObj;
    }

    public Actor getActorDetails(){
        return actorObj;
    }
}
