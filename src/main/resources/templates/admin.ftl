<!DOCTYPE html>
<html lang="en">
<head>
    <title>Funder &mdash; Colorlib Website Template</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link href="https://fonts.googleapis.com/css?family=Oswald:400,700|Work+Sans:300,400,700" rel="stylesheet">
    <link rel="stylesheet" href="/static/fonts/icomoon/style.css">

    <link rel="stylesheet" href="/static/css/bootstrap.min.css">
    <link rel="stylesheet" href="/static/css/magnific-popup.css">
    <link rel="stylesheet" href="/static/css/jquery-ui.css">
    <link rel="stylesheet" href="/static/css/owl.carousel.min.css">
    <link rel="stylesheet" href="/static/css/owl.theme.default.min.css">
    <link rel="stylesheet" href="/static/css/bootstrap-datepicker.css">
    <link rel="stylesheet" href="/static/css/animate.css">

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/mediaelement@4.2.7/build/mediaelementplayer.min.css">



    <link rel="stylesheet" href="/static/fonts/flaticon/font/flaticon.css">

    <link rel="stylesheet" href="/static/css/aos.css">

    <link rel="stylesheet" href="/static/css/style.css">

    <script >
        function edit1slide() {
            alert("!");
            var params = new FormData();
            params.append("text", "JavaScript");

            var ajax = new XMLHttpRequest();

// выполнить код, когда придёт ответ с POST-запроса
            ajax.onreadystatechange = function() {
                if (ajax.readyState == 4) {

                    if (ajax.status == 200 || ajax.status == 304) {
                        // код при успешном запросе
                        ajax.response; // ответ сервера
                    } else {
                        // код при ошибке
                    }

                }
            }

// Оправка POST-запроса
            ajax.open('POST', '/admin');
            ajax.setRequestHeader("X-Requested-With", "XMLHttpRequest");
            ajax.send(params);




            //document.getElementById("slide1").parentElement.removeChild();
            //document.getElementById("slide1").style.backgroundImage="url(img_1)";
        }
    </script>

    <script>
        function sav() {
            alert("!");
            var xhr = new XMLHttpRequest();


            var body = '_csrf=' + encodeURIComponent("${_csrf.token}") +
                '&text=' + encodeURIComponent("js");

            xhr.open("POST", '/admin', true);
            xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');

            //xhr.onreadystatechange = ...;

            xhr.send(body);
        }
    </script>

</head>

<body style="background-image: url('/static/images/bg.jpg');">


<div id="textremake" class="modal fade bd-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Редактор текста</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <div>
                    <input type="input" placeholder="Введите заголовок..."><br>
                    <textarea cols="60" rows="10" placeholder="Введите текст..."></textarea>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Отменить</button>
                <button type="button" class="btn btn-primary" onclick="sav()">Сохранить1</button>
            </div>
        </div>
    </div>
</div>

<div id="slideremake" class="modal fade bd-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Редактор слайдера</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <div>
                    <input type="input" placeholder="Введите заголовок слайда..."><br>
                    <textarea cols="60" rows="3" placeholder="Введите текст слайда..."></textarea><br>
                    <div class="custom-file">
                        <input type="file" class="custom-file-input" id="customFile">
                        <label class="custom-file-label" for="customFile">Выбрать фотографию</label>
                    </div>
                    <div class="col-auto my-1">
                        <label class="mr-sm-2" for="inlineFormCustomSelect">Номер слайда</label>
                        <select class="custom-select mr-sm-2" id="inlineFormCustomSelect">
                            <option selected>Выбрать...</option>
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                        </select>
                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Отменить</button>
                <button type="button" class="btn btn-primary">Сохранить</button>
            </div>
        </div>
    </div>
</div>

<div id="imgremake" class="modal fade bd-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Изменить фотографию</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <div class="custom-file">
                    <input type="file" class="custom-file-input" id="customFile">
                    <label class="custom-file-label" for="customFile">Выбрать фотографию</label>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Отменить</button>
                <button type="button" class="btn btn-primary">Сохранить</button>
            </div>
        </div>
    </div>
</div>

<div id="humremake" class="modal fade bd-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Редактор информации о человеке</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <div>
                    <input type="input" placeholder="Введите имя"><br>
                    <textarea cols="60" rows="10" placeholder="Введите описание"></textarea>
                </div>
                <div class="custom-file">
                    <input type="file" class="custom-file-input" id="customFile">
                    <label class="custom-file-label" for="customFile">Выбрать фотографию</label>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Отменить</button>
                <button type="button" class="btn btn-primary">Сохранить</button>
            </div>
        </div>
    </div>
