package org.doit.controller;

import org.doit.dao.ItemDAO;
import org.doit.modul.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ItemController {

    @Autowired
    private ItemDAO itemDAO;

    @GetMapping("/item")
    public String getItem(Model model){
        model.addAttribute("item", itemDAO.getItemFromId(1));

        return "/item";
    }

}
