package com.example.sweater.domain;

public class TitleTextImgHtml {

    private String   html = "  <div class=\"site-half \">\n" +
            "    <div class=\"img-bg-1 $$type\" style=\"background-image: url('$$img');\"></div>\n" +
            "    <div class=\"container\">\n" +
            "      <div class=\"row no-gutters align-items-stretch\">\n" +
            "        <div class=\"col-md-5 m$$litter-md-auto py-5\">\n" +
            "          <h2 class=\"site-section-heading text-uppercase font-secondary mb-5\"> $$title" +
            "</h2>\n" +
            "\n" +
            "          <p>$$text</p>  \n" +
            "        \n" +
            "          <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#textremake\">\n" +
            "            Редактировать текст\n" +
            "          </button>\n" +
            "        </div>\n" +
            "      </div>\n" +
            "    </div>\n" +
            "  </div>";

    private String htmlMid = "    <div class=\"site-section\">\n" +
            "      <div class=\"container\">\n" +
            "        <div class=\"row\">\n" +
            "          <div class=\"col-lg-6\">\n" +
            "            <p class=\"mb-5\"><img src=\"$$img\" alt=\"Image\" class=\"img-fluid\"></p>\n" +
            "          </div>\n" +
            "          <div class=\"col-lg-5 ml-auto\">\n" +
            "            <h2 class=\"site-section-heading mb-3 font-secondary text-uppercase\">$$title</h2>\n" +
            "            <p class=\"mb-5\">$$text</p>\n" +
            "            <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#textremake\">\n" +
            "              Редактировать текст\n" +
            "            </button>\n" +
            "            <p><a href=\"#\" class=\"btn btn-outline-primary py-2 px-4\">Insured Yours Now</a></p>\n" +
            "          </div>\n" +
            "        </div>\n" +
            "      </div>\n" +
            "    </div>";





    private TitleTextImg titleTextImg;

    public TitleTextImgHtml(TitleTextImg titleTextImg) {
        this.titleTextImg = titleTextImg;
    }

    public String getHtml() {
        String rezult;

        if (titleTextImg.getType().equals("mid")){
            rezult = htmlMid.replace("$$img", this.titleTextImg.getImg());
            rezult = rezult.replace("$$title", titleTextImg.getTitle());
            rezult = rezult.replace("$$text", titleTextImg.getText());
            return rezult;
        } else {
            rezult = html.replace("$$img", this.titleTextImg.getImg());
            rezult = rezult.replace("$$type", titleTextImg.getType());
            String litter = titleTextImg.getType().equals(" ") ? "l" : titleTextImg.getType().equals("right") ? "r" : "";
            rezult = rezult.replace("$$litter", litter);
            rezult = rezult.replace("$$title", titleTextImg.getTitle());
            rezult = rezult.replace("$$text", titleTextImg.getText());
            return rezult;
        }
    }


    public String createTitleTextImg(TitleTextImg titleTextImg){
        String html;

        if (titleTextImg.getType() == "left") {
            html = "  <div class=\"site-half\">\n" +
                    "    <div class=\"img-bg-1\" style=\"background-image: url('" + titleTextImg.getImg() + "');\"></div>\n" +
                    "    <div class=\"container\">\n" +
                    "      <div class=\"row no-gutters align-items-stretch\">\n" +
                    "        <div class=\"col-md-5 ml-md-auto py-5\">\n" +
                    "          <h2 class=\"site-section-heading text-uppercase font-secondary mb-5\">" + titleTextImg.getTitle() +
                    "</h2>\n" +
                    "\n" +
                    "          <p>" + titleTextImg.getText() + "</p>  \n" +
                    "        \n" +
                    "          <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#textremake\">\n" +
                    "            Редактировать текст\n" +
                    "          </button>\n" +
                    "        </div>\n" +
                    "      </div>\n" +
                    "    </div>\n" +
                    "  </div>";
        }
        else {
            if (titleTextImg.getType() == "right"){
                html = "  <div class=\"site-half right\">\n" +
                        "    <div class=\"img-bg-1\" style=\"background-image: url('" + titleTextImg.getImg() + "');\"></div>\n" +
                        "    <div class=\"container\">\n" +
                        "      <div class=\"row no-gutters align-items-stretch\">\n" +
                        "        <div class=\"col-md-5 ml-md-auto py-5\">\n" +
                        "          <h2 class=\"site-section-heading text-uppercase font-secondary mb-5\">" + titleTextImg.getTitle() +
                        "</h2>\n" +
                        "\n" +
                        "          <p>" + titleTextImg.getText() + "</p>  \n" +
                        "        \n" +
                        "          <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#textremake\">\n" +
                        "            Редактировать текст\n" +
                        "          </button>\n" +
                        "        </div>\n" +
                        "      </div>\n" +
                        "    </div>\n" +
                        "  </div>";
            }
            else {
                html = "    <div class=\"site-section\">\n" +
                        "      <div class=\"container\">\n" +
                        "        <div class=\"row\">\n" +
                        "          <div class=\"col-lg-6\">\n" +
                        "            <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#imgremake\">\n" +
                        "              Изменить фотографию\n" +
                        "            </button>\n" +
                        "            <p class=\"mb-5\"><img src=\"images/img_1.jpg\" alt=\"Image\" class=\"img-fluid\"></p>\n" +
                        "          </div>\n" +
                        "          <div class=\"col-lg-5 ml-auto\">\n" +
                        "            <h2 class=\"site-section-heading mb-3 font-secondary text-uppercase\">Thousands of Houses Damage Each Year</h2>\n" +
                        "            <p class=\"mb-5\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Enim ad, tempora incidunt accusantium. Similique magni quaerat beatae illo aliquid. Libero non ipsa nisi, corporis architecto incidunt rem repellendus asperiores numquam!</p>\n" +
                        "            <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#textremake\">\n" +
                        "              Редактировать текст\n" +
                        "            </button>\n" +
                        "            <p><a href=\"#\" class=\"btn btn-outline-primary py-2 px-4\">Insured Yours Now</a></p>\n" +
                        "          </div>\n" +
                        "        </div>\n" +
                        "      </div>\n" +
                        "    </div>";
            }
        }

        return html;
    }

}
