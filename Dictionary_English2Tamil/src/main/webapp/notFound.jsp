<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tamil Meanings</title>
    <link rel="stylesheet" type="text/css" href="resultMeaning.css">
</head>
<body>
    <div class="container">
        <h1>English to Tamil Dictionary</h1>
         
        
        <div class="meaning">
            <span class="englishword">English word:</span> <span class="user-enter-word">${userEnterWord}</span>
            <br><br>
            <span class="notfound">${noMeaning}</span>
            <br><br>
            <span class="notfound"> >> Sorry, no content found matching your search. <<  </span>
        </div>
        <button onclick="goBack()">Back</button>
        <div class="disclaimer">* This web application provides meanings for 56,862 words. *</div>
    </div>
    <script>
        function goBack() {
            window.history.back();
        }
    </script>
</body>
</html>
