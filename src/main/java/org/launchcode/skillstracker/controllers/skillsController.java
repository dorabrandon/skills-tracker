package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class skillsController {



    @GetMapping
    @ResponseBody
    public String languages() {
        return "<html>" +
                "<body>" +
                "<h1> Skills Tracker </h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li> Java </li>" +
                "<li> JavaScript </li>" +
                "<li> Python </li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
    @PostMapping(value="favorite")
    @ResponseBody
    public String displayFavorite(@RequestParam String name,@RequestParam String lang1, @RequestParam String lang2, @RequestParam String lang3){
        return "<html>" +
                "<body>" +
                "<h1>" + name +"</h1>" +
                "<ol>" +
                "<li> " + lang1 + "</li>"+
                "<li> " + lang2 + "</li>" +
                "<li> " + lang3 +"</li>"+
                "</ol>";
    }

    @GetMapping("form")
    @ResponseBody
    public String displayForm(){
        return "<html>" +
                "<body>" +
                "<form action='favorite' method = 'POST'> " +
                "<label>Name: <input type='text' name='name'> </label><br>" +
                "<label> My favorite language: " +
                "<select name='lang1'>" +
                "<option value = ''>* Select One * </option>" +
                "<option value = 'Java'> Java</option>" +
                "<option value = 'JavaScript'> JavaScript </option>" +
                "<option value = 'Python'> Python </option>" +
                "</select>" +
                "</label><br>" +
                "<label> My second favorite language: " +
                "<select name='lang2'>" +
                "<option value = ''>* Select One * </option>" +
                "<option value = 'Java'> Java</option>" +
                "<option value = 'JavaScript'> JavaScript </option>" +
                "<option value = 'Python'> Python </option>" +
                "</select>" +
                "</label><br>" +
                "<label> My third favorite language: " +
                "<select name='lang3'>" +
                "<option value = ''>* Select One * </option>" +
                "<option value = 'Java'> Java</option>" +
                "<option value = 'Javascript'> JavaScript </option>" +
                "<option value = 'Python'> Python </option>" +
                "</select>" +
                "</label><br>" +
                "<input type = 'submit' value = 'Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";


    }
}
