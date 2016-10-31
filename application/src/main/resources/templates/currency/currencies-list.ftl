<!DOCTYPE html>

<html>
<head>
    <title>Currencies</title>
    <link type="text/css" href="css/style.css">
</head>
<body>
    <div>
        <a href="index">Back</a>
    </div>

    <div>
    <ul>
        <#list currencies as currency>
            <li>
                <strong>${currency.code}</strong> - ${currency.name}
            </li>
        </#list>
    </ul>
    </div>
</body>
</html>
