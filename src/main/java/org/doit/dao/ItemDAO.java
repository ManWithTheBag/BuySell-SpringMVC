package org.doit.dao;

import org.doit.modul.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ItemDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    public Item getItemFromId(int id){
        return jdbcTemplate.query("select * from items where id = ?", new Object[]{id},
                new BeanPropertyRowMapper<>(Item.class)).stream().findAny().orElse(null);
    }

    public List<Item> getItemsList(){
        return jdbcTemplate.query("select * from items", new BeanPropertyRowMapper<>(Item.class));
    }

    public void setNewItem(Item item){
        jdbcTemplate.update("insert into items values ( default ,?,?,?)", item.getName(), item.getCost(), item.getDescription());
    }

}
