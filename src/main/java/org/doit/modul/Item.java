package org.doit.modul;


public class Item {
    private int id;
    private String name;
    private float cost;
    private String description;


    //region Setters
    public  void setId(int id){this.id = id;}
    public void setName(String name) {
        this.name = name;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    //endregion

    //region Getters
    public int getId(){return  id;}
    public String getName() {
        return name;
    }
    public float getCost() {
        return cost;
    }
    public String getDescription() {
        return description;
    }
    //endregion



}
