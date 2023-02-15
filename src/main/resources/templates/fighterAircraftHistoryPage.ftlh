<!DOCTYPE html>
<html>
<head>
    <title>advertising calculator</title>
</head>
<body>
<h1>Калькулятор планирования стоимости изготовления рекламной продукции</h1><hr>
<h4>Оборонная сфера. Истребитель. ПОДРОБНАЯ ИНФОРМАЦИЯ ОБ ОПЕРАЦИИ № ${fighterAircraft.id}</h4>

<b>Parametr 1: ${fighterAircraft.perem1}</b>
<b>Parametr 2: ${fighterAircraft.perem2}</b>
<b>Parametr 3: ${fighterAircraft.perem3}</b>
<b>Parametr 4: ${fighterAircraft.perem4}</b>
<b>Parametr 5: ${fighterAircraft.perem5}</b>
<hr>

<form action="/fighterAircraft/delete/${fighterAircraft.id}" method="post">
    <input type="submit" value="Удалить">
</form>

<hr>



</body>
</html>