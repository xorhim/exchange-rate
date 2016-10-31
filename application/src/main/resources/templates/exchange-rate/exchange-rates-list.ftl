<!DOCTYPE html>

<html>
<head>
    <title>Exchange Rates</title>
    <link type="text/css" href="css/style.css">
</head>
<body>
    <div>
        <a href="index">Back</a>
    </div>

    <table>
        <thead>
            <tr>
                <th>Source Currency</th>
                <th>Target Currency</th>
                <th>Exchange Rate</th>
                <th>Creation Time</th>
            </tr>
        </thead>
        <tbody>
            <#list exchangeRates as exchangeRate>
                <tr>
                    <td>${exchangeRate.source.name}</td>
                    <td>${exchangeRate.target.name}</td>
                    <td>${exchangeRate.rate}</td>
                    <td>${exchangeRate.creationTime}</td>
                </tr>
            </#list>
        </tbody>
    </table>
</body>
</html>
