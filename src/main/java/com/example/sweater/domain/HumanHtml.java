package com.example.sweater.domain;

public class HumanHtml {

    public String createHuman(Human human){
        String html = "          <div class=\"p-5\">\n" +
                "            <div class=\"d-block block-testimony w-75 mx-auto text-center\">\n" +
                "              <div class=\"person w-25 mx-auto mb-4\">\n" +
                "                <img src=\"" + human.getImg() + "\" alt=\"Image\" class=\"img-fluid rounded-circle\">\n" +
                "              </div>\n" +
                "              <div>\n" +
                "                <h2 class=\"h5 mb-4\">" + human.getName() + "</h2>\n" +
                "                <blockquote>&ldquo;" + human.getText() + "&rdquo;</blockquote>                \n" +
                "              </div>\n" +
                "              <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#humremake\">\n" +
                "                Редактировать иформации о человеке\n" +
                "              </button>\n" +
                "\n" +
                "              <button type=\"button\" class=\"btn btn-primary\">\n" +
                "                Удалить человека из слайдера\n" +
                "              </button>\n" +
                "            </div>\n" +
                "          </div>";

        return html;
    }
}
