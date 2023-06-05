package br.com.front;

public class constClass {

    public static String htmlPage = "<html>" +
            "<head>" +
            "  <meta charset="+"UTF-8>" +
            "  <title>Procedimento</title>" +
            "  <style>" +
            "    label {" +
            "      display: block;" +
            "      margin-bottom: 10px;" +
            "      font-weight: bold;" +
            "    }" +
            "" +
            "    select, input[type="+"number] {" +
            "      padding: 8px;" +
            "      border: 1px solid #ccc;" +
            "      border-radius: 4px;" +
            "      width: 200px;" +
            "      margin-bottom: 10px;" +
            "    }" +
            "" +
            "    input[type="+"radio" +"] {" +
            "      margin-right: 5px;" +
            "    }" +
            "" +
            "    input[type="+"submit] {" +
            "      padding: 10px 20px;" +
            "      background-color: #4CAF50;" +
            "      color: white;" +
            "      border: none;" +
            "      border-radius: 4px;" +
            "      cursor: pointer;" +
            "    }" +
            "" +
            "    .radio-container {" +
            "      display: inline-block;" +
            "      vertical-align: middle;" +
            "      position: relative;" +
            "      padding-left: 30px;" +
            "      cursor: pointer;" +
            "      font-size: 16px;" +
            "      margin-right: 10px;" +
            "    }" +
            "" +
            "    .radio-container input {" +
            "      position: absolute;" +
            "      opacity: 0;" +
            "      cursor: pointer;" +
            "    }" +
            "" +
            "    /* Quadrado externo do input radio */" +
            "    .radio-container .radio-outer {" +
            "      position: absolute;" +
            "      top: 0;" +
            "      left: 0;" +
            "      width: 20px;" +
            "      height: 20px;" +
            "      border: 2px solid #ccc;" +
            "      border-radius: 4px;" +
            "    }" +
            "" +
            "    /* Quadrado interno do input radio quando selecionado */" +
            "    .radio-container .radio-inner {" +
            "      position: absolute;" +
            "      top: 4px;" +
            "      left: 4px;" +
            "      width: 12px;" +
            "      height: 12px;" +
            "      background-color: #4CAF50;" +
            "      border-radius: 2px;" +
            "      display: none;" +
            "    }" +
            "" +
            "    /* Estilo do texto do input radio */" +
            "    .radio-container label {" +
            "      margin-left: 25px;" +
            "    }" +
            "" +
            "    /* Exibindo o quadrado interno quando o input radio está selecionado */" +
            "    .radio-container input:checked + .radio-outer {" +
            "      border-color: #4CAF50;" +
            "    }" +
            "" +
            "    .radio-container input:checked + .radio-outer .radio-inner {" +
            "      display: block;" +
            "    }" +
            "" +
            "    #container-proc {" +
            "      margin: 30px;" +
            "      background-color: #f1f1f1;" +
            "      padding: 20px;" +
            "      border-radius: 4px;" +
            "      box-shadow: 0 2px 5px rgba(0, 0, 0, 0.2);" +
            "      display: inline-block;" +
            "    }" +
            "" +
            "    #form-procedimento {" +
            "      display: flex;" +
            "      justify-content: center;" +
            "      align-items: center;" +
            "      height: 100vh;" +
            "    }" +
            "  </style>" +
            "</head>" +
            "<body>" +
            "<div id="+"form-procedimento>" +
            "  <form  method="+"post action="+"http://localhost:8080/mandarProcedimento>" +
            "    <div id="+"container-proc>" +
            "      <div>" +
            "        <label for=\"procedimento\">Selecione um procedimento:</label>" +
            "        <select name=\"procedimento\" id=\"procedimento\">" +
            "          <option data-id=\"1\" value=\"1234\">1 - 1234</option>" +
            "          <option data-id=\"2\" value=\"4567\">2 - 4567</option>" +
            "          <option data-id=\"3\" value=\"6789\">3 - 6789</option>" +
            "        </select>" +
            "      </div>" +
            "      <div>" +
            "        <input type=\"number\" placeholder=\"Idade\" id=\"idade\" name=\"idade\" required>" +
            "      </div>" +
            "      <div>" +
            "        <label class=\"text-center\">Sexo:</label>" +
            "        <div class=\"radio-container\">" +
            "          <input type=\"radio\" id=\"masculino\" name=\"sexo\" value=\"M\" checked>" +
            "          <label for=\"masculino\" class=\"radio-outer\"></label>" +
            "          <div class=\"radio-inner\"></div>" +
            "          <label for=\"masculino\">Masculino</label>" +
            "        </div>" +
            "        <div class=\"radio-container\">" +
            "          <input type=\"radio\" id=\"feminino\" name=\"sexo\" value=\"F\">" +
            "          <label for=\"feminino\" class=\"radio-outer\"></label>" +
            "          <div class=\"radio-inner\"></div>" +
            "          <label for=\"feminino\">Feminino</label>" +
            "        </div>" +
            "      </div>" +
            "      <div>" +
            "       <input type=\"submit\" value=\"Enviar\">" +
            "      </div>" +
            "      <div hidden id="+"sucess"+">" +
            "        <h4>" +
            "          Procedimento válido!" +
            "        </h4>" +
            "      </div>" +
            "      <div hidden id="+"fail"+">" +
            "        <h4>" +
            "          Procedimento inválido!" +
            "        </h4>" +
            "      </div>" +
            "    </div>" +
            "  </form>" +
            "</div>" +
            "</body>" +
            "</html>" +
            "" ;

