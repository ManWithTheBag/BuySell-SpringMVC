package org.doit.controller;

import org.doit.dao.ItemDAO;
import org.doit.modul.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ItemController {

    @Autowired
    private ItemDAO itemDAO;

    @GetMapping("/")
    public String mainSheet(){
        return "/test";
    }

    @GetMapping("/item/{id}")
    public String getItem(@PathVariable("id") int id, Model model){
        model.addAttribute("item", itemDAO.getItemFromId(id));

        return "/item";
    }

    @GetMapping("/itemsList")
    public  String getAllItems(Model model){
        model.addAttribute("itemsList", itemDAO.getItemsList());
        return "/itemsList";
    }

    @GetMapping("/item/new")
    public String showAddForm(){
        return "/newItem";
    }

    @PostMapping("/item/new")
    public String setNewItem(@ModelAttribute Item item){
        itemDAO.setNewItem(item);

        return ("redirect:/itemsList");
    }
}
