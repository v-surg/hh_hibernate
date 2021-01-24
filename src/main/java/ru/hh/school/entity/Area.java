package ru.hh.school.entity;

//TODO: оформите entity

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "area")
public class Area {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "area_id")
  private Integer id;
  private String name;

  public Area(){ }

  public Area(String areaName){
    name = areaName;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o){
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Area area = (Area)o;
    return Objects.equals(id, area.id) && Objects.equals(name, area.name);
  }

  @Override
  public int hashCode() {return 17;}

  @Override
  public String toString(){
    return "Area{" +
            "id=" + id + '\'' +
            "name=" + name +
            "}";
  }
}
