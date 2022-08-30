package com.message.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InfoController {

    @GetMapping("/info")// обробатывает get-запросы.(GET)- метод  для чтения данных с сайта.
    public String info(Model model)
    //мы предаем в модель  в которой находяться наши данные  необходимые для отображения на нашем сайте.model.addAttribute("some text", someObject);
    // это добавление в передаваемую модель данных, в вашем случае someObject, которые потом будут доступны по ключу который вы указываете как параметр String,
    // в вашем случае это "title".
    {
        model.addAttribute("info", "info");
        return "info";
    }


}