</div>

<div class="site-wrap">



    <div class="site-mobile-menu">
        <div class="site-mobile-menu-header">
            <div class="site-mobile-menu-close mt-3">
                <span class="icon-close2 js-menu-toggle"></span>
            </div>
        </div>
        <div class="site-mobile-menu-body"></div>
    </div> <!-- .site-mobile-menu -->


    <div class="site-navbar-wrap js-site-navbar bg-white">

        <div class="container">
            <div class="site-navbar bg-light">
                <div class="row align-items-center">
                    <div class="col-2">
                        <h2 class="mb-0 site-logo"><a href="index.html" class="font-weight-bold">СМАКАТА</a></h2>
                    </div>
                    <div class="col-10">
                        <nav class="site-navigation text-right" role="navigation">
                            <div class="container">
                                <div class="d-inline-block d-lg-none ml-md-0 mr-auto py-3"><a href="#" class="site-menu-toggle js-menu-toggle text-black"><span class="icon-menu h3"></span></a></div>

                                <ul class="site-menu js-clone-nav d-none d-lg-block">
                                    <li class="active"><a href="index.html">Главная</a></li>
                                    <li class="has-children">
                                        <a href="insurance.html">Insurance</a>
                                        <ul class="dropdown arrow-top">
                                            <li><a href="#">Home Insurance</a></li>
                                            <li><a href="#">Auto Insurance</a></li>
                                            <li><a href="#">Travel Insurance</a></li>
                                            <li class="has-children">
                                                <a href="#">Sub Menus</a>
                                                <ul class="dropdown">
                                                    <li><a href="insurance.html">Home Insurance</a></li>
                                                    <li><a href="insurance.html">Auto Insurance</a></li>
                                                    <li><a href="insurance.html">Travel Insurance</a></li>
                                                </ul>
                                            </li>
                                        </ul>
                                    </li>
                                    <li><a href="services.html">Фотогалерея</a></li>

                                    <li><a href="contact.html">Контакты</a></li>

                                </ul>
                            </div>
                        </nav>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="slide-one-item home-slider owl-carousel">

        <#list slider as sl>
            ${sl}
        </#list>

    </div>

    <div class="site-section">
        <div class="container">
            <div class="row">
                <div class="col-md-12 text-center">
                    <span class="caption d-block mb-2 font-secondary font-weight-bold">Концерты и праздники</span>
                    <h2 class="site-section-heading text-uppercase text-center font-secondary">Все наши мероприятия</h2>
                    <button>Добавить статью</button>
                </div>
            </div>
            <div class="row">
                <div class="col-md-12 block-13 nav-direction-white">
                    <div class="nonloop-block-13 owl-carousel">
                        <#list listCarous as c>
                            ${c}
                        </#list>


                    </div>
                </div>
            </div>
        </div>
    </div>




${ blockLeft}


${blockRight}



    <div class="site-section block-14 bg-light nav-direction-white">

        <div class="container">

            <div class="row mb-5">
                <div class="col-md-12">
                    <h2 class="site-section-heading text-center text-uppercase">Testimonies</h2>
                </div>
            </div>

            <div class="nonloop-block-14 owl-carousel">

                <#list human as c>
                    ${c}
                </#list>

            </div>

        </div>

    </div>

    ${blockMid}


    <div class="py-5 bg-primary">
        <div class="container">
            <div class="row align-items-center">
                <div class="col-md-6 text-center text-md-left mb-3 mb-md-0">
                    <h2 class="text-uppercase text-white mb-0">Small Business Insurance Company</h2>
                </div>
                <div class="col-md-3 ml-auto text-center text-md-left">
                    <a href="#" class="btn btn-bg-primary d-inline-block d-md-block font-secondary text-uppercase">Contact Us</a>
                </div>
            </div>
        </div>
    </div>


</div>

<script src="/static/js/jquery-3.3.1.min.js"></script>
<script src="/static/js/jquery-migrate-3.0.1.min.js"></script>
<script src="/static/js/jquery-ui.js"></script>
<script src="/static/js/popper.min.js"></script>
<script src="/static/js/bootstrap.min.js"></script>
<script src="/static/js/owl.carousel.min.js"></script>
<script src="/static/js/jquery.stellar.min.js"></script>
<script src="/static/js/jquery.countdown.min.js"></script>
<script src="/static/js/jquery.magnific-popup.min.js"></script>
<script src="/static/js/bootstrap-datepicker.min.js"></script>
<script src="/static/js/aos.js"></script>

<script src="/static/js/main.js"></script>

</body>
</html>