package com.example.sweater.RestController;

import com.example.sweater.Json.SliderJson;
import com.example.sweater.domain.*;
import com.example.sweater.repos.CarouselRepo;
import com.example.sweater.repos.HumanRepo;
import com.example.sweater.repos.SliderRepo;
import com.example.sweater.repos.TitleTextImgRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Map;

@RestController
public class Admin {

    @Autowired
    SliderRepo slider;

    @Autowired
    TitleTextImgRepo block;

    @Autowired
    CarouselRepo carousel;

    @Autowired
    HumanRepo human;

    void initialization(Map<String, Object> model){
        Slider sl = new Slider("3","3","3",3);
        ArrayList<Slider> list = (ArrayList<Slider>) slider.findAll();
        ArrayList<String> listHtml = new ArrayList<>();
        for (int i = 0; i <list.size() ; i++) {
            SliderHtml sliderHtml = new SliderHtml();
            listHtml.add(sliderHtml.createSlide(list.get(i)));

        }

        TitleTextImg txt = new TitleTextImg("Заголовок", "TextTextText", "/static/images/hero_bg_2.jpg", "right");
        ArrayList<TitleTextImg> listTti = (ArrayList<TitleTextImg>) block.findAll();
        // TitleTextImg titleTextImg = new TitleTextImg("1","1","1","1");
        //block.save(txt);
        String listTtiHtmlLeft ="";
        // for (int i = 0; i < listTti.size(); i++) {
        TitleTextImgHtml titleTextImgHtml = new TitleTextImgHtml(listTti.get(0));
        listTtiHtmlLeft = titleTextImgHtml.getHtml();
        titleTextImgHtml = new TitleTextImgHtml(listTti.get(1));
        String llistTtiHtmlRight = titleTextImgHtml.getHtml();
        titleTextImgHtml = new TitleTextImgHtml(listTti.get(2));
        String llistTtiHtmlMid = titleTextImgHtml.getHtml();

        //  listTtiHtml.add(titleTextImgHtml.getHtml());
        //}


        Carousel carous = new Carousel("/static/images/hero_bg_2.jpg","Titel","TextTextText", 9l);
        ArrayList<Carousel> listCarous = (ArrayList<Carousel>) carousel.findAll();
        //slider.save(sl);
        ArrayList<String> listCarousHtml = new ArrayList<>();
        for (int i = 0; i <listCarous.size() ; i++) {
            CarouselHtml carouselHtml = new CarouselHtml(listCarous.get(i));
            listCarousHtml.add(carouselHtml.getHtml());
        }


        Human valTableHuman = new Human(
                "Vanya Bublik", "TextTextText", "/static/images/person_3.jpg", 1);
        ArrayList<Human> listHuman = (ArrayList<Human>) human.findAll();
        ArrayList<String> listHumanHtml = new ArrayList<>();
        human.save(valTableHuman);
        for (int i = 0; i < listHuman.size(); i++) {
            HumanHtml humanHtml = new HumanHtml();
            listHumanHtml.add(humanHtml.createHuman(listHuman.get(i)));
        }

        //System.out.println(list.size());

        model.put("slider",listHtml);
        // System.out.println(listTtiHtmlLeft);
        model.put("blockLeft", listTtiHtmlLeft);
        //System.out.println(llistTtiHtmlRight);
        model.put("blockRight",llistTtiHtmlRight);
        model.put("blockMid", llistTtiHtmlMid);
        //   System.out.println(listCarousHtml.get(0));
        model.put("human", listHumanHtml);
        model.put("listCarous",listCarousHtml);
    }
///
//    @PostMapping(value = "/admin")
//    public ResponseEntity<?> create( String client) {
//       // System.out.println(client.text+client.text+"0");
//        System.out.println(client);
//
//        return new ResponseEntity<>(HttpStatus.OK);
//    }


    @PostMapping( "/admin" )
    public void someControllerMethod( @RequestParam Map<String, String> body ) {
        System.out.println("text = "+ body.get("text"));
    }

//    @PostMapping("/admin")
//    public String getGeneridc(@RequestBody SliderJson stringToParse, Map<String, Object> model){
//        System.out.println(stringToParse.text);
//
////        StringReader reader = new StringReader(stringToParse);
////
////        ObjectMapper mapper = new ObjectMapper();
////
////        try {
////            SliderJson cat = mapper.readValue(reader, SliderJson.class);
////            System.out.println("json  text =" +cat.text);
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
//        initialization( model);
//        System.out.println(stringToParse);
//        return "admin";
//    }
}
