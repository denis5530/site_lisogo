package com.example.sweater.domain;

public class CarouselHtml {
    private Carousel carousel;
    private String html = "    <div class=\"media-image\">\n" +
            "          <img src=\"$$img\" alt=\"Image\" class=\"img-fluid\">\n" +
            "          <div class=\"media-image-body\">\n" +
            "            <h2 class=\"font-secondary text-uppercase\">$$title</h2>\n" +
            "    <p>$$text</p>\n" +
            "            <p><a href=\"#\" class=\"btn btn-primary text-white px-4\"><span class=\"caption\">$$more</span></a></p>\n" +
            "    <button>Редактировать статью</button>\n" +
            "    <button>Удалить статью</button>\n" +
            "          </div>\n" +
            "        </div>";


    public CarouselHtml(Carousel carousel) {
        this.carousel = carousel;
    }

    public String getHtml() {
        html = html.replace("$$img",carousel.getImg());
        html = html.replace("$$title",carousel.getTitle());
        html = html.replace("$$text",carousel.getText());
        html = html.replace("$$more","подробнее");
        return html;
    }
}