    public static String classError = "<!DOCTYPE html>" +
            "<html>" +
            "<head>" +
            "  <meta charset="+"UTF-8>" +
            "  <title>Procedimento</title>" +
            "  <style>" +
            "    body {" +
            "      font-family: Arial, sans-serif;" +
            "      background-color: #DFDFDF;" +
            "      display: flex;" +
            "      justify-content: center;" +
            "      align-items: center;" +
            "      height: 100vh;" +
            "    }" +
            "" +
            "    #form-procedimento {" +
            "      margin: 30px;" +
            "      background-color: #f1f1f1;" +
            "      padding: 20px;" +
            "      border-radius: 4px;" +
            "      box-shadow: 0 2px 5px rgba(0, 0, 0, 0.2);" +
            "      text-align: center;" +
            "    }" +
            "" +
            "    h4 {" +
            "      margin-bottom: 10px;" +
            "      font-weight: bold;" +
            "    }" +
            "" +
            "    input[type="+"submit] {" +
            "      padding: 10px 20px;" +
            "      background-color: #00995D;" +
            "      color: white;" +
            "      border: none;" +
            "      border-radius: 4px;" +
            "      cursor: pointer;" +
            "    }" +
            "  </style>" +
            "</head>" +
            "<body>" +
            "<div id=\"form-procedimento\">" +
            "  <img src=\"https://site-adufs.s3.amazonaws.com/uploads/2021/02d92f9526b9b2e6e3e9f4ddc486b215.png\" alt=\"Logo\">" +
            "  <div>" +
            "    <h4>Procedimento invalido!</h4>" +
            "  </div>" +
            " <div>" +
            "  <input type=\"button\" onclick=\"window.location.href='http://localhost:8080/procedimento.html'\" value=\"Voltar\">" +
            "</div>" +
            "</div>" +
            "</body>" +
            "</html>";

    public static String classSuccess = "<!DOCTYPE html>" +
            "<html>" +
            "<head>" +
            "  <meta charset="+"UTF-8>" +
            "  <title>Procedimento</title>" +
            "  <style>" +
            "    body {" +
            "      font-family: Arial, sans-serif;" +
            "      background-color: #DFDFDF;" +
            "      display: flex;" +
            "      justify-content: center;" +
            "      align-items: center;" +
            "      height: 100vh;" +
            "    }" +
            "" +
            "    #form-procedimento {" +
            "      margin: 30px;" +
            "      background-color: #f1f1f1;" +
            "      padding: 20px;" +
            "      border-radius: 4px;" +
            "      box-shadow: 0 2px 5px rgba(0, 0, 0, 0.2);" +
            "      text-align: center;" +
            "    }" +
            "" +
            "    h4 {" +
            "      margin-bottom: 10px;" +
            "      font-weight: bold;" +
            "    }" +
            "" +
            "    input[type="+"submit] {" +
            "      padding: 10px 20px;" +
            "      background-color: #00995D;" +
            "      color: white;" +
            "      border: none;" +
            "      border-radius: 4px;" +
            "      cursor: pointer;" +
            "    }" +
            "  </style>" +
            "</head>" +
            "<body>" +
            "<div id=\"form-procedimento\">" +
            "  <img src=\"https://site-adufs.s3.amazonaws.com/uploads/2021/02d92f9526b9b2e6e3e9f4ddc486b215.png\" alt=\"Logo\">" +
            "  <div>" +
            "    <h4>Procedimento valido!</h4>" +
            "  </div>" +
            "<div>" +
            "  <input type=\"button\" onclick=\"window.location.href='http://localhost:8080/procedimento.html'\" value=\"Voltar\">" +
            "</div>" +
            "</div>" +
            "</body>" +
            "</html>";
}
