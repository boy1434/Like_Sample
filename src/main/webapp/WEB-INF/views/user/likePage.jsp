<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
        <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css"
            integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p"
            crossorigin="anonymous" />
        <style>
            .m_set_red {
                color: red;
            }

            .m_set_white {
                color: white;
            }

            .m_set_pointer {
                cursor: pointer;
            }
        </style>
    </head>

    <body>
        <h1>좋아요 페이지 입니다.</h1>
        <hr />
        <i class="far fa-heart "></i>
        <i class="fas fa-heart m_set_red"></i>
        <hr />
        <i id="heart1" class="far fa-heart m_set_pointer" onclick="like()"></i>

        <script>
            async function like() {
                // jquery 문법 ajax 사용해도 된다.
                // fetch 문법

                let response = await fetch("http://localhost:8080/like", {
                    method: "post"
                });

                let parseResponse = await response.json(); // json(), text() 받음

                // alert(parseResponse)
                console.log(parseResponse);

                if (parseResponse.code == 1) {
                    $("#heart1").addClass("m_set_red");
                    $("#heart1").toggleClass("fas");
                }
            }
        </script>
    </body>

    </html>