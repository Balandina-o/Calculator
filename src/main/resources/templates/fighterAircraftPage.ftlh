<!DOCTYPE html>
<html>
<head>
    <title>advertising calculator</title>
</head>
<body>
<h1>Калькулятор планирования стоимости изготовления рекламной продукции</h1><hr>
<h4>Оборонная сфера. Истребитель</h4>
<form action="/" method="get">
    Поиск по названию объявления: <input type="text" name="title"><br>
    <input type="submit" value="Поиск"/>
</form>
<#list fighterAircrafts as fighterAircraft>
    <div>
        <p><b>${fighterAircraft.title}</b> ${fighterAircraft.p2} | <a href="/fighterAircraft/${fighterAircraft.id}">Подробнее...</a></p>
    </div>
</#list>

<hr>
<h3>Введите параметры для вычислений: </h3>
<form action="/fighterAircraft/create" method="post">
    Параметр 1: <input type="text" name="title"/><br><br>
    Параметр 2: <input type="text" name="p2"/><br><br>
    Параметр 3: <input type="text" name="p3"/><br><br>
    Параметр 4: <input type="text" name="p4"/><br><br>
    Параметр 5: <input type="text" name="p5"/><br><br>
    <input type="submit" value="Добавить"/>
</form>

</body>
</html>