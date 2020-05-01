package com.example.sweater.domain;

public class SliderHtml {

    String title =" <h1 id=\"zag\" class=\"font-secondary font-weight-bold text-uppercase\"> $$q </h1>";
    String text ="<span class=\"caption d-block text-white\"> $$q </span><br>";
    String buttonEdit = "<button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#slideremake\">\n" +
            "                            Редактировать слайд\n" +
            "                        </button><br>";
    String buttonDel = "<button type=\"button\" class=\"btn btn-primary\" onclick=\"edit1slide()\">\n" +
            "                            Удалить этот слайд\n" +
            "                        </button>";

    String html = "<div id=\"slide$$id\" class=\"site-blocks-cover inner-page overlay\" style=\"background-image: url($$img);\" data-aos=\"fade\" data-stellar-background-ratio=\"0.5\">\n" +
            "            <div class=\"container\">\n" +
            "                <div  class=\"row align-items-center\">\n" +
            "                    <div id=\"asd\" class=\"col-md-6\" data-aos=\"fade\"> $$q </div>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "        </div>";

    public String createSlide (Slider slide){
        String t = this.title.replace("$$q",slide.getTitle());
        t +=this.text.replace("$$q", slide.getText());
        t +=this.buttonEdit;
        t +=this.buttonDel;
        String rezult = html.replace("$$img", slide.getImg());
        rezult = rezult.replace("$$id",slide.getId()+"");
        rezult = rezult.replace("$$q", t);

         return rezult;

    }
}
