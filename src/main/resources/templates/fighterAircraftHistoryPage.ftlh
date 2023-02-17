<!DOCTYPE html>
<html>
<head>
    <title>advertising calculator</title>
</head>
<body>
<h1>Калькулятор планирования стоимости изготовления рекламной продукции</h1><hr>
<h4>Оборонная сфера. Истребитель. ПОДРОБНАЯ ИНФОРМАЦИЯ ОБ ОПЕРАЦИИ № ${fighterAircraft.id}</h4>

<b>Parametr 1: ${fighterAircraft.title}</b>
<b>Parametr 2: ${fighterAircraft.p2}</b>
<b>Parametr 3: ${fighterAircraft.p3}</b>
<b>Parametr 4: ${fighterAircraft.p4}</b>
<b>Parametr 5: ${fighterAircraft.p5}</b>
<hr>
<form action="/fighterAircraft/delete/${fighterAircraft.id}" method="post">
    <input type="submit" value="Удалить">
</form>

<form action="/fighterAircraft/goback" method="post">
    <input type="submit" value="Назад"/>
</form>

<input  type="radio" name="contact" value=".pdf" checked>

<input type="radio" name="contact" value=".doc">

<input type="radio" name="contact" value=".docx">

<input type="radio" name="contact" value=".xlsx">

<form action="/fighterAircraft/print" method="post">
    <input type="submit" value="Распечатать"/>
</form>

</body>
</html>